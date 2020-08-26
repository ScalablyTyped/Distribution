package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a checked exception that represents the detail of an exception thrown by a {@link LanguageScriptProvider} whilst executing a script */
@js.native
trait ScriptExceptionRaisedException extends ScriptErrorRaisedException {
  /** Name of script where error occurred */
  var exceptionType: String = js.native
}

object ScriptExceptionRaisedException {
  @scala.inline
  def apply(
    Context: XInterface,
    Message: String,
    exceptionType: String,
    language: String,
    lineNum: Double,
    scriptName: String
  ): ScriptExceptionRaisedException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], exceptionType = exceptionType.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lineNum = lineNum.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptExceptionRaisedException]
  }
  @scala.inline
  implicit class ScriptExceptionRaisedExceptionOps[Self <: ScriptExceptionRaisedException] (val x: Self) extends AnyVal {
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
    def setExceptionType(value: String): Self = this.set("exceptionType", value.asInstanceOf[js.Any])
  }
  
}

