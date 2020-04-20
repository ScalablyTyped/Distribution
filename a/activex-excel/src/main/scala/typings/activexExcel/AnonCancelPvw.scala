package typings.activexExcel

import typings.activexExcel.Excel.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelPvw extends js.Object {
  var Cancel: Boolean
  val Pvw: ProtectedViewWindow
}

object AnonCancelPvw {
  @scala.inline
  def apply(Cancel: Boolean, Pvw: ProtectedViewWindow): AnonCancelPvw = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pvw = Pvw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelPvw]
  }
}

