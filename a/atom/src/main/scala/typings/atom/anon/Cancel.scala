package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var text: String
  def cancel(): Unit
}

object Cancel {
  @scala.inline
  def apply(cancel: () => Unit, text: String): Cancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

