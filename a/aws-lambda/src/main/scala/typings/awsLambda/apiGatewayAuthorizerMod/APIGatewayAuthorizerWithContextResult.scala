package typings.awsLambda.apiGatewayAuthorizerMod

import typings.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayAuthorizerWithContextResult[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] extends js.Object {
  var context: TAuthorizerContext
  var policyDocument: PolicyDocument
  var principalId: String
  var usageIdentifierKey: js.UndefOr[String | Null] = js.undefined
}

object APIGatewayAuthorizerWithContextResult {
  @scala.inline
  def apply[TAuthorizerContext](
    context: TAuthorizerContext,
    policyDocument: PolicyDocument,
    principalId: String,
    usageIdentifierKey: js.UndefOr[Null | String] = js.undefined
  ): APIGatewayAuthorizerWithContextResult[TAuthorizerContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    if (!js.isUndefined(usageIdentifierKey)) __obj.updateDynamic("usageIdentifierKey")(usageIdentifierKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]
  }
}

