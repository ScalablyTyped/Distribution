package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "IfStmt")
@js.native
class IfStmt protected () extends Statement {
  def this(condition: Expression, trueCase: js.Array[Statement]) = this()
  def this(condition: Expression, trueCase: js.Array[Statement], falseCase: js.Array[Statement]) = this()
  def this(condition: Expression, trueCase: js.Array[Statement], falseCase: js.Array[Statement], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var condition: Expression = js.native
  var falseCase: js.Array[Statement] = js.native
  var trueCase: js.Array[Statement] = js.native
}

