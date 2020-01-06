package typings.awsDashSdk.clientsCognitoidentityMod

import typings.awsDashSdk.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentials.CognitoIdentityCredentialsInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpenIdTokenInput extends CognitoIdentityCredentialsInputs {
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typings.awsDashSdk.clientsCognitoidentityMod.IdentityId = js.native
  /**
    * A set of optional name-value pairs that map provider names to provider tokens. When using graph.facebook.com and www.amazon.com, supply the access_token returned from the provider's authflow. For accounts.google.com, an Amazon Cognito user pool provider, or any other OpenId Connect provider, always include the id_token.
    */
  var Logins: js.UndefOr[LoginsMap] = js.native
}

object GetOpenIdTokenInput {
  @scala.inline
  def apply(IdentityId: IdentityId, Logins: LoginsMap = null): GetOpenIdTokenInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
    if (Logins != null) __obj.updateDynamic("Logins")(Logins.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenIdTokenInput]
  }
}

