package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsageLimitResponse extends StObject {
  
  /**
    * The returned usage limit object.
    */
  var usageLimit: js.UndefOr[UsageLimit] = js.undefined
}
object GetUsageLimitResponse {
  
  inline def apply(): GetUsageLimitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageLimitResponse]
  }
  
  extension [Self <: GetUsageLimitResponse](x: Self) {
    
    inline def setUsageLimit(value: UsageLimit): Self = StObject.set(x, "usageLimit", value.asInstanceOf[js.Any])
    
    inline def setUsageLimitUndefined: Self = StObject.set(x, "usageLimit", js.undefined)
  }
}
