package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptFrameworkErrorException]
  }
}

