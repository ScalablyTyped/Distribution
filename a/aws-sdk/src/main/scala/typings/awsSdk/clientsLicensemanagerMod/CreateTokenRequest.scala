package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTokenRequest extends StObject {
  
  /**
    * Idempotency token, valid for 10 minutes.
    */
  var ClientToken: typings.awsSdk.clientsLicensemanagerMod.ClientToken
  
  /**
    * Token expiration, in days, counted from token creation. The default is 365 days.
    */
  var ExpirationInDays: js.UndefOr[Integer] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the license. The ARN is mapped to the aud claim of the JWT token.
    */
  var LicenseArn: Arn
  
  /**
    * Amazon Resource Name (ARN) of the IAM roles to embed in the token. License Manager does not check whether the roles are in use.
    */
  var RoleArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * Data specified by the caller to be included in the JWT token. The data is mapped to the amr claim of the JWT token.
    */
  var TokenProperties: js.UndefOr[MaxSize3StringList] = js.undefined
}
object CreateTokenRequest {
  
  inline def apply(ClientToken: ClientToken, LicenseArn: Arn): CreateTokenRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], LicenseArn = LicenseArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTokenRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTokenRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setExpirationInDays(value: Integer): Self = StObject.set(x, "ExpirationInDays", value.asInstanceOf[js.Any])
    
    inline def setExpirationInDaysUndefined: Self = StObject.set(x, "ExpirationInDays", js.undefined)
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArns(value: ArnList): Self = StObject.set(x, "RoleArns", value.asInstanceOf[js.Any])
    
    inline def setRoleArnsUndefined: Self = StObject.set(x, "RoleArns", js.undefined)
    
    inline def setRoleArnsVarargs(value: Arn*): Self = StObject.set(x, "RoleArns", js.Array(value*))
    
    inline def setTokenProperties(value: MaxSize3StringList): Self = StObject.set(x, "TokenProperties", value.asInstanceOf[js.Any])
    
    inline def setTokenPropertiesUndefined: Self = StObject.set(x, "TokenProperties", js.undefined)
    
    inline def setTokenPropertiesVarargs(value: String*): Self = StObject.set(x, "TokenProperties", js.Array(value*))
  }
}
