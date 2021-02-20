package typings.activexLibreoffice.com_.sun.star.beans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a property value. */
@js.native
trait PropertyValue extends StObject {
  
  /**
    * contains an implementation-specific handle for the property.
    *
    * It may be -1 if the implementation has no handle. If available it can be used for fast lookups.
    */
  var Handle: Double = js.native
  
  /**
    * specifies the name of the property.
    *
    * The name is unique within a sequence of PropertyValues. Upper and lower case are distinguished.
    */
  var Name: String = js.native
  
  /** determines if the value comes from the object itself or from a default and if the value cannot be determined exactly. */
  var State: PropertyState = js.native
  
  /** contains the value of the property or `VOID` , if no value is available. */
  var Value: js.Any = js.native
}
object PropertyValue {
  
  @scala.inline
  def apply(Handle: Double, Name: String, State: PropertyState, Value: js.Any): PropertyValue = {
    val __obj = js.Dynamic.literal(Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyValue]
  }
  
  @scala.inline
  implicit class PropertyValueMutableBuilder[Self <: PropertyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandle(value: Double): Self = StObject.set(x, "Handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: PropertyState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
