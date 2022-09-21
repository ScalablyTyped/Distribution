package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "IfStmt")
@js.native
open class IfStmt protected () extends Statement {
  def this(condition: Expression, trueCase: js.Array[Statement]) = this()
  def this(condition: Expression, trueCase: js.Array[Statement], falseCase: js.Array[Statement]) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: js.Array[Statement],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(condition: Expression, trueCase: js.Array[Statement], falseCase: Unit, sourceSpan: ParseSourceSpan) = this()
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
    sourceSpan: Unit,
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: js.Array[Statement],
    sourceSpan: ParseSourceSpan,
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: Unit,
    sourceSpan: Null,
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: Unit,
    sourceSpan: Unit,
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  def this(
    condition: Expression,
    trueCase: js.Array[Statement],
    falseCase: Unit,
    sourceSpan: ParseSourceSpan,
    leadingComments: js.Array[LeadingComment_]
  ) = this()
  
  var condition: Expression = js.native
  
  var falseCase: js.Array[Statement] = js.native
  
  var trueCase: js.Array[Statement] = js.native
}
