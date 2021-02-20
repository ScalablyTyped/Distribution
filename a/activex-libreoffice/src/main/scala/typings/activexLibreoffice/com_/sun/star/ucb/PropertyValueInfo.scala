package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import org.scalablytyped.runtime.StObject
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
  implicit class PropertyValueInfoMutableBuilder[Self <: PropertyValueInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueState(value: PropertyValueState): Self = StObject.set(x, "ValueState", value.asInstanceOf[js.Any])
  }
}
