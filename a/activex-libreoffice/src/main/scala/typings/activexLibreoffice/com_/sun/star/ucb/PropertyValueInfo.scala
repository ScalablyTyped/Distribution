package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains value and state of a {@link com.sun.star.beans.Property} . */
trait PropertyValueInfo
  extends StObject
     with PropertyValue {
  
  /** the state of the property value. */
  var ValueState: PropertyValueState
}
object PropertyValueInfo {
  
  inline def apply(Handle: Double, Name: String, State: PropertyState, Value: Any, ValueState: PropertyValueState): PropertyValueInfo = {
    val __obj = js.Dynamic.literal(Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueState = ValueState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyValueInfo]
  }
  
  extension [Self <: PropertyValueInfo](x: Self) {
    
    inline def setValueState(value: PropertyValueState): Self = StObject.set(x, "ValueState", value.asInstanceOf[js.Any])
  }
}
