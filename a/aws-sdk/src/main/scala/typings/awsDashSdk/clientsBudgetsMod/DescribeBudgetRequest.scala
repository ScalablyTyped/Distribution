package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want a description of.
    */
  var AccountId: typings.awsDashSdk.clientsBudgetsMod.AccountId
  /**
    * The name of the budget that you want a description of.
    */
  var BudgetName: typings.awsDashSdk.clientsBudgetsMod.BudgetName
}

object DescribeBudgetRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DescribeBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BudgetName = BudgetName)
  
    __obj.asInstanceOf[DescribeBudgetRequest]
  }
}

