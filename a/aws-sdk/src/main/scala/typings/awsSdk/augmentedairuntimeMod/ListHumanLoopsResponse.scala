package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHumanLoopsResponse extends js.Object {
  
  /**
    * An array of objects that contain information about the human loops.
    */
  var HumanLoopSummaries: typings.awsSdk.augmentedairuntimeMod.HumanLoopSummaries = js.native
  
  /**
    * A token to display the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.NextToken] = js.native
}
object ListHumanLoopsResponse {
  
  @scala.inline
  def apply(HumanLoopSummaries: HumanLoopSummaries): ListHumanLoopsResponse = {
    val __obj = js.Dynamic.literal(HumanLoopSummaries = HumanLoopSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanLoopsResponse]
  }
  
  @scala.inline
  implicit class ListHumanLoopsResponseOps[Self <: ListHumanLoopsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHumanLoopSummariesVarargs(value: HumanLoopSummary*): Self = this.set("HumanLoopSummaries", js.Array(value :_*))
    
    @scala.inline
    def setHumanLoopSummaries(value: HumanLoopSummaries): Self = this.set("HumanLoopSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
