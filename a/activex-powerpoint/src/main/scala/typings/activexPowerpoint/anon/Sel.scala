package typings.activexPowerpoint.anon

import typings.activexPowerpoint.PowerPoint.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sel extends js.Object {
  var Cancel: Boolean = js.native
  val Sel: Selection = js.native
}

object Sel {
  @scala.inline
  def apply(Cancel: Boolean, Sel: Selection): Sel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sel]
  }
  @scala.inline
  implicit class SelOps[Self <: Sel] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSel(value: Selection): Self = this.set("Sel", value.asInstanceOf[js.Any])
  }
  
}

