package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscriber extends js.Object {
  /**
    * The address that AWS sends budget notifications to, either an SNS topic or an email. When you create a subscriber, the value of Address can't contain line breaks.
    */
  var Address: SubscriberAddress = js.native
  /**
    * The type of notification that AWS sends to a subscriber.
    */
  var SubscriptionType: typings.awsSdk.budgetsMod.SubscriptionType = js.native
}

object Subscriber {
  @scala.inline
  def apply(Address: SubscriberAddress, SubscriptionType: SubscriptionType): Subscriber = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscriber]
  }
}

