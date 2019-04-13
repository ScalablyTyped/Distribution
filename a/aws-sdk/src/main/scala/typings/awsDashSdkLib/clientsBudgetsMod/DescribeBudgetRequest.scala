package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want a description of.
    */
  var AccountId: awsDashSdkLib.clientsBudgetsMod.AccountId
  /**
    * The name of the budget that you want a description of.
    */
  var BudgetName: awsDashSdkLib.clientsBudgetsMod.BudgetName
}

object DescribeBudgetRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DescribeBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BudgetName = BudgetName)
  
    __obj.asInstanceOf[DescribeBudgetRequest]
  }
}

