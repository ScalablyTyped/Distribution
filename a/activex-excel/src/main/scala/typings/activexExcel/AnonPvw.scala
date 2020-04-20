package typings.activexExcel

import typings.activexExcel.Excel.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPvw extends js.Object {
  val Pvw: ProtectedViewWindow
}

object AnonPvw {
  @scala.inline
  def apply(Pvw: ProtectedViewWindow): AnonPvw = {
    val __obj = js.Dynamic.literal(Pvw = Pvw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPvw]
  }
}

