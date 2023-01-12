package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingNotificationTarget extends StObject {
  
  /**
    * The streaming notification target.
    */
  var NotificationTarget: typings.awsSdk.clientsChimeMod.NotificationTarget
}
object StreamingNotificationTarget {
  
  inline def apply(NotificationTarget: NotificationTarget): StreamingNotificationTarget = {
    val __obj = js.Dynamic.literal(NotificationTarget = NotificationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingNotificationTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamingNotificationTarget] (val x: Self) extends AnyVal {
    
    inline def setNotificationTarget(value: NotificationTarget): Self = StObject.set(x, "NotificationTarget", value.asInstanceOf[js.Any])
  }
}
