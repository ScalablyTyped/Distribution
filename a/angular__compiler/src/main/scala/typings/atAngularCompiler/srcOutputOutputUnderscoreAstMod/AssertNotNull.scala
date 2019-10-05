package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "AssertNotNull")
@js.native
class AssertNotNull protected () extends Expression {
  def this(condition: Expression) = this()
  def this(condition: Expression, sourceSpan: ParseSourceSpan) = this()
  var condition: Expression = js.native
}

@JSImport("@angular/compiler/src/output/output_ast", "assertNotNull")
@js.native
object assertNotNull extends js.Object {
  def apply(expr: Expression): AssertNotNull = js.native
  def apply(expr: Expression, sourceSpan: ParseSourceSpan): AssertNotNull = js.native
}

