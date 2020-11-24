package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetsResponse extends js.Object {
  
  /**
    * A list of budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.budgetsMod.Budgets] = js.native
  
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object DescribeBudgetsResponse {
  
  @scala.inline
  def apply(): DescribeBudgetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetsResponse]
  }
  
  @scala.inline
  implicit class DescribeBudgetsResponseOps[Self <: DescribeBudgetsResponse] (val x: Self) extends AnyVal {
    
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
    def setBudgetsVarargs(value: Budget*): Self = this.set("Budgets", js.Array(value :_*))
    
    @scala.inline
    def setBudgets(value: Budgets): Self = this.set("Budgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudgets: Self = this.set("Budgets", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
