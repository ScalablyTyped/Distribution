package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMailboxDetailsResponse extends js.Object {
  /**
    * The maximum allowed mailbox size, in MB, for the specified user.
    */
  var MailboxQuota: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.MailboxQuota] = js.native
  /**
    * The current mailbox size, in MB, for the specified user.
    */
  var MailboxSize: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.MailboxSize] = js.native
}

object GetMailboxDetailsResponse {
  @scala.inline
  def apply(MailboxQuota: Int | Double = null, MailboxSize: Int | Double = null): GetMailboxDetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (MailboxQuota != null) __obj.updateDynamic("MailboxQuota")(MailboxQuota.asInstanceOf[js.Any])
    if (MailboxSize != null) __obj.updateDynamic("MailboxSize")(MailboxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMailboxDetailsResponse]
  }
}

