package typings.activexExcel.anon

import typings.activexExcel.Excel.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pvw extends js.Object {
  val Pvw: ProtectedViewWindow = js.native
}

object Pvw {
  @scala.inline
  def apply(Pvw: ProtectedViewWindow): Pvw = {
    val __obj = js.Dynamic.literal(Pvw = Pvw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pvw]
  }
  @scala.inline
  implicit class PvwOps[Self <: Pvw] (val x: Self) extends AnyVal {
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
    def setPvw(value: ProtectedViewWindow): Self = this.set("Pvw", value.asInstanceOf[js.Any])
  }
  
}

