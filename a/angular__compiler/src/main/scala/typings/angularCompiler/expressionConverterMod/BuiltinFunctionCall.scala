package typings.angularCompiler.expressionConverterMod

import typings.angularCompiler.astMod.AST
import typings.angularCompiler.astMod.AbsoluteSourceSpan
import typings.angularCompiler.astMod.FunctionCall
import typings.angularCompiler.astMod.ParseSpan
import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "BuiltinFunctionCall")
@js.native
class BuiltinFunctionCall protected () extends FunctionCall {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, args: js.Array[AST], converter: BuiltinConverter) = this()
  @JSName("args")
  var args_BuiltinFunctionCall: js.Array[AST] = js.native
  @JSName("converter")
  var converter_Original: BuiltinConverter = js.native
  def converter(args: js.Array[Expression]): Expression = js.native
}

