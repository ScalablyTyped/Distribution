package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventSubscriptionResult extends StObject {
  
  var EventSubscription: js.UndefOr[typings.awsSdk.clientsNeptuneMod.EventSubscription] = js.undefined
}
object DeleteEventSubscriptionResult {
  
  inline def apply(): DeleteEventSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEventSubscriptionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEventSubscriptionResult] (val x: Self) extends AnyVal {
    
    inline def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    inline def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
