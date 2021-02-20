package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "IfStmt")
@js.native
class IfStmt_ protected () extends Statement {
  def this(condition: Expression, trueCase: js.Array[Statement]) = this()
  def this(condition: Expression, trueCase: js.Array[Statement], falseCase: js.Array[Statement]) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: js.Array[Statement],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: js.UndefOr[scala.Nothing],
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: js.UndefOr[scala.Nothing],
    sourceSpan: Null,
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: js.UndefOr[scala.Nothing],
    sourceSpan: ParseSourceSpan,
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: js.Array[Statement],
    sourceSpan: js.UndefOr[scala.Nothing],
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: js.Array[Statement],
    sourceSpan: Null,
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: js.Array[Statement],
    sourceSpan: ParseSourceSpan,
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  
  var condition: Expression = js.native
  
  var falseCase: js.Array[Statement] = js.native
  
  var trueCase: js.Array[Statement] = js.native
}
