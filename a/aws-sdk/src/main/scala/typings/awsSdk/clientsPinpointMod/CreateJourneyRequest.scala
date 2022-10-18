package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJourneyRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var WriteJourneyRequest: typings.awsSdk.clientsPinpointMod.WriteJourneyRequest
}
object CreateJourneyRequest {
  
  inline def apply(ApplicationId: string, WriteJourneyRequest: WriteJourneyRequest): CreateJourneyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteJourneyRequest = WriteJourneyRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJourneyRequest]
  }
  
  extension [Self <: CreateJourneyRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setWriteJourneyRequest(value: WriteJourneyRequest): Self = StObject.set(x, "WriteJourneyRequest", value.asInstanceOf[js.Any])
  }
}
