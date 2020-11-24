package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is a checked exception that represents an error encountered by a {@link LanguageScriptProvider} whilst executing a script */
@js.native
trait ScriptErrorRaisedException extends Exception {
  
  /** Scripting language of script that generated exception */
  var language: String = js.native
  
  /** line number where error occurred. */
  var lineNum: Double = js.native
  
  /** Name of script where error occurred */
  var scriptName: String = js.native
}
object ScriptErrorRaisedException {
  
  @scala.inline
  def apply(Context: XInterface, Message: String, language: String, lineNum: Double, scriptName: String): ScriptErrorRaisedException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lineNum = lineNum.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptErrorRaisedException]
  }
  
  @scala.inline
  implicit class ScriptErrorRaisedExceptionOps[Self <: ScriptErrorRaisedException] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNum(value: Double): Self = this.set("lineNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptName(value: String): Self = this.set("scriptName", value.asInstanceOf[js.Any])
  }
}
