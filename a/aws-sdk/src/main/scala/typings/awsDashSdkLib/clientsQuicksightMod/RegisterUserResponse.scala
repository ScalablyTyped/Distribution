package typings
package awsDashSdkLib.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterUserResponse extends js.Object {
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * The http status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  /**
    * The user name.
    */
  var User: js.UndefOr[User] = js.undefined
  /**
    * The URL the user visits to complete registration and provide a password. This is returned only for users with an identity type of QUICKSIGHT.
    */
  var UserInvitationUrl: js.UndefOr[String] = js.undefined
}

object RegisterUserResponse {
  @scala.inline
  def apply(
    RequestId: String = null,
    Status: js.UndefOr[StatusCode] = js.undefined,
    User: User = null,
    UserInvitationUrl: String = null
  ): RegisterUserResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status)
    if (User != null) __obj.updateDynamic("User")(User)
    if (UserInvitationUrl != null) __obj.updateDynamic("UserInvitationUrl")(UserInvitationUrl)
    __obj.asInstanceOf[RegisterUserResponse]
  }
}

