package typings.awsDashLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessKey extends js.Object {
  var accessKey: String | Null
  var accountId: String | Null
  var apiKey: String | Null
  var apiKeyId: String | Null
  var caller: String | Null
  var cognitoAuthenticationProvider: String | Null
  var cognitoAuthenticationType: String | Null
  var cognitoIdentityId: String | Null
  var cognitoIdentityPoolId: String | Null
  var principalOrgId: String | Null
  var sourceIp: String
  var user: String | Null
  var userAgent: String | Null
  var userArn: String | Null
}

object Anon_AccessKey {
  @scala.inline
  def apply(
    sourceIp: String,
    accessKey: String = null,
    accountId: String = null,
    apiKey: String = null,
    apiKeyId: String = null,
    caller: String = null,
    cognitoAuthenticationProvider: String = null,
    cognitoAuthenticationType: String = null,
    cognitoIdentityId: String = null,
    cognitoIdentityPoolId: String = null,
    principalOrgId: String = null,
    user: String = null,
    userAgent: String = null,
    userArn: String = null
  ): Anon_AccessKey = {
    val __obj = js.Dynamic.literal(sourceIp = sourceIp.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (apiKeyId != null) __obj.updateDynamic("apiKeyId")(apiKeyId.asInstanceOf[js.Any])
    if (caller != null) __obj.updateDynamic("caller")(caller.asInstanceOf[js.Any])
    if (cognitoAuthenticationProvider != null) __obj.updateDynamic("cognitoAuthenticationProvider")(cognitoAuthenticationProvider.asInstanceOf[js.Any])
    if (cognitoAuthenticationType != null) __obj.updateDynamic("cognitoAuthenticationType")(cognitoAuthenticationType.asInstanceOf[js.Any])
    if (cognitoIdentityId != null) __obj.updateDynamic("cognitoIdentityId")(cognitoIdentityId.asInstanceOf[js.Any])
    if (cognitoIdentityPoolId != null) __obj.updateDynamic("cognitoIdentityPoolId")(cognitoIdentityPoolId.asInstanceOf[js.Any])
    if (principalOrgId != null) __obj.updateDynamic("principalOrgId")(principalOrgId.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (userArn != null) __obj.updateDynamic("userArn")(userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccessKey]
  }
}

