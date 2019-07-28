package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyVersionResponse extends js.Object {
  /**
    * Specifies whether the policy version is the default.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.undefined
  /**
    * The JSON document that describes the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
  /**
    * The policy version ID.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
}

object CreatePolicyVersionResponse {
  @scala.inline
  def apply(
    isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
    policyArn: PolicyArn = null,
    policyDocument: PolicyDocument = null,
    policyVersionId: PolicyVersionId = null
  ): CreatePolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDefaultVersion)) __obj.updateDynamic("isDefaultVersion")(isDefaultVersion)
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn)
    if (policyDocument != null) __obj.updateDynamic("policyDocument")(policyDocument)
    if (policyVersionId != null) __obj.updateDynamic("policyVersionId")(policyVersionId)
    __obj.asInstanceOf[CreatePolicyVersionResponse]
  }
}

