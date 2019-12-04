package typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod

import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssToken
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssUnknownTokenListAst")
@js.native
class CssUnknownTokenListAst protected () extends CssRuleAst {
  def this(location: ParseSourceSpan, name: String, tokens: js.Array[CssToken]) = this()
  var name: String = js.native
  var tokens: js.Array[CssToken] = js.native
}

