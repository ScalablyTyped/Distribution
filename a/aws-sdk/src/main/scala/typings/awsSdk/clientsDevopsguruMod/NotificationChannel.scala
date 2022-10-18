package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationChannel extends StObject {
  
  /**
    *  A NotificationChannelConfig object that contains information about configured notification channels. 
    */
  var Config: js.UndefOr[NotificationChannelConfig] = js.undefined
  
  /**
    *  The ID of a notification channel. 
    */
  var Id: js.UndefOr[NotificationChannelId] = js.undefined
}
object NotificationChannel {
  
  inline def apply(): NotificationChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationChannel]
  }
  
  extension [Self <: NotificationChannel](x: Self) {
    
    inline def setConfig(value: NotificationChannelConfig): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "Config", js.undefined)
    
    inline def setId(value: NotificationChannelId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
