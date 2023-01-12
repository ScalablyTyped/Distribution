package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemporaryGlueTableCredentialsResponse extends StObject {
  
  /**
    * The access key ID for the temporary credentials.
    */
  var AccessKeyId: js.UndefOr[AccessKeyIdString] = js.undefined
  
  /**
    * The date and time when the temporary credentials expire.
    */
  var Expiration: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The secret key for the temporary credentials.
    */
  var SecretAccessKey: js.UndefOr[SecretAccessKeyString] = js.undefined
  
  /**
    * The session token for the temporary credentials.
    */
  var SessionToken: js.UndefOr[SessionTokenString] = js.undefined
}
object GetTemporaryGlueTableCredentialsResponse {
  
  inline def apply(): GetTemporaryGlueTableCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemporaryGlueTableCredentialsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemporaryGlueTableCredentialsResponse] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: AccessKeyIdString): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    inline def setExpiration(value: js.Date): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    inline def setSecretAccessKey(value: SecretAccessKeyString): Self = StObject.set(x, "SecretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "SecretAccessKey", js.undefined)
    
    inline def setSessionToken(value: SessionTokenString): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "SessionToken", js.undefined)
  }
}
