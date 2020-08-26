package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "expressionType")
@js.native
object expressionType extends js.Object {
  def apply(expr: Expression): ExpressionType_ = js.native
  def apply(expr: Expression, typeModifiers: js.UndefOr[scala.Nothing], typeParams: js.Array[Type]): ExpressionType_ = js.native
  def apply(expr: Expression, typeModifiers: js.Array[TypeModifier]): ExpressionType_ = js.native
  def apply(expr: Expression, typeModifiers: js.Array[TypeModifier], typeParams: js.Array[Type]): ExpressionType_ = js.native
  def apply(expr: Expression, typeModifiers: Null, typeParams: js.Array[Type]): ExpressionType_ = js.native
}

