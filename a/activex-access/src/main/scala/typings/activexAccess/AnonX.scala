package typings.activexAccess

import typings.activexStdole.stdole.OLE_XPOS_PIXELS
import typings.activexStdole.stdole.OLE_YPOS_PIXELS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX extends js.Object {
  val Button: Double
  val FieldList: Double
  val Shift: Double
  val X: OLE_XPOS_PIXELS
  val Y: OLE_YPOS_PIXELS
}

object AnonX {
  @scala.inline
  def apply(Button: Double, FieldList: Double, Shift: Double, X: OLE_XPOS_PIXELS, Y: OLE_YPOS_PIXELS): AnonX = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], FieldList = FieldList.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
}

