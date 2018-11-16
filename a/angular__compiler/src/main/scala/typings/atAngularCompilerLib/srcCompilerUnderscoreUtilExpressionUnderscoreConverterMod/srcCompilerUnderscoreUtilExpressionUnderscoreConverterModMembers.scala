package typings
package atAngularCompilerLib.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler_util/expression_converter", JSImport.Namespace)
@js.native
object srcCompilerUnderscoreUtilExpressionUnderscoreConverterModMembers extends js.Object {
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    action: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST,
    bindingId: java.lang.String
  ): ConvertActionBindingResult = js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    action: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST,
    bindingId: java.lang.String,
    interpolationFunction: InterpolationFunction
  ): ConvertActionBindingResult = js.native
  def convertActionBinding(
    localResolver: scala.Null,
    implicitReceiver: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    action: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST,
    bindingId: java.lang.String
  ): ConvertActionBindingResult = js.native
  def convertActionBinding(
    localResolver: scala.Null,
    implicitReceiver: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    action: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST,
    bindingId: java.lang.String,
    interpolationFunction: InterpolationFunction
  ): ConvertActionBindingResult = js.native
  def convertPropertyBinding(
    localResolver: LocalResolver,
    implicitReceiver: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    expressionWithoutBuiltins: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST,
    bindingId: java.lang.String,
    form: BindingForm
  ): ConvertPropertyBindingResult = js.native
  def convertPropertyBinding(
    localResolver: LocalResolver,
    implicitReceiver: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    expressionWithoutBuiltins: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST,
    bindingId: java.lang.String,
    form: BindingForm,
    interpolationFunction: InterpolationFunction
  ): ConvertPropertyBindingResult = js.native
  def convertPropertyBinding(
    localResolver: scala.Null,
    implicitReceiver: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    expressionWithoutBuiltins: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST,
    bindingId: java.lang.String,
    form: BindingForm
  ): ConvertPropertyBindingResult = js.native
  def convertPropertyBinding(
    localResolver: scala.Null,
    implicitReceiver: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    expressionWithoutBuiltins: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST,
    bindingId: java.lang.String,
    form: BindingForm,
    interpolationFunction: InterpolationFunction
  ): ConvertPropertyBindingResult = js.native
  def convertPropertyBindingBuiltins(
    converterFactory: BuiltinConverterFactory,
    ast: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST
  ): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def temporaryDeclaration(bindingId: java.lang.String, temporaryNumber: scala.Double): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement = js.native
}

