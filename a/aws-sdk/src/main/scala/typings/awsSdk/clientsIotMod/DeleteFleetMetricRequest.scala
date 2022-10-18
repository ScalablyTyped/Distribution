package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetMetricRequest extends StObject {
  
  /**
    * The expected version of the fleet metric to delete.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  
  /**
    * The name of the fleet metric to delete.
    */
  var metricName: FleetMetricName
}
object DeleteFleetMetricRequest {
  
  inline def apply(metricName: FleetMetricName): DeleteFleetMetricRequest = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetMetricRequest]
  }
  
  extension [Self <: DeleteFleetMetricRequest](x: Self) {
    
    inline def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    inline def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    inline def setMetricName(value: FleetMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
  }
}
