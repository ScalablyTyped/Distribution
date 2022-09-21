package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visitor3[Result] extends StObject {
  
  var visit: js.UndefOr[js.Function1[/* node */ TmplAstNode, Result]] = js.undefined
  
  def visitBoundAttribute(attribute: TmplAstBoundAttribute): Result
  
  def visitBoundEvent(attribute: TmplAstBoundEvent): Result
  
  def visitBoundText(text: TmplAstBoundText): Result
  
  def visitContent(content: TmplAstContent): Result
  
  def visitElement(element: TmplAstElement): Result
  
  def visitIcu(icu: TmplAstIcu): Result
  
  def visitReference(reference: TmplAstReference): Result
  
  def visitTemplate(template: TmplAstTemplate): Result
  
  def visitText(text: TmplAstText): Result
  
  def visitTextAttribute(attribute: TmplAstTextAttribute): Result
  
  def visitVariable(variable: TmplAstVariable): Result
}
object Visitor3 {
  
  inline def apply[Result](
    visitBoundAttribute: TmplAstBoundAttribute => Result,
    visitBoundEvent: TmplAstBoundEvent => Result,
    visitBoundText: TmplAstBoundText => Result,
    visitContent: TmplAstContent => Result,
    visitElement: TmplAstElement => Result,
    visitIcu: TmplAstIcu => Result,
    visitReference: TmplAstReference => Result,
    visitTemplate: TmplAstTemplate => Result,
    visitText: TmplAstText => Result,
    visitTextAttribute: TmplAstTextAttribute => Result,
    visitVariable: TmplAstVariable => Result
  ): Visitor3[Result] = {
    val __obj = js.Dynamic.literal(visitBoundAttribute = js.Any.fromFunction1(visitBoundAttribute), visitBoundEvent = js.Any.fromFunction1(visitBoundEvent), visitBoundText = js.Any.fromFunction1(visitBoundText), visitContent = js.Any.fromFunction1(visitContent), visitElement = js.Any.fromFunction1(visitElement), visitIcu = js.Any.fromFunction1(visitIcu), visitReference = js.Any.fromFunction1(visitReference), visitTemplate = js.Any.fromFunction1(visitTemplate), visitText = js.Any.fromFunction1(visitText), visitTextAttribute = js.Any.fromFunction1(visitTextAttribute), visitVariable = js.Any.fromFunction1(visitVariable))
    __obj.asInstanceOf[Visitor3[Result]]
  }
  
  extension [Self <: Visitor3[?], Result](x: Self & Visitor3[Result]) {
    
    inline def setVisit(value: /* node */ TmplAstNode => Result): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
    
    inline def setVisitBoundAttribute(value: TmplAstBoundAttribute => Result): Self = StObject.set(x, "visitBoundAttribute", js.Any.fromFunction1(value))
    
    inline def setVisitBoundEvent(value: TmplAstBoundEvent => Result): Self = StObject.set(x, "visitBoundEvent", js.Any.fromFunction1(value))
    
    inline def setVisitBoundText(value: TmplAstBoundText => Result): Self = StObject.set(x, "visitBoundText", js.Any.fromFunction1(value))
    
    inline def setVisitContent(value: TmplAstContent => Result): Self = StObject.set(x, "visitContent", js.Any.fromFunction1(value))
    
    inline def setVisitElement(value: TmplAstElement => Result): Self = StObject.set(x, "visitElement", js.Any.fromFunction1(value))
    
    inline def setVisitIcu(value: TmplAstIcu => Result): Self = StObject.set(x, "visitIcu", js.Any.fromFunction1(value))
    
    inline def setVisitReference(value: TmplAstReference => Result): Self = StObject.set(x, "visitReference", js.Any.fromFunction1(value))
    
    inline def setVisitTemplate(value: TmplAstTemplate => Result): Self = StObject.set(x, "visitTemplate", js.Any.fromFunction1(value))
    
    inline def setVisitText(value: TmplAstText => Result): Self = StObject.set(x, "visitText", js.Any.fromFunction1(value))
    
    inline def setVisitTextAttribute(value: TmplAstTextAttribute => Result): Self = StObject.set(x, "visitTextAttribute", js.Any.fromFunction1(value))
    
    inline def setVisitUndefined: Self = StObject.set(x, "visit", js.undefined)
    
    inline def setVisitVariable(value: TmplAstVariable => Result): Self = StObject.set(x, "visitVariable", js.Any.fromFunction1(value))
  }
}
