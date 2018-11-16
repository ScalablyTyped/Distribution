package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeleteNotificationRequest extends js.Object {
  /**
       * The accountId that is associated with the budget whose notification you want to delete.
       */
  var AccountId: AccountId
  /**
       * The name of the budget whose notification you want to delete.
       */
  var BudgetName: BudgetName
  /**
       * The notification that you want to delete.
       */
  var Notification: Notification
}

