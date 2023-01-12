package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotDefaultValue extends StObject {
  
  /**
    * The default value to use when a user doesn't provide a value for a slot.
    */
  var defaultValue: SlotDefaultValueString
}
object SlotDefaultValue {
  
  inline def apply(defaultValue: SlotDefaultValueString): SlotDefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotDefaultValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotDefaultValue] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: SlotDefaultValueString): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
