package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserSecurityProfilesRequest extends js.Object {
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId = js.native
  /**
    * The identifiers of the security profiles for the user.
    */
  var SecurityProfileIds: typings.awsDashSdk.clientsConnectMod.SecurityProfileIds = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: typings.awsDashSdk.clientsConnectMod.UserId = js.native
}

object UpdateUserSecurityProfilesRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, SecurityProfileIds: SecurityProfileIds, UserId: UserId): UpdateUserSecurityProfilesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SecurityProfileIds = SecurityProfileIds.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateUserSecurityProfilesRequest]
  }
}

