package typings.angularCompiler.i18nAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends AST {
  var sourceSpan: ParseSourceSpan = js.native
  def visit(visitor: Visitor): js.Any = js.native
  def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

