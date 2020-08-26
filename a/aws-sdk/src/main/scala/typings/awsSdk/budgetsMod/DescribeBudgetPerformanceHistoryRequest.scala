package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBudgetPerformanceHistoryRequest extends js.Object {
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
  var MaxResults: js.UndefOr[typings.awsSdk.budgetsMod.MaxResults] = js.native
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * Retrieves how often the budget went into an ALARM state for the specified time period.
    */
  var TimePeriod: js.UndefOr[typings.awsSdk.budgetsMod.TimePeriod] = js.native
}

object DescribeBudgetPerformanceHistoryRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DescribeBudgetPerformanceHistoryRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetPerformanceHistoryRequest]
  }
  @scala.inline
  implicit class DescribeBudgetPerformanceHistoryRequestOps[Self <: DescribeBudgetPerformanceHistoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBudgetName(value: BudgetName): Self = this.set("BudgetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTimePeriod(value: TimePeriod): Self = this.set("TimePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePeriod: Self = this.set("TimePeriod", js.undefined)
  }
  
}

