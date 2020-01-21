package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFieldListKeyCode extends js.Object {
  val FieldList: Double
  var KeyCode: Double
  val Shift: Double
}

object AnonFieldListKeyCode {
  @scala.inline
  def apply(FieldList: Double, KeyCode: Double, Shift: Double): AnonFieldListKeyCode = {
    val __obj = js.Dynamic.literal(FieldList = FieldList.asInstanceOf[js.Any], KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFieldListKeyCode]
  }
}

