package typings.activexExcel.anon

import typings.activexExcel.Excel.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WnWindow extends js.Object {
  val Wn: Window
}

object WnWindow {
  @scala.inline
  def apply(Wn: Window): WnWindow = {
    val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WnWindow]
  }
}

