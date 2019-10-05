package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "IfStmt")
@js.native
class IfStmt protected () extends Statement {
  def this(condition: Expression, trueCase: js.Array[Statement]) = this()
  def this(condition: Expression, trueCase: js.Array[Statement], falseCase: js.Array[Statement]) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: js.Array[Statement],
    sourceSpan: ParseSourceSpan
  ) = this()
  var condition: Expression = js.native
  var falseCase: js.Array[Statement] = js.native
  var trueCase: js.Array[Statement] = js.native
}

@JSImport("@angular/compiler/src/output/output_ast", "ifStmt")
@js.native
object ifStmt extends js.Object {
  def apply(condition: Expression, thenClause: js.Array[Statement]): IfStmt = js.native
  def apply(condition: Expression, thenClause: js.Array[Statement], elseClause: js.Array[Statement]): IfStmt = js.native
}

