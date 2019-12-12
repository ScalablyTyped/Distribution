package typings.atAngularCompiler.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCompiler.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod.BindingForm.General
import typings.atAngularCompiler.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod.BindingForm.TrySimple
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BindingForm with Double] = js.native
  /* 0 */ @js.native
  object General extends TopLevel[General with Double]
  
  /* 1 */ @js.native
  object TrySimple extends TopLevel[TrySimple with Double]
  
}

