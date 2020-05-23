package typings.activexExcel.anon

import typings.activexExcel.Excel.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelPvw extends js.Object {
  var Cancel: Boolean
  val Pvw: ProtectedViewWindow
}

object CancelPvw {
  @scala.inline
  def apply(Cancel: Boolean, Pvw: ProtectedViewWindow): CancelPvw = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pvw = Pvw.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelPvw]
  }
}

