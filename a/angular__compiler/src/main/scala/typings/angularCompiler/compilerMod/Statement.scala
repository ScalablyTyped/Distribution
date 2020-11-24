package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "Statement")
@js.native
abstract class Statement ()
  extends typings.angularCompiler.publicApiMod.Statement {
  def this(modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier]) = this()
  def this(
    modifiers: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    modifiers: js.UndefOr[scala.Nothing],
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ) = this()
  def this(
    modifiers: js.UndefOr[scala.Nothing],
    sourceSpan: Null,
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ) = this()
  def this(
    modifiers: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ) = this()
  def this(
    modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ) = this()
  def this(
    modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: Null,
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ) = this()
  def this(
    modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ) = this()
}
