package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "BinaryOperatorExpr")
@js.native
class BinaryOperatorExpr protected () extends Expression {
  def this(operator: BinaryOperator, lhs: Expression, rhs: Expression) = this()
  def this(operator: BinaryOperator, lhs: Expression, rhs: Expression, `type`: Type) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: Type,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: js.UndefOr[scala.Nothing],
    parens: Boolean
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: Null,
    parens: Boolean
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan,
    parens: Boolean
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: Null,
    sourceSpan: js.UndefOr[scala.Nothing],
    parens: Boolean
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: Null,
    sourceSpan: Null,
    parens: Boolean
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: Null,
    sourceSpan: ParseSourceSpan,
    parens: Boolean
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: Type,
    sourceSpan: js.UndefOr[scala.Nothing],
    parens: Boolean
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: Type,
    sourceSpan: Null,
    parens: Boolean
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: Type,
    sourceSpan: ParseSourceSpan,
    parens: Boolean
  ) = this()
  var lhs: Expression = js.native
  var operator: BinaryOperator = js.native
  var parens: Boolean = js.native
  var rhs: Expression = js.native
}

