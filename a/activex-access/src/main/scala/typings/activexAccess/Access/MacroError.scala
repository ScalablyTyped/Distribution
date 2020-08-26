package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacroError extends js.Object {
  @JSName("Access.MacroError_typekey")
  var AccessDotMacroError_typekey: MacroError = js.native
  val ActionName: String = js.native
  val Arguments: String = js.native
  val Condition: String = js.native
  val Description: String = js.native
  val MacroName: String = js.native
  val Number: Double = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
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
  @scala.inline
  implicit class MacroErrorOps[Self <: MacroError] (val x: Self) extends AnyVal {
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
    def setAccessDotMacroError_typekey(value: MacroError): Self = this.set("Access.MacroError_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionName(value: String): Self = this.set("ActionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setArguments(value: String): Self = this.set("Arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: String): Self = this.set("Condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    @scala.inline
    def setMacroName(value: String): Self = this.set("MacroName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("Number", value.asInstanceOf[js.Any])
  }
  
}

