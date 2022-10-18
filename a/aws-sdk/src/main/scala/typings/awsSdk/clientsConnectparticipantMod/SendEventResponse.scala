package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendEventResponse extends StObject {
  
  /**
    * The time when the event was sent. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.undefined
  
  /**
    * The ID of the response.
    */
  var Id: js.UndefOr[ChatItemId] = js.undefined
}
object SendEventResponse {
  
  inline def apply(): SendEventResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendEventResponse]
  }
  
  extension [Self <: SendEventResponse](x: Self) {
    
    inline def setAbsoluteTime(value: Instant): Self = StObject.set(x, "AbsoluteTime", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteTimeUndefined: Self = StObject.set(x, "AbsoluteTime", js.undefined)
    
    inline def setId(value: ChatItemId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
