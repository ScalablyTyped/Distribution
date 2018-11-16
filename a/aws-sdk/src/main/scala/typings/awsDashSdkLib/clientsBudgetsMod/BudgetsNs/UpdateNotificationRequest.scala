package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateNotificationRequest extends js.Object {
  /**
       * The accountId that is associated with the budget whose notification you want to update.
       */
  var AccountId: AccountId
  /**
       * The name of the budget whose notification you want to update.
       */
  var BudgetName: BudgetName
  /**
       * The updated notification to be associated with a budget.
       */
  var NewNotification: Notification
  /**
       * The previous notification associated with a budget.
       */
  var OldNotification: Notification
}

