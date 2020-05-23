package typings.activexMsforms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shift extends js.Object {
  val Button: Double
  val Index: Double
  val Shift: Double
  val X: Double
  val Y: Double
}

object Shift {
  @scala.inline
  def apply(Button: Double, Index: Double, Shift: Double, X: Double, Y: Double): Shift = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shift]
  }
}

