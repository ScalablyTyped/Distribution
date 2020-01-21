package typings.asana.mod.resources.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventError extends js.Object {
  var message: String
}

object EventError {
  @scala.inline
  def apply(message: String): EventError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventError]
  }
}

