package typings.activexExcel.anon

import typings.activexExcel.Excel.Window
import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wn extends js.Object {
  val Wb: Workbook = js.native
  val Wn: Window = js.native
}

object Wn {
  @scala.inline
  def apply(Wb: Workbook, Wn: Window): Wn = {
    val __obj = js.Dynamic.literal(Wb = Wb.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wn]
  }
  @scala.inline
  implicit class WnOps[Self <: Wn] (val x: Self) extends AnyVal {
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
    def setWb(value: Workbook): Self = this.set("Wb", value.asInstanceOf[js.Any])
    @scala.inline
    def setWn(value: Window): Self = this.set("Wn", value.asInstanceOf[js.Any])
  }
  
}

