package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJourneyResponse extends StObject {
  
  var JourneyResponse: typings.awsSdk.clientsPinpointMod.JourneyResponse
}
object CreateJourneyResponse {
  
  inline def apply(JourneyResponse: JourneyResponse): CreateJourneyResponse = {
    val __obj = js.Dynamic.literal(JourneyResponse = JourneyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJourneyResponse]
  }
  
  extension [Self <: CreateJourneyResponse](x: Self) {
    
    inline def setJourneyResponse(value: JourneyResponse): Self = StObject.set(x, "JourneyResponse", value.asInstanceOf[js.Any])
  }
}
