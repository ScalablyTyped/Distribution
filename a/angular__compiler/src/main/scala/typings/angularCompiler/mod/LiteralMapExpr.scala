package typings.angularCompiler.mod

import typings.angularCompiler.outputAstMod.LiteralMapEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "LiteralMapExpr")
@js.native
class LiteralMapExpr protected ()
  extends typings.angularCompiler.compilerMod.LiteralMapExpr {
  def this(entries: js.Array[LiteralMapEntry]) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: typings.angularCompiler.outputAstMod.MapType) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: typings.angularCompiler.outputAstMod.MapType,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

