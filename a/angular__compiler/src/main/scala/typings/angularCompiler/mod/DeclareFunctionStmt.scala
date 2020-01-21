package typings.angularCompiler.mod

import typings.angularCompiler.outputAstMod.FnParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "DeclareFunctionStmt")
@js.native
class DeclareFunctionStmt protected ()
  extends typings.angularCompiler.publicApiMod.DeclareFunctionStmt {
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: Null,
    modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type,
    modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier]
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: Null,
    modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: Null,
    modifiers: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type,
    modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type,
    modifiers: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

