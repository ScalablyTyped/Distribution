package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuOptions extends js.Object {
  /** The command to trigger when the item is clicked. */
  var command: js.UndefOr[String] = js.native
  /** The menu itme's label. */
  var label: String = js.native
  /** An array of sub menus. */
  var submenu: js.UndefOr[js.Array[MenuOptions]] = js.native
}

object MenuOptions {
  @scala.inline
  def apply(label: String): MenuOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOptions]
  }
  @scala.inline
  implicit class MenuOptionsOps[Self <: MenuOptions] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    @scala.inline
    def setSubmenuVarargs(value: MenuOptions*): Self = this.set("submenu", js.Array(value :_*))
    @scala.inline
    def setSubmenu(value: js.Array[MenuOptions]): Self = this.set("submenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmenu: Self = this.set("submenu", js.undefined)
  }
  
}

