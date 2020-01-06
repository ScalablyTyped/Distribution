package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoomMembershipResponse extends js.Object {
  /**
    * The room membership details.
    */
  var RoomMembership: js.UndefOr[typings.awsDashSdk.clientsChimeMod.RoomMembership] = js.native
}

object UpdateRoomMembershipResponse {
  @scala.inline
  def apply(RoomMembership: RoomMembership = null): UpdateRoomMembershipResponse = {
    val __obj = js.Dynamic.literal()
    if (RoomMembership != null) __obj.updateDynamic("RoomMembership")(RoomMembership.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoomMembershipResponse]
  }
}

