package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeResponse extends StObject {
  
  /**
    * The ARN of the subscription if it is confirmed, or the string "pending confirmation" if the subscription requires confirmation. However, if the API request parameter ReturnSubscriptionArn is true, then the value is always the subscription ARN, even if the subscription requires confirmation.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
}
object SubscribeResponse {
  
  inline def apply(): SubscribeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeResponse]
  }
  
  extension [Self <: SubscribeResponse](x: Self) {
    
    inline def setSubscriptionArn(value: subscriptionARN): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionArnUndefined: Self = StObject.set(x, "SubscriptionArn", js.undefined)
  }
}
