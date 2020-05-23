package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shift extends js.Object {
  val FieldList: Double
  var KeyCode: Double
  val Shift: Double
}

object Shift {
  @scala.inline
  def apply(FieldList: Double, KeyCode: Double, Shift: Double): Shift = {
    val __obj = js.Dynamic.literal(FieldList = FieldList.asInstanceOf[js.Any], KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shift]
  }
}

