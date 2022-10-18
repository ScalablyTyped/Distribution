package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceSpecificCredentialsResponse extends StObject {
  
  /**
    * A list of structures that each contain details about a service-specific credential.
    */
  var ServiceSpecificCredentials: js.UndefOr[ServiceSpecificCredentialsListType] = js.undefined
}
object ListServiceSpecificCredentialsResponse {
  
  inline def apply(): ListServiceSpecificCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceSpecificCredentialsResponse]
  }
  
  extension [Self <: ListServiceSpecificCredentialsResponse](x: Self) {
    
    inline def setServiceSpecificCredentials(value: ServiceSpecificCredentialsListType): Self = StObject.set(x, "ServiceSpecificCredentials", value.asInstanceOf[js.Any])
    
    inline def setServiceSpecificCredentialsUndefined: Self = StObject.set(x, "ServiceSpecificCredentials", js.undefined)
    
    inline def setServiceSpecificCredentialsVarargs(value: ServiceSpecificCredentialMetadata*): Self = StObject.set(x, "ServiceSpecificCredentials", js.Array(value*))
  }
}
