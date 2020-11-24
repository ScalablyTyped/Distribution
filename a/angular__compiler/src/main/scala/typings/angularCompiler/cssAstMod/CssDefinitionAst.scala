package typings.angularCompiler.cssAstMod

import typings.angularCompiler.cssLexerMod.CssToken
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssDefinitionAst")
@js.native
class CssDefinitionAst protected () extends CssAst {
  def this(location: ParseSourceSpan, property: CssToken, value: CssStyleValueAst) = this()
  
  var property: CssToken = js.native
  
  var value: CssStyleValueAst = js.native
}
