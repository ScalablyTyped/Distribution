package typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseLocation
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssAst")
@js.native
abstract class CssAst protected () extends js.Object {
  def this(location: ParseSourceSpan) = this()
  val end: ParseLocation = js.native
  var location: ParseSourceSpan = js.native
  val start: ParseLocation = js.native
  def visit(visitor: CssAstVisitor): js.Any = js.native
  def visit(visitor: CssAstVisitor, context: js.Any): js.Any = js.native
}

