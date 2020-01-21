package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "CommaExpr")
@js.native
class CommaExpr protected ()
  extends typings.angularCompiler.outputAstMod.CommaExpr {
  def this(parts: js.Array[typings.angularCompiler.outputAstMod.Expression]) = this()
  def this(
    parts: js.Array[typings.angularCompiler.outputAstMod.Expression],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

