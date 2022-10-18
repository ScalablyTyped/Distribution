package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendUsersMessagesRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var SendUsersMessageRequest: typings.awsSdk.clientsPinpointMod.SendUsersMessageRequest
}
object SendUsersMessagesRequest {
  
  inline def apply(ApplicationId: string, SendUsersMessageRequest: SendUsersMessageRequest): SendUsersMessagesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SendUsersMessageRequest = SendUsersMessageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessagesRequest]
  }
  
  extension [Self <: SendUsersMessagesRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSendUsersMessageRequest(value: SendUsersMessageRequest): Self = StObject.set(x, "SendUsersMessageRequest", value.asInstanceOf[js.Any])
  }
}
