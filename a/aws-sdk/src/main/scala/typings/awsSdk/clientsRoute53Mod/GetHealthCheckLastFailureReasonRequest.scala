package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHealthCheckLastFailureReasonRequest extends StObject {
  
  /**
    * The ID for the health check for which you want the last failure reason. When you created the health check, CreateHealthCheck returned the ID in the response, in the HealthCheckId element.  If you want to get the last failure reason for a calculated health check, you must use the Amazon Route 53 console or the CloudWatch console. You can't use GetHealthCheckLastFailureReason for a calculated health check. 
    */
  var HealthCheckId: typings.awsSdk.clientsRoute53Mod.HealthCheckId
}
object GetHealthCheckLastFailureReasonRequest {
  
  inline def apply(HealthCheckId: HealthCheckId): GetHealthCheckLastFailureReasonRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckLastFailureReasonRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHealthCheckLastFailureReasonRequest] (val x: Self) extends AnyVal {
    
    inline def setHealthCheckId(value: HealthCheckId): Self = StObject.set(x, "HealthCheckId", value.asInstanceOf[js.Any])
  }
}
