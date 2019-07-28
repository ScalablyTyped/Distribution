package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.providerNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a checked exception that represents an error encountered by a {@link LanguageScriptProvider} whilst executing a script */
trait ScriptErrorRaisedException extends Exception {
  /** Scripting language of script that generated exception */
  var language: String
  /** line number where error occurred. */
  var lineNum: Double
  /** Name of script where error occurred */
  var scriptName: String
}

object ScriptErrorRaisedException {
  @scala.inline
  def apply(Context: XInterface, Message: String, language: String, lineNum: Double, scriptName: String): ScriptErrorRaisedException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, language = language, lineNum = lineNum, scriptName = scriptName)
  
    __obj.asInstanceOf[ScriptErrorRaisedException]
  }
}

