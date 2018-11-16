package typings
package atAngularCompilerLib.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingForm extends js.Object

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "BindingForm")
@js.native
object BindingForm extends js.Object {
  @js.native
  sealed trait General
    extends atAngularCompilerLib.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod.BindingForm
  
  @js.native
  sealed trait TrySimple
    extends atAngularCompilerLib.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod.BindingForm
  
  /* 0 */ val General: General with scala.Double = js.native
  /* 1 */ val TrySimple: TrySimple with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod.BindingForm with scala.Double
  ] = js.native
}

