package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionVisitor extends js.Object {
  def visitAssertNotNullExpr(ast: AssertNotNull, context: js.Any): js.Any
  def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: js.Any): js.Any
  def visitCastExpr(ast: CastExpr, context: js.Any): js.Any
  def visitCommaExpr(ast: CommaExpr, context: js.Any): js.Any
  def visitConditionalExpr(ast: ConditionalExpr, context: js.Any): js.Any
  def visitExternalExpr(ast: ExternalExpr, context: js.Any): js.Any
  def visitFunctionExpr(ast: FunctionExpr, context: js.Any): js.Any
  def visitInstantiateExpr(ast: InstantiateExpr, context: js.Any): js.Any
  def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: js.Any): js.Any
  def visitInvokeMethodExpr(ast: InvokeMethodExpr, context: js.Any): js.Any
  def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: js.Any): js.Any
  def visitLiteralExpr(ast: LiteralExpr, context: js.Any): js.Any
  def visitLiteralMapExpr(ast: LiteralMapExpr, context: js.Any): js.Any
  def visitNotExpr(ast: NotExpr, context: js.Any): js.Any
  def visitReadKeyExpr(ast: ReadKeyExpr, context: js.Any): js.Any
  def visitReadPropExpr(ast: ReadPropExpr, context: js.Any): js.Any
  def visitReadVarExpr(ast: ReadVarExpr, context: js.Any): js.Any
  def visitTypeofExpr(ast: TypeofExpr, context: js.Any): js.Any
  def visitWrappedNodeExpr(ast: WrappedNodeExpr[_], context: js.Any): js.Any
  def visitWriteKeyExpr(expr: WriteKeyExpr, context: js.Any): js.Any
  def visitWritePropExpr(expr: WritePropExpr, context: js.Any): js.Any
  def visitWriteVarExpr(expr: WriteVarExpr, context: js.Any): js.Any
}

