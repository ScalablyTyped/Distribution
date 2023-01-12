package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetMetricRequest extends StObject {
  
  /**
    * The name of the fleet metric to describe.
    */
  var metricName: FleetMetricName
}
object DescribeFleetMetricRequest {
  
  inline def apply(metricName: FleetMetricName): DescribeFleetMetricRequest = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetMetricRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFleetMetricRequest] (val x: Self) extends AnyVal {
    
    inline def setMetricName(value: FleetMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
  }
}
