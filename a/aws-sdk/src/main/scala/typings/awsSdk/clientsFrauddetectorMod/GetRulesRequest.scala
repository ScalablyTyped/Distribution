package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRulesRequest extends StObject {
  
  /**
    * The detector ID.
    */
  var detectorId: identifier
  
  /**
    * The maximum number of rules to return for the request.
    */
  var maxResults: js.UndefOr[RulesMaxResults] = js.undefined
  
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The rule ID.
    */
  var ruleId: js.UndefOr[identifier] = js.undefined
  
  /**
    * The rule version.
    */
  var ruleVersion: js.UndefOr[wholeNumberVersionString] = js.undefined
}
object GetRulesRequest {
  
  inline def apply(detectorId: identifier): GetRulesRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRulesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRulesRequest] (val x: Self) extends AnyVal {
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: RulesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRuleId(value: identifier): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
    
    inline def setRuleVersion(value: wholeNumberVersionString): Self = StObject.set(x, "ruleVersion", value.asInstanceOf[js.Any])
    
    inline def setRuleVersionUndefined: Self = StObject.set(x, "ruleVersion", js.undefined)
  }
}
