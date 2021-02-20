package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamingNotificationTarget extends StObject {
  
  /**
    * The streaming notification target.
    */
  var NotificationTarget: typings.awsSdk.chimeMod.NotificationTarget = js.native
}
object StreamingNotificationTarget {
  
  @scala.inline
  def apply(NotificationTarget: NotificationTarget): StreamingNotificationTarget = {
    val __obj = js.Dynamic.literal(NotificationTarget = NotificationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingNotificationTarget]
  }
  
  @scala.inline
  implicit class StreamingNotificationTargetMutableBuilder[Self <: StreamingNotificationTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationTarget(value: NotificationTarget): Self = StObject.set(x, "NotificationTarget", value.asInstanceOf[js.Any])
  }
}
