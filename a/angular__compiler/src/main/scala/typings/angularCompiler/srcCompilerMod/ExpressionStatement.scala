package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "ExpressionStatement")
@js.native
class ExpressionStatement protected ()
  extends typings.angularCompiler.outputAstMod.ExpressionStatement {
  def this(expr: typings.angularCompiler.outputAstMod.Expression) = this()
  def this(
    expr: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    expr: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ) = this()
  def this(
    expr: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: Null,
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ) = this()
  def this(
    expr: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    leadingComments: js.Array[typings.angularCompiler.outputAstMod.LeadingComment_]
  ) = this()
}
