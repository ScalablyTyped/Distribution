package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersOrderUpdateUserNotification extends StObject {
  
  /**
    * The contents of the notification.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The title for the user notification.
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2OrdersOrderUpdateUserNotification {
  
  inline def apply(): GoogleActionsV2OrdersOrderUpdateUserNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderUpdateUserNotification]
  }
  
  extension [Self <: GoogleActionsV2OrdersOrderUpdateUserNotification](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
