package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyVersionResponse extends js.Object {
  /**
    * Specifies whether the policy version is the default.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.native
  /**
    * The JSON document that describes the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.native
  /**
    * The policy version ID.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.native
}

object CreatePolicyVersionResponse {
  @scala.inline
  def apply(
    isDefaultVersion: js.UndefOr[scala.Boolean] = js.undefined,
    policyArn: PolicyArn = null,
    policyDocument: PolicyDocument = null,
    policyVersionId: PolicyVersionId = null
  ): CreatePolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDefaultVersion)) __obj.updateDynamic("isDefaultVersion")(isDefaultVersion.asInstanceOf[js.Any])
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn.asInstanceOf[js.Any])
    if (policyDocument != null) __obj.updateDynamic("policyDocument")(policyDocument.asInstanceOf[js.Any])
    if (policyVersionId != null) __obj.updateDynamic("policyVersionId")(policyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyVersionResponse]
  }
}

