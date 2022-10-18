package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventSubscriptionResult extends StObject {
  
  var EventSubscription: js.UndefOr[typings.awsSdk.clientsDocdbMod.EventSubscription] = js.undefined
}
object CreateEventSubscriptionResult {
  
  inline def apply(): CreateEventSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventSubscriptionResult]
  }
  
  extension [Self <: CreateEventSubscriptionResult](x: Self) {
    
    inline def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    inline def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
