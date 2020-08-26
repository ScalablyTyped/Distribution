package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "InstantiateExpr")
@js.native
class InstantiateExpr protected () extends Expression {
  def this(classExpr: Expression, args: js.Array[Expression]) = this()
  def this(classExpr: Expression, args: js.Array[Expression], `type`: Type) = this()
  def this(
    classExpr: Expression,
    args: js.Array[Expression],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(classExpr: Expression, args: js.Array[Expression], `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(classExpr: Expression, args: js.Array[Expression], `type`: Type, sourceSpan: ParseSourceSpan) = this()
  var args: js.Array[Expression] = js.native
  var classExpr: Expression = js.native
}

