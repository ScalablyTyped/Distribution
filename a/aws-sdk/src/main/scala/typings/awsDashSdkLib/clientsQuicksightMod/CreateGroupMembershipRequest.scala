package typings
package awsDashSdkLib.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupMembershipRequest extends js.Object {
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.AwsAccountId
  /**
    * The name of the group that you want to add the user to.
    */
  var GroupName: awsDashSdkLib.clientsQuicksightMod.GroupName
  /**
    * The name of the user that you want to add to the group membership.
    */
  var MemberName: GroupMemberName
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: awsDashSdkLib.clientsQuicksightMod.Namespace
}

object CreateGroupMembershipRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    GroupName: GroupName,
    MemberName: GroupMemberName,
    Namespace: Namespace
  ): CreateGroupMembershipRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId, GroupName = GroupName, MemberName = MemberName, Namespace = Namespace)
  
    __obj.asInstanceOf[CreateGroupMembershipRequest]
  }
}

