package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSider extends js.Object {
  def addSider(id: String): Unit = js.native
  def removeSider(id: String): Unit = js.native
}

object AddSider {
  @scala.inline
  def apply(addSider: String => Unit, removeSider: String => Unit): AddSider = {
    val __obj = js.Dynamic.literal(addSider = js.Any.fromFunction1(addSider), removeSider = js.Any.fromFunction1(removeSider))
    __obj.asInstanceOf[AddSider]
  }
  @scala.inline
  implicit class AddSiderOps[Self <: AddSider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddSider(value: String => Unit): Self = this.set("addSider", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveSider(value: String => Unit): Self = this.set("removeSider", js.Any.fromFunction1(value))
  }
  
}

