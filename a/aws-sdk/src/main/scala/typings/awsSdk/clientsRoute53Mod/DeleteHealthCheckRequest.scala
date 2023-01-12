package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHealthCheckRequest extends StObject {
  
  /**
    * The ID of the health check that you want to delete.
    */
  var HealthCheckId: typings.awsSdk.clientsRoute53Mod.HealthCheckId
}
object DeleteHealthCheckRequest {
  
  inline def apply(HealthCheckId: HealthCheckId): DeleteHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHealthCheckRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteHealthCheckRequest] (val x: Self) extends AnyVal {
    
    inline def setHealthCheckId(value: HealthCheckId): Self = StObject.set(x, "HealthCheckId", value.asInstanceOf[js.Any])
  }
}
