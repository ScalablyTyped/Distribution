package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDetail extends js.Object {
  var Arn: js.UndefOr[arnType] = js.undefined
  /**
    * A list of the managed policies attached to the user.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
  /**
    * The date and time, in ISO 8601 date-time format, when the user was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  /**
    * A list of IAM groups that the user is in.
    */
  var GroupList: js.UndefOr[groupNameListType] = js.undefined
  /**
    * The path to the user. For more information about paths, see IAM Identifiers in the Using IAM guide.
    */
  var Path: js.UndefOr[pathType] = js.undefined
  /**
    * The ARN of the policy used to set the permissions boundary for the user. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined
  /**
    * A list of tags that are associated with the specified user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
  /**
    * The stable and unique string identifying the user. For more information about IDs, see IAM Identifiers in the Using IAM guide.
    */
  var UserId: js.UndefOr[idType] = js.undefined
  /**
    * The friendly name identifying the user.
    */
  var UserName: js.UndefOr[userNameType] = js.undefined
  /**
    * A list of the inline policies embedded in the user.
    */
  var UserPolicyList: js.UndefOr[policyDetailListType] = js.undefined
}

object UserDetail {
  @scala.inline
  def apply(
    Arn: arnType = null,
    AttachedManagedPolicies: attachedPoliciesListType = null,
    CreateDate: dateType = null,
    GroupList: groupNameListType = null,
    Path: pathType = null,
    PermissionsBoundary: AttachedPermissionsBoundary = null,
    Tags: tagListType = null,
    UserId: idType = null,
    UserName: userNameType = null,
    UserPolicyList: policyDetailListType = null
  ): UserDetail = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (AttachedManagedPolicies != null) __obj.updateDynamic("AttachedManagedPolicies")(AttachedManagedPolicies)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (GroupList != null) __obj.updateDynamic("GroupList")(GroupList)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    if (PermissionsBoundary != null) __obj.updateDynamic("PermissionsBoundary")(PermissionsBoundary)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (UserId != null) __obj.updateDynamic("UserId")(UserId)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    if (UserPolicyList != null) __obj.updateDynamic("UserPolicyList")(UserPolicyList)
    __obj.asInstanceOf[UserDetail]
  }
}

