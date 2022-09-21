package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsagePlanRequest extends StObject {
  
  /**
    * The identifier of the UsagePlan resource to be retrieved.
    */
  var usagePlanId: String
}
object GetUsagePlanRequest {
  
  inline def apply(usagePlanId: String): GetUsagePlanRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsagePlanRequest]
  }
  
  extension [Self <: GetUsagePlanRequest](x: Self) {
    
    inline def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
  }
}
