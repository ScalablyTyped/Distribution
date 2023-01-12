package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visitor extends StObject {
  
  var visit: js.UndefOr[js.Function2[/* node */ Node2, /* context */ Any, Any]] = js.undefined
  
  def visitAttribute(attribute: Attribute, context: Any): Any
  
  def visitComment(comment: Comment2, context: Any): Any
  
  def visitElement(element: Element2, context: Any): Any
  
  def visitExpansion(expansion: Expansion, context: Any): Any
  
  def visitExpansionCase(expansionCase: ExpansionCase, context: Any): Any
  
  def visitText(text: Text2, context: Any): Any
}
object Visitor {
  
  inline def apply(
    visitAttribute: (Attribute, Any) => Any,
    visitComment: (Comment2, Any) => Any,
    visitElement: (Element2, Any) => Any,
    visitExpansion: (Expansion, Any) => Any,
    visitExpansionCase: (ExpansionCase, Any) => Any,
    visitText: (Text2, Any) => Any
  ): Visitor = {
    val __obj = js.Dynamic.literal(visitAttribute = js.Any.fromFunction2(visitAttribute), visitComment = js.Any.fromFunction2(visitComment), visitElement = js.Any.fromFunction2(visitElement), visitExpansion = js.Any.fromFunction2(visitExpansion), visitExpansionCase = js.Any.fromFunction2(visitExpansionCase), visitText = js.Any.fromFunction2(visitText))
    __obj.asInstanceOf[Visitor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Visitor] (val x: Self) extends AnyVal {
    
    inline def setVisit(value: (/* node */ Node2, /* context */ Any) => Any): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
    
    inline def setVisitAttribute(value: (Attribute, Any) => Any): Self = StObject.set(x, "visitAttribute", js.Any.fromFunction2(value))
    
    inline def setVisitComment(value: (Comment2, Any) => Any): Self = StObject.set(x, "visitComment", js.Any.fromFunction2(value))
    
    inline def setVisitElement(value: (Element2, Any) => Any): Self = StObject.set(x, "visitElement", js.Any.fromFunction2(value))
    
    inline def setVisitExpansion(value: (Expansion, Any) => Any): Self = StObject.set(x, "visitExpansion", js.Any.fromFunction2(value))
    
    inline def setVisitExpansionCase(value: (ExpansionCase, Any) => Any): Self = StObject.set(x, "visitExpansionCase", js.Any.fromFunction2(value))
    
    inline def setVisitText(value: (Text2, Any) => Any): Self = StObject.set(x, "visitText", js.Any.fromFunction2(value))
    
    inline def setVisitUndefined: Self = StObject.set(x, "visit", js.undefined)
  }
}
