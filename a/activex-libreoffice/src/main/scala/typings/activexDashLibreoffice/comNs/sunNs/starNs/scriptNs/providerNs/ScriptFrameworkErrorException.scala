package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.providerNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a checked exception that represents an error encountered by the Scripting Framework whilst executing a script */
trait ScriptFrameworkErrorException extends Exception {
  /** error type {@link com.sun.star.script.provider.ScriptFrameworkErrorType} */
  var errorType: Double
  /** Scripting language of script that generated exception */
  var language: String
  /** Name of script where error occurred */
  var scriptName: String
}

object ScriptFrameworkErrorException {
  @scala.inline
  def apply(Context: XInterface, Message: String, errorType: Double, language: String, scriptName: String): ScriptFrameworkErrorException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, errorType = errorType, language = language, scriptName = scriptName)
  
    __obj.asInstanceOf[ScriptFrameworkErrorException]
  }
}

