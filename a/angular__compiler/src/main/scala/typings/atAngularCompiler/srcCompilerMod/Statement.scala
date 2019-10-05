package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.StmtModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "Statement")
@js.native
abstract class Statement ()
  extends typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement {
  def this(modifiers: js.Array[StmtModifier]) = this()
  def this(
    modifiers: js.Array[StmtModifier],
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(modifiers: Null, sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
}

