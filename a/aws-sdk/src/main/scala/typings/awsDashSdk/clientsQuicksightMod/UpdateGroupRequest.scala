package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGroupRequest extends js.Object {
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId
  /**
    * The description for the group that you want to update.
    */
  var Description: js.UndefOr[GroupDescription] = js.undefined
  /**
    * The name of the group that you want to update.
    */
  var GroupName: typings.awsDashSdk.clientsQuicksightMod.GroupName
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsDashSdk.clientsQuicksightMod.Namespace
}

object UpdateGroupRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    GroupName: GroupName,
    Namespace: Namespace,
    Description: GroupDescription = null
  ): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId, GroupName = GroupName, Namespace = Namespace)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[UpdateGroupRequest]
  }
}

