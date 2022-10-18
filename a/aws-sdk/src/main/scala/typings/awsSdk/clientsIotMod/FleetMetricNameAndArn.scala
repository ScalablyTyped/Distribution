package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetMetricNameAndArn extends StObject {
  
  /**
    * The fleet metric ARN.
    */
  var metricArn: js.UndefOr[FleetMetricArn] = js.undefined
  
  /**
    * The fleet metric name.
    */
  var metricName: js.UndefOr[FleetMetricName] = js.undefined
}
object FleetMetricNameAndArn {
  
  inline def apply(): FleetMetricNameAndArn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetMetricNameAndArn]
  }
  
  extension [Self <: FleetMetricNameAndArn](x: Self) {
    
    inline def setMetricArn(value: FleetMetricArn): Self = StObject.set(x, "metricArn", value.asInstanceOf[js.Any])
    
    inline def setMetricArnUndefined: Self = StObject.set(x, "metricArn", js.undefined)
    
    inline def setMetricName(value: FleetMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
