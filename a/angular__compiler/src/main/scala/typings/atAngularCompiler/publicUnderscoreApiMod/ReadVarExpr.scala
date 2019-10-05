package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinVar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ReadVarExpr")
@js.native
class ReadVarExpr protected ()
  extends typings.atAngularCompiler.srcCompilerMod.ReadVarExpr {
  def this(name: String) = this()
  def this(name: BuiltinVar) = this()
  def this(name: String, `type`: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type) = this()
  def this(name: BuiltinVar, `type`: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type) = this()
  def this(
    name: String,
    `type`: Null,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: BuiltinVar,
    `type`: Null,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: BuiltinVar,
    `type`: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

