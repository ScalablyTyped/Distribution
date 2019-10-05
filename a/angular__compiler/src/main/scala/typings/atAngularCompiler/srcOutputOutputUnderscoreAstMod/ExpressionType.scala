package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ExpressionType")
@js.native
class ExpressionType protected () extends Type {
  def this(value: Expression) = this()
  def this(value: Expression, modifiers: js.Array[TypeModifier]) = this()
  def this(value: Expression, modifiers: js.Array[TypeModifier], typeParams: js.Array[Type]) = this()
  def this(value: Expression, modifiers: Null, typeParams: js.Array[Type]) = this()
  var typeParams: js.Array[Type] | Null = js.native
  var value: Expression = js.native
}

@JSImport("@angular/compiler/src/output/output_ast", "expressionType")
@js.native
object expressionType extends js.Object {
  def apply(expr: Expression): ExpressionType = js.native
  def apply(expr: Expression, typeModifiers: js.Array[TypeModifier]): ExpressionType = js.native
  def apply(expr: Expression, typeModifiers: js.Array[TypeModifier], typeParams: js.Array[Type]): ExpressionType = js.native
  def apply(expr: Expression, typeModifiers: Null, typeParams: js.Array[Type]): ExpressionType = js.native
}

