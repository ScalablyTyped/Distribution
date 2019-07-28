package typings.awsDashSdk.clientsCognitoidentityMod

import typings.awsDashSdk.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityCredentialsInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpenIdTokenInput extends CognitoIdentityCredentialsInputs {
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typings.awsDashSdk.clientsCognitoidentityMod.IdentityId
  /**
    * A set of optional name-value pairs that map provider names to provider tokens. When using graph.facebook.com and www.amazon.com, supply the access_token returned from the provider's authflow. For accounts.google.com, an Amazon Cognito user pool provider, or any other OpenId Connect provider, always include the id_token.
    */
  var Logins: js.UndefOr[LoginsMap] = js.undefined
}

object GetOpenIdTokenInput {
  @scala.inline
  def apply(IdentityId: IdentityId, Logins: LoginsMap = null): GetOpenIdTokenInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId)
    if (Logins != null) __obj.updateDynamic("Logins")(Logins)
    __obj.asInstanceOf[GetOpenIdTokenInput]
  }
}

