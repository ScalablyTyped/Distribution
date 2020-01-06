package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserRequest extends js.Object {
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: typings.awsDashSdk.clientsConnectMod.UserId = js.native
}

object DescribeUserRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, UserId: UserId): DescribeUserRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeUserRequest]
  }
}

