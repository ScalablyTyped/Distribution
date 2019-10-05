package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyVersionRequest extends js.Object {
  /**
    * The JSON document that describes the policy. Minimum length of 1. Maximum length of 2048, excluding whitespace.
    */
  var policyDocument: PolicyDocument
  /**
    * The policy name.
    */
  var policyName: PolicyName
  /**
    * Specifies whether the policy version is set as the default. When this parameter is true, the new policy version becomes the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
    */
  var setAsDefault: js.UndefOr[SetAsDefault] = js.undefined
}

object CreatePolicyVersionRequest {
  @scala.inline
  def apply(
    policyDocument: PolicyDocument,
    policyName: PolicyName,
    setAsDefault: js.UndefOr[scala.Boolean] = js.undefined
  ): CreatePolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument, policyName = policyName)
    if (!js.isUndefined(setAsDefault)) __obj.updateDynamic("setAsDefault")(setAsDefault)
    __obj.asInstanceOf[CreatePolicyVersionRequest]
  }
}

