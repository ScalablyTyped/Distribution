package typings.angularCompiler.cssAstMod

import typings.angularCompiler.cssLexerMod.CssToken
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssStyleValueAst")
@js.native
class CssStyleValueAst protected () extends CssAst {
  def this(location: ParseSourceSpan, tokens: js.Array[CssToken], strValue: String) = this()
  
  var strValue: String = js.native
  
  var tokens: js.Array[CssToken] = js.native
}
