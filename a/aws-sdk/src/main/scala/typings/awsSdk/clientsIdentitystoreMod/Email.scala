package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  /**
    * A Boolean value representing whether this is the primary email address for the associated resource.
    */
  var Primary: js.UndefOr[SensitiveBooleanType] = js.undefined
  
  /**
    * A string representing the type of address. For example, "Work."
    */
  var Type: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string containing an email address. For example, "johndoe@amazon.com."
    */
  var Value: js.UndefOr[SensitiveStringType] = js.undefined
}
object Email {
  
  inline def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  
  extension [Self <: Email](x: Self) {
    
    inline def setPrimary(value: SensitiveBooleanType): Self = StObject.set(x, "Primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "Primary", js.undefined)
    
    inline def setType(value: SensitiveStringType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: SensitiveStringType): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
