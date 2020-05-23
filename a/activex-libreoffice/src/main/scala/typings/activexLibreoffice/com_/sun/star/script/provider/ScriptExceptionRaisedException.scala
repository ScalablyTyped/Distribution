package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a checked exception that represents the detail of an exception thrown by a {@link LanguageScriptProvider} whilst executing a script */
trait ScriptExceptionRaisedException extends ScriptErrorRaisedException {
  /** Name of script where error occurred */
  var exceptionType: String
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
}

