package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelPvw extends js.Object {
  var Cancel: Boolean
  val Pvw: ProtectedViewWindow
}

object Anon_CancelPvw {
  @scala.inline
  def apply(Cancel: Boolean, Pvw: ProtectedViewWindow): Anon_CancelPvw = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Pvw = Pvw)
  
    __obj.asInstanceOf[Anon_CancelPvw]
  }
}

