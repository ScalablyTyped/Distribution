package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceInsightsMetricQuery extends StObject {
  
  /**
    * One or more filters to apply to a Performance Insights GetResourceMetrics API query. Restrictions:   Any number of filters by the same dimension, as specified in the GroupBy parameter.   A single filter for any other dimension in this dimension group.  
    */
  var Filter: js.UndefOr[PerformanceInsightsMetricFilterMap] = js.undefined
  
  /**
    * The specification for how to aggregate the data points from a Performance Insights GetResourceMetrics API query. The Performance Insights query returns all of the dimensions within that group, unless you provide the names of specific dimensions within that group. You can also request that Performance Insights return a limited number of values for a dimension.
    */
  var GroupBy: js.UndefOr[PerformanceInsightsMetricDimensionGroup] = js.undefined
  
  /**
    * The name of the meteric used used when querying an Performance Insights GetResourceMetrics API for anomaly metrics. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.   If the number of active sessions is less than an internal Performance Insights threshold, db.load.avg and db.sampledload.avg are the same value. If the number of active sessions is greater than the internal threshold, Performance Insights samples the active sessions, with db.load.avg showing the scaled values, db.sampledload.avg showing the raw values, and db.sampledload.avg less than db.load.avg. For most use cases, you can query db.load.avg only. 
    */
  var Metric: js.UndefOr[PerformanceInsightsMetricName] = js.undefined
}
object PerformanceInsightsMetricQuery {
  
  inline def apply(): PerformanceInsightsMetricQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceInsightsMetricQuery]
  }
  
  extension [Self <: PerformanceInsightsMetricQuery](x: Self) {
    
    inline def setFilter(value: PerformanceInsightsMetricFilterMap): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setGroupBy(value: PerformanceInsightsMetricDimensionGroup): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "GroupBy", js.undefined)
    
    inline def setMetric(value: PerformanceInsightsMetricName): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
  }
}
