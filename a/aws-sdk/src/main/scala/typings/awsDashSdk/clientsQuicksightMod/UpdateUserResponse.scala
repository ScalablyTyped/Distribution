package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserResponse extends js.Object {
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * The http status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  /**
    * The Amazon QuickSight user.
    */
  var User: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.User] = js.undefined
}

object UpdateUserResponse {
  @scala.inline
  def apply(RequestId: String = null, Status: Int | Double = null, User: User = null): UpdateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[UpdateUserResponse]
  }
}

