package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoomMembershipResponse extends js.Object {
  /**
    * The room membership details.
    */
  var RoomMembership: js.UndefOr[typings.awsSdk.chimeMod.RoomMembership] = js.native
}

object CreateRoomMembershipResponse {
  @scala.inline
  def apply(RoomMembership: RoomMembership = null): CreateRoomMembershipResponse = {
    val __obj = js.Dynamic.literal()
    if (RoomMembership != null) __obj.updateDynamic("RoomMembership")(RoomMembership.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomMembershipResponse]
  }
}

