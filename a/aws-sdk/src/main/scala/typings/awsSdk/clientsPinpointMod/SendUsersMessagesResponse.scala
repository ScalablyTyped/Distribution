package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendUsersMessagesResponse extends StObject {
  
  var SendUsersMessageResponse: typings.awsSdk.clientsPinpointMod.SendUsersMessageResponse
}
object SendUsersMessagesResponse {
  
  inline def apply(SendUsersMessageResponse: SendUsersMessageResponse): SendUsersMessagesResponse = {
    val __obj = js.Dynamic.literal(SendUsersMessageResponse = SendUsersMessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessagesResponse]
  }
  
  extension [Self <: SendUsersMessagesResponse](x: Self) {
    
    inline def setSendUsersMessageResponse(value: SendUsersMessageResponse): Self = StObject.set(x, "SendUsersMessageResponse", value.asInstanceOf[js.Any])
  }
}
