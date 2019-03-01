package typings
package activexDashAccessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  var Button: scala.Double
  var Shift: scala.Double
  var X: scala.Double
  var Y: scala.Double
}

object Anon_Button {
  @scala.inline
  def apply(Button: scala.Double, Shift: scala.Double, X: scala.Double, Y: scala.Double): Anon_Button = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Button")(Button)
    __obj.updateDynamic("Shift")(Shift)
    __obj.updateDynamic("X")(X)
    __obj.updateDynamic("Y")(Y)
    __obj.asInstanceOf[Anon_Button]
  }
}

