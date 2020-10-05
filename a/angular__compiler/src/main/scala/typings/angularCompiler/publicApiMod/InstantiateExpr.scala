package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "InstantiateExpr")
@js.native
class InstantiateExpr protected ()
  extends typings.angularCompiler.srcCompilerMod.InstantiateExpr {
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

