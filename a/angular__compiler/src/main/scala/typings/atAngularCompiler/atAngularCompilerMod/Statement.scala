package typings.atAngularCompiler.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Statement")
@js.native
abstract class Statement ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.Statement {
  def this(modifiers: js.Array[typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StmtModifier]) = this()
  def this(
    modifiers: js.Array[typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StmtModifier],
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(modifiers: Null, sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
}

