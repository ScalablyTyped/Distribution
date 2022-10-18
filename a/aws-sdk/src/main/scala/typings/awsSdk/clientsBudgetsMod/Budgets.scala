package typings.awsSdk.clientsBudgetsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Budgets extends Service {
  
  @JSName("config")
  var config_Budgets: ConfigBase & ClientConfiguration = js.native
  
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
    *  Creates a budget action. 
    */
  def createBudgetAction(): Request[CreateBudgetActionResponse, AWSError] = js.native
  def createBudgetAction(callback: js.Function2[/* err */ AWSError, /* data */ CreateBudgetActionResponse, Unit]): Request[CreateBudgetActionResponse, AWSError] = js.native
  /**
    *  Creates a budget action. 
    */
  def createBudgetAction(params: CreateBudgetActionRequest): Request[CreateBudgetActionResponse, AWSError] = js.native
  def createBudgetAction(
    params: CreateBudgetActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBudgetActionResponse, Unit]
  ): Request[CreateBudgetActionResponse, AWSError] = js.native
  
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
    *  Deletes a budget action. 
    */
  def deleteBudgetAction(): Request[DeleteBudgetActionResponse, AWSError] = js.native
  def deleteBudgetAction(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBudgetActionResponse, Unit]): Request[DeleteBudgetActionResponse, AWSError] = js.native
  /**
    *  Deletes a budget action. 
    */
  def deleteBudgetAction(params: DeleteBudgetActionRequest): Request[DeleteBudgetActionResponse, AWSError] = js.native
  def deleteBudgetAction(
    params: DeleteBudgetActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBudgetActionResponse, Unit]
  ): Request[DeleteBudgetActionResponse, AWSError] = js.native
  
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
    *  Describes a budget action detail. 
    */
  def describeBudgetAction(): Request[DescribeBudgetActionResponse, AWSError] = js.native
  def describeBudgetAction(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetActionResponse, Unit]): Request[DescribeBudgetActionResponse, AWSError] = js.native
  /**
    *  Describes a budget action detail. 
    */
  def describeBudgetAction(params: DescribeBudgetActionRequest): Request[DescribeBudgetActionResponse, AWSError] = js.native
  def describeBudgetAction(
    params: DescribeBudgetActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetActionResponse, Unit]
  ): Request[DescribeBudgetActionResponse, AWSError] = js.native
  
  /**
    *  Describes a budget action history detail. 
    */
  def describeBudgetActionHistories(): Request[DescribeBudgetActionHistoriesResponse, AWSError] = js.native
  def describeBudgetActionHistories(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetActionHistoriesResponse, Unit]): Request[DescribeBudgetActionHistoriesResponse, AWSError] = js.native
  /**
    *  Describes a budget action history detail. 
    */
  def describeBudgetActionHistories(params: DescribeBudgetActionHistoriesRequest): Request[DescribeBudgetActionHistoriesResponse, AWSError] = js.native
  def describeBudgetActionHistories(
    params: DescribeBudgetActionHistoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetActionHistoriesResponse, Unit]
  ): Request[DescribeBudgetActionHistoriesResponse, AWSError] = js.native
  
  /**
    *  Describes all of the budget actions for an account. 
    */
  def describeBudgetActionsForAccount(): Request[DescribeBudgetActionsForAccountResponse, AWSError] = js.native
  def describeBudgetActionsForAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetActionsForAccountResponse, Unit]
  ): Request[DescribeBudgetActionsForAccountResponse, AWSError] = js.native
  /**
    *  Describes all of the budget actions for an account. 
    */
  def describeBudgetActionsForAccount(params: DescribeBudgetActionsForAccountRequest): Request[DescribeBudgetActionsForAccountResponse, AWSError] = js.native
  def describeBudgetActionsForAccount(
    params: DescribeBudgetActionsForAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetActionsForAccountResponse, Unit]
  ): Request[DescribeBudgetActionsForAccountResponse, AWSError] = js.native
  
  /**
    *  Describes all of the budget actions for a budget. 
    */
  def describeBudgetActionsForBudget(): Request[DescribeBudgetActionsForBudgetResponse, AWSError] = js.native
  def describeBudgetActionsForBudget(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetActionsForBudgetResponse, Unit]
  ): Request[DescribeBudgetActionsForBudgetResponse, AWSError] = js.native
  /**
    *  Describes all of the budget actions for a budget. 
    */
  def describeBudgetActionsForBudget(params: DescribeBudgetActionsForBudgetRequest): Request[DescribeBudgetActionsForBudgetResponse, AWSError] = js.native
  def describeBudgetActionsForBudget(
    params: DescribeBudgetActionsForBudgetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetActionsForBudgetResponse, Unit]
  ): Request[DescribeBudgetActionsForBudgetResponse, AWSError] = js.native
  
  /**
    *  Lists the budget names and notifications that are associated with an account. 
    */
  def describeBudgetNotificationsForAccount(): Request[DescribeBudgetNotificationsForAccountResponse, AWSError] = js.native
  def describeBudgetNotificationsForAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetNotificationsForAccountResponse, Unit]
  ): Request[DescribeBudgetNotificationsForAccountResponse, AWSError] = js.native
  /**
    *  Lists the budget names and notifications that are associated with an account. 
    */
  def describeBudgetNotificationsForAccount(params: DescribeBudgetNotificationsForAccountRequest): Request[DescribeBudgetNotificationsForAccountResponse, AWSError] = js.native
  def describeBudgetNotificationsForAccount(
    params: DescribeBudgetNotificationsForAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBudgetNotificationsForAccountResponse, Unit]
  ): Request[DescribeBudgetNotificationsForAccountResponse, AWSError] = js.native
  
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
    *  Executes a budget action. 
    */
  def executeBudgetAction(): Request[ExecuteBudgetActionResponse, AWSError] = js.native
  def executeBudgetAction(callback: js.Function2[/* err */ AWSError, /* data */ ExecuteBudgetActionResponse, Unit]): Request[ExecuteBudgetActionResponse, AWSError] = js.native
  /**
    *  Executes a budget action. 
    */
  def executeBudgetAction(params: ExecuteBudgetActionRequest): Request[ExecuteBudgetActionResponse, AWSError] = js.native
  def executeBudgetAction(
    params: ExecuteBudgetActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExecuteBudgetActionResponse, Unit]
  ): Request[ExecuteBudgetActionResponse, AWSError] = js.native
  
  /**
    * Updates a budget. You can change every part of a budget except for the budgetName and the calculatedSpend. When you modify a budget, the calculatedSpend drops to zero until Amazon Web Services has new usage data to use for forecasting.  Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def updateBudget(): Request[UpdateBudgetResponse, AWSError] = js.native
  def updateBudget(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBudgetResponse, Unit]): Request[UpdateBudgetResponse, AWSError] = js.native
  /**
    * Updates a budget. You can change every part of a budget except for the budgetName and the calculatedSpend. When you modify a budget, the calculatedSpend drops to zero until Amazon Web Services has new usage data to use for forecasting.  Only one of BudgetLimit or PlannedBudgetLimits can be present in the syntax at one time. Use the syntax that matches your case. The Request Syntax section shows the BudgetLimit syntax. For PlannedBudgetLimits, see the Examples section.  
    */
  def updateBudget(params: UpdateBudgetRequest): Request[UpdateBudgetResponse, AWSError] = js.native
  def updateBudget(
    params: UpdateBudgetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBudgetResponse, Unit]
  ): Request[UpdateBudgetResponse, AWSError] = js.native
  
  /**
    *  Updates a budget action. 
    */
  def updateBudgetAction(): Request[UpdateBudgetActionResponse, AWSError] = js.native
  def updateBudgetAction(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBudgetActionResponse, Unit]): Request[UpdateBudgetActionResponse, AWSError] = js.native
  /**
    *  Updates a budget action. 
    */
  def updateBudgetAction(params: UpdateBudgetActionRequest): Request[UpdateBudgetActionResponse, AWSError] = js.native
  def updateBudgetAction(
    params: UpdateBudgetActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBudgetActionResponse, Unit]
  ): Request[UpdateBudgetActionResponse, AWSError] = js.native
  
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
