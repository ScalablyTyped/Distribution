package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpenIdTokenForDeveloperIdentityInput extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.IdentityId] = js.undefined
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsDashSdk.clientsCognitoidentityMod.IdentityPoolId
  /**
    * A set of optional name-value pairs that map provider names to provider tokens. Each name-value pair represents a user from a public provider or developer provider. If the user is from a developer provider, the name-value pair will follow the syntax "developer_provider_name": "developer_user_identifier". The developer provider is the "domain" by which Cognito will refer to your users; you provided this domain while creating/updating the identity pool. The developer user identifier is an identifier from your backend that uniquely identifies a user. When you create an identity pool, you can specify the supported logins.
    */
  var Logins: LoginsMap
  /**
    * The expiration time of the token, in seconds. You can specify a custom expiration time for the token so that you can cache it. If you don't provide an expiration time, the token is valid for 15 minutes. You can exchange the token with Amazon STS for temporary AWS credentials, which are valid for a maximum of one hour. The maximum token duration you can set is 24 hours. You should take care in setting the expiration time for a token, as there are significant security implications: an attacker could use a leaked token to access your AWS resources for the token's duration.
    */
  var TokenDuration: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.TokenDuration] = js.undefined
}

object GetOpenIdTokenForDeveloperIdentityInput {
  @scala.inline
  def apply(
    IdentityPoolId: IdentityPoolId,
    Logins: LoginsMap,
    IdentityId: IdentityId = null,
    TokenDuration: Int | Double = null
  ): GetOpenIdTokenForDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId, Logins = Logins)
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    if (TokenDuration != null) __obj.updateDynamic("TokenDuration")(TokenDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenIdTokenForDeveloperIdentityInput]
  }
}

