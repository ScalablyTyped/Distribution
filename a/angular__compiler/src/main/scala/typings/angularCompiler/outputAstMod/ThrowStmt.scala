package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "ThrowStmt")
@js.native
class ThrowStmt protected () extends Statement {
  def this(error: Expression) = this()
  def this(error: Expression, sourceSpan: ParseSourceSpan) = this()
  def this(error: Expression, sourceSpan: Null, leadingComments: js.Array[LeadingComment_]) = this()
  def this(error: Expression, sourceSpan: Unit, leadingComments: js.Array[LeadingComment_]) = this()
  def this(error: Expression, sourceSpan: ParseSourceSpan, leadingComments: js.Array[LeadingComment_]) = this()
  
  var error: Expression = js.native
  
  def isEquivalent(stmt: ThrowStmt): Boolean = js.native
}
