package typings.activexLibreoffice.com_.sun.star.mozilla

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Explains a change for a menu item */
@js.native
trait MenuSingleChange extends js.Object {
  /** value of change */
  var Change: js.Any = js.native
  /** ID identifying the type of change in the any type change */
  var ChangeID: Double = js.native
  /** unique ID of this menu item */
  var ID: Double = js.native
}

object MenuSingleChange {
  @scala.inline
  def apply(Change: js.Any, ChangeID: Double, ID: Double): MenuSingleChange = {
    val __obj = js.Dynamic.literal(Change = Change.asInstanceOf[js.Any], ChangeID = ChangeID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuSingleChange]
  }
  @scala.inline
  implicit class MenuSingleChangeOps[Self <: MenuSingleChange] (val x: Self) extends AnyVal {
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
    def setChange(value: js.Any): Self = this.set("Change", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeID(value: Double): Self = this.set("ChangeID", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
  }
  
}

