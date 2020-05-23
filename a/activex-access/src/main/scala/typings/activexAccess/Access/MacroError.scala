package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacroError extends js.Object {
  @JSName("Access.MacroError_typekey")
  var AccessDotMacroError_typekey: MacroError
  val ActionName: String
  val Arguments: String
  val Condition: String
  val Description: String
  val MacroName: String
  val Number: Double
  def IsMemberSafe(dispid: Double): Boolean
}

object MacroError {
  @scala.inline
  def apply(
    AccessDotMacroError_typekey: MacroError,
    ActionName: String,
    Arguments: String,
    Condition: String,
    Description: String,
    IsMemberSafe: Double => Boolean,
    MacroName: String,
    Number: Double
  ): MacroError = {
    val __obj = js.Dynamic.literal(ActionName = ActionName.asInstanceOf[js.Any], Arguments = Arguments.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), MacroName = MacroName.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.MacroError_typekey")(AccessDotMacroError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacroError]
  }
}

