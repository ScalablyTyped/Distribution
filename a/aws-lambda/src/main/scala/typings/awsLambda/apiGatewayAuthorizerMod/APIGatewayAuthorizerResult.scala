package typings.awsLambda.apiGatewayAuthorizerMod

import typings.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayAuthorizerResult extends js.Object {
  var context: js.UndefOr[APIGatewayAuthorizerResultContext | Null] = js.undefined
  var policyDocument: PolicyDocument
  var principalId: String
  var usageIdentifierKey: js.UndefOr[String | Null] = js.undefined
}

object APIGatewayAuthorizerResult {
  @scala.inline
  def apply(
    policyDocument: PolicyDocument,
    principalId: String,
    context: js.UndefOr[Null | APIGatewayAuthorizerResultContext] = js.undefined,
    usageIdentifierKey: js.UndefOr[Null | String] = js.undefined
  ): APIGatewayAuthorizerResult = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(usageIdentifierKey)) __obj.updateDynamic("usageIdentifierKey")(usageIdentifierKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerResult]
  }
}

