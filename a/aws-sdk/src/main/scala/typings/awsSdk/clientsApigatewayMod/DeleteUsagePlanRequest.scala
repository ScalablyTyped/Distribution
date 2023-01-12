package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUsagePlanRequest extends StObject {
  
  /**
    * The Id of the to-be-deleted usage plan.
    */
  var usagePlanId: String
}
object DeleteUsagePlanRequest {
  
  inline def apply(usagePlanId: String): DeleteUsagePlanRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUsagePlanRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteUsagePlanRequest] (val x: Self) extends AnyVal {
    
    inline def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
  }
}
