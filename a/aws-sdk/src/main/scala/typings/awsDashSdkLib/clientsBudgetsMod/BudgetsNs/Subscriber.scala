package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscriber extends js.Object {
  /**
    * The address that AWS sends budget notifications to, either an SNS topic or an email.
    */
  var Address: SubscriberAddress
  /**
    * The type of notification that AWS sends to a subscriber.
    */
  var SubscriptionType: awsDashSdkLib.clientsBudgetsMod.BudgetsNs.SubscriptionType
}

object Subscriber {
  @scala.inline
  def apply(Address: SubscriberAddress, SubscriptionType: SubscriptionType): Subscriber = {
    val __obj = js.Dynamic.literal(Address = Address, SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Subscriber]
  }
}

