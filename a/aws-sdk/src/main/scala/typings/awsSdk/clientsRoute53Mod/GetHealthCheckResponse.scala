package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHealthCheckResponse extends StObject {
  
  /**
    * A complex type that contains information about one health check that is associated with the current Amazon Web Services account.
    */
  var HealthCheck: typings.awsSdk.clientsRoute53Mod.HealthCheck
}
object GetHealthCheckResponse {
  
  inline def apply(HealthCheck: HealthCheck): GetHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHealthCheckResponse] (val x: Self) extends AnyVal {
    
    inline def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
  }
}
