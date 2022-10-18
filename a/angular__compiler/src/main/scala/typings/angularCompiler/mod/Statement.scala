package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/compiler", "Statement")
@js.native
open class Statement () extends StObject {
  def this(modifiers: StmtModifier) = this()
  def this(modifiers: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(modifiers: StmtModifier, sourceSpan: ParseSourceSpan) = this()
  def this(modifiers: Unit, sourceSpan: Null, leadingComments: js.Array[LeadingComment_]) = this()
  def this(modifiers: Unit, sourceSpan: Unit, leadingComments: js.Array[LeadingComment_]) = this()
  def this(modifiers: Unit, sourceSpan: ParseSourceSpan, leadingComments: js.Array[LeadingComment_]) = this()
  def this(modifiers: StmtModifier, sourceSpan: Null, leadingComments: js.Array[LeadingComment_]) = this()
  def this(modifiers: StmtModifier, sourceSpan: Unit, leadingComments: js.Array[LeadingComment_]) = this()
  def this(modifiers: StmtModifier, sourceSpan: ParseSourceSpan, leadingComments: js.Array[LeadingComment_]) = this()
  
  def addLeadingComment(leadingComment: LeadingComment_): Unit = js.native
  
  def hasModifier(modifier: StmtModifier): Boolean = js.native
  
  /**
    * Calculates whether this statement produces the same value as the given statement.
    * Note: We don't check Types nor ParseSourceSpans nor function arguments.
    */
  def isEquivalent(stmt: Statement): Boolean = js.native
  
  var leadingComments: js.UndefOr[js.Array[LeadingComment_]] = js.native
  
  var modifiers: StmtModifier = js.native
  
  var sourceSpan: ParseSourceSpan | Null = js.native
  
  def visitStatement(visitor: StatementVisitor, context: Any): Any = js.native
}
