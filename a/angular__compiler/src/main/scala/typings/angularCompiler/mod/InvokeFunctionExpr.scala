package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "InvokeFunctionExpr")
@js.native
open class InvokeFunctionExpr protected () extends Expression {
  def this(fn: Expression, args: js.Array[Expression]) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Type) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Null, sourceSpan: Null, pure: Boolean) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Null, sourceSpan: Unit, pure: Boolean) = this()
  def this(
    fn: Expression,
    args: js.Array[Expression],
    `type`: Null,
    sourceSpan: ParseSourceSpan,
    pure: Boolean
  ) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Unit, sourceSpan: Null, pure: Boolean) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Unit, sourceSpan: Unit, pure: Boolean) = this()
  def this(
    fn: Expression,
    args: js.Array[Expression],
    `type`: Unit,
    sourceSpan: ParseSourceSpan,
    pure: Boolean
  ) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Type, sourceSpan: Null, pure: Boolean) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Type, sourceSpan: Unit, pure: Boolean) = this()
  def this(
    fn: Expression,
    args: js.Array[Expression],
    `type`: Type,
    sourceSpan: ParseSourceSpan,
    pure: Boolean
  ) = this()
  
  var args: js.Array[Expression] = js.native
  
  var fn: Expression = js.native
  
  var pure: Boolean = js.native
}
