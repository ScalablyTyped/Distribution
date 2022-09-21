package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ReturnStatement")
@js.native
open class ReturnStatement protected () extends Statement {
  def this(value: Expression) = this()
  def this(value: Expression, sourceSpan: ParseSourceSpan) = this()
  def this(value: Expression, sourceSpan: Null, leadingComments: js.Array[LeadingComment_]) = this()
  def this(value: Expression, sourceSpan: Unit, leadingComments: js.Array[LeadingComment_]) = this()
  def this(value: Expression, sourceSpan: ParseSourceSpan, leadingComments: js.Array[LeadingComment_]) = this()
  
  var value: Expression = js.native
}
