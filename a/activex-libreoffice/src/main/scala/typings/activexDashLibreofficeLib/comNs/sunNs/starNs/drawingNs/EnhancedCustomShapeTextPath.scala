package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
trait EnhancedCustomShapeTextPath extends js.Object {
  /** This property specifies if the text is scaled using the shape path. */
  var ScaleX: scala.Boolean
  /** This property specifies if a text path is used. The default is false. */
  var TextPath: scala.Boolean
  /** This property specifies how the text is drawn. */
  var TextPathMode: EnhancedCustomShapeTextPathMode
}

object EnhancedCustomShapeTextPath {
  @scala.inline
  def apply(ScaleX: scala.Boolean, TextPath: scala.Boolean, TextPathMode: EnhancedCustomShapeTextPathMode): EnhancedCustomShapeTextPath = {
    val __obj = js.Dynamic.literal(ScaleX = ScaleX, TextPath = TextPath, TextPathMode = TextPathMode)
  
    __obj.asInstanceOf[EnhancedCustomShapeTextPath]
  }
}

