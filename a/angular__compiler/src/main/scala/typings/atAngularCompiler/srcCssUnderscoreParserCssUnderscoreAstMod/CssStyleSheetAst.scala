package typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssStyleSheetAst")
@js.native
class CssStyleSheetAst protected () extends CssAst {
  def this(location: ParseSourceSpan, rules: js.Array[CssAst]) = this()
  var rules: js.Array[CssAst] = js.native
}

