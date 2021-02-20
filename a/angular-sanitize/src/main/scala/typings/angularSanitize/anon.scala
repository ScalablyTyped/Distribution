package typings.angularSanitize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait HtmlElements extends StObject {
    
    var htmlElements: js.UndefOr[js.Array[String]] = js.native
    
    var htmlVoidElements: js.UndefOr[js.Array[String]] = js.native
    
    var svgElements: js.UndefOr[js.Array[String]] = js.native
  }
  object HtmlElements {
    
    @scala.inline
    def apply(): HtmlElements = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlElements]
    }
    
    @scala.inline
    implicit class HtmlElementsMutableBuilder[Self <: HtmlElements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtmlElements(value: js.Array[String]): Self = StObject.set(x, "htmlElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlElementsUndefined: Self = StObject.set(x, "htmlElements", js.undefined)
      
      @scala.inline
      def setHtmlElementsVarargs(value: String*): Self = StObject.set(x, "htmlElements", js.Array(value :_*))
      
      @scala.inline
      def setHtmlVoidElements(value: js.Array[String]): Self = StObject.set(x, "htmlVoidElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlVoidElementsUndefined: Self = StObject.set(x, "htmlVoidElements", js.undefined)
      
      @scala.inline
      def setHtmlVoidElementsVarargs(value: String*): Self = StObject.set(x, "htmlVoidElements", js.Array(value :_*))
      
      @scala.inline
      def setSvgElements(value: js.Array[String]): Self = StObject.set(x, "svgElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgElementsUndefined: Self = StObject.set(x, "svgElements", js.undefined)
      
      @scala.inline
      def setSvgElementsVarargs(value: String*): Self = StObject.set(x, "svgElements", js.Array(value :_*))
    }
  }
}
