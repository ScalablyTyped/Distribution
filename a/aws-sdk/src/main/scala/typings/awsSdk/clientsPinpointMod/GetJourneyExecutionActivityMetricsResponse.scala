package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJourneyExecutionActivityMetricsResponse extends StObject {
  
  var JourneyExecutionActivityMetricsResponse: typings.awsSdk.clientsPinpointMod.JourneyExecutionActivityMetricsResponse
}
object GetJourneyExecutionActivityMetricsResponse {
  
  inline def apply(JourneyExecutionActivityMetricsResponse: JourneyExecutionActivityMetricsResponse): GetJourneyExecutionActivityMetricsResponse = {
    val __obj = js.Dynamic.literal(JourneyExecutionActivityMetricsResponse = JourneyExecutionActivityMetricsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyExecutionActivityMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJourneyExecutionActivityMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setJourneyExecutionActivityMetricsResponse(value: JourneyExecutionActivityMetricsResponse): Self = StObject.set(x, "JourneyExecutionActivityMetricsResponse", value.asInstanceOf[js.Any])
  }
}
