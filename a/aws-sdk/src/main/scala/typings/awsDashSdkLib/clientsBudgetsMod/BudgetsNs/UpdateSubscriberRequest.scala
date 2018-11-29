package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateSubscriberRequest extends js.Object {
  /**
       * The accountId that is associated with the budget whose subscriber you want to update.
       */
  var AccountId: AccountId
  /**
       * The name of the budget whose subscriber you want to update.
       */
  var BudgetName: BudgetName
  /**
       * The updated subscriber that is associated with a budget notification.
       */
  var NewSubscriber: Subscriber
  /**
       * The notification whose subscriber you want to update.
       */
  var Notification: Notification
  /**
       * The previous subscriber that is associated with a budget notification.
       */
  var OldSubscriber: Subscriber
}

