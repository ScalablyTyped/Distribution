package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockServiceLinkedRoleRequest extends js.Object {
  var RoleArn: __stringMin1Max1600 = js.native
  var Timeout: __integerMin1Max29000 = js.native
}

object LockServiceLinkedRoleRequest {
  @scala.inline
  def apply(RoleArn: __stringMin1Max1600, Timeout: __integerMin1Max29000): LockServiceLinkedRoleRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LockServiceLinkedRoleRequest]
  }
}

