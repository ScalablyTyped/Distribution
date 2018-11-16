package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DescribeNotificationsForBudgetResponse extends js.Object {
  /**
       * The pagination token that indicates the next set of results that you can retrieve.
       */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
       * A list of notifications associated with a budget.
       */
  var Notifications: js.UndefOr[Notifications] = js.undefined
}

