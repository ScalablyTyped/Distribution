package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddSider extends js.Object {
  def addSider(id: String): Unit
  def removeSider(id: String): Unit
}

object AnonAddSider {
  @scala.inline
  def apply(addSider: String => Unit, removeSider: String => Unit): AnonAddSider = {
    val __obj = js.Dynamic.literal(addSider = js.Any.fromFunction1(addSider), removeSider = js.Any.fromFunction1(removeSider))
    __obj.asInstanceOf[AnonAddSider]
  }
}

