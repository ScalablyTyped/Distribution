package typings.awesomeNotifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Async extends StObject {
    
    var async: js.UndefOr[Double] = js.undefined
    
    var `async-block`: js.UndefOr[Double] = js.undefined
  }
  object Async {
    
    inline def apply(): Async = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Async]
    }
    
    extension [Self <: Async](x: Self) {
      
      inline def setAsync(value: Double): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def `setAsync-block`(value: Double): Self = StObject.set(x, "async-block", value.asInstanceOf[js.Any])
      
      inline def `setAsync-blockUndefined`: Self = StObject.set(x, "async-block", js.undefined)
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    }
  }
  
  trait Asyncblock extends StObject {
    
    var async: js.UndefOr[String] = js.undefined
    
    var `async-block`: js.UndefOr[String] = js.undefined
  }
  object Asyncblock {
    
    inline def apply(): Asyncblock = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Asyncblock]
    }
    
    extension [Self <: Asyncblock](x: Self) {
      
      inline def setAsync(value: String): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def `setAsync-block`(value: String): Self = StObject.set(x, "async-block", value.asInstanceOf[js.Any])
      
      inline def `setAsync-blockUndefined`: Self = StObject.set(x, "async-block", js.undefined)
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    }
  }
}
