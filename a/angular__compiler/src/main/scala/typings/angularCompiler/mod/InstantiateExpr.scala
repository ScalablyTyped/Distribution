package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "InstantiateExpr")
@js.native
class InstantiateExpr protected ()
  extends typings.angularCompiler.compilerMod.InstantiateExpr {
  def this(
    classExpr: typings.angularCompiler.outputAstMod.Expression,
    args: js.Array[typings.angularCompiler.outputAstMod.Expression]
  ) = this()
  def this(
    classExpr: typings.angularCompiler.outputAstMod.Expression,
    args: js.Array[typings.angularCompiler.outputAstMod.Expression],
    `type`: typings.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    classExpr: typings.angularCompiler.outputAstMod.Expression,
    args: js.Array[typings.angularCompiler.outputAstMod.Expression],
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    classExpr: typings.angularCompiler.outputAstMod.Expression,
    args: js.Array[typings.angularCompiler.outputAstMod.Expression],
    `type`: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    classExpr: typings.angularCompiler.outputAstMod.Expression,
    args: js.Array[typings.angularCompiler.outputAstMod.Expression],
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

