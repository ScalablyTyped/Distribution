package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains value and state of a {@link com.sun.star.beans.Property} . */
trait PropertyValueInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue {
  /** the state of the property value. */
  var ValueState: PropertyValueState
}

object PropertyValueInfo {
  @scala.inline
  def apply(
    Handle: scala.Double,
    Name: java.lang.String,
    State: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState,
    Value: js.Any,
    ValueState: PropertyValueState
  ): PropertyValueInfo = {
    val __obj = js.Dynamic.literal(Handle = Handle, Name = Name, State = State, Value = Value, ValueState = ValueState)
  
    __obj.asInstanceOf[PropertyValueInfo]
  }
}

