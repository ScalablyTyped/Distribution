package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterUserResponse extends js.Object {
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * The user name.
    */
  var User: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.User] = js.native
  /**
    * The URL the user visits to complete registration and provide a password. This is returned only for users with an identity type of QUICKSIGHT.
    */
  var UserInvitationUrl: js.UndefOr[String] = js.native
}

object RegisterUserResponse {
  @scala.inline
  def apply(
    RequestId: String = null,
    Status: Int | scala.Double = null,
    User: User = null,
    UserInvitationUrl: String = null
  ): RegisterUserResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    if (UserInvitationUrl != null) __obj.updateDynamic("UserInvitationUrl")(UserInvitationUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterUserResponse]
  }
}

