package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateArchiveRuleRequest extends js.Object {
  
  /**
    * The name of the analyzer to update the archive rules for.
    */
  var analyzerName: Name = js.native
  
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * A filter to match for the rules to update. Only rules that match the filter are updated.
    */
  var filter: FilterCriteriaMap = js.native
  
  /**
    * The name of the rule to update.
    */
  var ruleName: Name = js.native
}
object UpdateArchiveRuleRequest {
  
  @scala.inline
  def apply(analyzerName: Name, filter: FilterCriteriaMap, ruleName: Name): UpdateArchiveRuleRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateArchiveRuleRequest]
  }
  
  @scala.inline
  implicit class UpdateArchiveRuleRequestOps[Self <: UpdateArchiveRuleRequest] (val x: Self) extends AnyVal {
    
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
    def setAnalyzerName(value: Name): Self = this.set("analyzerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: FilterCriteriaMap): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleName(value: Name): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
  }
}
