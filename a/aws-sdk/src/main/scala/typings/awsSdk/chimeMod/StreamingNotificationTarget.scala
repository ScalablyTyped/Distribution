package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingNotificationTarget extends StObject {
  
  /**
    * The streaming notification target.
    */
  var NotificationTarget: typings.awsSdk.chimeMod.NotificationTarget
}
object StreamingNotificationTarget {
  
  inline def apply(NotificationTarget: NotificationTarget): StreamingNotificationTarget = {
    val __obj = js.Dynamic.literal(NotificationTarget = NotificationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingNotificationTarget]
  }
  
  extension [Self <: StreamingNotificationTarget](x: Self) {
    
    inline def setNotificationTarget(value: NotificationTarget): Self = StObject.set(x, "NotificationTarget", value.asInstanceOf[js.Any])
  }
}
