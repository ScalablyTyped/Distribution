package typings.activexExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButton extends js.Object {
  val Button: Double
  val Shift: Double
  val x: Double
  val y: Double
}

object AnonButton {
  @scala.inline
  def apply(Button: Double, Shift: Double, x: Double, y: Double): AnonButton = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonButton]
  }
}

