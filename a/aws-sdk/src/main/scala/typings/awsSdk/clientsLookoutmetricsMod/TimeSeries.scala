package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeries extends StObject {
  
  /**
    * The dimensions of the metric.
    */
  var DimensionList: DimensionNameValueList
  
  /**
    * The values for the metric.
    */
  var MetricValueList: typings.awsSdk.clientsLookoutmetricsMod.MetricValueList
  
  /**
    * The ID of the metric.
    */
  var TimeSeriesId: typings.awsSdk.clientsLookoutmetricsMod.TimeSeriesId
}
object TimeSeries {
  
  inline def apply(
    DimensionList: DimensionNameValueList,
    MetricValueList: MetricValueList,
    TimeSeriesId: TimeSeriesId
  ): TimeSeries = {
    val __obj = js.Dynamic.literal(DimensionList = DimensionList.asInstanceOf[js.Any], MetricValueList = MetricValueList.asInstanceOf[js.Any], TimeSeriesId = TimeSeriesId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSeries]
  }
  
  extension [Self <: TimeSeries](x: Self) {
    
    inline def setDimensionList(value: DimensionNameValueList): Self = StObject.set(x, "DimensionList", value.asInstanceOf[js.Any])
    
    inline def setDimensionListVarargs(value: DimensionNameValue*): Self = StObject.set(x, "DimensionList", js.Array(value*))
    
    inline def setMetricValueList(value: MetricValueList): Self = StObject.set(x, "MetricValueList", value.asInstanceOf[js.Any])
    
    inline def setMetricValueListVarargs(value: MetricValue*): Self = StObject.set(x, "MetricValueList", js.Array(value*))
    
    inline def setTimeSeriesId(value: TimeSeriesId): Self = StObject.set(x, "TimeSeriesId", value.asInstanceOf[js.Any])
  }
}
