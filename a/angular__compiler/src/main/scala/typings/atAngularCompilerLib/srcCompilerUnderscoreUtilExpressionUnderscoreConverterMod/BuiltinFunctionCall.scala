package typings
package atAngularCompilerLib.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "BuiltinFunctionCall")
@js.native
class BuiltinFunctionCall protected ()
  extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.FunctionCall {
  def this(span: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParseSpan, args: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST], converter: BuiltinConverter) = this()
  @JSName("args")
  var args_BuiltinFunctionCall: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST] = js.native
  @JSName("converter")
  var converter_Original: BuiltinConverter = js.native
  def converter(args: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression]): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
}

