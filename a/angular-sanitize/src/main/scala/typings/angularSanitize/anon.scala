package typings.angularSanitize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HtmlElements extends StObject {
    
    var htmlElements: js.UndefOr[js.Array[String]] = js.undefined
    
    var htmlVoidElements: js.UndefOr[js.Array[String]] = js.undefined
    
    var svgElements: js.UndefOr[js.Array[String]] = js.undefined
  }
  object HtmlElements {
    
    inline def apply(): HtmlElements = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlElements]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HtmlElements] (val x: Self) extends AnyVal {
      
      inline def setHtmlElements(value: js.Array[String]): Self = StObject.set(x, "htmlElements", value.asInstanceOf[js.Any])
      
      inline def setHtmlElementsUndefined: Self = StObject.set(x, "htmlElements", js.undefined)
      
      inline def setHtmlElementsVarargs(value: String*): Self = StObject.set(x, "htmlElements", js.Array(value*))
      
      inline def setHtmlVoidElements(value: js.Array[String]): Self = StObject.set(x, "htmlVoidElements", value.asInstanceOf[js.Any])
      
      inline def setHtmlVoidElementsUndefined: Self = StObject.set(x, "htmlVoidElements", js.undefined)
      
      inline def setHtmlVoidElementsVarargs(value: String*): Self = StObject.set(x, "htmlVoidElements", js.Array(value*))
      
      inline def setSvgElements(value: js.Array[String]): Self = StObject.set(x, "svgElements", value.asInstanceOf[js.Any])
      
      inline def setSvgElementsUndefined: Self = StObject.set(x, "svgElements", js.undefined)
      
      inline def setSvgElementsVarargs(value: String*): Self = StObject.set(x, "svgElements", js.Array(value*))
    }
  }
}
