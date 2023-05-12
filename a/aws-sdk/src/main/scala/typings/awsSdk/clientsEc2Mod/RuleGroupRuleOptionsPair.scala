package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleOptionsPair extends StObject {
  
  /**
    * The ARN of the rule group.
    */
  var RuleGroupArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The rule options.
    */
  var RuleOptions: js.UndefOr[RuleOptionList] = js.undefined
}
object RuleGroupRuleOptionsPair {
  
  inline def apply(): RuleGroupRuleOptionsPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleOptionsPair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleGroupRuleOptionsPair] (val x: Self) extends AnyVal {
    
    inline def setRuleGroupArn(value: ResourceArn): Self = StObject.set(x, "RuleGroupArn", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupArnUndefined: Self = StObject.set(x, "RuleGroupArn", js.undefined)
    
    inline def setRuleOptions(value: RuleOptionList): Self = StObject.set(x, "RuleOptions", value.asInstanceOf[js.Any])
    
    inline def setRuleOptionsUndefined: Self = StObject.set(x, "RuleOptions", js.undefined)
    
    inline def setRuleOptionsVarargs(value: RuleOption*): Self = StObject.set(x, "RuleOptions", js.Array(value*))
  }
}
