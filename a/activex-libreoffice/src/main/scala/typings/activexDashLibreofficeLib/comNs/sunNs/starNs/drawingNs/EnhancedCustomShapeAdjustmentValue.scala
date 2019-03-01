package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a single AdjustmentValue */
trait EnhancedCustomShapeAdjustmentValue extends js.Object {
  /** optional name, used by pptx import/export for custom shape presets */
  var Name: java.lang.String
  var State: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState
  /** the any can be of type long or double */
  var Value: js.Any
}

object EnhancedCustomShapeAdjustmentValue {
  @scala.inline
  def apply(
    Name: java.lang.String,
    State: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState,
    Value: js.Any
  ): EnhancedCustomShapeAdjustmentValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("State")(State)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[EnhancedCustomShapeAdjustmentValue]
  }
}

