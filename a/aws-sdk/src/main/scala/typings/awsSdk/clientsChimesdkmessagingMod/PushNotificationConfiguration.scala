package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushNotificationConfiguration extends StObject {
  
  /**
    * The body of the push notification.
    */
  var Body: js.UndefOr[PushNotificationBody] = js.undefined
  
  /**
    * The title of the push notification.
    */
  var Title: js.UndefOr[PushNotificationTitle] = js.undefined
  
  /**
    * Enum value that indicates the type of the push notification for a message. DEFAULT: Normal mobile push notification. VOIP: VOIP mobile push notification.
    */
  var Type: js.UndefOr[PushNotificationType] = js.undefined
}
object PushNotificationConfiguration {
  
  inline def apply(): PushNotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationConfiguration]
  }
  
  extension [Self <: PushNotificationConfiguration](x: Self) {
    
    inline def setBody(value: PushNotificationBody): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setTitle(value: PushNotificationTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setType(value: PushNotificationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
