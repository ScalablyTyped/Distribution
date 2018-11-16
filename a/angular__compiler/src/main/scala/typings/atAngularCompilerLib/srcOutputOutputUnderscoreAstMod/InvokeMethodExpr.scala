package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "InvokeMethodExpr")
@js.native
class InvokeMethodExpr protected () extends Expression {
  def this(receiver: Expression, method: BuiltinMethod, args: js.Array[Expression]) = this()
  def this(receiver: Expression, method: java.lang.String, args: js.Array[Expression]) = this()
  def this(receiver: Expression, method: BuiltinMethod, args: js.Array[Expression], `type`: Type) = this()
  def this(receiver: Expression, method: java.lang.String, args: js.Array[Expression], `type`: Type) = this()
  def this(receiver: Expression, method: BuiltinMethod, args: js.Array[Expression], `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(receiver: Expression, method: BuiltinMethod, args: js.Array[Expression], `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(receiver: Expression, method: java.lang.String, args: js.Array[Expression], `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(receiver: Expression, method: java.lang.String, args: js.Array[Expression], `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var args: js.Array[Expression] = js.native
  var builtin: BuiltinMethod | scala.Null = js.native
  var name: java.lang.String | scala.Null = js.native
  var receiver: Expression = js.native
}

