package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success extends StObject {
  
  var success: js.UndefOr[Percent] = js.undefined
  
  var successPercent: js.UndefOr[Double] = js.undefined
}
object Success {
  
  inline def apply(): Success = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Success]
  }
  
  extension [Self <: Success](x: Self) {
    
    inline def setSuccess(value: Percent): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessPercent(value: Double): Self = StObject.set(x, "successPercent", value.asInstanceOf[js.Any])
    
    inline def setSuccessPercentUndefined: Self = StObject.set(x, "successPercent", js.undefined)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
