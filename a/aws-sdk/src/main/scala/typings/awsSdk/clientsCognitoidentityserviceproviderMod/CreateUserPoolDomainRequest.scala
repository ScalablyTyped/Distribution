package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserPoolDomainRequest extends StObject {
  
  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application. Provide this parameter only if you want to use a custom domain for your user pool. Otherwise, you can exclude this parameter and use the Amazon Cognito hosted domain instead. For more information about the hosted domain and custom domains, see Configuring a User Pool Domain.
    */
  var CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.undefined
  
  /**
    * The domain string. For custom domains, this is the fully-qualified domain name, such as auth.example.com. For Amazon Cognito prefix domains, this is the prefix alone, such as auth.
    */
  var Domain: DomainType
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}
object CreateUserPoolDomainRequest {
  
  inline def apply(Domain: DomainType, UserPoolId: UserPoolIdType): CreateUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserPoolDomainRequest]
  }
  
  extension [Self <: CreateUserPoolDomainRequest](x: Self) {
    
    inline def setCustomDomainConfig(value: CustomDomainConfigType): Self = StObject.set(x, "CustomDomainConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainConfigUndefined: Self = StObject.set(x, "CustomDomainConfig", js.undefined)
    
    inline def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
