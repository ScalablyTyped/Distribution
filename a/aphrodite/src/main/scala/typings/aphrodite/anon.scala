package typings.aphrodite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: String
    
    var renderedClassNames: js.Array[String]
  }
  object Content {
    
    inline def apply(content: String, renderedClassNames: js.Array[String]): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], renderedClassNames = renderedClassNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setRenderedClassNames(value: js.Array[String]): Self = StObject.set(x, "renderedClassNames", value.asInstanceOf[js.Any])
      
      inline def setRenderedClassNamesVarargs(value: String*): Self = StObject.set(x, "renderedClassNames", js.Array(value :_*))
    }
  }
  
  trait FontFamily extends StObject {
    
    var fontFamily: String
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[String | Double] = js.undefined
    
    var src: String
  }
  object FontFamily {
    
    inline def apply(fontFamily: String, src: String): FontFamily = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontFamily]
    }
    
    extension [Self <: FontFamily](x: Self) {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
