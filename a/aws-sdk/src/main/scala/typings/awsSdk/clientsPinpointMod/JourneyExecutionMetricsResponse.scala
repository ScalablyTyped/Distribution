package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneyExecutionMetricsResponse extends StObject {
  
  /**
    * The unique identifier for the application that the metric applies to.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the journey that the metric applies to.
    */
  var JourneyId: string
  
  /**
    * The date and time, in ISO 8601 format, when Amazon Pinpoint last evaluated the journey and updated the data for the metric.
    */
  var LastEvaluatedTime: string
  
  /**
    * A JSON object that contains the results of the query. For information about the structure and contents of the results, see the Amazon Pinpoint Developer Guide.
    */
  var Metrics: MapOfString
}
object JourneyExecutionMetricsResponse {
  
  inline def apply(ApplicationId: string, JourneyId: string, LastEvaluatedTime: string, Metrics: MapOfString): JourneyExecutionMetricsResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any], LastEvaluatedTime = LastEvaluatedTime.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyExecutionMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JourneyExecutionMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setJourneyId(value: string): Self = StObject.set(x, "JourneyId", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedTime(value: string): Self = StObject.set(x, "LastEvaluatedTime", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: MapOfString): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
  }
}
