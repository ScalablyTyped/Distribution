package typings.authmosphere

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockOptionsMod {
  
  @js.native
  trait MockOptions extends StObject {
    
    var times: js.UndefOr[Double] = js.native
    
    var url: String = js.native
  }
  object MockOptions {
    
    @scala.inline
    def apply(url: String): MockOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockOptions]
    }
    
    @scala.inline
    implicit class MockOptionsMutableBuilder[Self <: MockOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
