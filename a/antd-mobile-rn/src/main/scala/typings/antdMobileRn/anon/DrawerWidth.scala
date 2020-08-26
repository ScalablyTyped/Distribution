package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerWidth extends js.Object {
  var drawerWidth: Double = js.native
  var open: Boolean = js.native
  var position: String = js.native
}

object DrawerWidth {
  @scala.inline
  def apply(drawerWidth: Double, open: Boolean, position: String): DrawerWidth = {
    val __obj = js.Dynamic.literal(drawerWidth = drawerWidth.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerWidth]
  }
  @scala.inline
  implicit class DrawerWidthOps[Self <: DrawerWidth] (val x: Self) extends AnyVal {
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
    def setDrawerWidth(value: Double): Self = this.set("drawerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

