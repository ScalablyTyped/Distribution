package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Budget extends js.Object {
  /**
       * The total amount of cost, usage, or RI utilization that you want to track with your budget.  BudgetLimit is required for cost or usage budgets, but optional for RI utilization budgets. RI utilization budgets default to the only valid value for RI utilization budgets, which is 100.
       */
  var BudgetLimit: js.UndefOr[Spend] = js.undefined
  /**
       * The name of a budget. Unique within accounts. : and \ characters are not allowed in the BudgetName.
       */
  var BudgetName: BudgetName
  /**
       * Whether this budget tracks monetary costs, usage, or RI utilization.
       */
  var BudgetType: BudgetType
  /**
       * The actual and forecasted cost or usage being tracked by a budget.
       */
  var CalculatedSpend: js.UndefOr[CalculatedSpend] = js.undefined
  /**
       * The cost filters applied to a budget, such as service or region.
       */
  var CostFilters: js.UndefOr[CostFilters] = js.undefined
  /**
       * The types of costs included in this budget.
       */
  var CostTypes: js.UndefOr[CostTypes] = js.undefined
  /**
       * The period of time covered by a budget. Has a start date and an end date. The start date must come before the end date. There are no restrictions on the end date.  If you created your budget and didn't specify a start date, AWS defaults to the start of your chosen time period (i.e. DAILY, MONTHLY, QUARTERLY, ANNUALLY). For example, if you created your budget on January 24th 2018, chose DAILY, and didn't set a start date, AWS set your start date to 01/24/18 00:00 UTC. If you chose MONTHLY, AWS set your start date to 01/01/18 00:00 UTC. If you didn't specify an end date, AWS set your end date to 06/15/87 00:00 UTC. The defaults are the same for the AWS Billing and Cost Management console and the API.  You can change either date with the UpdateBudget operation. After the end date, AWS deletes the budget and all associated notifications and subscribers.
       */
  var TimePeriod: js.UndefOr[TimePeriod] = js.undefined
  /**
       * The length of time until a budget resets the actual and forecasted spend.
       */
  var TimeUnit: TimeUnit
}

