package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateManagedInstanceRoleRequest extends js.Object {
  /**
    * The IAM role you want to assign or change.
    */
  var IamRole: typings.awsDashSdk.clientsSsmMod.IamRole
  /**
    * The ID of the managed instance where you want to update the role.
    */
  var InstanceId: ManagedInstanceId
}

object UpdateManagedInstanceRoleRequest {
  @scala.inline
  def apply(IamRole: IamRole, InstanceId: ManagedInstanceId): UpdateManagedInstanceRoleRequest = {
    val __obj = js.Dynamic.literal(IamRole = IamRole, InstanceId = InstanceId)
  
    __obj.asInstanceOf[UpdateManagedInstanceRoleRequest]
  }
}

