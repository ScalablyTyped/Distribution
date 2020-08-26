package typings.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuOptions extends js.Object {
  var color: String = js.native
  var menuItems: js.Array[MenuItem] = js.native
  var title: String = js.native
}

object MenuOptions {
  @scala.inline
  def apply(color: String, menuItems: js.Array[MenuItem], title: String): MenuOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuItemsVarargs(value: MenuItem*): Self = this.set("menuItems", js.Array(value :_*))
    @scala.inline
    def setMenuItems(value: js.Array[MenuItem]): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

