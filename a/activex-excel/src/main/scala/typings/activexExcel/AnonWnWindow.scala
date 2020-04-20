package typings.activexExcel

import typings.activexExcel.Excel.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWnWindow extends js.Object {
  val Wn: Window
}

object AnonWnWindow {
  @scala.inline
  def apply(Wn: Window): AnonWnWindow = {
    val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWnWindow]
  }
}

