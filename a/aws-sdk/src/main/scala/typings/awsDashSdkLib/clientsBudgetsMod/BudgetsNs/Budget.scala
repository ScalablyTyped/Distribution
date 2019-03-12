package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Budget extends js.Object {
  /**
    * The total amount of cost, usage, RI utilization, or RI coverage that you want to track with your budget.  BudgetLimit is required for cost or usage budgets, but optional for RI utilization or coverage budgets. RI utilization or coverage budgets default to 100, which is the only valid value for RI utilization or coverage budgets.
    */
  var BudgetLimit: js.UndefOr[Spend] = js.undefined
  /**
    * The name of a budget. The name must be unique within accounts. The : and \ characters aren't allowed in BudgetName.
    */
  var BudgetName: awsDashSdkLib.clientsBudgetsMod.BudgetsNs.BudgetName
  /**
    * Whether this budget tracks monetary costs, usage, RI utilization, or RI coverage.
    */
  var BudgetType: awsDashSdkLib.clientsBudgetsMod.BudgetsNs.BudgetType
  /**
    * The actual and forecasted cost or usage that the budget tracks.
    */
  var CalculatedSpend: js.UndefOr[CalculatedSpend] = js.undefined
  /**
    * The cost filters, such as service or region, that are applied to a budget. AWS Budgets supports the following services as a filter for RI budgets:   Amazon Elastic Compute Cloud - Compute   Amazon Redshift   Amazon Relational Database Service   Amazon ElastiCache   Amazon Elasticsearch Service  
    */
  var CostFilters: js.UndefOr[CostFilters] = js.undefined
  /**
    * The types of costs that are included in this COST budget.  USAGE, RI_UTILIZATION, and RI_COVERAGE budgets do not have CostTypes.
    */
  var CostTypes: js.UndefOr[CostTypes] = js.undefined
  /**
    * The last time that you updated this budget.
    */
  var LastUpdatedTime: js.UndefOr[GenericTimestamp] = js.undefined
  /**
    * The period of time that is covered by a budget. The period has a start date and an end date. The start date must come before the end date. The end date must come before 06/15/87 00:00 UTC.  If you create your budget and don't specify a start date, AWS defaults to the start of your chosen time period (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your budget on January 24, 2018, chose DAILY, and didn't set a start date, AWS set your start date to 01/24/18 00:00 UTC. If you chose MONTHLY, AWS set your start date to 01/01/18 00:00 UTC. If you didn't specify an end date, AWS set your end date to 06/15/87 00:00 UTC. The defaults are the same for the AWS Billing and Cost Management console and the API.  You can change either date with the UpdateBudget operation. After the end date, AWS deletes the budget and all associated notifications and subscribers.
    */
  var TimePeriod: js.UndefOr[TimePeriod] = js.undefined
  /**
    * The length of time until a budget resets the actual and forecasted spend. DAILY is available only for RI_UTILIZATION and RI_COVERAGE budgets.
    */
  var TimeUnit: awsDashSdkLib.clientsBudgetsMod.BudgetsNs.TimeUnit
}

object Budget {
  @scala.inline
  def apply(
    BudgetName: BudgetName,
    BudgetType: BudgetType,
    TimeUnit: TimeUnit,
    BudgetLimit: Spend = null,
    CalculatedSpend: CalculatedSpend = null,
    CostFilters: CostFilters = null,
    CostTypes: CostTypes = null,
    LastUpdatedTime: GenericTimestamp = null,
    TimePeriod: TimePeriod = null
  ): Budget = {
    val __obj = js.Dynamic.literal(BudgetName = BudgetName, BudgetType = BudgetType.asInstanceOf[js.Any], TimeUnit = TimeUnit.asInstanceOf[js.Any])
    if (BudgetLimit != null) __obj.updateDynamic("BudgetLimit")(BudgetLimit)
    if (CalculatedSpend != null) __obj.updateDynamic("CalculatedSpend")(CalculatedSpend)
    if (CostFilters != null) __obj.updateDynamic("CostFilters")(CostFilters)
    if (CostTypes != null) __obj.updateDynamic("CostTypes")(CostTypes)
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime)
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod)
    __obj.asInstanceOf[Budget]
  }
}

