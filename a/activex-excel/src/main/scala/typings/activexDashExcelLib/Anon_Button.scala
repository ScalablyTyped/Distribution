package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  val Button: scala.Double
  val Shift: scala.Double
  val x: scala.Double
  val y: scala.Double
}

object Anon_Button {
  @scala.inline
  def apply(Button: scala.Double, Shift: scala.Double, x: scala.Double, y: scala.Double): Anon_Button = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Button")(Button)
    __obj.updateDynamic("Shift")(Shift)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_Button]
  }
}

