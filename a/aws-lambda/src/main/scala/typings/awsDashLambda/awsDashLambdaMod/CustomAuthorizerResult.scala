package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAuthorizerResult extends js.Object {
  var context: js.UndefOr[AuthResponseContext] = js.undefined
  var policyDocument: PolicyDocument
  var principalId: String
  var usageIdentifierKey: js.UndefOr[String] = js.undefined
}

object CustomAuthorizerResult {
  @scala.inline
  def apply(
    policyDocument: PolicyDocument,
    principalId: String,
    context: AuthResponseContext = null,
    usageIdentifierKey: String = null
  ): CustomAuthorizerResult = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument, principalId = principalId)
    if (context != null) __obj.updateDynamic("context")(context)
    if (usageIdentifierKey != null) __obj.updateDynamic("usageIdentifierKey")(usageIdentifierKey)
    __obj.asInstanceOf[CustomAuthorizerResult]
  }
}

