package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReadinessCheckResourceStatusResponse extends StObject {
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The readiness at a rule level.
    */
  var Readiness: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.Readiness] = js.undefined
  
  /**
    * Details of the rule's results.
    */
  var Rules: js.UndefOr[listOfRuleResult] = js.undefined
}
object GetReadinessCheckResourceStatusResponse {
  
  inline def apply(): GetReadinessCheckResourceStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReadinessCheckResourceStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReadinessCheckResourceStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReadiness(value: Readiness): Self = StObject.set(x, "Readiness", value.asInstanceOf[js.Any])
    
    inline def setReadinessUndefined: Self = StObject.set(x, "Readiness", js.undefined)
    
    inline def setRules(value: listOfRuleResult): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: RuleResult*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
