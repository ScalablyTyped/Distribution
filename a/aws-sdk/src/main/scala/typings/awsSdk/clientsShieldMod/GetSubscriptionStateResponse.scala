package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSubscriptionStateResponse extends StObject {
  
  /**
    * The status of the subscription.
    */
  var SubscriptionState: typings.awsSdk.clientsShieldMod.SubscriptionState
}
object GetSubscriptionStateResponse {
  
  inline def apply(SubscriptionState: SubscriptionState): GetSubscriptionStateResponse = {
    val __obj = js.Dynamic.literal(SubscriptionState = SubscriptionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionStateResponse]
  }
  
  extension [Self <: GetSubscriptionStateResponse](x: Self) {
    
    inline def setSubscriptionState(value: SubscriptionState): Self = StObject.set(x, "SubscriptionState", value.asInstanceOf[js.Any])
  }
}
