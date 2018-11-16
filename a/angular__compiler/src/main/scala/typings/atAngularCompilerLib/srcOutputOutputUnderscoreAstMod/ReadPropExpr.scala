package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ReadPropExpr")
@js.native
class ReadPropExpr protected () extends Expression {
  def this(receiver: Expression, name: java.lang.String) = this()
  def this(receiver: Expression, name: java.lang.String, `type`: Type) = this()
  def this(receiver: Expression, name: java.lang.String, `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(receiver: Expression, name: java.lang.String, `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var name: java.lang.String = js.native
  var receiver: Expression = js.native
  def set(value: Expression): WritePropExpr = js.native
}

