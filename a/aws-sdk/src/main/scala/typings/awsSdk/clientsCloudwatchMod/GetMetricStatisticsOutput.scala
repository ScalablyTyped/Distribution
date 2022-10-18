package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricStatisticsOutput extends StObject {
  
  /**
    * The data points for the specified metric.
    */
  var Datapoints: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Datapoints] = js.undefined
  
  /**
    * A label for the specified metric.
    */
  var Label: js.UndefOr[MetricLabel] = js.undefined
}
object GetMetricStatisticsOutput {
  
  inline def apply(): GetMetricStatisticsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricStatisticsOutput]
  }
  
  extension [Self <: GetMetricStatisticsOutput](x: Self) {
    
    inline def setDatapoints(value: Datapoints): Self = StObject.set(x, "Datapoints", value.asInstanceOf[js.Any])
    
    inline def setDatapointsUndefined: Self = StObject.set(x, "Datapoints", js.undefined)
    
    inline def setDatapointsVarargs(value: Datapoint*): Self = StObject.set(x, "Datapoints", js.Array(value*))
    
    inline def setLabel(value: MetricLabel): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
  }
}
