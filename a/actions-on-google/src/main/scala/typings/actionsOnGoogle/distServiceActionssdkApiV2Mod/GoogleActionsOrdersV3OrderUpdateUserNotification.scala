package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3OrderUpdateUserNotification extends StObject {
  
  /**
    * The contents of the notification.
    * Max allowed length is 100 chars.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The title for the user notification.
    * Max allowed length is 30 chars.
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleActionsOrdersV3OrderUpdateUserNotification {
  
  inline def apply(): GoogleActionsOrdersV3OrderUpdateUserNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3OrderUpdateUserNotification]
  }
  
  extension [Self <: GoogleActionsOrdersV3OrderUpdateUserNotification](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
