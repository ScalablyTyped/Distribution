package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRulesResponse extends StObject {
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A list of readiness rules for a specific resource type.
    */
  var Rules: js.UndefOr[listOfListRulesOutput] = js.undefined
}
object ListRulesResponse {
  
  inline def apply(): ListRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRulesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRulesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRules(value: listOfListRulesOutput): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: ListRulesOutput*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
