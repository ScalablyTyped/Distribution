package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

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
    val __obj = js.Dynamic.literal(ScaleX = ScaleX, TextPath = TextPath, TextPathMode = TextPathMode)
  
    __obj.asInstanceOf[EnhancedCustomShapeTextPath]
  }
}

