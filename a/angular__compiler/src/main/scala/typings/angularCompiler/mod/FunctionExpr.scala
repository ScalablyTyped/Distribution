package typings.angularCompiler.mod

import typings.angularCompiler.outputAstMod.FnParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "FunctionExpr")
@js.native
class FunctionExpr protected ()
  extends typings.angularCompiler.publicApiMod.FunctionExpr {
  def this(params: js.Array[FnParam], statements: js.Array[typings.angularCompiler.outputAstMod.Statement]) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: Null,
    sourceSpan: Null,
    name: String
  ) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    name: String
  ) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: Null,
    name: String
  ) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[typings.angularCompiler.outputAstMod.Statement],
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    name: String
  ) = this()
}

