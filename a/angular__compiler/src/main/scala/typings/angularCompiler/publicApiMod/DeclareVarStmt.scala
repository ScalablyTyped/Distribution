package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "DeclareVarStmt")
@js.native
class DeclareVarStmt protected ()
  extends typings.angularCompiler.srcCompilerMod.DeclareVarStmt {
  def this(
    name: String,
    value: js.UndefOr[typings.angularCompiler.outputAstMod.Expression],
    `type`: js.UndefOr[typings.angularCompiler.outputAstMod.Type | Null],
    modifiers: js.UndefOr[js.Array[typings.angularCompiler.outputAstMod.StmtModifier] | Null],
    sourceSpan: js.UndefOr[typings.angularCompiler.srcParseUtilMod.ParseSourceSpan | Null]
  ) = this()
}

