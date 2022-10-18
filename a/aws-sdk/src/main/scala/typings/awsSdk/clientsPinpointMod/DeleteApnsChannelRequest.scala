package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApnsChannelRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
}
object DeleteApnsChannelRequest {
  
  inline def apply(ApplicationId: string): DeleteApnsChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApnsChannelRequest]
  }
  
  extension [Self <: DeleteApnsChannelRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
