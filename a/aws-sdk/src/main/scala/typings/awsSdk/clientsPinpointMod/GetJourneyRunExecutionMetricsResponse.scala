package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJourneyRunExecutionMetricsResponse extends StObject {
  
  var JourneyRunExecutionMetricsResponse: typings.awsSdk.clientsPinpointMod.JourneyRunExecutionMetricsResponse
}
object GetJourneyRunExecutionMetricsResponse {
  
  inline def apply(JourneyRunExecutionMetricsResponse: JourneyRunExecutionMetricsResponse): GetJourneyRunExecutionMetricsResponse = {
    val __obj = js.Dynamic.literal(JourneyRunExecutionMetricsResponse = JourneyRunExecutionMetricsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyRunExecutionMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJourneyRunExecutionMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setJourneyRunExecutionMetricsResponse(value: JourneyRunExecutionMetricsResponse): Self = StObject.set(x, "JourneyRunExecutionMetricsResponse", value.asInstanceOf[js.Any])
  }
}
