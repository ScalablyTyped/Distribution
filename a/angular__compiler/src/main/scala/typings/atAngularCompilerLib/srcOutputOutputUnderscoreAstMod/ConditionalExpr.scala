package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ConditionalExpr")
@js.native
class ConditionalExpr protected () extends Expression {
  def this(condition: Expression, trueCase: Expression) = this()
  def this(condition: Expression, trueCase: Expression, falseCase: Expression) = this()
  def this(condition: Expression, trueCase: Expression, falseCase: Expression, `type`: Type) = this()
  def this(condition: Expression, trueCase: Expression, falseCase: scala.Null, `type`: Type) = this()
  def this(condition: Expression, trueCase: Expression, falseCase: Expression, `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(condition: Expression, trueCase: Expression, falseCase: Expression, `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(condition: Expression, trueCase: Expression, falseCase: scala.Null, `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(condition: Expression, trueCase: Expression, falseCase: scala.Null, `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var condition: Expression = js.native
  var falseCase: Expression | scala.Null = js.native
  var trueCase: Expression = js.native
}

