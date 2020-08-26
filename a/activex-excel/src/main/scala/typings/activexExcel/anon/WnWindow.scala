package typings.activexExcel.anon

import typings.activexExcel.Excel.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WnWindow extends js.Object {
  val Wn: Window = js.native
}

object WnWindow {
  @scala.inline
  def apply(Wn: Window): WnWindow = {
    val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WnWindow]
  }
  @scala.inline
  implicit class WnWindowOps[Self <: WnWindow] (val x: Self) extends AnyVal {
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
    def setWn(value: Window): Self = this.set("Wn", value.asInstanceOf[js.Any])
  }
  
}

