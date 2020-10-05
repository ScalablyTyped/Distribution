package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "DeclareFunctionStmt")
@js.native
class DeclareFunctionStmt protected () extends Statement {
  def this(name: String, params: js.Array[FnParam], statements: js.Array[Statement]) = this()
  def this(name: String, params: js.Array[FnParam], statements: js.Array[Statement], `type`: Type) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: js.UndefOr[scala.Nothing],
    modifiers: js.Array[StmtModifier]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Null,
    modifiers: js.Array[StmtModifier]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Type,
    modifiers: js.Array[StmtModifier]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: js.UndefOr[scala.Nothing],
    modifiers: js.Array[StmtModifier],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: js.UndefOr[scala.Nothing],
    modifiers: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Null,
    modifiers: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Null,
    modifiers: js.Array[StmtModifier],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Null,
    modifiers: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Type,
    modifiers: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Type,
    modifiers: js.Array[StmtModifier],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Type,
    modifiers: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  var name: String = js.native
  var params: js.Array[FnParam] = js.native
  var statements: js.Array[Statement] = js.native
  var `type`: Type | Null = js.native
}

