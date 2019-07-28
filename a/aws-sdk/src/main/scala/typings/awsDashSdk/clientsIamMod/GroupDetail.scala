package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupDetail extends js.Object {
  var Arn: js.UndefOr[arnType] = js.undefined
  /**
    * A list of the managed policies attached to the group.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
  /**
    * The date and time, in ISO 8601 date-time format, when the group was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  /**
    * The stable and unique string identifying the group. For more information about IDs, see IAM Identifiers in the Using IAM guide.
    */
  var GroupId: js.UndefOr[idType] = js.undefined
  /**
    * The friendly name that identifies the group.
    */
  var GroupName: js.UndefOr[groupNameType] = js.undefined
  /**
    * A list of the inline policies embedded in the group.
    */
  var GroupPolicyList: js.UndefOr[policyDetailListType] = js.undefined
  /**
    * The path to the group. For more information about paths, see IAM Identifiers in the Using IAM guide.
    */
  var Path: js.UndefOr[pathType] = js.undefined
}

object GroupDetail {
  @scala.inline
  def apply(
    Arn: arnType = null,
    AttachedManagedPolicies: attachedPoliciesListType = null,
    CreateDate: dateType = null,
    GroupId: idType = null,
    GroupName: groupNameType = null,
    GroupPolicyList: policyDetailListType = null,
    Path: pathType = null
  ): GroupDetail = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (AttachedManagedPolicies != null) __obj.updateDynamic("AttachedManagedPolicies")(AttachedManagedPolicies)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (GroupPolicyList != null) __obj.updateDynamic("GroupPolicyList")(GroupPolicyList)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[GroupDetail]
  }
}

