package typings.ahooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnNow extends StObject {
  
  var returnNow: js.UndefOr[Boolean] = js.undefined
  
  var stopNow: js.UndefOr[Boolean] = js.undefined
}
object ReturnNow {
  
  inline def apply(): ReturnNow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnNow]
  }
  
  extension [Self <: ReturnNow](x: Self) {
    
    inline def setReturnNow(value: Boolean): Self = StObject.set(x, "returnNow", value.asInstanceOf[js.Any])
    
    inline def setReturnNowUndefined: Self = StObject.set(x, "returnNow", js.undefined)
    
    inline def setStopNow(value: Boolean): Self = StObject.set(x, "stopNow", value.asInstanceOf[js.Any])
    
    inline def setStopNowUndefined: Self = StObject.set(x, "stopNow", js.undefined)
  }
}
