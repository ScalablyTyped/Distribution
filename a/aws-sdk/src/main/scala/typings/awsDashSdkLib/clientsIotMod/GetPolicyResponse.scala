package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyResponse extends js.Object {
  /**
    * The date the policy was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The default policy version ID.
    */
  var defaultVersionId: js.UndefOr[PolicyVersionId] = js.undefined
  /**
    * The generation ID of the policy.
    */
  var generationId: js.UndefOr[GenerationId] = js.undefined
  /**
    * The date the policy was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.undefined
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
}

object GetPolicyResponse {
  @scala.inline
  def apply(
    creationDate: DateType = null,
    defaultVersionId: PolicyVersionId = null,
    generationId: GenerationId = null,
    lastModifiedDate: DateType = null,
    policyArn: PolicyArn = null,
    policyDocument: PolicyDocument = null,
    policyName: PolicyName = null
  ): GetPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (defaultVersionId != null) __obj.updateDynamic("defaultVersionId")(defaultVersionId)
    if (generationId != null) __obj.updateDynamic("generationId")(generationId)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn)
    if (policyDocument != null) __obj.updateDynamic("policyDocument")(policyDocument)
    if (policyName != null) __obj.updateDynamic("policyName")(policyName)
    __obj.asInstanceOf[GetPolicyResponse]
  }
}

