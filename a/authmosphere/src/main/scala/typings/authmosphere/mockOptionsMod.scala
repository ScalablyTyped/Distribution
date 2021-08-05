package typings.authmosphere

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockOptionsMod {
  
  trait MockOptions extends StObject {
    
    var times: js.UndefOr[Double] = js.undefined
    
    var url: String
  }
  object MockOptions {
    
    inline def apply(url: String): MockOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockOptions]
    }
    
    extension [Self <: MockOptions](x: Self) {
      
      inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
