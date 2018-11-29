package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DescribeBudgetPerformanceHistoryRequest extends js.Object {
  var AccountId: AccountId
  var BudgetName: BudgetName
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
       * Retrieves how often the budget went into an ALARM state for the specified time period.
       */
  var TimePeriod: js.UndefOr[TimePeriod] = js.undefined
}

