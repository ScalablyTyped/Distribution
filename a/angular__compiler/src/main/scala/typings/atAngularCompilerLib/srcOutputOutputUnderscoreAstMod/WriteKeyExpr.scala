package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "WriteKeyExpr")
@js.native
class WriteKeyExpr protected () extends Expression {
  def this(receiver: Expression, index: Expression, value: Expression) = this()
  def this(receiver: Expression, index: Expression, value: Expression, `type`: Type) = this()
  def this(receiver: Expression, index: Expression, value: Expression, `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(receiver: Expression, index: Expression, value: Expression, `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var index: Expression = js.native
  var receiver: Expression = js.native
  var value: Expression = js.native
}

