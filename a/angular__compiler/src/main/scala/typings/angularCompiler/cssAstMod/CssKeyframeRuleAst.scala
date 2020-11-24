package typings.angularCompiler.cssAstMod

import typings.angularCompiler.cssLexerMod.CssToken
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssKeyframeRuleAst")
@js.native
class CssKeyframeRuleAst protected () extends CssBlockRuleAst {
  def this(location: ParseSourceSpan, name: CssToken, block: CssBlockAst) = this()
}
