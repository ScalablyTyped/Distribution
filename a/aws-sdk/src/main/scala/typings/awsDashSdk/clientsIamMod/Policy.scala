package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  var Arn: js.UndefOr[arnType] = js.undefined
  /**
    * The number of entities (users, groups, and roles) that the policy is attached to.
    */
  var AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined
  /**
    * The date and time, in ISO 8601 date-time format, when the policy was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  /**
    * The identifier for the version of the policy that is set as the default version.
    */
  var DefaultVersionId: js.UndefOr[policyVersionIdType] = js.undefined
  /**
    * A friendly description of the policy. This element is included in the response to the GetPolicy operation. It is not included in the response to the ListPolicies operation. 
    */
  var Description: js.UndefOr[policyDescriptionType] = js.undefined
  /**
    * Specifies whether the policy can be attached to an IAM user, group, or role.
    */
  var IsAttachable: js.UndefOr[booleanType] = js.undefined
  /**
    * The path to the policy. For more information about paths, see IAM Identifiers in the Using IAM guide.
    */
  var Path: js.UndefOr[policyPathType] = js.undefined
  /**
    * The number of entities (users and roles) for which the policy is used to set the permissions boundary.  For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.undefined
  /**
    * The stable and unique string identifying the policy. For more information about IDs, see IAM Identifiers in the Using IAM guide.
    */
  var PolicyId: js.UndefOr[idType] = js.undefined
  /**
    * The friendly name (not ARN) identifying the policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.undefined
  /**
    * The date and time, in ISO 8601 date-time format, when the policy was last updated. When a policy has only one version, this field contains the date and time when the policy was created. When a policy has more than one version, this field contains the date and time when the most recent policy version was created.
    */
  var UpdateDate: js.UndefOr[dateType] = js.undefined
}

object Policy {
  @scala.inline
  def apply(
    Arn: arnType = null,
    AttachmentCount: Int | Double = null,
    CreateDate: dateType = null,
    DefaultVersionId: policyVersionIdType = null,
    Description: policyDescriptionType = null,
    IsAttachable: js.UndefOr[Boolean] = js.undefined,
    Path: policyPathType = null,
    PermissionsBoundaryUsageCount: Int | Double = null,
    PolicyId: idType = null,
    PolicyName: policyNameType = null,
    UpdateDate: dateType = null
  ): Policy = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (AttachmentCount != null) __obj.updateDynamic("AttachmentCount")(AttachmentCount.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (DefaultVersionId != null) __obj.updateDynamic("DefaultVersionId")(DefaultVersionId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(IsAttachable)) __obj.updateDynamic("IsAttachable")(IsAttachable)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    if (PermissionsBoundaryUsageCount != null) __obj.updateDynamic("PermissionsBoundaryUsageCount")(PermissionsBoundaryUsageCount.asInstanceOf[js.Any])
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId)
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName)
    if (UpdateDate != null) __obj.updateDynamic("UpdateDate")(UpdateDate)
    __obj.asInstanceOf[Policy]
  }
}

