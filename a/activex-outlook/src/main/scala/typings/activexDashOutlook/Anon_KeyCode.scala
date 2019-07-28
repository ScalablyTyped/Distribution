package typings.activexDashOutlook

import typings.activexDashOutlook.OutlookNs.OlShiftState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyCode extends js.Object {
  val KeyCode: Double
  val Shift: OlShiftState
}

object Anon_KeyCode {
  @scala.inline
  def apply(KeyCode: Double, Shift: OlShiftState): Anon_KeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode, Shift = Shift)
  
    __obj.asInstanceOf[Anon_KeyCode]
  }
}

