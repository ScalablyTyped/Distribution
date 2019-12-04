package typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssStylesBlockAst")
@js.native
class CssStylesBlockAst protected () extends CssBlockAst {
  def this(location: ParseSourceSpan, definitions: js.Array[CssDefinitionAst]) = this()
  var definitions: js.Array[CssDefinitionAst] = js.native
}

