package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCorrect extends js.Object {
  @JSName("Access.AutoCorrect_typekey")
  var AccessDotAutoCorrect_typekey: AutoCorrect
  var DisplayAutoCorrectOptions: Boolean
  def IsMemberSafe(dispid: Double): Boolean
}

object AutoCorrect {
  @scala.inline
  def apply(
    AccessDotAutoCorrect_typekey: AutoCorrect,
    DisplayAutoCorrectOptions: Boolean,
    IsMemberSafe: Double => Boolean
  ): AutoCorrect = {
    val __obj = js.Dynamic.literal(DisplayAutoCorrectOptions = DisplayAutoCorrectOptions.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe))
    __obj.updateDynamic("Access.AutoCorrect_typekey")(AccessDotAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrect]
  }
}

