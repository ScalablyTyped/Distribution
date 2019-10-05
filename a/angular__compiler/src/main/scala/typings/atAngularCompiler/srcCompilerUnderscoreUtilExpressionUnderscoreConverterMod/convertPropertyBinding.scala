package typings.atAngularCompiler.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

