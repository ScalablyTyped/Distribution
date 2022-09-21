package typings.autolinker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait OnCloseTag extends StObject {
    
    def onCloseTag(tagName: String, offset: Double): Unit
    
    def onComment(offset: Double): Unit
    
    def onDoctype(offset: Double): Unit
    
    def onOpenTag(tagName: String, offset: Double): Unit
    
    def onText(text: String, offset: Double): Unit
  }
  object OnCloseTag {
    
    inline def apply(
      onCloseTag: (String, Double) => Unit,
      onComment: Double => Unit,
      onDoctype: Double => Unit,
      onOpenTag: (String, Double) => Unit,
      onText: (String, Double) => Unit
    ): OnCloseTag = {
      val __obj = js.Dynamic.literal(onCloseTag = js.Any.fromFunction2(onCloseTag), onComment = js.Any.fromFunction1(onComment), onDoctype = js.Any.fromFunction1(onDoctype), onOpenTag = js.Any.fromFunction2(onOpenTag), onText = js.Any.fromFunction2(onText))
      __obj.asInstanceOf[OnCloseTag]
    }
    
    extension [Self <: OnCloseTag](x: Self) {
      
      inline def setOnCloseTag(value: (String, Double) => Unit): Self = StObject.set(x, "onCloseTag", js.Any.fromFunction2(value))
      
      inline def setOnComment(value: Double => Unit): Self = StObject.set(x, "onComment", js.Any.fromFunction1(value))
      
      inline def setOnDoctype(value: Double => Unit): Self = StObject.set(x, "onDoctype", js.Any.fromFunction1(value))
      
      inline def setOnOpenTag(value: (String, Double) => Unit): Self = StObject.set(x, "onOpenTag", js.Any.fromFunction2(value))
      
      inline def setOnText(value: (String, Double) => Unit): Self = StObject.set(x, "onText", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined std.Required<autolinker.autolinker/dist/commonjs/autolinker.StripPrefixConfigObj> */
  trait RequiredStripPrefixConfig extends StObject {
    
    var scheme: Boolean
    
    var www: Boolean
  }
  object RequiredStripPrefixConfig {
    
    inline def apply(scheme: Boolean, www: Boolean): RequiredStripPrefixConfig = {
      val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any], www = www.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredStripPrefixConfig]
    }
    
    extension [Self <: RequiredStripPrefixConfig](x: Self) {
      
      inline def setScheme(value: Boolean): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setWww(value: Boolean): Self = StObject.set(x, "www", value.asInstanceOf[js.Any])
    }
  }
}
