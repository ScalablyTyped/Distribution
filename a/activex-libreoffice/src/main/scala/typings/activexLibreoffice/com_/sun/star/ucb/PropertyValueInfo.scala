package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains value and state of a {@link com.sun.star.beans.Property} . */
@js.native
trait PropertyValueInfo extends PropertyValue {
  
  /** the state of the property value. */
  var ValueState: PropertyValueState = js.native
}
object PropertyValueInfo {
  
  @scala.inline
  def apply(Handle: Double, Name: String, State: PropertyState, Value: js.Any, ValueState: PropertyValueState): PropertyValueInfo = {
    val __obj = js.Dynamic.literal(Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueState = ValueState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyValueInfo]
  }
  
  @scala.inline
  implicit class PropertyValueInfoOps[Self <: PropertyValueInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValueState(value: PropertyValueState): Self = this.set("ValueState", value.asInstanceOf[js.Any])
  }
}
