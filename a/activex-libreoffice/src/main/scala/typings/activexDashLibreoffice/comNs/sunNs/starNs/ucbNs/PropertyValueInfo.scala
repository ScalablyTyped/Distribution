package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains value and state of a {@link com.sun.star.beans.Property} . */
trait PropertyValueInfo extends PropertyValue {
  /** the state of the property value. */
  var ValueState: PropertyValueState
}

object PropertyValueInfo {
  @scala.inline
  def apply(Handle: Double, Name: String, State: PropertyState, Value: js.Any, ValueState: PropertyValueState): PropertyValueInfo = {
    val __obj = js.Dynamic.literal(Handle = Handle, Name = Name, State = State, Value = Value, ValueState = ValueState)
  
    __obj.asInstanceOf[PropertyValueInfo]
  }
}

