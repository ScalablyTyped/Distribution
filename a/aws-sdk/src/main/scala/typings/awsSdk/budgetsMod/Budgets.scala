package typings.awsSdk.budgetsMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Budgets extends Service {
  @JSName("config")
  var config_Budgets: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a budget and, if included, notifications and subscribers.   Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def createBudget(): Request[CreateBudgetResponse, AWSError] = js.native
  def createBudget(callback: js.Function2[/* err */ AWSError, /* data */ CreateBudgetResponse, Unit]): Request[CreateBudgetResponse, AWSError] = js.native
  /**
    * Creates a budget and, if included, notifications and subscribers.   Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def createBudget(params: CreateBudgetRequest): Request[CreateBudgetResponse, AWSError] = js.native
  def createBudget(
    params: CreateBudgetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBudgetResponse, Unit]
  ): Request[CreateBudgetResponse, AWSError] = js.native
  /**
    * Creates a notification. You must create the budget before you create the associated notification.
    */
  def createNotification(): Request[CreateNotificationResponse, AWSError] = js.native
  def createNotification(callback: js.Function2[/* err */ AWSError, /* data */ CreateNotificationResponse, Unit]): Request[CreateNotificationResponse, AWSError] = js.native
  /**
    * Creates a notification. You must create the budget before you create the associated notification.
    */
  def createNotification(params: CreateNotificationRequest): Request[CreateNotificationResponse, AWSError] = js.native
  def createNotification(
    params: CreateNotificationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNotificationResponse, Unit]
  ): Request[CreateNotificationResponse, AWSError] = js.native
  /**
    * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
    */
  def createSubscriber(): Request[CreateSubscriberResponse, AWSError] = js.native
  def createSubscriber(callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriberResponse, Unit]): Request[CreateSubscriberResponse, AWSError] = js.native
  /**
    * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
    */
  def createSubscriber(params: CreateSubscriberRequest): Request[CreateSubscriberResponse, AWSError] = js.native
  def createSubscriber(
    params: CreateSubscriberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriberResponse, Unit]
  ): Request[CreateSubscriberResponse, AWSError] = js.native
  /**
    * Deletes a budget. You can delete your budget at any time.  Deleting a budget also deletes the notifications and subscribers that are associated with that budget. 
    */
  def deleteBudget(): Request[DeleteBudgetResponse, AWSError] = js.native
  def deleteBudget(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBudgetResponse, Unit]): Request[DeleteBudgetResponse, AWSError] = js.native
  /**
    * Deletes a budget. You can delete your budget at any time.  Deleting a budget also deletes the notifications and subscribers that are associated with that budget. 
    */
  def deleteBudget(params: DeleteBudgetRequest): Request[DeleteBudgetResponse, AWSError] = js.native
  def deleteBudget(
    params: DeleteBudgetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBudgetResponse, Unit]
  ): Request[DeleteBudgetResponse, AWSError] = js.native
  /**
    * Deletes a notification.  Deleting a notification also deletes the subscribers that are associated with the notification. 
    */
  def deleteNotification(): Request[DeleteNotificationResponse, AWSError] = js.native
  def deleteNotification(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNotificationResponse, Unit]): Request[DeleteNotificationResponse, AWSError] = js.native
  /**
    * Deletes a notification.  Deleting a notification also deletes the subscribers that are associated with the notification. 
    */
  def deleteNotification(params: DeleteNotificationRequest): Request[DeleteNotificationResponse, AWSError] = js.native
  def deleteNotification(
    params: DeleteNotificationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNotificationResponse, Unit]
  ): Request[DeleteNotificationResponse, AWSError] = js.native
  /**
    * Deletes a subscriber.  Deleting the last subscriber to a notification also deletes the notification. 
    */
  def deleteSubscriber(): Request[DeleteSubscriberResponse, AWSError] = js.native
  def deleteSubscriber(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubscriberResponse, Unit]): Request[DeleteSubscriberResponse, AWSError] = js.native
  /**
    * Deletes a subscriber.  Deleting the last subscriber to a notification also deletes the notification. 
    */
  def deleteSubscriber(params: DeleteSubscriberRequest): Request[DeleteSubscriberResponse, AWSError] = js.native
  def deleteSubscriber(
    params: DeleteSubscriberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubscriberResponse, Unit]
  ): Request[DeleteSubscriberResponse, AWSError] = js.native
  /**
    * Describes a budget.  The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def describeBudget(): Request[DescribeBudgetResponse, AWSError] = js.native
  def describeBudget(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetResponse, Unit]): Request[DescribeBudgetResponse, AWSError] = js.native
  /**
    * Describes a budget.  The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def describeBudget(params: DescribeBudgetRequest): Request[DescribeBudgetResponse, AWSError] = js.native
  def describeBudget(
    params: DescribeBudgetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetResponse, Unit]
  ): Request[DescribeBudgetResponse, AWSError] = js.native
  /**
    * Describes the history for DAILY, MONTHLY, and QUARTERLY budgets. Budget history isn't available for ANNUAL budgets.
    */
  def describeBudgetPerformanceHistory(): Request[DescribeBudgetPerformanceHistoryResponse, AWSError] = js.native
  def describeBudgetPerformanceHistory(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetPerformanceHistoryResponse, Unit]
  ): Request[DescribeBudgetPerformanceHistoryResponse, AWSError] = js.native
  /**
    * Describes the history for DAILY, MONTHLY, and QUARTERLY budgets. Budget history isn't available for ANNUAL budgets.
    */
  def describeBudgetPerformanceHistory(params: DescribeBudgetPerformanceHistoryRequest): Request[DescribeBudgetPerformanceHistoryResponse, AWSError] = js.native
  def describeBudgetPerformanceHistory(
    params: DescribeBudgetPerformanceHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetPerformanceHistoryResponse, Unit]
  ): Request[DescribeBudgetPerformanceHistoryResponse, AWSError] = js.native
  /**
    * Lists the budgets that are associated with an account.  The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def describeBudgets(): Request[DescribeBudgetsResponse, AWSError] = js.native
  def describeBudgets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetsResponse, Unit]): Request[DescribeBudgetsResponse, AWSError] = js.native
  /**
    * Lists the budgets that are associated with an account.  The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def describeBudgets(params: DescribeBudgetsRequest): Request[DescribeBudgetsResponse, AWSError] = js.native
  def describeBudgets(
    params: DescribeBudgetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetsResponse, Unit]
  ): Request[DescribeBudgetsResponse, AWSError] = js.native
  /**
    * Lists the notifications that are associated with a budget.
    */
  def describeNotificationsForBudget(): Request[DescribeNotificationsForBudgetResponse, AWSError] = js.native
  def describeNotificationsForBudget(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotificationsForBudgetResponse, Unit]
  ): Request[DescribeNotificationsForBudgetResponse, AWSError] = js.native
  /**
    * Lists the notifications that are associated with a budget.
    */
  def describeNotificationsForBudget(params: DescribeNotificationsForBudgetRequest): Request[DescribeNotificationsForBudgetResponse, AWSError] = js.native
  def describeNotificationsForBudget(
    params: DescribeNotificationsForBudgetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotificationsForBudgetResponse, Unit]
  ): Request[DescribeNotificationsForBudgetResponse, AWSError] = js.native
  /**
    * Lists the subscribers that are associated with a notification.
    */
  def describeSubscribersForNotification(): Request[DescribeSubscribersForNotificationResponse, AWSError] = js.native
  def describeSubscribersForNotification(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscribersForNotificationResponse, Unit]
  ): Request[DescribeSubscribersForNotificationResponse, AWSError] = js.native
  /**
    * Lists the subscribers that are associated with a notification.
    */
  def describeSubscribersForNotification(params: DescribeSubscribersForNotificationRequest): Request[DescribeSubscribersForNotificationResponse, AWSError] = js.native
  def describeSubscribersForNotification(
    params: DescribeSubscribersForNotificationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscribersForNotificationResponse, Unit]
  ): Request[DescribeSubscribersForNotificationResponse, AWSError] = js.native
  /**
    * Updates a budget. You can change every part of a budget except for the budgetName and the calculatedSpend. When you modify a budget, the calculatedSpend drops to zero until AWS has new usage data to use for forecasting.  Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def updateBudget(): Request[UpdateBudgetResponse, AWSError] = js.native
  def updateBudget(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBudgetResponse, Unit]): Request[UpdateBudgetResponse, AWSError] = js.native
  /**
    * Updates a budget. You can change every part of a budget except for the budgetName and the calculatedSpend. When you modify a budget, the calculatedSpend drops to zero until AWS has new usage data to use for forecasting.  Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def updateBudget(params: UpdateBudgetRequest): Request[UpdateBudgetResponse, AWSError] = js.native
  def updateBudget(
    params: UpdateBudgetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBudgetResponse, Unit]
  ): Request[UpdateBudgetResponse, AWSError] = js.native
  /**
    * Updates a notification.
    */
  def updateNotification(): Request[UpdateNotificationResponse, AWSError] = js.native
  def updateNotification(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotificationResponse, Unit]): Request[UpdateNotificationResponse, AWSError] = js.native
  /**
    * Updates a notification.
    */
  def updateNotification(params: UpdateNotificationRequest): Request[UpdateNotificationResponse, AWSError] = js.native
  def updateNotification(
    params: UpdateNotificationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNotificationResponse, Unit]
  ): Request[UpdateNotificationResponse, AWSError] = js.native
  /**
    * Updates a subscriber.
    */
  def updateSubscriber(): Request[UpdateSubscriberResponse, AWSError] = js.native
  def updateSubscriber(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriberResponse, Unit]): Request[UpdateSubscriberResponse, AWSError] = js.native
  /**
    * Updates a subscriber.
    */
  def updateSubscriber(params: UpdateSubscriberRequest): Request[UpdateSubscriberResponse, AWSError] = js.native
  def updateSubscriber(
    params: UpdateSubscriberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriberResponse, Unit]
  ): Request[UpdateSubscriberResponse, AWSError] = js.native
}

