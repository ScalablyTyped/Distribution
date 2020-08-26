package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "WritePropExpr")
@js.native
class WritePropExpr protected ()
  extends typings.angularCompiler.srcCompilerMod.WritePropExpr {
  def this(
    receiver: typings.angularCompiler.outputAstMod.Expression,
    name: String,
    value: typings.angularCompiler.outputAstMod.Expression
  ) = this()
  def this(
    receiver: typings.angularCompiler.outputAstMod.Expression,
    name: String,
    value: typings.angularCompiler.outputAstMod.Expression,
    `type`: typings.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    receiver: typings.angularCompiler.outputAstMod.Expression,
    name: String,
    value: typings.angularCompiler.outputAstMod.Expression,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    receiver: typings.angularCompiler.outputAstMod.Expression,
    name: String,
    value: typings.angularCompiler.outputAstMod.Expression,
    `type`: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    receiver: typings.angularCompiler.outputAstMod.Expression,
    name: String,
    value: typings.angularCompiler.outputAstMod.Expression,
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

