package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdInput
  extends awsDashSdkLib.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityCredentialsInputs {
  /**
    * A standard AWS account ID (9+ digits).
    */
  var AccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.IdentityPoolId
  /**
    * A set of optional name-value pairs that map provider names to provider tokens. The available provider names for Logins are as follows:   Facebook: graph.facebook.com    Amazon Cognito user pool: cognito-idp.&lt;region&gt;.amazonaws.com/&lt;YOUR_USER_POOL_ID&gt;, for example, cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789.    Google: accounts.google.com    Amazon: www.amazon.com    Twitter: api.twitter.com    Digits: www.digits.com   
    */
  var Logins: js.UndefOr[LoginsMap] = js.undefined
}

object GetIdInput {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId, AccountId: AccountId = null, Logins: LoginsMap = null): GetIdInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId)
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (Logins != null) __obj.updateDynamic("Logins")(Logins)
    __obj.asInstanceOf[GetIdInput]
  }
}

