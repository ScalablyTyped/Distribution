package typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod

import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssToken
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssStyleValueAst")
@js.native
class CssStyleValueAst protected () extends CssAst {
  def this(location: ParseSourceSpan, tokens: js.Array[CssToken], strValue: String) = this()
  var strValue: String = js.native
  var tokens: js.Array[CssToken] = js.native
}

