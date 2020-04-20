package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var text: String
  def cancel(): Unit
}

object AnonCancel {
  @scala.inline
  def apply(cancel: () => Unit, text: String): AnonCancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
}

