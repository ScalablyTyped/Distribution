package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyResponse extends js.Object {
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.undefined
  /**
    * The JSON document that describes the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
  /**
    * The policy name.
    */
  var policyName: js.UndefOr[PolicyName] = js.undefined
  /**
    * The policy version ID.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
}

object CreatePolicyResponse {
  @scala.inline
  def apply(
    policyArn: PolicyArn = null,
    policyDocument: PolicyDocument = null,
    policyName: PolicyName = null,
    policyVersionId: PolicyVersionId = null
  ): CreatePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn)
    if (policyDocument != null) __obj.updateDynamic("policyDocument")(policyDocument)
    if (policyName != null) __obj.updateDynamic("policyName")(policyName)
    if (policyVersionId != null) __obj.updateDynamic("policyVersionId")(policyVersionId)
    __obj.asInstanceOf[CreatePolicyResponse]
  }
}

