package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricStreamStatisticsConfiguration extends StObject {
  
  /**
    * The list of additional statistics that are to be streamed for the metrics listed in the IncludeMetrics array in this structure. This list can include as many as 20 statistics. If the OutputFormat for the stream is opentelemetry0.7, the only valid values are p??  percentile statistics such as p90, p99 and so on. If the OutputFormat for the stream is json, the valid values include the abbreviations for all of the statistics listed in  CloudWatch statistics definitions. For example, this includes tm98,  wm90, PR(:300), and so on.
    */
  var AdditionalStatistics: MetricStreamStatisticsAdditionalStatistics
  
  /**
    * An array of metric name and namespace pairs that stream the additional statistics listed in the value of the AdditionalStatistics parameter. There can be as many as 100 pairs in the array. All metrics that match the combination of metric name and namespace will be streamed with the additional statistics, no matter their dimensions.
    */
  var IncludeMetrics: MetricStreamStatisticsIncludeMetrics
}
object MetricStreamStatisticsConfiguration {
  
  inline def apply(
    AdditionalStatistics: MetricStreamStatisticsAdditionalStatistics,
    IncludeMetrics: MetricStreamStatisticsIncludeMetrics
  ): MetricStreamStatisticsConfiguration = {
    val __obj = js.Dynamic.literal(AdditionalStatistics = AdditionalStatistics.asInstanceOf[js.Any], IncludeMetrics = IncludeMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricStreamStatisticsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricStreamStatisticsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAdditionalStatistics(value: MetricStreamStatisticsAdditionalStatistics): Self = StObject.set(x, "AdditionalStatistics", value.asInstanceOf[js.Any])
    
    inline def setAdditionalStatisticsVarargs(value: MetricStreamStatistic*): Self = StObject.set(x, "AdditionalStatistics", js.Array(value*))
    
    inline def setIncludeMetrics(value: MetricStreamStatisticsIncludeMetrics): Self = StObject.set(x, "IncludeMetrics", value.asInstanceOf[js.Any])
    
    inline def setIncludeMetricsVarargs(value: MetricStreamStatisticsMetric*): Self = StObject.set(x, "IncludeMetrics", js.Array(value*))
  }
}
