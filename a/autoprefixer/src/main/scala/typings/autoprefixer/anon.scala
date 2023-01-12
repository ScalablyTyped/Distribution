package typings.autoprefixer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Browsers extends StObject {
    
    var browsers: StringDictionary[js.UndefOr[js.Object]]
    
    var prefixes: StringDictionary[js.UndefOr[js.Object]]
  }
  object Browsers {
    
    inline def apply(
      browsers: StringDictionary[js.UndefOr[js.Object]],
      prefixes: StringDictionary[js.UndefOr[js.Object]]
    ): Browsers = {
      val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browsers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Browsers] (val x: Self) extends AnyVal {
      
      inline def setBrowsers(value: StringDictionary[js.UndefOr[js.Object]]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setPrefixes(value: StringDictionary[js.UndefOr[js.Object]]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
  }
  object From {
    
    inline def apply(): From = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    }
  }
}
