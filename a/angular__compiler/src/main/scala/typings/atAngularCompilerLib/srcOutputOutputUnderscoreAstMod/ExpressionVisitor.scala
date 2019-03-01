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

object ExpressionVisitor {
  @scala.inline
  def apply(
    visitAssertNotNullExpr: js.Function2[AssertNotNull, js.Any, js.Any],
    visitBinaryOperatorExpr: js.Function2[BinaryOperatorExpr, js.Any, js.Any],
    visitCastExpr: js.Function2[CastExpr, js.Any, js.Any],
    visitCommaExpr: js.Function2[CommaExpr, js.Any, js.Any],
    visitConditionalExpr: js.Function2[ConditionalExpr, js.Any, js.Any],
    visitExternalExpr: js.Function2[ExternalExpr, js.Any, js.Any],
    visitFunctionExpr: js.Function2[FunctionExpr, js.Any, js.Any],
    visitInstantiateExpr: js.Function2[InstantiateExpr, js.Any, js.Any],
    visitInvokeFunctionExpr: js.Function2[InvokeFunctionExpr, js.Any, js.Any],
    visitInvokeMethodExpr: js.Function2[InvokeMethodExpr, js.Any, js.Any],
    visitLiteralArrayExpr: js.Function2[LiteralArrayExpr, js.Any, js.Any],
    visitLiteralExpr: js.Function2[LiteralExpr, js.Any, js.Any],
    visitLiteralMapExpr: js.Function2[LiteralMapExpr, js.Any, js.Any],
    visitNotExpr: js.Function2[NotExpr, js.Any, js.Any],
    visitReadKeyExpr: js.Function2[ReadKeyExpr, js.Any, js.Any],
    visitReadPropExpr: js.Function2[ReadPropExpr, js.Any, js.Any],
    visitReadVarExpr: js.Function2[ReadVarExpr, js.Any, js.Any],
    visitTypeofExpr: js.Function2[TypeofExpr, js.Any, js.Any],
    visitWrappedNodeExpr: js.Function2[WrappedNodeExpr[_], js.Any, js.Any],
    visitWriteKeyExpr: js.Function2[WriteKeyExpr, js.Any, js.Any],
    visitWritePropExpr: js.Function2[WritePropExpr, js.Any, js.Any],
    visitWriteVarExpr: js.Function2[WriteVarExpr, js.Any, js.Any]
  ): ExpressionVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitAssertNotNullExpr")(visitAssertNotNullExpr)
    __obj.updateDynamic("visitBinaryOperatorExpr")(visitBinaryOperatorExpr)
    __obj.updateDynamic("visitCastExpr")(visitCastExpr)
    __obj.updateDynamic("visitCommaExpr")(visitCommaExpr)
    __obj.updateDynamic("visitConditionalExpr")(visitConditionalExpr)
    __obj.updateDynamic("visitExternalExpr")(visitExternalExpr)
    __obj.updateDynamic("visitFunctionExpr")(visitFunctionExpr)
    __obj.updateDynamic("visitInstantiateExpr")(visitInstantiateExpr)
    __obj.updateDynamic("visitInvokeFunctionExpr")(visitInvokeFunctionExpr)
    __obj.updateDynamic("visitInvokeMethodExpr")(visitInvokeMethodExpr)
    __obj.updateDynamic("visitLiteralArrayExpr")(visitLiteralArrayExpr)
    __obj.updateDynamic("visitLiteralExpr")(visitLiteralExpr)
    __obj.updateDynamic("visitLiteralMapExpr")(visitLiteralMapExpr)
    __obj.updateDynamic("visitNotExpr")(visitNotExpr)
    __obj.updateDynamic("visitReadKeyExpr")(visitReadKeyExpr)
    __obj.updateDynamic("visitReadPropExpr")(visitReadPropExpr)
    __obj.updateDynamic("visitReadVarExpr")(visitReadVarExpr)
    __obj.updateDynamic("visitTypeofExpr")(visitTypeofExpr)
    __obj.updateDynamic("visitWrappedNodeExpr")(visitWrappedNodeExpr)
    __obj.updateDynamic("visitWriteKeyExpr")(visitWriteKeyExpr)
    __obj.updateDynamic("visitWritePropExpr")(visitWritePropExpr)
    __obj.updateDynamic("visitWriteVarExpr")(visitWriteVarExpr)
    __obj.asInstanceOf[ExpressionVisitor]
  }
}

