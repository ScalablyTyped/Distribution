package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRoomMembershipsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The room membership details.
    */
  var RoomMemberships: js.UndefOr[RoomMembershipList] = js.native
}

object ListRoomMembershipsResponse {
  @scala.inline
  def apply(NextToken: String = null, RoomMemberships: RoomMembershipList = null): ListRoomMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RoomMemberships != null) __obj.updateDynamic("RoomMemberships")(RoomMemberships.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRoomMembershipsResponse]
  }
}

