package typings.authmosphere

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTypesMockOptionsMod {
  
  trait MockOptions extends StObject {
    
    var times: js.UndefOr[Double] = js.undefined
    
    var url: String
  }
  object MockOptions {
    
    inline def apply(url: String): MockOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockOptions] (val x: Self) extends AnyVal {
      
      inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
