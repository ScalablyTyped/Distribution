package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRoutingProfileRequest extends js.Object {
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId = js.native
  /**
    * The identifier of the routing profile for the user.
    */
  var RoutingProfileId: typings.awsDashSdk.clientsConnectMod.RoutingProfileId = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: typings.awsDashSdk.clientsConnectMod.UserId = js.native
}

object UpdateUserRoutingProfileRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, RoutingProfileId: RoutingProfileId, UserId: UserId): UpdateUserRoutingProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateUserRoutingProfileRequest]
  }
}

