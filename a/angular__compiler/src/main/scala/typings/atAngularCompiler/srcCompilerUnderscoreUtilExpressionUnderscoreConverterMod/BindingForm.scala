package typings.atAngularCompiler.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingForm extends js.Object

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "BindingForm")
@js.native
object BindingForm extends js.Object {
  @js.native
  sealed trait General extends BindingForm
  
  @js.native
  sealed trait TrySimple extends BindingForm
  
  /* 0 */ val General: typings.atAngularCompiler.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod.BindingForm.General with Double = js.native
  /* 1 */ val TrySimple: typings.atAngularCompiler.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod.BindingForm.TrySimple with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BindingForm with Double] = js.native
}

