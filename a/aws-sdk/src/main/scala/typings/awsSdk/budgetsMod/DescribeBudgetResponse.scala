package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetResponse extends js.Object {
  
  /**
    * The description of the budget.
    */
  var Budget: js.UndefOr[typings.awsSdk.budgetsMod.Budget] = js.native
}
object DescribeBudgetResponse {
  
  @scala.inline
  def apply(): DescribeBudgetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetResponse]
  }
  
  @scala.inline
  implicit class DescribeBudgetResponseOps[Self <: DescribeBudgetResponse] (val x: Self) extends AnyVal {
    
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
    def setBudget(value: Budget): Self = this.set("Budget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudget: Self = this.set("Budget", js.undefined)
  }
}
