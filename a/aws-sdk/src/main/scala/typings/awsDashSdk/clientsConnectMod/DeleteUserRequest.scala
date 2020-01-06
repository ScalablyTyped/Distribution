package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserRequest extends js.Object {
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId = js.native
  /**
    * The identifier of the user.
    */
  var UserId: typings.awsDashSdk.clientsConnectMod.UserId = js.native
}

object DeleteUserRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, UserId: UserId): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

