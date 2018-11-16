package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "WritePropExpr")
@js.native
class WritePropExpr protected () extends Expression {
  def this(receiver: Expression, name: java.lang.String, value: Expression) = this()
  def this(receiver: Expression, name: java.lang.String, value: Expression, `type`: Type) = this()
  def this(receiver: Expression, name: java.lang.String, value: Expression, `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(receiver: Expression, name: java.lang.String, value: Expression, `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var name: java.lang.String = js.native
  var receiver: Expression = js.native
  var value: Expression = js.native
}

