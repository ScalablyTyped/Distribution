package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialsForIdentityResponse extends StObject {
  
  /**
    * Credentials for the provided identity ID.
    */
  var Credentials: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.Credentials] = js.undefined
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.IdentityId] = js.undefined
}
object GetCredentialsForIdentityResponse {
  
  inline def apply(): GetCredentialsForIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCredentialsForIdentityResponse]
  }
  
  extension [Self <: GetCredentialsForIdentityResponse](x: Self) {
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
  }
}
