package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Budgets
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Budgets: awsDashSdkLib.libConfigMod.ConfigBase with (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.ClientConfiguration */ js.Any) = js.native
  /**
    * Creates a budget and, if included, notifications and subscribers. 
    */
  def createBudget(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBudget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateBudgetResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a budget and, if included, notifications and subscribers. 
    */
  def createBudget(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateBudgetRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBudget(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateBudgetRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateBudgetResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a notification. You must create the budget before you create the associated notification.
    */
  def createNotification(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateNotificationResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a notification. You must create the budget before you create the associated notification.
    */
  def createNotification(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateNotificationRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createNotification(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateNotificationRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateNotificationResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
    */
  def createSubscriber(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateSubscriberResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSubscriber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateSubscriberResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateSubscriberResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a subscriber. You must create the associated budget and notification before you create the subscriber.
    */
  def createSubscriber(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateSubscriberRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateSubscriberResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSubscriber(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateSubscriberRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateSubscriberResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.CreateSubscriberResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a budget. You can delete your budget at any time.  Deleting a budget also deletes the notifications and subscribers that are associated with that budget. 
    */
  def deleteBudget(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteBudget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteBudgetResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a budget. You can delete your budget at any time.  Deleting a budget also deletes the notifications and subscribers that are associated with that budget. 
    */
  def deleteBudget(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteBudgetRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteBudget(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteBudgetRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteBudgetResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a notification.  Deleting a notification also deletes the subscribers that are associated with the notification. 
    */
  def deleteNotification(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteNotificationResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a notification.  Deleting a notification also deletes the subscribers that are associated with the notification. 
    */
  def deleteNotification(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteNotificationRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteNotification(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteNotificationRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteNotificationResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a subscriber.  Deleting the last subscriber to a notification also deletes the notification. 
    */
  def deleteSubscriber(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteSubscriberResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSubscriber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteSubscriberResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteSubscriberResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a subscriber.  Deleting the last subscriber to a notification also deletes the notification. 
    */
  def deleteSubscriber(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteSubscriberRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteSubscriberResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSubscriber(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteSubscriberRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteSubscriberResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DeleteSubscriberResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a budget.
    */
  def describeBudget(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBudget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a budget.
    */
  def describeBudget(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBudget(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the history for DAILY, MONTHLY, and QUARTERLY budgets. Budget history isn't available for ANNUAL budgets.
    */
  def describeBudgetPerformanceHistory(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetPerformanceHistoryResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBudgetPerformanceHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetPerformanceHistoryResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetPerformanceHistoryResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the history for DAILY, MONTHLY, and QUARTERLY budgets. Budget history isn't available for ANNUAL budgets.
    */
  def describeBudgetPerformanceHistory(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetPerformanceHistoryRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetPerformanceHistoryResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBudgetPerformanceHistory(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetPerformanceHistoryRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetPerformanceHistoryResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetPerformanceHistoryResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the budgets that are associated with an account.
    */
  def describeBudgets(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetsResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBudgets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetsResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetsResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the budgets that are associated with an account.
    */
  def describeBudgets(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetsRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetsResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBudgets(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetsRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetsResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeBudgetsResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the notifications that are associated with a budget.
    */
  def describeNotificationsForBudget(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeNotificationsForBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeNotificationsForBudget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeNotificationsForBudgetResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeNotificationsForBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the notifications that are associated with a budget.
    */
  def describeNotificationsForBudget(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeNotificationsForBudgetRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeNotificationsForBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeNotificationsForBudget(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeNotificationsForBudgetRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeNotificationsForBudgetResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeNotificationsForBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the subscribers that are associated with a notification.
    */
  def describeSubscribersForNotification(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeSubscribersForNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSubscribersForNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeSubscribersForNotificationResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeSubscribersForNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the subscribers that are associated with a notification.
    */
  def describeSubscribersForNotification(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeSubscribersForNotificationRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeSubscribersForNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSubscribersForNotification(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeSubscribersForNotificationRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeSubscribersForNotificationResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.DescribeSubscribersForNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a budget. You can change every part of a budget except for the budgetName and the calculatedSpend. When you modify a budget, the calculatedSpend drops to zero until AWS has new usage data to use for forecasting.
    */
  def updateBudget(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateBudget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateBudgetResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a budget. You can change every part of a budget except for the budgetName and the calculatedSpend. When you modify a budget, the calculatedSpend drops to zero until AWS has new usage data to use for forecasting.
    */
  def updateBudget(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateBudgetRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateBudget(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateBudgetRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateBudgetResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateBudgetResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a notification.
    */
  def updateNotification(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateNotificationResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a notification.
    */
  def updateNotification(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateNotificationRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateNotification(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateNotificationRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateNotificationResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateNotificationResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a subscriber.
    */
  def updateSubscriber(): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateSubscriberResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateSubscriber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateSubscriberResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateSubscriberResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a subscriber.
    */
  def updateSubscriber(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateSubscriberRequest */ js.Any
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateSubscriberResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateSubscriber(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateSubscriberRequest */ js.Any,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateSubscriberResponse */ /* data */ js.Any, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Budgets.Types.UpdateSubscriberResponse */ _, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

