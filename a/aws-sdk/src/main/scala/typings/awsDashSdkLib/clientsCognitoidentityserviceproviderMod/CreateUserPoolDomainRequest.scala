package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserPoolDomainRequest extends js.Object {
  /**
    * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application. Provide this parameter only if you want to use a custom domain for your user pool. Otherwise, you can exclude this parameter and use the Amazon Cognito hosted domain instead. For more information about the hosted domain and custom domains, see Configuring a User Pool Domain.
    */
  var CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.undefined
  /**
    * The domain string.
    */
  var Domain: DomainType
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}

object CreateUserPoolDomainRequest {
  @scala.inline
  def apply(Domain: DomainType, UserPoolId: UserPoolIdType, CustomDomainConfig: CustomDomainConfigType = null): CreateUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain, UserPoolId = UserPoolId)
    if (CustomDomainConfig != null) __obj.updateDynamic("CustomDomainConfig")(CustomDomainConfig)
    __obj.asInstanceOf[CreateUserPoolDomainRequest]
  }
}

