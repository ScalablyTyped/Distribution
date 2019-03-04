package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationStyleMetadata extends AnimationMetadata {
  /**
    * A percentage of the total animate time at which the style is to be applied.
    */
  var offset: scala.Double | scala.Null
  /**
    * A set of CSS style properties.
    */
  var styles: atAngularAnimationsLib.atAngularAnimationsLibStrings.`*` | (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]) | (js.Array[
    (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]) | atAngularAnimationsLib.atAngularAnimationsLibStrings.`*`
  ])
}

object AnimationStyleMetadata {
  @scala.inline
  def apply(
    styles: atAngularAnimationsLib.atAngularAnimationsLibStrings.`*` | (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]) | (js.Array[
      (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]) | atAngularAnimationsLib.atAngularAnimationsLibStrings.`*`
    ]),
    `type`: AnimationMetadataType,
    offset: scala.Int | scala.Double = null
  ): AnimationStyleMetadata = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStyleMetadata]
  }
}

