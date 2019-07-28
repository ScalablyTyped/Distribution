package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyVersionResponse extends js.Object {
  /**
    * The date the policy version was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The generation ID of the policy version.
    */
  var generationId: js.UndefOr[GenerationId] = js.undefined
  /**
    * Specifies whether the policy version is the default.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined
  /**
    * The date the policy version was last modified.
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
  /**
    * The policy version ID.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
}

object GetPolicyVersionResponse {
  @scala.inline
  def apply(
    creationDate: DateType = null,
    generationId: GenerationId = null,
    isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
    lastModifiedDate: DateType = null,
    policyArn: PolicyArn = null,
    policyDocument: PolicyDocument = null,
    policyName: PolicyName = null,
    policyVersionId: PolicyVersionId = null
  ): GetPolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (generationId != null) __obj.updateDynamic("generationId")(generationId)
    if (!js.isUndefined(isDefaultVersion)) __obj.updateDynamic("isDefaultVersion")(isDefaultVersion)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn)
    if (policyDocument != null) __obj.updateDynamic("policyDocument")(policyDocument)
    if (policyName != null) __obj.updateDynamic("policyName")(policyName)
    if (policyVersionId != null) __obj.updateDynamic("policyVersionId")(policyVersionId)
    __obj.asInstanceOf[GetPolicyVersionResponse]
  }
}

