package typings
package activexDashAccessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonFieldList extends js.Object {
  val Button: scala.Double
  val FieldList: scala.Double
  val Shift: scala.Double
  val X: activexDashStdoleLib.stdoleNs.OLE_XPOS_PIXELS
  val Y: activexDashStdoleLib.stdoleNs.OLE_YPOS_PIXELS
}

object Anon_ButtonFieldList {
  @scala.inline
  def apply(
    Button: scala.Double,
    FieldList: scala.Double,
    Shift: scala.Double,
    X: activexDashStdoleLib.stdoleNs.OLE_XPOS_PIXELS,
    Y: activexDashStdoleLib.stdoleNs.OLE_YPOS_PIXELS
  ): Anon_ButtonFieldList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Button")(Button)
    __obj.updateDynamic("FieldList")(FieldList)
    __obj.updateDynamic("Shift")(Shift)
    __obj.updateDynamic("X")(X)
    __obj.updateDynamic("Y")(Y)
    __obj.asInstanceOf[Anon_ButtonFieldList]
  }
}

