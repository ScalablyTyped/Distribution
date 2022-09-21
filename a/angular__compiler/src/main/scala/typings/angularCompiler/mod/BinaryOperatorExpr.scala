package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "BinaryOperatorExpr")
@js.native
open class BinaryOperatorExpr protected () extends Expression {
  def this(operator: BinaryOperator, lhs: Expression, rhs: Expression) = this()
  def this(operator: BinaryOperator, lhs: Expression, rhs: Expression, `type`: Type) = this()
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
    `type`: Unit,
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
    `type`: Null,
    sourceSpan: Null,
    parens: Boolean
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: Null,
    sourceSpan: Unit,
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
    `type`: Unit,
    sourceSpan: Null,
    parens: Boolean
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: Unit,
    sourceSpan: Unit,
    parens: Boolean
  ) = this()
  def this(
    operator: BinaryOperator,
    lhs: Expression,
    rhs: Expression,
    `type`: Unit,
    sourceSpan: ParseSourceSpan,
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
    sourceSpan: Unit,
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
