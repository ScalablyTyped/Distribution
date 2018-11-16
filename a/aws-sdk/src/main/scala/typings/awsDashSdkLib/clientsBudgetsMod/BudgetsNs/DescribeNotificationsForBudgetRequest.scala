package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DescribeNotificationsForBudgetRequest extends js.Object {
  /**
       * The accountId that is associated with the budget whose notifications you want descriptions of.
       */
  var AccountId: AccountId
  /**
       * The name of the budget whose notifications you want descriptions of.
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
}

