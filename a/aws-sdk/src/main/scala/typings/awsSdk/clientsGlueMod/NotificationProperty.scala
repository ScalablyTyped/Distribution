package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationProperty extends StObject {
  
  /**
    * After a job run starts, the number of minutes to wait before sending a job run delay notification.
    */
  var NotifyDelayAfter: js.UndefOr[typings.awsSdk.clientsGlueMod.NotifyDelayAfter] = js.undefined
}
object NotificationProperty {
  
  inline def apply(): NotificationProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationProperty]
  }
  
  extension [Self <: NotificationProperty](x: Self) {
    
    inline def setNotifyDelayAfter(value: NotifyDelayAfter): Self = StObject.set(x, "NotifyDelayAfter", value.asInstanceOf[js.Any])
    
    inline def setNotifyDelayAfterUndefined: Self = StObject.set(x, "NotifyDelayAfter", js.undefined)
  }
}
