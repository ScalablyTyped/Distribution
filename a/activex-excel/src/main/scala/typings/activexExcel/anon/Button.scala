package typings.activexExcel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  val Button: Double
  val Shift: Double
  val x: Double
  val y: Double
}

object Button {
  @scala.inline
  def apply(Button: Double, Shift: Double, x: Double, y: Double): Button = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

