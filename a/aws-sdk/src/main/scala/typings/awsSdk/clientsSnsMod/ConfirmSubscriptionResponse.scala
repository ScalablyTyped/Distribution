package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmSubscriptionResponse extends StObject {
  
  /**
    * The ARN of the created subscription.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
}
object ConfirmSubscriptionResponse {
  
  inline def apply(): ConfirmSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSubscriptionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfirmSubscriptionResponse] (val x: Self) extends AnyVal {
    
    inline def setSubscriptionArn(value: subscriptionARN): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionArnUndefined: Self = StObject.set(x, "SubscriptionArn", js.undefined)
  }
}
