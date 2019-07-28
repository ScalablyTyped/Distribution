package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddSider extends js.Object {
  def addSider(id: String): Unit
  def removeSider(id: String): Unit
}

object Anon_AddSider {
  @scala.inline
  def apply(addSider: String => Unit, removeSider: String => Unit): Anon_AddSider = {
    val __obj = js.Dynamic.literal(addSider = js.Any.fromFunction1(addSider), removeSider = js.Any.fromFunction1(removeSider))
  
    __obj.asInstanceOf[Anon_AddSider]
  }
}

