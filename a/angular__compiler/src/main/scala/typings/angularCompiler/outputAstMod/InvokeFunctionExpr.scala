package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "InvokeFunctionExpr")
@js.native
class InvokeFunctionExpr protected () extends Expression {
  def this(fn: Expression, args: js.Array[Expression]) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Type) = this()
  def this(
    fn: Expression,
    args: js.Array[Expression],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(
    fn: Expression,
    args: js.Array[Expression],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: js.UndefOr[scala.Nothing],
    pure: Boolean
  ) = this()
  def this(
    fn: Expression,
    args: js.Array[Expression],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: Null,
    pure: Boolean
  ) = this()
  def this(
    fn: Expression,
    args: js.Array[Expression],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan,
    pure: Boolean
  ) = this()
  def this(
    fn: Expression,
    args: js.Array[Expression],
    `type`: Null,
    sourceSpan: js.UndefOr[scala.Nothing],
    pure: Boolean
  ) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Null, sourceSpan: Null, pure: Boolean) = this()
  def this(
    fn: Expression,
    args: js.Array[Expression],
    `type`: Null,
    sourceSpan: ParseSourceSpan,
    pure: Boolean
  ) = this()
  def this(
    fn: Expression,
    args: js.Array[Expression],
    `type`: Type,
    sourceSpan: js.UndefOr[scala.Nothing],
    pure: Boolean
  ) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Type, sourceSpan: Null, pure: Boolean) = this()
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
