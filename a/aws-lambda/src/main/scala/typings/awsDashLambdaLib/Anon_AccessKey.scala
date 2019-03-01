package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessKey extends js.Object {
  var accessKey: java.lang.String | scala.Null
  var accountId: java.lang.String | scala.Null
  var apiKey: java.lang.String | scala.Null
  var apiKeyId: java.lang.String | scala.Null
  var caller: java.lang.String | scala.Null
  var cognitoAuthenticationProvider: java.lang.String | scala.Null
  var cognitoAuthenticationType: java.lang.String | scala.Null
  var cognitoIdentityId: java.lang.String | scala.Null
  var cognitoIdentityPoolId: java.lang.String | scala.Null
  var sourceIp: java.lang.String
  var user: java.lang.String | scala.Null
  var userAgent: java.lang.String | scala.Null
  var userArn: java.lang.String | scala.Null
}

object Anon_AccessKey {
  @scala.inline
  def apply(
    sourceIp: java.lang.String,
    accessKey: java.lang.String = null,
    accountId: java.lang.String = null,
    apiKey: java.lang.String = null,
    apiKeyId: java.lang.String = null,
    caller: java.lang.String = null,
    cognitoAuthenticationProvider: java.lang.String = null,
    cognitoAuthenticationType: java.lang.String = null,
    cognitoIdentityId: java.lang.String = null,
    cognitoIdentityPoolId: java.lang.String = null,
    user: java.lang.String = null,
    userAgent: java.lang.String = null,
    userArn: java.lang.String = null
  ): Anon_AccessKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sourceIp")(sourceIp)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (apiKeyId != null) __obj.updateDynamic("apiKeyId")(apiKeyId)
    if (caller != null) __obj.updateDynamic("caller")(caller)
    if (cognitoAuthenticationProvider != null) __obj.updateDynamic("cognitoAuthenticationProvider")(cognitoAuthenticationProvider)
    if (cognitoAuthenticationType != null) __obj.updateDynamic("cognitoAuthenticationType")(cognitoAuthenticationType)
    if (cognitoIdentityId != null) __obj.updateDynamic("cognitoIdentityId")(cognitoIdentityId)
    if (cognitoIdentityPoolId != null) __obj.updateDynamic("cognitoIdentityPoolId")(cognitoIdentityPoolId)
    if (user != null) __obj.updateDynamic("user")(user)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (userArn != null) __obj.updateDynamic("userArn")(userArn)
    __obj.asInstanceOf[Anon_AccessKey]
  }
}

