package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupTypePair extends StObject {
  
  /**
    * The ARN of the rule group.
    */
  var RuleGroupArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The rule group type. The possible values are Domain List and Suricata.
    */
  var RuleGroupType: js.UndefOr[String] = js.undefined
}
object RuleGroupTypePair {
  
  inline def apply(): RuleGroupTypePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupTypePair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleGroupTypePair] (val x: Self) extends AnyVal {
    
    inline def setRuleGroupArn(value: ResourceArn): Self = StObject.set(x, "RuleGroupArn", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupArnUndefined: Self = StObject.set(x, "RuleGroupArn", js.undefined)
    
    inline def setRuleGroupType(value: String): Self = StObject.set(x, "RuleGroupType", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupTypeUndefined: Self = StObject.set(x, "RuleGroupType", js.undefined)
  }
}
