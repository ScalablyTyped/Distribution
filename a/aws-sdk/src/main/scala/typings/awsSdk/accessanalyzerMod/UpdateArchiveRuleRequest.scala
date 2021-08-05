package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateArchiveRuleRequest extends StObject {
  
  /**
    * The name of the analyzer to update the archive rules for.
    */
  var analyzerName: Name
  
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A filter to match for the rules to update. Only rules that match the filter are updated.
    */
  var filter: FilterCriteriaMap
  
  /**
    * The name of the rule to update.
    */
  var ruleName: Name
}
object UpdateArchiveRuleRequest {
  
  inline def apply(analyzerName: Name, filter: FilterCriteriaMap, ruleName: Name): UpdateArchiveRuleRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateArchiveRuleRequest]
  }
  
  extension [Self <: UpdateArchiveRuleRequest](x: Self) {
    
    inline def setAnalyzerName(value: Name): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setFilter(value: FilterCriteriaMap): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: Name): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
