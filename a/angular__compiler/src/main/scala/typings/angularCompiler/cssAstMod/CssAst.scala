package typings.angularCompiler.cssAstMod

import typings.angularCompiler.srcParseUtilMod.ParseLocation
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssAst")
@js.native
abstract class CssAst protected () extends js.Object {
  def this(location: ParseSourceSpan) = this()
  var location: ParseSourceSpan = js.native
  def end(): ParseLocation = js.native
  def start(): ParseLocation = js.native
  def visit(visitor: CssAstVisitor): js.Any = js.native
  def visit(visitor: CssAstVisitor, context: js.Any): js.Any = js.native
}

