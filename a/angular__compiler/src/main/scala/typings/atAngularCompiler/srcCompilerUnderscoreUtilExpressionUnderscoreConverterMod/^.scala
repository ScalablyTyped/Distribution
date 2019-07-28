package typings.atAngularCompiler.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import typings.atAngularCompiler.Anon_ArgsStmts
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler_util/expression_converter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertActionBinding(localResolver: Null, implicitReceiver: Expression, action: AST, bindingId: String): ConvertActionBindingResult = js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction
  ): ConvertActionBindingResult = js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan
  ): ConvertActionBindingResult = js.native
  def convertActionBinding(localResolver: LocalResolver, implicitReceiver: Expression, action: AST, bindingId: String): ConvertActionBindingResult = js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction
  ): ConvertActionBindingResult = js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan
  ): ConvertActionBindingResult = js.native
  def convertPropertyBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm
  ): ConvertPropertyBindingResult = js.native
  def convertPropertyBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm,
    interpolationFunction: InterpolationFunction
  ): ConvertPropertyBindingResult = js.native
  def convertPropertyBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm
  ): ConvertPropertyBindingResult = js.native
  def convertPropertyBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm,
    interpolationFunction: InterpolationFunction
  ): ConvertPropertyBindingResult = js.native
  def convertPropertyBindingBuiltins(converterFactory: BuiltinConverterFactory, ast: AST): AST = js.native
  def convertUpdateArguments(
    localResolver: LocalResolver,
    contextVariableExpression: Expression,
    expressionWithArgumentsToExtract: AST,
    bindingId: String
  ): Anon_ArgsStmts = js.native
  def temporaryDeclaration(bindingId: String, temporaryNumber: Double): Statement = js.native
}

