package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyDetectorConfiguration extends StObject {
  
  /**
    * An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make sure that events that could cause unusual values for the metric, such as deployments, aren't used when CloudWatch creates the model.
    */
  var ExcludedTimeRanges: js.UndefOr[AnomalyDetectorExcludedTimeRanges] = js.undefined
  
  /**
    * The time zone to use for the metric. This is useful to enable the model to automatically account for daylight savings time changes if the metric is sensitive to such time changes. To specify a time zone, use the name of the time zone as specified in the standard tz database. For more information, see tz database.
    */
  var MetricTimezone: js.UndefOr[AnomalyDetectorMetricTimezone] = js.undefined
}
object AnomalyDetectorConfiguration {
  
  inline def apply(): AnomalyDetectorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyDetectorConfiguration]
  }
  
  extension [Self <: AnomalyDetectorConfiguration](x: Self) {
    
    inline def setExcludedTimeRanges(value: AnomalyDetectorExcludedTimeRanges): Self = StObject.set(x, "ExcludedTimeRanges", value.asInstanceOf[js.Any])
    
    inline def setExcludedTimeRangesUndefined: Self = StObject.set(x, "ExcludedTimeRanges", js.undefined)
    
    inline def setExcludedTimeRangesVarargs(value: Range*): Self = StObject.set(x, "ExcludedTimeRanges", js.Array(value*))
    
    inline def setMetricTimezone(value: AnomalyDetectorMetricTimezone): Self = StObject.set(x, "MetricTimezone", value.asInstanceOf[js.Any])
    
    inline def setMetricTimezoneUndefined: Self = StObject.set(x, "MetricTimezone", js.undefined)
  }
}
