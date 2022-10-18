package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHealthCheckRequest extends StObject {
  
  /**
    * The identifier that Amazon Route 53 assigned to the health check when you created it. When you add or update a resource record set, you use this value to specify which health check to use. The value can be up to 64 characters long.
    */
  var HealthCheckId: typings.awsSdk.clientsRoute53Mod.HealthCheckId
}
object GetHealthCheckRequest {
  
  inline def apply(HealthCheckId: HealthCheckId): GetHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckRequest]
  }
  
  extension [Self <: GetHealthCheckRequest](x: Self) {
    
    inline def setHealthCheckId(value: HealthCheckId): Self = StObject.set(x, "HealthCheckId", value.asInstanceOf[js.Any])
  }
}
