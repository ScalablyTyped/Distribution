package typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod

import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssToken
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssDefinitionAst")
@js.native
class CssDefinitionAst protected () extends CssAst {
  def this(location: ParseSourceSpan, property: CssToken, value: CssStyleValueAst) = this()
  var property: CssToken = js.native
  var value: CssStyleValueAst = js.native
}

