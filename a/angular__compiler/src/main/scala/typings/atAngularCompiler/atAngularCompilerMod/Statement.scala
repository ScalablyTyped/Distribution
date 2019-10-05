package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StmtModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Statement")
@js.native
abstract class Statement ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.Statement {
  def this(modifiers: js.Array[StmtModifier]) = this()
  def this(
    modifiers: js.Array[StmtModifier],
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(modifiers: Null, sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
}

