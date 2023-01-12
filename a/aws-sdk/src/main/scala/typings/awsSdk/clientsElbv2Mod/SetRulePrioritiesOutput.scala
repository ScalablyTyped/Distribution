package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRulePrioritiesOutput extends StObject {
  
  /**
    * Information about the rules.
    */
  var Rules: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Rules] = js.undefined
}
object SetRulePrioritiesOutput {
  
  inline def apply(): SetRulePrioritiesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetRulePrioritiesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetRulePrioritiesOutput] (val x: Self) extends AnyVal {
    
    inline def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
