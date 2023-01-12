package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJourneyDateRangeKpiResponse extends StObject {
  
  var JourneyDateRangeKpiResponse: typings.awsSdk.clientsPinpointMod.JourneyDateRangeKpiResponse
}
object GetJourneyDateRangeKpiResponse {
  
  inline def apply(JourneyDateRangeKpiResponse: JourneyDateRangeKpiResponse): GetJourneyDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(JourneyDateRangeKpiResponse = JourneyDateRangeKpiResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyDateRangeKpiResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJourneyDateRangeKpiResponse] (val x: Self) extends AnyVal {
    
    inline def setJourneyDateRangeKpiResponse(value: JourneyDateRangeKpiResponse): Self = StObject.set(x, "JourneyDateRangeKpiResponse", value.asInstanceOf[js.Any])
  }
}
