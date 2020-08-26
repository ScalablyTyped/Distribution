package typings.awsLambda.apiGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayEventIdentity extends js.Object {
  var accessKey: String | Null = js.native
  var accountId: String | Null = js.native
  var apiKey: String | Null = js.native
  var apiKeyId: String | Null = js.native
  var caller: String | Null = js.native
  var cognitoAuthenticationProvider: String | Null = js.native
  var cognitoAuthenticationType: String | Null = js.native
  var cognitoIdentityId: String | Null = js.native
  var cognitoIdentityPoolId: String | Null = js.native
  var principalOrgId: String | Null = js.native
  var sourceIp: String = js.native
  var user: String | Null = js.native
  var userAgent: String | Null = js.native
  var userArn: String | Null = js.native
}

object APIGatewayEventIdentity {
  @scala.inline
  def apply(sourceIp: String): APIGatewayEventIdentity = {
    val __obj = js.Dynamic.literal(sourceIp = sourceIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayEventIdentity]
  }
  @scala.inline
  implicit class APIGatewayEventIdentityOps[Self <: APIGatewayEventIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSourceIp(value: String): Self = this.set("sourceIp", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessKeyNull: Self = this.set("accessKey", null)
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountIdNull: Self = this.set("accountId", null)
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiKeyNull: Self = this.set("apiKey", null)
    @scala.inline
    def setApiKeyId(value: String): Self = this.set("apiKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiKeyIdNull: Self = this.set("apiKeyId", null)
    @scala.inline
    def setCaller(value: String): Self = this.set("caller", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallerNull: Self = this.set("caller", null)
    @scala.inline
    def setCognitoAuthenticationProvider(value: String): Self = this.set("cognitoAuthenticationProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setCognitoAuthenticationProviderNull: Self = this.set("cognitoAuthenticationProvider", null)
    @scala.inline
    def setCognitoAuthenticationType(value: String): Self = this.set("cognitoAuthenticationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCognitoAuthenticationTypeNull: Self = this.set("cognitoAuthenticationType", null)
    @scala.inline
    def setCognitoIdentityId(value: String): Self = this.set("cognitoIdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCognitoIdentityIdNull: Self = this.set("cognitoIdentityId", null)
    @scala.inline
    def setCognitoIdentityPoolId(value: String): Self = this.set("cognitoIdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCognitoIdentityPoolIdNull: Self = this.set("cognitoIdentityPoolId", null)
    @scala.inline
    def setPrincipalOrgId(value: String): Self = this.set("principalOrgId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrincipalOrgIdNull: Self = this.set("principalOrgId", null)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserNull: Self = this.set("user", null)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserAgentNull: Self = this.set("userAgent", null)
    @scala.inline
    def setUserArn(value: String): Self = this.set("userArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserArnNull: Self = this.set("userArn", null)
  }
  
}

