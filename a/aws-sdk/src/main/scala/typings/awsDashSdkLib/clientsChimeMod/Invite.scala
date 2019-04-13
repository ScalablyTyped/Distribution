package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invite extends js.Object {
  /**
    * The email address to which the invite is sent.
    */
  var EmailAddress: js.UndefOr[EmailAddress] = js.undefined
  /**
    * The status of the invite email.
    */
  var EmailStatus: js.UndefOr[EmailStatus] = js.undefined
  /**
    * The invite ID.
    */
  var InviteId: js.UndefOr[String] = js.undefined
  /**
    * The status of the invite.
    */
  var Status: js.UndefOr[InviteStatus] = js.undefined
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
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress)
    if (EmailStatus != null) __obj.updateDynamic("EmailStatus")(EmailStatus.asInstanceOf[js.Any])
    if (InviteId != null) __obj.updateDynamic("InviteId")(InviteId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invite]
  }
}

