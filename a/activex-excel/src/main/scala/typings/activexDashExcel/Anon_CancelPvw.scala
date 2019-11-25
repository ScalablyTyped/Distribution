package typings.activexDashExcel

import typings.activexDashExcel.Excel.ProtectedViewWindow
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
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pvw = Pvw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelPvw]
  }
}

