package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJourneyRunExecutionActivityMetricsResponse extends StObject {
  
  var JourneyRunExecutionActivityMetricsResponse: typings.awsSdk.clientsPinpointMod.JourneyRunExecutionActivityMetricsResponse
}
object GetJourneyRunExecutionActivityMetricsResponse {
  
  inline def apply(JourneyRunExecutionActivityMetricsResponse: JourneyRunExecutionActivityMetricsResponse): GetJourneyRunExecutionActivityMetricsResponse = {
    val __obj = js.Dynamic.literal(JourneyRunExecutionActivityMetricsResponse = JourneyRunExecutionActivityMetricsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyRunExecutionActivityMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJourneyRunExecutionActivityMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setJourneyRunExecutionActivityMetricsResponse(value: JourneyRunExecutionActivityMetricsResponse): Self = StObject.set(x, "JourneyRunExecutionActivityMetricsResponse", value.asInstanceOf[js.Any])
  }
}
