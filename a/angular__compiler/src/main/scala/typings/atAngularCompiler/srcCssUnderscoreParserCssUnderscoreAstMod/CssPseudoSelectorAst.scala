package typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod

import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssToken
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

