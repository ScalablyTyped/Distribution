package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  def cancel(): Unit
}

object AnonCancel {
  @scala.inline
  def apply(cancel: () => Unit): AnonCancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
  
    __obj.asInstanceOf[AnonCancel]
  }
}

