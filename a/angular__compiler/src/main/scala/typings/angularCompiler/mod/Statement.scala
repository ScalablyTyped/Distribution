package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "Statement")
@js.native
abstract class Statement ()
  extends typings.angularCompiler.compilerMod.Statement {
  def this(modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier]) = this()
  def this(
    modifiers: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(modifiers: Null, sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
}

