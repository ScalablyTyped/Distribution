package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateRoomMembershipRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The list of membership items.
    */
  var MembershipItemList: typings.awsDashSdk.clientsChimeMod.MembershipItemList = js.native
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString = js.native
}

object BatchCreateRoomMembershipRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, MembershipItemList: MembershipItemList, RoomId: NonEmptyString): BatchCreateRoomMembershipRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], MembershipItemList = MembershipItemList.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchCreateRoomMembershipRequest]
  }
}

