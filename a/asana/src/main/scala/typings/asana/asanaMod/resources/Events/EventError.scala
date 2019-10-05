package typings.asana.asanaMod.resources.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventError extends js.Object {
  var message: String
}

object EventError {
  @scala.inline
  def apply(message: String): EventError = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[EventError]
  }
}

