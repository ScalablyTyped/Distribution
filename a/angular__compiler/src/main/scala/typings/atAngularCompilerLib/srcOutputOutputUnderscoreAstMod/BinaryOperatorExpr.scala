package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "BinaryOperatorExpr")
@js.native
class BinaryOperatorExpr protected () extends Expression {
  def this(operator: BinaryOperator, lhs: Expression, rhs: Expression) = this()
  def this(operator: BinaryOperator, lhs: Expression, rhs: Expression, `type`: Type) = this()
  def this(operator: BinaryOperator, lhs: Expression, rhs: Expression, `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(operator: BinaryOperator, lhs: Expression, rhs: Expression, `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(operator: BinaryOperator, lhs: Expression, rhs: Expression, `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, parens: scala.Boolean) = this()
  def this(operator: BinaryOperator, lhs: Expression, rhs: Expression, `type`: Type, sourceSpan: scala.Null, parens: scala.Boolean) = this()
  def this(operator: BinaryOperator, lhs: Expression, rhs: Expression, `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, parens: scala.Boolean) = this()
  def this(operator: BinaryOperator, lhs: Expression, rhs: Expression, `type`: scala.Null, sourceSpan: scala.Null, parens: scala.Boolean) = this()
  var lhs: Expression = js.native
  var operator: BinaryOperator = js.native
  var parens: scala.Boolean = js.native
  var rhs: Expression = js.native
}

