package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ReadKeyExpr")
@js.native
class ReadKeyExpr protected () extends Expression {
  def this(receiver: Expression, index: Expression) = this()
  def this(receiver: Expression, index: Expression, `type`: Type) = this()
  def this(receiver: Expression, index: Expression, `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(receiver: Expression, index: Expression, `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var index: Expression = js.native
  var receiver: Expression = js.native
  def set(value: Expression): WriteKeyExpr = js.native
}

