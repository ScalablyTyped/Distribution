package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "UnaryOperatorExpr")
@js.native
open class UnaryOperatorExpr protected () extends Expression {
  def this(operator: UnaryOperator, expr: Expression) = this()
  def this(operator: UnaryOperator, expr: Expression, `type`: Type) = this()
  def this(operator: UnaryOperator, expr: Expression, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(operator: UnaryOperator, expr: Expression, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(operator: UnaryOperator, expr: Expression, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(operator: UnaryOperator, expr: Expression, `type`: Null, sourceSpan: Null, parens: Boolean) = this()
  def this(operator: UnaryOperator, expr: Expression, `type`: Null, sourceSpan: Unit, parens: Boolean) = this()
  def this(
    operator: UnaryOperator,
    expr: Expression,
    `type`: Null,
    sourceSpan: ParseSourceSpan,
    parens: Boolean
  ) = this()
  def this(operator: UnaryOperator, expr: Expression, `type`: Unit, sourceSpan: Null, parens: Boolean) = this()
  def this(operator: UnaryOperator, expr: Expression, `type`: Unit, sourceSpan: Unit, parens: Boolean) = this()
  def this(
    operator: UnaryOperator,
    expr: Expression,
    `type`: Unit,
    sourceSpan: ParseSourceSpan,
    parens: Boolean
  ) = this()
  def this(operator: UnaryOperator, expr: Expression, `type`: Type, sourceSpan: Null, parens: Boolean) = this()
  def this(operator: UnaryOperator, expr: Expression, `type`: Type, sourceSpan: Unit, parens: Boolean) = this()
  def this(
    operator: UnaryOperator,
    expr: Expression,
    `type`: Type,
    sourceSpan: ParseSourceSpan,
    parens: Boolean
  ) = this()
  
  var expr: Expression = js.native
  
  var operator: UnaryOperator = js.native
  
  var parens: Boolean = js.native
}
