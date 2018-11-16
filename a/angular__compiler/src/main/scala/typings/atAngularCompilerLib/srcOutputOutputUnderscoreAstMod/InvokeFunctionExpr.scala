package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "InvokeFunctionExpr")
@js.native
class InvokeFunctionExpr protected () extends Expression {
  def this(fn: Expression, args: js.Array[Expression]) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Type) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var args: js.Array[Expression] = js.native
  var fn: Expression = js.native
}

