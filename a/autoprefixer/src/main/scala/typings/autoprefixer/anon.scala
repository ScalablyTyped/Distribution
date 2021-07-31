package typings.autoprefixer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Browsers extends StObject {
    
    var browsers: js.Any
    
    var prefixes: js.Any
  }
  object Browsers {
    
    @scala.inline
    def apply(browsers: js.Any, prefixes: js.Any): Browsers = {
      val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browsers]
    }
    
    @scala.inline
    implicit class BrowsersMutableBuilder[Self <: Browsers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowsers(value: js.Any): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixes(value: js.Any): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    }
  }
}
