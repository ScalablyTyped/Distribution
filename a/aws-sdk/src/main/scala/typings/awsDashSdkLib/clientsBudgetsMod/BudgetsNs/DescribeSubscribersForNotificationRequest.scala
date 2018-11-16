package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DescribeSubscribersForNotificationRequest extends js.Object {
  /**
       * The accountId that is associated with the budget whose subscribers you want descriptions of.
       */
  var AccountId: AccountId
  /**
       * The name of the budget whose subscribers you want descriptions of.
       */
  var BudgetName: BudgetName
  /**
       * Optional integer. Specifies the maximum number of results to return in response.
       */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
       * The pagination token that indicates the next set of results to retrieve.
       */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
       * The notification whose subscribers you want to list.
       */
  var Notification: Notification
}

