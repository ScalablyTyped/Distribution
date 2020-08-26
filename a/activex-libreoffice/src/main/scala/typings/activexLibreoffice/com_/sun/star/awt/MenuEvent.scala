package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a menu event. */
@js.native
trait MenuEvent extends EventObject {
  /** contains the item ID. */
  var MenuId: Double = js.native
}

object MenuEvent {
  @scala.inline
  def apply(MenuId: Double, Source: XInterface): MenuEvent = {
    val __obj = js.Dynamic.literal(MenuId = MenuId.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuEvent]
  }
  @scala.inline
  implicit class MenuEventOps[Self <: MenuEvent] (val x: Self) extends AnyVal {
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
    def setMenuId(value: Double): Self = this.set("MenuId", value.asInstanceOf[js.Any])
  }
  
}

