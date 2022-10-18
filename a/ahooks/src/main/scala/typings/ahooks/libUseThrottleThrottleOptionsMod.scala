package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseThrottleThrottleOptionsMod {
  
  trait ThrottleOptions extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
    
    @JSName("wait")
    var wait_FThrottleOptions: js.UndefOr[Double] = js.undefined
  }
  object ThrottleOptions {
    
    inline def apply(): ThrottleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottleOptions]
    }
    
    extension [Self <: ThrottleOptions](x: Self) {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
