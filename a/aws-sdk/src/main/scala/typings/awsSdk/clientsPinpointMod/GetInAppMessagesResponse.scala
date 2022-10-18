package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInAppMessagesResponse extends StObject {
  
  var InAppMessagesResponse: typings.awsSdk.clientsPinpointMod.InAppMessagesResponse
}
object GetInAppMessagesResponse {
  
  inline def apply(InAppMessagesResponse: InAppMessagesResponse): GetInAppMessagesResponse = {
    val __obj = js.Dynamic.literal(InAppMessagesResponse = InAppMessagesResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInAppMessagesResponse]
  }
  
  extension [Self <: GetInAppMessagesResponse](x: Self) {
    
    inline def setInAppMessagesResponse(value: InAppMessagesResponse): Self = StObject.set(x, "InAppMessagesResponse", value.asInstanceOf[js.Any])
  }
}
