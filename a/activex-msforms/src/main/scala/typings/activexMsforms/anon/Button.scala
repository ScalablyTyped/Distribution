package typings.activexMsforms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  val Button: Double
  val Shift: Double
  val X: Double
  val Y: Double
}

object Button {
  @scala.inline
  def apply(Button: Double, Shift: Double, X: Double, Y: Double): Button = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

