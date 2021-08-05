package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUsagePlanRequest extends StObject {
  
  /**
    * [Required] The Id of the to-be-deleted usage plan.
    */
  var usagePlanId: String
}
object DeleteUsagePlanRequest {
  
  inline def apply(usagePlanId: String): DeleteUsagePlanRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUsagePlanRequest]
  }
  
  extension [Self <: DeleteUsagePlanRequest](x: Self) {
    
    inline def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
  }
}
