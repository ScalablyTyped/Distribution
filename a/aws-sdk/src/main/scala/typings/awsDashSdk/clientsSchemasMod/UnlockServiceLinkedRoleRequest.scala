package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnlockServiceLinkedRoleRequest extends js.Object {
  var RoleArn: __stringMin1Max1600 = js.native
}

object UnlockServiceLinkedRoleRequest {
  @scala.inline
  def apply(RoleArn: __stringMin1Max1600): UnlockServiceLinkedRoleRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnlockServiceLinkedRoleRequest]
  }
}

