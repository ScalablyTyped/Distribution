package typings.activexDashAccess

import typings.activexDashStdole.stdole.OLE_XPOS_PIXELS
import typings.activexDashStdole.stdole.OLE_YPOS_PIXELS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonFieldList extends js.Object {
  val Button: Double
  val FieldList: Double
  val Shift: Double
  val X: OLE_XPOS_PIXELS
  val Y: OLE_YPOS_PIXELS
}

object Anon_ButtonFieldList {
  @scala.inline
  def apply(Button: Double, FieldList: Double, Shift: Double, X: OLE_XPOS_PIXELS, Y: OLE_YPOS_PIXELS): Anon_ButtonFieldList = {
    val __obj = js.Dynamic.literal(Button = Button, FieldList = FieldList, Shift = Shift, X = X, Y = Y)
  
    __obj.asInstanceOf[Anon_ButtonFieldList]
  }
}

