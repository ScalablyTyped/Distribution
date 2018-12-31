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
    * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The pagination token that you include in your request to indicate the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

