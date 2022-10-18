package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddNotificationChannelResponse extends StObject {
  
  /**
    *  The ID of the added notification channel. 
    */
  var Id: NotificationChannelId
}
object AddNotificationChannelResponse {
  
  inline def apply(Id: NotificationChannelId): AddNotificationChannelResponse = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddNotificationChannelResponse]
  }
  
  extension [Self <: AddNotificationChannelResponse](x: Self) {
    
    inline def setId(value: NotificationChannelId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
