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
  var SubscriptionType: SubscriptionType
}

