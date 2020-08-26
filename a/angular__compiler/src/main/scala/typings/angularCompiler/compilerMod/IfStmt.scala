package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "IfStmt")
@js.native
class IfStmt protected ()
  extends typings.angularCompiler.publicApiMod.IfStmt {
  def this(
    condition: typings.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typings.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    condition: typings.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typings.angularCompiler.outputAstMod.Statement],
    falseCase: js.Array[typings.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    condition: typings.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typings.angularCompiler.outputAstMod.Statement],
    falseCase: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    condition: typings.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typings.angularCompiler.outputAstMod.Statement],
    falseCase: js.Array[typings.angularCompiler.outputAstMod.Statement],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

