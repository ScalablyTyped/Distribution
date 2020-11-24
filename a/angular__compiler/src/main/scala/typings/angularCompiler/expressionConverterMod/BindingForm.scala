package typings.angularCompiler.expressionConverterMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BindingForm extends js.Object
@JSImport("@angular/compiler/src/compiler_util/expression_converter", "BindingForm")
@js.native
object BindingForm extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BindingForm with Double] = js.native
  
  @js.native
  sealed trait Expression extends BindingForm
  /* 2 */ @js.native
  object Expression extends TopLevel[Expression with Double]
  
  @js.native
  sealed trait General extends BindingForm
  /* 0 */ @js.native
  object General extends TopLevel[General with Double]
  
  @js.native
  sealed trait TrySimple extends BindingForm
  /* 1 */ @js.native
  object TrySimple extends TopLevel[TrySimple with Double]
}
