package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateArchiveRuleRequest extends StObject {
  
  /**
    * The name of the created analyzer.
    */
  var analyzerName: Name = js.native
  
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * The criteria for the rule.
    */
  var filter: FilterCriteriaMap = js.native
  
  /**
    * The name of the rule to create.
    */
  var ruleName: Name = js.native
}
object CreateArchiveRuleRequest {
  
  @scala.inline
  def apply(analyzerName: Name, filter: FilterCriteriaMap, ruleName: Name): CreateArchiveRuleRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateArchiveRuleRequest]
  }
  
  @scala.inline
  implicit class CreateArchiveRuleRequestMutableBuilder[Self <: CreateArchiveRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzerName(value: Name): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterCriteriaMap): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleName(value: Name): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
