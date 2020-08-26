package typings.atom.anon

import typings.atom.mod.FocusableHTMLElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFocus[T] extends js.Object {
  var autoFocus: js.UndefOr[Boolean | FocusableHTMLElement] = js.native
  var item: T = js.native
  var priority: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object AutoFocus {
  @scala.inline
  def apply[T](item: T): AutoFocus[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFocus[T]]
  }
  @scala.inline
  implicit class AutoFocusOps[Self <: AutoFocus[_], T] (val x: Self with AutoFocus[T]) extends AnyVal {
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
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoFocusFunction0(value: () => HTMLElement): Self = this.set("autoFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setAutoFocus(value: Boolean | FocusableHTMLElement): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

