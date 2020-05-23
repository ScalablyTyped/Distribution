package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailboxName extends js.Object {
  var mailboxName: String
}

object MailboxName {
  @scala.inline
  def apply(mailboxName: String): MailboxName = {
    val __obj = js.Dynamic.literal(mailboxName = mailboxName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailboxName]
  }
}

