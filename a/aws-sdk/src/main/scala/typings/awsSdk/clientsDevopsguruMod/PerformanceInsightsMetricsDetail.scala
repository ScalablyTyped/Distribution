package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceInsightsMetricsDetail extends StObject {
  
  /**
    * The name used for a specific Performance Insights metric.
    */
  var MetricDisplayName: js.UndefOr[PerformanceInsightsMetricDisplayName] = js.undefined
  
  /**
    * A single query to be processed for the metric. For more information, see  PerformanceInsightsMetricQuery .
    */
  var MetricQuery: js.UndefOr[PerformanceInsightsMetricQuery] = js.undefined
  
  /**
    *  For more information, see  PerformanceInsightsReferenceData . 
    */
  var ReferenceData: js.UndefOr[PerformanceInsightsReferenceDataList] = js.undefined
  
  /**
    * The metric statistics during the anomalous period detected by DevOps Guru;
    */
  var StatsAtAnomaly: js.UndefOr[PerformanceInsightsStats] = js.undefined
  
  /**
    * Typical metric statistics that are not considered anomalous. When DevOps Guru analyzes metrics, it compares them to StatsAtBaseline to help determine if they are anomalous.
    */
  var StatsAtBaseline: js.UndefOr[PerformanceInsightsStats] = js.undefined
  
  /**
    * The unit of measure for a metric. For example, a session or a process.
    */
  var Unit: js.UndefOr[PerformanceInsightsMetricUnit] = js.undefined
}
object PerformanceInsightsMetricsDetail {
  
  inline def apply(): PerformanceInsightsMetricsDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceInsightsMetricsDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceInsightsMetricsDetail] (val x: Self) extends AnyVal {
    
    inline def setMetricDisplayName(value: PerformanceInsightsMetricDisplayName): Self = StObject.set(x, "MetricDisplayName", value.asInstanceOf[js.Any])
    
    inline def setMetricDisplayNameUndefined: Self = StObject.set(x, "MetricDisplayName", js.undefined)
    
    inline def setMetricQuery(value: PerformanceInsightsMetricQuery): Self = StObject.set(x, "MetricQuery", value.asInstanceOf[js.Any])
    
    inline def setMetricQueryUndefined: Self = StObject.set(x, "MetricQuery", js.undefined)
    
    inline def setReferenceData(value: PerformanceInsightsReferenceDataList): Self = StObject.set(x, "ReferenceData", value.asInstanceOf[js.Any])
    
    inline def setReferenceDataUndefined: Self = StObject.set(x, "ReferenceData", js.undefined)
    
    inline def setReferenceDataVarargs(value: PerformanceInsightsReferenceData*): Self = StObject.set(x, "ReferenceData", js.Array(value*))
    
    inline def setStatsAtAnomaly(value: PerformanceInsightsStats): Self = StObject.set(x, "StatsAtAnomaly", value.asInstanceOf[js.Any])
    
    inline def setStatsAtAnomalyUndefined: Self = StObject.set(x, "StatsAtAnomaly", js.undefined)
    
    inline def setStatsAtAnomalyVarargs(value: PerformanceInsightsStat*): Self = StObject.set(x, "StatsAtAnomaly", js.Array(value*))
    
    inline def setStatsAtBaseline(value: PerformanceInsightsStats): Self = StObject.set(x, "StatsAtBaseline", value.asInstanceOf[js.Any])
    
    inline def setStatsAtBaselineUndefined: Self = StObject.set(x, "StatsAtBaseline", js.undefined)
    
    inline def setStatsAtBaselineVarargs(value: PerformanceInsightsStat*): Self = StObject.set(x, "StatsAtBaseline", js.Array(value*))
    
    inline def setUnit(value: PerformanceInsightsMetricUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
