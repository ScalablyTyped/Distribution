package typings.activexAccess.anon

import typings.activexStdole.stdole.OLE_XPOS_PIXELS
import typings.activexStdole.stdole.OLE_YPOS_PIXELS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X extends js.Object {
  val Button: Double = js.native
  val FieldList: Double = js.native
  val Shift: Double = js.native
  val X: OLE_XPOS_PIXELS = js.native
  val Y: OLE_YPOS_PIXELS = js.native
}

object X {
  @scala.inline
  def apply(Button: Double, FieldList: Double, Shift: Double, X: OLE_XPOS_PIXELS, Y: OLE_YPOS_PIXELS): X = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], FieldList = FieldList.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  @scala.inline
  implicit class XOps[Self <: X] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setButton(value: Double): Self = this.set("Button", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldList(value: Double): Self = this.set("FieldList", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift(value: Double): Self = this.set("Shift", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: OLE_XPOS_PIXELS): Self = this.set("X", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: OLE_YPOS_PIXELS): Self = this.set("Y", value.asInstanceOf[js.Any])
  }
  
}

