package typings.atAngularAnimations.atAngularAnimationsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationStyleMetadata extends AnimationMetadata {
  /**
    * A percentage of the total animate time at which the style is to be applied.
    */
  var offset: Double | Null
  /**
    * A set of CSS style properties.
    */
  var styles: typings.atAngularAnimations.atAngularAnimationsStrings.`*` | (StringDictionary[String | Double]) | (js.Array[
    (StringDictionary[String | Double]) | typings.atAngularAnimations.atAngularAnimationsStrings.`*`
  ])
}

object AnimationStyleMetadata {
  @scala.inline
  def apply(
    styles: typings.atAngularAnimations.atAngularAnimationsStrings.`*` | (StringDictionary[String | Double]) | (js.Array[
      (StringDictionary[String | Double]) | typings.atAngularAnimations.atAngularAnimationsStrings.`*`
    ]),
    `type`: AnimationMetadataType,
    offset: Int | Double = null
  ): AnimationStyleMetadata = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStyleMetadata]
  }
}

