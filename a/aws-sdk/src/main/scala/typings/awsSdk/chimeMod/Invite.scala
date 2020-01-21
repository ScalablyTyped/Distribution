package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invite extends js.Object {
  /**
    * The email address to which the invite is sent.
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.chimeMod.EmailAddress] = js.native
  /**
    * The status of the invite email.
    */
  var EmailStatus: js.UndefOr[typings.awsSdk.chimeMod.EmailStatus] = js.native
  /**
    * The invite ID.
    */
  var InviteId: js.UndefOr[String] = js.native
  /**
    * The status of the invite.
    */
  var Status: js.UndefOr[InviteStatus] = js.native
}

object Invite {
  @scala.inline
  def apply(
    EmailAddress: EmailAddress = null,
    EmailStatus: EmailStatus = null,
    InviteId: String = null,
    Status: InviteStatus = null
  ): Invite = {
    val __obj = js.Dynamic.literal()
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress.asInstanceOf[js.Any])
    if (EmailStatus != null) __obj.updateDynamic("EmailStatus")(EmailStatus.asInstanceOf[js.Any])
    if (InviteId != null) __obj.updateDynamic("InviteId")(InviteId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invite]
  }
}

