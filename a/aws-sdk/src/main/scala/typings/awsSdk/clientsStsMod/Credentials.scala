package typings.awsSdk.clientsStsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  /**
    * The access key ID that identifies the temporary security credentials.
    */
  var AccessKeyId: accessKeyIdType
  
  /**
    * The date on which the current credentials expire.
    */
  var Expiration: js.Date
  
  /**
    * The secret access key that can be used to sign requests.
    */
  var SecretAccessKey: accessKeySecretType
  
  /**
    * The token that users must pass to the service API to use the temporary credentials.
    */
  var SessionToken: tokenType
}
object Credentials {
  
  inline def apply(
    AccessKeyId: accessKeyIdType,
    Expiration: js.Date,
    SecretAccessKey: accessKeySecretType,
    SessionToken: tokenType
  ): Credentials = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], Expiration = Expiration.asInstanceOf[js.Any], SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any], SessionToken = SessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  
  extension [Self <: Credentials](x: Self) {
    
    inline def setAccessKeyId(value: accessKeyIdType): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setExpiration(value: js.Date): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKey(value: accessKeySecretType): Self = StObject.set(x, "SecretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSessionToken(value: tokenType): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
  }
}
