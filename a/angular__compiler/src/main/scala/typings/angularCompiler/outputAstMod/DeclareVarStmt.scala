package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "DeclareVarStmt")
@js.native
class DeclareVarStmt protected () extends Statement {
  def this(
    name: String,
    value: js.UndefOr[Expression],
    `type`: js.UndefOr[Type | Null],
    modifiers: js.UndefOr[js.Array[StmtModifier] | Null],
    sourceSpan: js.UndefOr[ParseSourceSpan | Null]
  ) = this()
  var name: String = js.native
  var `type`: Type | Null = js.native
  var value: js.UndefOr[Expression] = js.native
}

