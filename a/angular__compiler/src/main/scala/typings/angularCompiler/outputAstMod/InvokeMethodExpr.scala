package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "InvokeMethodExpr")
@js.native
class InvokeMethodExpr protected () extends Expression {
  def this(receiver: Expression, method: String, args: js.Array[Expression]) = this()
  def this(receiver: Expression, method: BuiltinMethod, args: js.Array[Expression]) = this()
  def this(receiver: Expression, method: String, args: js.Array[Expression], `type`: Type) = this()
  def this(receiver: Expression, method: BuiltinMethod, args: js.Array[Expression], `type`: Type) = this()
  def this(
    receiver: Expression,
    method: String,
    args: js.Array[Expression],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    receiver: Expression,
    method: String,
    args: js.Array[Expression],
    `type`: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    receiver: Expression,
    method: String,
    args: js.Array[Expression],
    `type`: Type,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    receiver: Expression,
    method: BuiltinMethod,
    args: js.Array[Expression],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    receiver: Expression,
    method: BuiltinMethod,
    args: js.Array[Expression],
    `type`: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    receiver: Expression,
    method: BuiltinMethod,
    args: js.Array[Expression],
    `type`: Type,
    sourceSpan: ParseSourceSpan
  ) = this()
  var args: js.Array[Expression] = js.native
  var builtin: BuiltinMethod | Null = js.native
  var name: String | Null = js.native
  var receiver: Expression = js.native
}

