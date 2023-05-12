package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJourneyRunsResponse extends StObject {
  
  var JourneyRunsResponse: typings.awsSdk.clientsPinpointMod.JourneyRunsResponse
}
object GetJourneyRunsResponse {
  
  inline def apply(JourneyRunsResponse: JourneyRunsResponse): GetJourneyRunsResponse = {
    val __obj = js.Dynamic.literal(JourneyRunsResponse = JourneyRunsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyRunsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJourneyRunsResponse] (val x: Self) extends AnyVal {
    
    inline def setJourneyRunsResponse(value: JourneyRunsResponse): Self = StObject.set(x, "JourneyRunsResponse", value.asInstanceOf[js.Any])
  }
}
