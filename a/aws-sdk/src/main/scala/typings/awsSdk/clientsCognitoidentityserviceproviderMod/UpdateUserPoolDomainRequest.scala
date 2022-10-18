package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserPoolDomainRequest extends StObject {
  
  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in pages for your application. Use this object to specify an SSL certificate that is managed by ACM.
    */
  var CustomDomainConfig: CustomDomainConfigType
  
  /**
    * The domain name for the custom domain that hosts the sign-up and sign-in pages for your application. One example might be auth.example.com.  This string can include only lowercase letters, numbers, and hyphens. Don't use a hyphen for the first or last character. Use periods to separate subdomain names.
    */
  var Domain: DomainType
  
  /**
    * The ID of the user pool that is associated with the custom domain whose certificate you're updating.
    */
  var UserPoolId: UserPoolIdType
}
object UpdateUserPoolDomainRequest {
  
  inline def apply(CustomDomainConfig: CustomDomainConfigType, Domain: DomainType, UserPoolId: UserPoolIdType): UpdateUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(CustomDomainConfig = CustomDomainConfig.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserPoolDomainRequest]
  }
  
  extension [Self <: UpdateUserPoolDomainRequest](x: Self) {
    
    inline def setCustomDomainConfig(value: CustomDomainConfigType): Self = StObject.set(x, "CustomDomainConfig", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
