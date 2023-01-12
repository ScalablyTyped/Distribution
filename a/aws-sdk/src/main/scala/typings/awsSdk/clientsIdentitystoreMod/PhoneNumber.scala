package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumber extends StObject {
  
  /**
    * A Boolean value representing whether this is the primary phone number for the associated resource.
    */
  var Primary: js.UndefOr[SensitiveBooleanType] = js.undefined
  
  /**
    * A string representing the type of a phone number. For example, "Mobile."
    */
  var Type: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string containing a phone number. For example, "8675309" or "+1 (800) 123-4567".
    */
  var Value: js.UndefOr[SensitiveStringType] = js.undefined
}
object PhoneNumber {
  
  inline def apply(): PhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneNumber] (val x: Self) extends AnyVal {
    
    inline def setPrimary(value: SensitiveBooleanType): Self = StObject.set(x, "Primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "Primary", js.undefined)
    
    inline def setType(value: SensitiveStringType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: SensitiveStringType): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
