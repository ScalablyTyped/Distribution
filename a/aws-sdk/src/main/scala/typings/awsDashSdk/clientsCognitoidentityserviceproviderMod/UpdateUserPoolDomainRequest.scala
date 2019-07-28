package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserPoolDomainRequest extends js.Object {
  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in pages for your application. Use this object to specify an SSL certificate that is managed by ACM.
    */
  var CustomDomainConfig: CustomDomainConfigType
  /**
    * The domain name for the custom domain that hosts the sign-up and sign-in pages for your application. For example: auth.example.com.  This string can include only lowercase letters, numbers, and hyphens. Do not use a hyphen for the first or last character. Use periods to separate subdomain names.
    */
  var Domain: DomainType
  /**
    * The ID of the user pool that is associated with the custom domain that you are updating the certificate for.
    */
  var UserPoolId: UserPoolIdType
}

object UpdateUserPoolDomainRequest {
  @scala.inline
  def apply(CustomDomainConfig: CustomDomainConfigType, Domain: DomainType, UserPoolId: UserPoolIdType): UpdateUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(CustomDomainConfig = CustomDomainConfig, Domain = Domain, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[UpdateUserPoolDomainRequest]
  }
}

