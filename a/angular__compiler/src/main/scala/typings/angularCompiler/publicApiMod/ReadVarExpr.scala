package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "ReadVarExpr")
@js.native
class ReadVarExpr protected ()
  extends typings.angularCompiler.srcCompilerMod.ReadVarExpr {
  def this(name: String) = this()
  def this(name: typings.angularCompiler.outputAstMod.BuiltinVar) = this()
  def this(name: String, `type`: typings.angularCompiler.outputAstMod.Type) = this()
  def this(
    name: typings.angularCompiler.outputAstMod.BuiltinVar,
    `type`: typings.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(name: String, `type`: Null, sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(
    name: String,
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: typings.angularCompiler.outputAstMod.BuiltinVar,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: typings.angularCompiler.outputAstMod.BuiltinVar,
    `type`: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: typings.angularCompiler.outputAstMod.BuiltinVar,
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
