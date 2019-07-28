package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserRoutingProfileRequest extends js.Object {
  /**
    * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId
  /**
    * The identifier of the routing profile to assign to the user.
    */
  var RoutingProfileId: typings.awsDashSdk.clientsConnectMod.RoutingProfileId
  /**
    * The identifier for the user account to assign the routing profile to.
    */
  var UserId: typings.awsDashSdk.clientsConnectMod.UserId
}

object UpdateUserRoutingProfileRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, RoutingProfileId: RoutingProfileId, UserId: UserId): UpdateUserRoutingProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, RoutingProfileId = RoutingProfileId, UserId = UserId)
  
    __obj.asInstanceOf[UpdateUserRoutingProfileRequest]
  }
}

