package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleDetail extends js.Object {
  var Arn: js.UndefOr[arnType] = js.undefined
  /**
    * The trust policy that grants permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
  /**
    * A list of managed policies attached to the role. These policies are the role's access (permissions) policies.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
  /**
    * The date and time, in ISO 8601 date-time format, when the role was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  /**
    * A list of instance profiles that contain this role.
    */
  var InstanceProfileList: js.UndefOr[instanceProfileListType] = js.undefined
  /**
    * The path to the role. For more information about paths, see IAM Identifiers in the Using IAM guide.
    */
  var Path: js.UndefOr[pathType] = js.undefined
  /**
    * The ARN of the policy used to set the permissions boundary for the role. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined
  /**
    * The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the Using IAM guide.
    */
  var RoleId: js.UndefOr[idType] = js.undefined
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: js.UndefOr[roleNameType] = js.undefined
  /**
    * A list of inline policies embedded in the role. These policies are the role's access (permissions) policies.
    */
  var RolePolicyList: js.UndefOr[policyDetailListType] = js.undefined
  /**
    * A list of tags that are attached to the specified role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
}

object RoleDetail {
  @scala.inline
  def apply(
    Arn: arnType = null,
    AssumeRolePolicyDocument: policyDocumentType = null,
    AttachedManagedPolicies: attachedPoliciesListType = null,
    CreateDate: dateType = null,
    InstanceProfileList: instanceProfileListType = null,
    Path: pathType = null,
    PermissionsBoundary: AttachedPermissionsBoundary = null,
    RoleId: idType = null,
    RoleName: roleNameType = null,
    RolePolicyList: policyDetailListType = null,
    Tags: tagListType = null
  ): RoleDetail = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (AssumeRolePolicyDocument != null) __obj.updateDynamic("AssumeRolePolicyDocument")(AssumeRolePolicyDocument)
    if (AttachedManagedPolicies != null) __obj.updateDynamic("AttachedManagedPolicies")(AttachedManagedPolicies)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (InstanceProfileList != null) __obj.updateDynamic("InstanceProfileList")(InstanceProfileList)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    if (PermissionsBoundary != null) __obj.updateDynamic("PermissionsBoundary")(PermissionsBoundary)
    if (RoleId != null) __obj.updateDynamic("RoleId")(RoleId)
    if (RoleName != null) __obj.updateDynamic("RoleName")(RoleName)
    if (RolePolicyList != null) __obj.updateDynamic("RolePolicyList")(RolePolicyList)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[RoleDetail]
  }
}

