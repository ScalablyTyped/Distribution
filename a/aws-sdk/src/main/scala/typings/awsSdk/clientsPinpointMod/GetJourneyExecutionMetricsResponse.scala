package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJourneyExecutionMetricsResponse extends StObject {
  
  var JourneyExecutionMetricsResponse: typings.awsSdk.clientsPinpointMod.JourneyExecutionMetricsResponse
}
object GetJourneyExecutionMetricsResponse {
  
  inline def apply(JourneyExecutionMetricsResponse: JourneyExecutionMetricsResponse): GetJourneyExecutionMetricsResponse = {
    val __obj = js.Dynamic.literal(JourneyExecutionMetricsResponse = JourneyExecutionMetricsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyExecutionMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJourneyExecutionMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setJourneyExecutionMetricsResponse(value: JourneyExecutionMetricsResponse): Self = StObject.set(x, "JourneyExecutionMetricsResponse", value.asInstanceOf[js.Any])
  }
}
