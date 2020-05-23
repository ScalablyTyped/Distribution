package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewMessages extends js.Object {
  var mailboxName: String
  var newMessages: Double
  var oldMessages: Double
}

object NewMessages {
  @scala.inline
  def apply(mailboxName: String, newMessages: Double, oldMessages: Double): NewMessages = {
    val __obj = js.Dynamic.literal(mailboxName = mailboxName.asInstanceOf[js.Any], newMessages = newMessages.asInstanceOf[js.Any], oldMessages = oldMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewMessages]
  }
}

