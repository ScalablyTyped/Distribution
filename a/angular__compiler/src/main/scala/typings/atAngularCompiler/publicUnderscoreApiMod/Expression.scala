package typings.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Expression")
@js.native
abstract class Expression ()
  extends typings.atAngularCompiler.srcCompilerMod.Expression {
  def this(`type`: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type) = this()
  def this(
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(`type`: Null, sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(
    `type`: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

