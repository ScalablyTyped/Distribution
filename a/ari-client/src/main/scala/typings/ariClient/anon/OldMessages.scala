package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldMessages extends js.Object {
  var newMessages: Double
  var oldMessages: Double
}

object OldMessages {
  @scala.inline
  def apply(newMessages: Double, oldMessages: Double): OldMessages = {
    val __obj = js.Dynamic.literal(newMessages = newMessages.asInstanceOf[js.Any], oldMessages = oldMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldMessages]
  }
}

