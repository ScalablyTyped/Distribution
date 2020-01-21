package typings.angularCompiler.publicApiMod

import typings.angularCompiler.outputAstMod.TypeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ExpressionType")
@js.native
class ExpressionType protected ()
  extends typings.angularCompiler.srcCompilerMod.ExpressionType {
  def this(value: typings.angularCompiler.outputAstMod.Expression) = this()
  def this(value: typings.angularCompiler.outputAstMod.Expression, modifiers: js.Array[TypeModifier]) = this()
  def this(
    value: typings.angularCompiler.outputAstMod.Expression,
    modifiers: js.Array[TypeModifier],
    typeParams: js.Array[typings.angularCompiler.outputAstMod.Type]
  ) = this()
  def this(
    value: typings.angularCompiler.outputAstMod.Expression,
    modifiers: Null,
    typeParams: js.Array[typings.angularCompiler.outputAstMod.Type]
  ) = this()
}

