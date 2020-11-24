package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "WriteVarExpr")
@js.native
class WriteVarExpr protected ()
  extends typings.angularCompiler.outputAstMod.WriteVarExpr {
  def this(name: String, value: typings.angularCompiler.outputAstMod.Expression) = this()
  def this(
    name: String,
    value: typings.angularCompiler.outputAstMod.Expression,
    `type`: typings.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    name: String,
    value: typings.angularCompiler.outputAstMod.Expression,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: typings.angularCompiler.outputAstMod.Expression,
    `type`: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: typings.angularCompiler.outputAstMod.Expression,
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
