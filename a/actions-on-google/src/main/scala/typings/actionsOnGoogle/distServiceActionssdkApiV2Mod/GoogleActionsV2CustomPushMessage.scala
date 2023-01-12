package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2CustomPushMessage extends StObject {
  
  /**
    * An order update updating orders placed through transaction APIs.
    */
  var orderUpdate: js.UndefOr[GoogleActionsV2OrdersOrderUpdate] = js.undefined
  
  /**
    * The specified target for the push request.
    */
  var target: js.UndefOr[GoogleActionsV2CustomPushMessageTarget] = js.undefined
  
  /**
    * If specified, displays a notification to the user with specified title
    * and text.
    */
  var userNotification: js.UndefOr[GoogleActionsV2UserNotification] = js.undefined
}
object GoogleActionsV2CustomPushMessage {
  
  inline def apply(): GoogleActionsV2CustomPushMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2CustomPushMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2CustomPushMessage] (val x: Self) extends AnyVal {
    
    inline def setOrderUpdate(value: GoogleActionsV2OrdersOrderUpdate): Self = StObject.set(x, "orderUpdate", value.asInstanceOf[js.Any])
    
    inline def setOrderUpdateUndefined: Self = StObject.set(x, "orderUpdate", js.undefined)
    
    inline def setTarget(value: GoogleActionsV2CustomPushMessageTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUserNotification(value: GoogleActionsV2UserNotification): Self = StObject.set(x, "userNotification", value.asInstanceOf[js.Any])
    
    inline def setUserNotificationUndefined: Self = StObject.set(x, "userNotification", js.undefined)
  }
}
