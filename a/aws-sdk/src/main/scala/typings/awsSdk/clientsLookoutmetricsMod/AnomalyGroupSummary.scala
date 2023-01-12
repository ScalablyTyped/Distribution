package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyGroupSummary extends StObject {
  
  /**
    * The ID of the anomaly group.
    */
  var AnomalyGroupId: js.UndefOr[UUID] = js.undefined
  
  /**
    * The severity score of the group.
    */
  var AnomalyGroupScore: js.UndefOr[Score] = js.undefined
  
  /**
    * The end time for the group.
    */
  var EndTime: js.UndefOr[TimestampString] = js.undefined
  
  /**
    * The name of the primary affected measure for the group.
    */
  var PrimaryMetricName: js.UndefOr[MetricName] = js.undefined
  
  /**
    * The start time for the group.
    */
  var StartTime: js.UndefOr[TimestampString] = js.undefined
}
object AnomalyGroupSummary {
  
  inline def apply(): AnomalyGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyGroupSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnomalyGroupSummary] (val x: Self) extends AnyVal {
    
    inline def setAnomalyGroupId(value: UUID): Self = StObject.set(x, "AnomalyGroupId", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupIdUndefined: Self = StObject.set(x, "AnomalyGroupId", js.undefined)
    
    inline def setAnomalyGroupScore(value: Score): Self = StObject.set(x, "AnomalyGroupScore", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupScoreUndefined: Self = StObject.set(x, "AnomalyGroupScore", js.undefined)
    
    inline def setEndTime(value: TimestampString): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setPrimaryMetricName(value: MetricName): Self = StObject.set(x, "PrimaryMetricName", value.asInstanceOf[js.Any])
    
    inline def setPrimaryMetricNameUndefined: Self = StObject.set(x, "PrimaryMetricName", js.undefined)
    
    inline def setStartTime(value: TimestampString): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
