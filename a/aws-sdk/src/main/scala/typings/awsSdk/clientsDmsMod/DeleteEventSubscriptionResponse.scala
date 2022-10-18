package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventSubscriptionResponse extends StObject {
  
  /**
    * The event subscription that was deleted.
    */
  var EventSubscription: js.UndefOr[typings.awsSdk.clientsDmsMod.EventSubscription] = js.undefined
}
object DeleteEventSubscriptionResponse {
  
  inline def apply(): DeleteEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEventSubscriptionResponse]
  }
  
  extension [Self <: DeleteEventSubscriptionResponse](x: Self) {
    
    inline def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    inline def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
