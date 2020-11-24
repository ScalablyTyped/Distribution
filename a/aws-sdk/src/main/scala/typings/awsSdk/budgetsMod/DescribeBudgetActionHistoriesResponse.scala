package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetActionHistoriesResponse extends js.Object {
  
  /**
    *  The historical record of the budget action resource. 
    */
  var ActionHistories: typings.awsSdk.budgetsMod.ActionHistories = js.native
  
  var NextToken: js.UndefOr[GenericString] = js.native
}
object DescribeBudgetActionHistoriesResponse {
  
  @scala.inline
  def apply(ActionHistories: ActionHistories): DescribeBudgetActionHistoriesResponse = {
    val __obj = js.Dynamic.literal(ActionHistories = ActionHistories.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionHistoriesResponse]
  }
  
  @scala.inline
  implicit class DescribeBudgetActionHistoriesResponseOps[Self <: DescribeBudgetActionHistoriesResponse] (val x: Self) extends AnyVal {
    
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
    def setActionHistoriesVarargs(value: ActionHistory*): Self = this.set("ActionHistories", js.Array(value :_*))
    
    @scala.inline
    def setActionHistories(value: ActionHistories): Self = this.set("ActionHistories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
