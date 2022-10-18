package typings.angularLocalize

import typings.angularCompiler.mod.ParseErrorLevel
import typings.angularCompiler.mod.ParseSourceSpan
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateTranslationFilesTranslationParsersTranslationParseErrorMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/translation_parsers/translation_parse_error", "TranslationParseError")
  @js.native
  open class TranslationParseError protected ()
    extends StObject
       with Error {
    def this(span: ParseSourceSpan, msg: String) = this()
    def this(span: ParseSourceSpan, msg: String, level: ParseErrorLevel) = this()
    
    var level: ParseErrorLevel = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    var msg: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var span: ParseSourceSpan = js.native
  }
}
