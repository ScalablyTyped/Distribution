package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyEventSubscriptionResponse extends StObject {
  
  /**
    * The modified event subscription.
    */
  var EventSubscription: js.UndefOr[typings.awsSdk.clientsDmsMod.EventSubscription] = js.undefined
}
object ModifyEventSubscriptionResponse {
  
  inline def apply(): ModifyEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyEventSubscriptionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyEventSubscriptionResponse] (val x: Self) extends AnyVal {
    
    inline def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    inline def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
