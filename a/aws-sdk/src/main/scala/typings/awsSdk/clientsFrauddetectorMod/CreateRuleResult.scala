package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleResult extends StObject {
  
  /**
    * The created rule.
    */
  var rule: js.UndefOr[Rule] = js.undefined
}
object CreateRuleResult {
  
  inline def apply(): CreateRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRuleResult] (val x: Self) extends AnyVal {
    
    inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
