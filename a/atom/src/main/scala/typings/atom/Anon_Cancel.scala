package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var text: String
  def cancel(): Unit
}

object Anon_Cancel {
  @scala.inline
  def apply(cancel: () => Unit, text: String): Anon_Cancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), text = text)
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

