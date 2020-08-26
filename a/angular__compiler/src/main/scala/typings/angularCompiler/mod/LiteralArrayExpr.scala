package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "LiteralArrayExpr")
@js.native
class LiteralArrayExpr protected ()
  extends typings.angularCompiler.compilerMod.LiteralArrayExpr {
  def this(entries: js.Array[typings.angularCompiler.outputAstMod.Expression]) = this()
  def this(
    entries: js.Array[typings.angularCompiler.outputAstMod.Expression],
    `type`: typings.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    entries: js.Array[typings.angularCompiler.outputAstMod.Expression],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    entries: js.Array[typings.angularCompiler.outputAstMod.Expression],
    `type`: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    entries: js.Array[typings.angularCompiler.outputAstMod.Expression],
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

