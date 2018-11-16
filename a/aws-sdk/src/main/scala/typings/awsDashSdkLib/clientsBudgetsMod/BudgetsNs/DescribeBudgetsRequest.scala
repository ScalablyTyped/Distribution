package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DescribeBudgetsRequest extends js.Object {
  /**
       * The accountId that is associated with the budgets that you want descriptions of.
       */
  var AccountId: AccountId
  /**
       * Optional integer. Specifies the maximum number of results to return in response.
       */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
       * The pagination token that indicates the next set of results to retrieve.
       */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

