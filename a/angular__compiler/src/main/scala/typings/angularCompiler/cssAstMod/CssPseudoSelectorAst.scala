package typings.angularCompiler.cssAstMod

import typings.angularCompiler.cssLexerMod.CssToken
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssPseudoSelectorAst")
@js.native
class CssPseudoSelectorAst protected () extends CssSelectorPartAst {
  def this(
    location: ParseSourceSpan,
    strValue: String,
    name: String,
    tokens: js.Array[CssToken],
    innerSelectors: js.Array[CssSelectorAst]
  ) = this()
  
  var innerSelectors: js.Array[CssSelectorAst] = js.native
  
  var name: String = js.native
  
  var strValue: String = js.native
  
  var tokens: js.Array[CssToken] = js.native
}
