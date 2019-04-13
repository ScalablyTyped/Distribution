package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserHierarchyRequest extends js.Object {
  /**
    * The identifier for the hierarchy group to assign to the user.
    */
  var HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined
  /**
    * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
    */
  var InstanceId: awsDashSdkLib.clientsConnectMod.InstanceId
  /**
    * The identifier of the user account to assign the hierarchy group to.
    */
  var UserId: awsDashSdkLib.clientsConnectMod.UserId
}

object UpdateUserHierarchyRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, UserId: UserId, HierarchyGroupId: HierarchyGroupId = null): UpdateUserHierarchyRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, UserId = UserId)
    if (HierarchyGroupId != null) __obj.updateDynamic("HierarchyGroupId")(HierarchyGroupId)
    __obj.asInstanceOf[UpdateUserHierarchyRequest]
  }
}

