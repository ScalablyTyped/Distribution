package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessMethod extends StObject {
  
  /**
    * Specifies the AccessMethod.
    */
  var AccessMethodType: js.UndefOr[typings.awsSdk.acmpcaMod.AccessMethodType] = js.undefined
  
  /**
    * An object identifier (OID) specifying the AccessMethod. The OID must satisfy the regular expression shown below. For more information, see NIST's definition of Object Identifier (OID).
    */
  var CustomObjectIdentifier: js.UndefOr[typings.awsSdk.acmpcaMod.CustomObjectIdentifier] = js.undefined
}
object AccessMethod {
  
  inline def apply(): AccessMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessMethod]
  }
  
  extension [Self <: AccessMethod](x: Self) {
    
    inline def setAccessMethodType(value: AccessMethodType): Self = StObject.set(x, "AccessMethodType", value.asInstanceOf[js.Any])
    
    inline def setAccessMethodTypeUndefined: Self = StObject.set(x, "AccessMethodType", js.undefined)
    
    inline def setCustomObjectIdentifier(value: CustomObjectIdentifier): Self = StObject.set(x, "CustomObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCustomObjectIdentifierUndefined: Self = StObject.set(x, "CustomObjectIdentifier", js.undefined)
  }
}
