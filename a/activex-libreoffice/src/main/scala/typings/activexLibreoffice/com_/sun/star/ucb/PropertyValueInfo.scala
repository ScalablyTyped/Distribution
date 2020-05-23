package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
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
    val __obj = js.Dynamic.literal(Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueState = ValueState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyValueInfo]
  }
}

