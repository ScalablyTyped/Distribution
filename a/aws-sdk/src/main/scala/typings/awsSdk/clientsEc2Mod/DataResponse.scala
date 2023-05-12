package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataResponse extends StObject {
  
  /**
    * The Region or Availability Zone that's the destination for the data query. For example, eu-west-1.
    */
  var Destination: js.UndefOr[String] = js.undefined
  
  /**
    * The ID passed in the DataQuery.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * The metric used for the network performance request. Only aggregate-latency is supported, which shows network latency during a specified period. 
    */
  var Metric: js.UndefOr[MetricType] = js.undefined
  
  /**
    * A list of MetricPoint objects.
    */
  var MetricPoints: js.UndefOr[typings.awsSdk.clientsEc2Mod.MetricPoints] = js.undefined
  
  /**
    * The period used for the network performance request.
    */
  var Period: js.UndefOr[PeriodType] = js.undefined
  
  /**
    * The Region or Availability Zone that's the source for the data query. For example, us-east-1.
    */
  var Source: js.UndefOr[String] = js.undefined
  
  /**
    * The statistic used for the network performance request.
    */
  var Statistic: js.UndefOr[StatisticType] = js.undefined
}
object DataResponse {
  
  inline def apply(): DataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataResponse] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: String): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMetric(value: MetricType): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricPoints(value: MetricPoints): Self = StObject.set(x, "MetricPoints", value.asInstanceOf[js.Any])
    
    inline def setMetricPointsUndefined: Self = StObject.set(x, "MetricPoints", js.undefined)
    
    inline def setMetricPointsVarargs(value: MetricPoint*): Self = StObject.set(x, "MetricPoints", js.Array(value*))
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
    
    inline def setPeriod(value: PeriodType): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStatistic(value: StatisticType): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
  }
}
