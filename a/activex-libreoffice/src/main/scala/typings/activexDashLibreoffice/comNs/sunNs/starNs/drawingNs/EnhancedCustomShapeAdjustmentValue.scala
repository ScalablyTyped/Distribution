package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a single AdjustmentValue */
trait EnhancedCustomShapeAdjustmentValue extends js.Object {
  /** optional name, used by pptx import/export for custom shape presets */
  var Name: String
  var State: PropertyState
  /** the any can be of type long or double */
  var Value: js.Any
}

object EnhancedCustomShapeAdjustmentValue {
  @scala.inline
  def apply(Name: String, State: PropertyState, Value: js.Any): EnhancedCustomShapeAdjustmentValue = {
    val __obj = js.Dynamic.literal(Name = Name, State = State, Value = Value)
  
    __obj.asInstanceOf[EnhancedCustomShapeAdjustmentValue]
  }
}

