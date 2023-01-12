package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneyPushMessage extends StObject {
  
  /**
    * The number of seconds that the push notification service should keep the message, if the service is unable to deliver the notification the first time. This value is converted to an expiration value when it's sent to a push-notification service. If this value is 0, the service treats the notification as if it expires immediately and the service doesn't store or try to deliver the notification again. This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM) service.
    */
  var TimeToLive: js.UndefOr[string] = js.undefined
}
object JourneyPushMessage {
  
  inline def apply(): JourneyPushMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyPushMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JourneyPushMessage] (val x: Self) extends AnyVal {
    
    inline def setTimeToLive(value: string): Self = StObject.set(x, "TimeToLive", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveUndefined: Self = StObject.set(x, "TimeToLive", js.undefined)
  }
}
