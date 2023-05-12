package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQuery extends StObject {
  
  /**
    * The Region or Availability Zone that's the target for the data query. For example, eu-north-1.
    */
  var Destination: js.UndefOr[String] = js.undefined
  
  /**
    * A user-defined ID associated with a data query that's returned in the dataResponse identifying the query. For example, if you set the Id to MyQuery01in the query, the dataResponse identifies the query as MyQuery01.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * The metric, aggregation-latency, indicating that network latency is aggregated for the query. This is the only supported metric.
    */
  var Metric: js.UndefOr[MetricType] = js.undefined
  
  /**
    * The aggregation period used for the data query.
    */
  var Period: js.UndefOr[PeriodType] = js.undefined
  
  /**
    * The Region or Availability Zone that's the source for the data query. For example, us-east-1.
    */
  var Source: js.UndefOr[String] = js.undefined
  
  /**
    * The metric data aggregation period, p50, between the specified startDate and endDate. For example, a metric of five_minutes is the median of all the data points gathered within those five minutes. p50 is the only supported metric.
    */
  var Statistic: js.UndefOr[StatisticType] = js.undefined
}
object DataQuery {
  
  inline def apply(): DataQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQuery] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: String): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMetric(value: MetricType): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
    
    inline def setPeriod(value: PeriodType): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStatistic(value: StatisticType): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
  }
}
