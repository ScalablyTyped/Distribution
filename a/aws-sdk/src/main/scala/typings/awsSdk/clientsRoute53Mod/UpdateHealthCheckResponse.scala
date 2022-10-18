package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHealthCheckResponse extends StObject {
  
  /**
    * A complex type that contains the response to an UpdateHealthCheck request.
    */
  var HealthCheck: typings.awsSdk.clientsRoute53Mod.HealthCheck
}
object UpdateHealthCheckResponse {
  
  inline def apply(HealthCheck: HealthCheck): UpdateHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHealthCheckResponse]
  }
  
  extension [Self <: UpdateHealthCheckResponse](x: Self) {
    
    inline def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
  }
}
