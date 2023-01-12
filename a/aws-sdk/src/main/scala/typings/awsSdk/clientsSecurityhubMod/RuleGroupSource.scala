package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSource extends StObject {
  
  /**
    * Stateful inspection criteria for a domain list rule group. A domain list rule group determines access by specific protocols to specific domains.
    */
  var RulesSourceList: js.UndefOr[RuleGroupSourceListDetails] = js.undefined
  
  /**
    * Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules.
    */
  var RulesString: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Suricata rule specifications.
    */
  var StatefulRules: js.UndefOr[RuleGroupSourceStatefulRulesList] = js.undefined
  
  /**
    * The stateless rules and custom actions used by a stateless rule group.
    */
  var StatelessRulesAndCustomActions: js.UndefOr[RuleGroupSourceStatelessRulesAndCustomActionsDetails] = js.undefined
}
object RuleGroupSource {
  
  inline def apply(): RuleGroupSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleGroupSource] (val x: Self) extends AnyVal {
    
    inline def setRulesSourceList(value: RuleGroupSourceListDetails): Self = StObject.set(x, "RulesSourceList", value.asInstanceOf[js.Any])
    
    inline def setRulesSourceListUndefined: Self = StObject.set(x, "RulesSourceList", js.undefined)
    
    inline def setRulesString(value: NonEmptyString): Self = StObject.set(x, "RulesString", value.asInstanceOf[js.Any])
    
    inline def setRulesStringUndefined: Self = StObject.set(x, "RulesString", js.undefined)
    
    inline def setStatefulRules(value: RuleGroupSourceStatefulRulesList): Self = StObject.set(x, "StatefulRules", value.asInstanceOf[js.Any])
    
    inline def setStatefulRulesUndefined: Self = StObject.set(x, "StatefulRules", js.undefined)
    
    inline def setStatefulRulesVarargs(value: RuleGroupSourceStatefulRulesDetails*): Self = StObject.set(x, "StatefulRules", js.Array(value*))
    
    inline def setStatelessRulesAndCustomActions(value: RuleGroupSourceStatelessRulesAndCustomActionsDetails): Self = StObject.set(x, "StatelessRulesAndCustomActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessRulesAndCustomActionsUndefined: Self = StObject.set(x, "StatelessRulesAndCustomActions", js.undefined)
  }
}
