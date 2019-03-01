package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a checked exception that represents the detail of an exception thrown by a {@link LanguageScriptProvider} whilst executing a script */
trait ScriptExceptionRaisedException extends ScriptErrorRaisedException {
  /** Name of script where error occurred */
  var exceptionType: java.lang.String
}

object ScriptExceptionRaisedException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    exceptionType: java.lang.String,
    language: java.lang.String,
    lineNum: scala.Double,
    scriptName: java.lang.String
  ): ScriptExceptionRaisedException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("exceptionType")(exceptionType)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("lineNum")(lineNum)
    __obj.updateDynamic("scriptName")(scriptName)
    __obj.asInstanceOf[ScriptExceptionRaisedException]
  }
}

