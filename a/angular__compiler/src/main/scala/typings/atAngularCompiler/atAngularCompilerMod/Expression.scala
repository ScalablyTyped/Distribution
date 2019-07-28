package typings.atAngularCompiler.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Expression")
@js.native
abstract class Expression ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.Expression {
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

