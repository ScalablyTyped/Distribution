package typings.angularCompiler.expressionConverterMod

import typings.angularCompiler.anon.Args
import typings.angularCompiler.astMod.AST
import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertUpdateArguments")
@js.native
object convertUpdateArguments extends js.Object {
  def apply(
    localResolver: LocalResolver,
    contextVariableExpression: Expression,
    expressionWithArgumentsToExtract: AST,
    bindingId: String
  ): Args = js.native
}

