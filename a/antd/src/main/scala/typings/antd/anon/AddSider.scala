package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSider extends js.Object {
  def addSider(id: String): Unit
  def removeSider(id: String): Unit
}

object AddSider {
  @scala.inline
  def apply(addSider: String => Unit, removeSider: String => Unit): AddSider = {
    val __obj = js.Dynamic.literal(addSider = js.Any.fromFunction1(addSider), removeSider = js.Any.fromFunction1(removeSider))
    __obj.asInstanceOf[AddSider]
  }
}

