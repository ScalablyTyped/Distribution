package typings
package activexDashAccessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldListKeyCode extends js.Object {
  val FieldList: scala.Double
  var KeyCode: scala.Double
  val Shift: scala.Double
}

object Anon_FieldListKeyCode {
  @scala.inline
  def apply(FieldList: scala.Double, KeyCode: scala.Double, Shift: scala.Double): Anon_FieldListKeyCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FieldList")(FieldList)
    __obj.updateDynamic("KeyCode")(KeyCode)
    __obj.updateDynamic("Shift")(Shift)
    __obj.asInstanceOf[Anon_FieldListKeyCode]
  }
}

