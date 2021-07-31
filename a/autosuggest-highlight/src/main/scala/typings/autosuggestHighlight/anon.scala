package typings.autosuggestHighlight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Highlight extends StObject {
    
    var highlight: Boolean
    
    var text: String
  }
  object Highlight {
    
    @scala.inline
    def apply(highlight: Boolean, text: String): Highlight = {
      val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Highlight]
    }
    
    @scala.inline
    implicit class HighlightMutableBuilder[Self <: Highlight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
