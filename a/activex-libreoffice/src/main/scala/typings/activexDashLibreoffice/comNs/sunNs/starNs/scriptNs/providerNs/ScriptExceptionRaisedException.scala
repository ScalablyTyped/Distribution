package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.providerNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, exceptionType = exceptionType, language = language, lineNum = lineNum, scriptName = scriptName)
  
    __obj.asInstanceOf[ScriptExceptionRaisedException]
  }
}

