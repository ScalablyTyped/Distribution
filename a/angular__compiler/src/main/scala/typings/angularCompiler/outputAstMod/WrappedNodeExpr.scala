package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "WrappedNodeExpr")
@js.native
class WrappedNodeExpr[T] protected () extends Expression {
  def this(node: T) = this()
  def this(node: T, `type`: Type) = this()
  def this(node: T, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(node: T, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  var node: T = js.native
}

