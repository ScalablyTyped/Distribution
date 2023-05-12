package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingNotificationTarget extends StObject {
  
  /**
    * The streaming notification target.
    */
  var NotificationTarget: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.NotificationTarget] = js.undefined
}
object StreamingNotificationTarget {
  
  inline def apply(): StreamingNotificationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingNotificationTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamingNotificationTarget] (val x: Self) extends AnyVal {
    
    inline def setNotificationTarget(value: NotificationTarget): Self = StObject.set(x, "NotificationTarget", value.asInstanceOf[js.Any])
    
    inline def setNotificationTargetUndefined: Self = StObject.set(x, "NotificationTarget", js.undefined)
  }
}
