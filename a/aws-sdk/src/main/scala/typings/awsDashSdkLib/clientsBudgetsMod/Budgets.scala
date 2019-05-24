package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Budgets
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Budgets: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a budget and, if included, notifications and subscribers.   Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def createBudget(): awsDashSdkLib.libRequestMod.Request[CreateBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBudget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBudgetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a budget and, if included, notifications and subscribers.   Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def createBudget(params: CreateBudgetRequest): awsDashSdkLib.libRequestMod.Request[CreateBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBudget(
    params: CreateBudgetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBudgetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a notification. You must create the budget before you create the associated notification.
    */
  def createNotification(): awsDashSdkLib.libRequestMod.Request[CreateNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNotificationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a notification. You must create the budget before you create the associated notification.
    */
  def createNotification(params: CreateNotificationRequest): awsDashSdkLib.libRequestMod.Request[CreateNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNotification(
    params: CreateNotificationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNotificationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
    */
  def createSubscriber(): awsDashSdkLib.libRequestMod.Request[CreateSubscriberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSubscriber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSubscriberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSubscriberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
    */
  def createSubscriber(params: CreateSubscriberRequest): awsDashSdkLib.libRequestMod.Request[CreateSubscriberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSubscriber(
    params: CreateSubscriberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSubscriberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSubscriberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a budget. You can delete your budget at any time.  Deleting a budget also deletes the notifications and subscribers that are associated with that budget. 
    */
  def deleteBudget(): awsDashSdkLib.libRequestMod.Request[DeleteBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBudget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBudgetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a budget. You can delete your budget at any time.  Deleting a budget also deletes the notifications and subscribers that are associated with that budget. 
    */
  def deleteBudget(params: DeleteBudgetRequest): awsDashSdkLib.libRequestMod.Request[DeleteBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBudget(
    params: DeleteBudgetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBudgetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a notification.  Deleting a notification also deletes the subscribers that are associated with the notification. 
    */
  def deleteNotification(): awsDashSdkLib.libRequestMod.Request[DeleteNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteNotificationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a notification.  Deleting a notification also deletes the subscribers that are associated with the notification. 
    */
  def deleteNotification(params: DeleteNotificationRequest): awsDashSdkLib.libRequestMod.Request[DeleteNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNotification(
    params: DeleteNotificationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteNotificationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a subscriber.  Deleting the last subscriber to a notification also deletes the notification. 
    */
  def deleteSubscriber(): awsDashSdkLib.libRequestMod.Request[DeleteSubscriberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSubscriber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSubscriberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSubscriberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a subscriber.  Deleting the last subscriber to a notification also deletes the notification. 
    */
  def deleteSubscriber(params: DeleteSubscriberRequest): awsDashSdkLib.libRequestMod.Request[DeleteSubscriberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSubscriber(
    params: DeleteSubscriberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSubscriberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSubscriberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a budget.  The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def describeBudget(): awsDashSdkLib.libRequestMod.Request[DescribeBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBudget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBudgetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a budget.  The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def describeBudget(params: DescribeBudgetRequest): awsDashSdkLib.libRequestMod.Request[DescribeBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBudget(
    params: DescribeBudgetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBudgetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the history for DAILY, MONTHLY, and QUARTERLY budgets. Budget history isn't available for ANNUAL budgets.
    */
  def describeBudgetPerformanceHistory(): awsDashSdkLib.libRequestMod.Request[DescribeBudgetPerformanceHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBudgetPerformanceHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBudgetPerformanceHistoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBudgetPerformanceHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the history for DAILY, MONTHLY, and QUARTERLY budgets. Budget history isn't available for ANNUAL budgets.
    */
  def describeBudgetPerformanceHistory(params: DescribeBudgetPerformanceHistoryRequest): awsDashSdkLib.libRequestMod.Request[DescribeBudgetPerformanceHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBudgetPerformanceHistory(
    params: DescribeBudgetPerformanceHistoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBudgetPerformanceHistoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBudgetPerformanceHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the budgets that are associated with an account.  The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def describeBudgets(): awsDashSdkLib.libRequestMod.Request[DescribeBudgetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBudgets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBudgetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBudgetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the budgets that are associated with an account.  The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def describeBudgets(params: DescribeBudgetsRequest): awsDashSdkLib.libRequestMod.Request[DescribeBudgetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBudgets(
    params: DescribeBudgetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBudgetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBudgetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the notifications that are associated with a budget.
    */
  def describeNotificationsForBudget(): awsDashSdkLib.libRequestMod.Request[DescribeNotificationsForBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeNotificationsForBudget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotificationsForBudgetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotificationsForBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the notifications that are associated with a budget.
    */
  def describeNotificationsForBudget(params: DescribeNotificationsForBudgetRequest): awsDashSdkLib.libRequestMod.Request[DescribeNotificationsForBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeNotificationsForBudget(
    params: DescribeNotificationsForBudgetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotificationsForBudgetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotificationsForBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the subscribers that are associated with a notification.
    */
  def describeSubscribersForNotification(): awsDashSdkLib.libRequestMod.Request[DescribeSubscribersForNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSubscribersForNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSubscribersForNotificationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSubscribersForNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the subscribers that are associated with a notification.
    */
  def describeSubscribersForNotification(params: DescribeSubscribersForNotificationRequest): awsDashSdkLib.libRequestMod.Request[DescribeSubscribersForNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSubscribersForNotification(
    params: DescribeSubscribersForNotificationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSubscribersForNotificationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSubscribersForNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a budget. You can change every part of a budget except for the budgetName and the calculatedSpend. When you modify a budget, the calculatedSpend drops to zero until AWS has new usage data to use for forecasting.  Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def updateBudget(): awsDashSdkLib.libRequestMod.Request[UpdateBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBudget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBudgetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a budget. You can change every part of a budget except for the budgetName and the calculatedSpend. When you modify a budget, the calculatedSpend drops to zero until AWS has new usage data to use for forecasting.  Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def updateBudget(params: UpdateBudgetRequest): awsDashSdkLib.libRequestMod.Request[UpdateBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBudget(
    params: UpdateBudgetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBudgetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBudgetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a notification.
    */
  def updateNotification(): awsDashSdkLib.libRequestMod.Request[UpdateNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateNotificationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a notification.
    */
  def updateNotification(params: UpdateNotificationRequest): awsDashSdkLib.libRequestMod.Request[UpdateNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateNotification(
    params: UpdateNotificationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateNotificationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a subscriber.
    */
  def updateSubscriber(): awsDashSdkLib.libRequestMod.Request[UpdateSubscriberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSubscriber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSubscriberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSubscriberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a subscriber.
    */
  def updateSubscriber(params: UpdateSubscriberRequest): awsDashSdkLib.libRequestMod.Request[UpdateSubscriberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSubscriber(
    params: UpdateSubscriberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSubscriberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSubscriberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

