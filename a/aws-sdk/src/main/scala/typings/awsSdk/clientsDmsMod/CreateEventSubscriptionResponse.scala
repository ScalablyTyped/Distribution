package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventSubscriptionResponse extends StObject {
  
  /**
    * The event subscription that was created.
    */
  var EventSubscription: js.UndefOr[typings.awsSdk.clientsDmsMod.EventSubscription] = js.undefined
}
object CreateEventSubscriptionResponse {
  
  inline def apply(): CreateEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventSubscriptionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEventSubscriptionResponse] (val x: Self) extends AnyVal {
    
    inline def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    inline def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
