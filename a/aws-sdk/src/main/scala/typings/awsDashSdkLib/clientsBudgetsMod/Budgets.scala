package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Budgets
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Budgets: awsDashSdkLib.libConfigMod.ConfigBase with js.Any = js.native
  /**
     * Creates a budget and, if included, notifications and subscribers. 
     */
  def createBudget(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a budget and, if included, notifications and subscribers. 
     */
  def createBudget(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a budget and, if included, notifications and subscribers. 
     */
  def createBudget(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a budget and, if included, notifications and subscribers. 
     */
  def createBudget(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a notification. You must create the budget before you create the associated notification.
     */
  def createNotification(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a notification. You must create the budget before you create the associated notification.
     */
  def createNotification(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a notification. You must create the budget before you create the associated notification.
     */
  def createNotification(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a notification. You must create the budget before you create the associated notification.
     */
  def createNotification(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
     */
  def createSubscriber(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
     */
  def createSubscriber(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
     */
  def createSubscriber(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
     */
  def createSubscriber(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a budget. You can delete your budget at any time.  Deleting a budget also deletes the notifications and subscribers associated with that budget. 
     */
  def deleteBudget(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a budget. You can delete your budget at any time.  Deleting a budget also deletes the notifications and subscribers associated with that budget. 
     */
  def deleteBudget(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a budget. You can delete your budget at any time.  Deleting a budget also deletes the notifications and subscribers associated with that budget. 
     */
  def deleteBudget(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a budget. You can delete your budget at any time.  Deleting a budget also deletes the notifications and subscribers associated with that budget. 
     */
  def deleteBudget(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a notification.  Deleting a notification also deletes the subscribers associated with the notification. 
     */
  def deleteNotification(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a notification.  Deleting a notification also deletes the subscribers associated with the notification. 
     */
  def deleteNotification(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a notification.  Deleting a notification also deletes the subscribers associated with the notification. 
     */
  def deleteNotification(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a notification.  Deleting a notification also deletes the subscribers associated with the notification. 
     */
  def deleteNotification(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a subscriber.  Deleting the last subscriber to a notification also deletes the notification. 
     */
  def deleteSubscriber(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a subscriber.  Deleting the last subscriber to a notification also deletes the notification. 
     */
  def deleteSubscriber(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a subscriber.  Deleting the last subscriber to a notification also deletes the notification. 
     */
  def deleteSubscriber(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a subscriber.  Deleting the last subscriber to a notification also deletes the notification. 
     */
  def deleteSubscriber(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Describes a budget.
     */
  def describeBudget(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Describes a budget.
     */
  def describeBudget(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Describes a budget.
     */
  def describeBudget(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Describes a budget.
     */
  def describeBudget(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the budgets associated with an account.
     */
  def describeBudgets(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the budgets associated with an account.
     */
  def describeBudgets(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the budgets associated with an account.
     */
  def describeBudgets(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the budgets associated with an account.
     */
  def describeBudgets(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the notifications associated with a budget.
     */
  def describeNotificationsForBudget(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the notifications associated with a budget.
     */
  def describeNotificationsForBudget(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the notifications associated with a budget.
     */
  def describeNotificationsForBudget(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the notifications associated with a budget.
     */
  def describeNotificationsForBudget(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the subscribers associated with a notification.
     */
  def describeSubscribersForNotification(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the subscribers associated with a notification.
     */
  def describeSubscribersForNotification(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the subscribers associated with a notification.
     */
  def describeSubscribersForNotification(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists the subscribers associated with a notification.
     */
  def describeSubscribersForNotification(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a budget. You can change every part of a budget except for the budgetName and the calculatedSpend. When a budget is modified, the calculatedSpend drops to zero until AWS has new usage data to use for forecasting.
     */
  def updateBudget(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a budget. You can change every part of a budget except for the budgetName and the calculatedSpend. When a budget is modified, the calculatedSpend drops to zero until AWS has new usage data to use for forecasting.
     */
  def updateBudget(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a budget. You can change every part of a budget except for the budgetName and the calculatedSpend. When a budget is modified, the calculatedSpend drops to zero until AWS has new usage data to use for forecasting.
     */
  def updateBudget(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a budget. You can change every part of a budget except for the budgetName and the calculatedSpend. When a budget is modified, the calculatedSpend drops to zero until AWS has new usage data to use for forecasting.
     */
  def updateBudget(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a notification.
     */
  def updateNotification(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a notification.
     */
  def updateNotification(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a notification.
     */
  def updateNotification(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a notification.
     */
  def updateNotification(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a subscriber.
     */
  def updateSubscriber(): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a subscriber.
     */
  def updateSubscriber(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a subscriber.
     */
  def updateSubscriber(params: js.Any): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a subscriber.
     */
  def updateSubscriber(
    params: js.Any,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

