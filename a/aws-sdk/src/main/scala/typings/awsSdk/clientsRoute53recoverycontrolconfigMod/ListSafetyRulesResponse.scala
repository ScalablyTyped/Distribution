package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSafetyRulesResponse extends StObject {
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[stringMin1Max8096PatternS] = js.undefined
  
  /**
    * The list of safety rules in a control panel.
    */
  var SafetyRules: js.UndefOr[listOfRule] = js.undefined
}
object ListSafetyRulesResponse {
  
  inline def apply(): ListSafetyRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSafetyRulesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSafetyRulesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: stringMin1Max8096PatternS): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSafetyRules(value: listOfRule): Self = StObject.set(x, "SafetyRules", value.asInstanceOf[js.Any])
    
    inline def setSafetyRulesUndefined: Self = StObject.set(x, "SafetyRules", js.undefined)
    
    inline def setSafetyRulesVarargs(value: Rule*): Self = StObject.set(x, "SafetyRules", js.Array(value*))
  }
}
