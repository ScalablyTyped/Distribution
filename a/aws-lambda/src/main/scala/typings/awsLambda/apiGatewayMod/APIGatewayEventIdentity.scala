package typings.awsLambda.apiGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayEventIdentity extends js.Object {
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

object APIGatewayEventIdentity {
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
  ): APIGatewayEventIdentity = {
    val __obj = js.Dynamic.literal(sourceIp = sourceIp.asInstanceOf[js.Any], accessKey = accessKey.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any], apiKey = apiKey.asInstanceOf[js.Any], apiKeyId = apiKeyId.asInstanceOf[js.Any], caller = caller.asInstanceOf[js.Any], cognitoAuthenticationProvider = cognitoAuthenticationProvider.asInstanceOf[js.Any], cognitoAuthenticationType = cognitoAuthenticationType.asInstanceOf[js.Any], cognitoIdentityId = cognitoIdentityId.asInstanceOf[js.Any], cognitoIdentityPoolId = cognitoIdentityPoolId.asInstanceOf[js.Any], principalOrgId = principalOrgId.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayEventIdentity]
  }
}

