package typings.angularCompiler.expressionConverterMod

import typings.angularCompiler.astMod.AST
import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertPropertyBinding")
@js.native
object convertPropertyBinding extends js.Object {
  
  def apply(
    localResolver: Null,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm
  ): ConvertPropertyBindingResult = js.native
  def apply(
    localResolver: Null,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm,
    interpolationFunction: InterpolationFunction
  ): ConvertPropertyBindingResult = js.native
  def apply(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm
  ): ConvertPropertyBindingResult = js.native
  def apply(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm,
    interpolationFunction: InterpolationFunction
  ): ConvertPropertyBindingResult = js.native
}
