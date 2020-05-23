package typings.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.angularAnimationsStrings.Asterisk
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
  var styles: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk])
}

object AnimationStyleMetadata {
  @scala.inline
  def apply(
    styles: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk]),
    `type`: AnimationMetadataType,
    offset: Double = null.asInstanceOf[Double]
  ): AnimationStyleMetadata = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStyleMetadata]
  }
}

