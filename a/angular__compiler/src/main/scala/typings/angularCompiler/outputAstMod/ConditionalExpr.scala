package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ConditionalExpr")
@js.native
class ConditionalExpr protected () extends Expression {
  def this(condition: Expression, trueCase: Expression) = this()
  def this(condition: Expression, trueCase: Expression, falseCase: Expression) = this()
  def this(condition: Expression, trueCase: Expression, falseCase: Null, `type`: Type) = this()
  def this(condition: Expression, trueCase: Expression, falseCase: Expression, `type`: Type) = this()
  def this(
    condition: Expression,
    trueCase: Expression,
    falseCase: Null,
    `type`: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    condition: Expression,
    trueCase: Expression,
    falseCase: Null,
    `type`: Type,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    condition: Expression,
    trueCase: Expression,
    falseCase: Expression,
    `type`: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    condition: Expression,
    trueCase: Expression,
    falseCase: Expression,
    `type`: Type,
    sourceSpan: ParseSourceSpan
  ) = this()
  var condition: Expression = js.native
  var falseCase: Expression | Null = js.native
  var trueCase: Expression = js.native
}

