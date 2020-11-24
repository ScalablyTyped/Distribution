package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "ReturnStatement")
@js.native
class ReturnStatement protected () extends Statement {
  def this(value: Expression) = this()
  def this(value: Expression, sourceSpan: ParseSourceSpan) = this()
  def this(
    value: Expression,
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(value: Expression, sourceSpan: Null, leadingComments: js.Array[LeadingComment_]) = this()
  def this(value: Expression, sourceSpan: ParseSourceSpan, leadingComments: js.Array[LeadingComment_]) = this()
  
  var value: Expression = js.native
}
