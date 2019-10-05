package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "TypeofExpr")
@js.native
class TypeofExpr protected () extends Expression {
  def this(expr: Expression) = this()
  def this(expr: Expression, `type`: Type) = this()
  def this(expr: Expression, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(expr: Expression, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  var expr: Expression = js.native
}

@JSImport("@angular/compiler/src/output/output_ast", "typeofExpr")
@js.native
object typeofExpr extends js.Object {
  def apply(expr: Expression): TypeofExpr = js.native
}

