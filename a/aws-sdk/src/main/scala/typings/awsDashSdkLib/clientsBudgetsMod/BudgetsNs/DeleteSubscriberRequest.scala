package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSubscriberRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose subscriber you want to delete.
    */
  var AccountId: AccountId
  /**
    * The name of the budget whose subscriber you want to delete.
    */
  var BudgetName: BudgetName
  /**
    * The notification whose subscriber you want to delete.
    */
  var Notification: Notification
  /**
    * The subscriber that you want to delete.
    */
  var Subscriber: Subscriber
}

