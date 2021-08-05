package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscriber extends StObject {
  
  /**
    * The address that AWS sends budget notifications to, either an SNS topic or an email. When you create a subscriber, the value of Address can't contain line breaks.
    */
  var Address: SubscriberAddress
  
  /**
    * The type of notification that AWS sends to a subscriber.
    */
  var SubscriptionType: typings.awsSdk.budgetsMod.SubscriptionType
}
object Subscriber {
  
  inline def apply(Address: SubscriberAddress, SubscriptionType: SubscriptionType): Subscriber = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscriber]
  }
  
  extension [Self <: Subscriber](x: Self) {
    
    inline def setAddress(value: SubscriberAddress): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionType(value: SubscriptionType): Self = StObject.set(x, "SubscriptionType", value.asInstanceOf[js.Any])
  }
}
