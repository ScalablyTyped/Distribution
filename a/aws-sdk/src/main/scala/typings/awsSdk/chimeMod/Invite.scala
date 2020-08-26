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
  def apply(): Invite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invite]
  }
  @scala.inline
  implicit class InviteOps[Self <: Invite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("EmailAddress", js.undefined)
    @scala.inline
    def setEmailStatus(value: EmailStatus): Self = this.set("EmailStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailStatus: Self = this.set("EmailStatus", js.undefined)
    @scala.inline
    def setInviteId(value: String): Self = this.set("InviteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInviteId: Self = this.set("InviteId", js.undefined)
    @scala.inline
    def setStatus(value: InviteStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

