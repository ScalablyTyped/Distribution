package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAuthorizerResult extends js.Object {
  var context: js.UndefOr[AuthResponseContext] = js.undefined
  var policyDocument: PolicyDocument
  var principalId: java.lang.String
  var usageIdentifierKey: js.UndefOr[java.lang.String] = js.undefined
}

object CustomAuthorizerResult {
  @scala.inline
  def apply(
    policyDocument: PolicyDocument,
    principalId: java.lang.String,
    context: AuthResponseContext = null,
    usageIdentifierKey: java.lang.String = null
  ): CustomAuthorizerResult = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument, principalId = principalId)
    if (context != null) __obj.updateDynamic("context")(context)
    if (usageIdentifierKey != null) __obj.updateDynamic("usageIdentifierKey")(usageIdentifierKey)
    __obj.asInstanceOf[CustomAuthorizerResult]
  }
}

