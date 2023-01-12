package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionDefinitionVersion extends StObject {
  
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[listOfSubscription] = js.undefined
}
object SubscriptionDefinitionVersion {
  
  inline def apply(): SubscriptionDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionDefinitionVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionDefinitionVersion] (val x: Self) extends AnyVal {
    
    inline def setSubscriptions(value: listOfSubscription): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "Subscriptions", js.Array(value*))
  }
}
