package typings.awsLambda.apiGatewayAuthorizerMod

import typings.awsLambda.awsLambdaStrings.TOKEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayTokenAuthorizerEvent extends APIGatewayAuthorizerEvent {
  var authorizationToken: String
  var methodArn: String
  var `type`: TOKEN
}

object APIGatewayTokenAuthorizerEvent {
  @scala.inline
  def apply(authorizationToken: String, methodArn: String, `type`: TOKEN): APIGatewayTokenAuthorizerEvent = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayTokenAuthorizerEvent]
  }
}

