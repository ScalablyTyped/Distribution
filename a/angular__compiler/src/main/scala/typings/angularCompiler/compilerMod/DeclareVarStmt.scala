package typings.angularCompiler.compilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "DeclareVarStmt")
@js.native
class DeclareVarStmt protected ()
  extends typings.angularCompiler.publicApiMod.DeclareVarStmt {
  def this(
    name: String,
    value: js.UndefOr[typings.angularCompiler.outputAstMod.Expression],
    `type`: js.UndefOr[typings.angularCompiler.outputAstMod.Type | Null],
    modifiers: js.UndefOr[js.Array[typings.angularCompiler.outputAstMod.StmtModifier]],
    sourceSpan: js.UndefOr[typings.angularCompiler.srcParseUtilMod.ParseSourceSpan | Null],
    leadingComments: js.UndefOr[js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]]
  ) = this()
}
