package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "LiteralArrayExpr")
@js.native
class LiteralArrayExpr protected () extends Expression {
  def this(entries: js.Array[Expression]) = this()
  def this(entries: js.Array[Expression], `type`: Type) = this()
  def this(entries: js.Array[Expression], `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(entries: js.Array[Expression], `type`: Type, sourceSpan: ParseSourceSpan) = this()
  var entries: js.Array[Expression] = js.native
}

