package typings.activexDashMsforms

import typings.activexDashMsforms.MSForms.ReturnInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyCode extends js.Object {
  val KeyCode: ReturnInteger
  val Shift: Double
}

object Anon_KeyCode {
  @scala.inline
  def apply(KeyCode: ReturnInteger, Shift: Double): Anon_KeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyCode]
  }
}

