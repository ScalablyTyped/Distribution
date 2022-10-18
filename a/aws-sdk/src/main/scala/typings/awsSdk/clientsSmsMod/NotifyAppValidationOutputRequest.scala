package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyAppValidationOutputRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: AppIdWithValidation
  
  /**
    * The notification information.
    */
  var notificationContext: js.UndefOr[NotificationContext] = js.undefined
}
object NotifyAppValidationOutputRequest {
  
  inline def apply(appId: AppIdWithValidation): NotifyAppValidationOutputRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyAppValidationOutputRequest]
  }
  
  extension [Self <: NotifyAppValidationOutputRequest](x: Self) {
    
    inline def setAppId(value: AppIdWithValidation): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setNotificationContext(value: NotificationContext): Self = StObject.set(x, "notificationContext", value.asInstanceOf[js.Any])
    
    inline def setNotificationContextUndefined: Self = StObject.set(x, "notificationContext", js.undefined)
  }
}
