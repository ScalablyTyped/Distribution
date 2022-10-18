package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJourneyResponse extends StObject {
  
  var JourneyResponse: typings.awsSdk.clientsPinpointMod.JourneyResponse
}
object DeleteJourneyResponse {
  
  inline def apply(JourneyResponse: JourneyResponse): DeleteJourneyResponse = {
    val __obj = js.Dynamic.literal(JourneyResponse = JourneyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJourneyResponse]
  }
  
  extension [Self <: DeleteJourneyResponse](x: Self) {
    
    inline def setJourneyResponse(value: JourneyResponse): Self = StObject.set(x, "JourneyResponse", value.asInstanceOf[js.Any])
  }
}
