package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceSpecificCredentialResponse extends StObject {
  
  /**
    * A structure that contains information about the newly created service-specific credential.  This is the only time that the password for this credential set is available. It cannot be recovered later. Instead, you must reset the password with ResetServiceSpecificCredential. 
    */
  var ServiceSpecificCredential: js.UndefOr[typings.awsSdk.clientsIamMod.ServiceSpecificCredential] = js.undefined
}
object CreateServiceSpecificCredentialResponse {
  
  inline def apply(): CreateServiceSpecificCredentialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceSpecificCredentialResponse]
  }
  
  extension [Self <: CreateServiceSpecificCredentialResponse](x: Self) {
    
    inline def setServiceSpecificCredential(value: ServiceSpecificCredential): Self = StObject.set(x, "ServiceSpecificCredential", value.asInstanceOf[js.Any])
    
    inline def setServiceSpecificCredentialUndefined: Self = StObject.set(x, "ServiceSpecificCredential", js.undefined)
  }
}
