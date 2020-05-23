package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
trait EnhancedCustomShapeTextPath extends js.Object {
  /** This property specifies if the text is scaled using the shape path. */
  var ScaleX: Boolean
  /** This property specifies if a text path is used. The default is false. */
  var TextPath: Boolean
  /** This property specifies how the text is drawn. */
  var TextPathMode: EnhancedCustomShapeTextPathMode
}

object EnhancedCustomShapeTextPath {
  @scala.inline
  def apply(ScaleX: Boolean, TextPath: Boolean, TextPathMode: EnhancedCustomShapeTextPathMode): EnhancedCustomShapeTextPath = {
    val __obj = js.Dynamic.literal(ScaleX = ScaleX.asInstanceOf[js.Any], TextPath = TextPath.asInstanceOf[js.Any], TextPathMode = TextPathMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeTextPath]
  }
}

