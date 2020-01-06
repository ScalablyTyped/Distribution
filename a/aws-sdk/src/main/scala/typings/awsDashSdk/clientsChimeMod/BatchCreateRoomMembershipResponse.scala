package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateRoomMembershipResponse extends js.Object {
  /**
    * If the action fails for one or more of the member IDs in the request, a list of the member IDs is returned, along with error codes and error messages.
    */
  var Errors: js.UndefOr[MemberErrorList] = js.native
}

object BatchCreateRoomMembershipResponse {
  @scala.inline
  def apply(Errors: MemberErrorList = null): BatchCreateRoomMembershipResponse = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateRoomMembershipResponse]
  }
}

