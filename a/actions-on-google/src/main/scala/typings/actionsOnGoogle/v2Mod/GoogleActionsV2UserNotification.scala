package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UserNotification extends StObject {
  
  /**
    * The content of the notification.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The title for the notification.
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UserNotification {
  
  inline def apply(): GoogleActionsV2UserNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UserNotification]
  }
  
  extension [Self <: GoogleActionsV2UserNotification](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
