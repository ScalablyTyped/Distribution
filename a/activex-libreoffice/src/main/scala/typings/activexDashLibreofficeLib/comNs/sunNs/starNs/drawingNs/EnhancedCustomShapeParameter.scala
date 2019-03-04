package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a single value which is used with EnhancedCustomShapes */
trait EnhancedCustomShapeParameter extends js.Object {
  var Type: scala.Double
  /** the any can be of type long or double */
  var Value: js.Any
}

object EnhancedCustomShapeParameter {
  @scala.inline
  def apply(Type: scala.Double, Value: js.Any): EnhancedCustomShapeParameter = {
    val __obj = js.Dynamic.literal(Type = Type, Value = Value)
  
    __obj.asInstanceOf[EnhancedCustomShapeParameter]
  }
}

