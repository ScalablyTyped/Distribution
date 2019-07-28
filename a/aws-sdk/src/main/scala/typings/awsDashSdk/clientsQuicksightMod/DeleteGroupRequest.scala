package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGroupRequest extends js.Object {
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId
  /**
    * The name of the group that you want to delete.
    */
  var GroupName: typings.awsDashSdk.clientsQuicksightMod.GroupName
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsDashSdk.clientsQuicksightMod.Namespace
}

object DeleteGroupRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, GroupName: GroupName, Namespace: Namespace): DeleteGroupRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId, GroupName = GroupName, Namespace = Namespace)
  
    __obj.asInstanceOf[DeleteGroupRequest]
  }
}

