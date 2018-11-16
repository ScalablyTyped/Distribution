package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateSubscriberRequest extends js.Object {
  /**
       * The accountId associated with the budget that you want to create a subscriber for.
       */
  var AccountId: AccountId
  /**
       * The name of the budget that you want to subscribe to. Budget names must be unique within an account.
       */
  var BudgetName: BudgetName
  /**
       * The notification that you want to create a subscriber for.
       */
  var Notification: Notification
  /**
       * The subscriber that you want to associate with a budget notification.
       */
  var Subscriber: Subscriber
}

