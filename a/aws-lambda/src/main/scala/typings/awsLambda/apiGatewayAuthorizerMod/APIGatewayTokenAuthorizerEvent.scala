package typings.awsLambda.apiGatewayAuthorizerMod

import typings.awsLambda.awsLambdaStrings.TOKEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayTokenAuthorizerEvent extends APIGatewayAuthorizerEvent {
  var authorizationToken: String = js.native
  var methodArn: String = js.native
  var `type`: TOKEN = js.native
}

object APIGatewayTokenAuthorizerEvent {
  @scala.inline
  def apply(authorizationToken: String, methodArn: String, `type`: TOKEN): APIGatewayTokenAuthorizerEvent = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayTokenAuthorizerEvent]
  }
  @scala.inline
  implicit class APIGatewayTokenAuthorizerEventOps[Self <: APIGatewayTokenAuthorizerEvent] (val x: Self) extends AnyVal {
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
    def setAuthorizationToken(value: String): Self = this.set("authorizationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodArn(value: String): Self = this.set("methodArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TOKEN): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

