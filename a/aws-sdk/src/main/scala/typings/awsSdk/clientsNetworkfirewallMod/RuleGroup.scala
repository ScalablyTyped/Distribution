package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroup extends StObject {
  
  /**
    * The list of a rule group's reference sets.
    */
  var ReferenceSets: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.ReferenceSets] = js.undefined
  
  /**
    * Settings that are available for use in the rules in the rule group. You can only use these for stateful rule groups. 
    */
  var RuleVariables: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.RuleVariables] = js.undefined
  
  /**
    * The stateful rules or stateless rules for the rule group. 
    */
  var RulesSource: typings.awsSdk.clientsNetworkfirewallMod.RulesSource
  
  /**
    * Additional options governing how Network Firewall handles stateful rules. The policies where you use your stateful rule group must have stateful rule options settings that are compatible with these settings.
    */
  var StatefulRuleOptions: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.StatefulRuleOptions] = js.undefined
}
object RuleGroup {
  
  inline def apply(RulesSource: RulesSource): RuleGroup = {
    val __obj = js.Dynamic.literal(RulesSource = RulesSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroup]
  }
  
  extension [Self <: RuleGroup](x: Self) {
    
    inline def setReferenceSets(value: ReferenceSets): Self = StObject.set(x, "ReferenceSets", value.asInstanceOf[js.Any])
    
    inline def setReferenceSetsUndefined: Self = StObject.set(x, "ReferenceSets", js.undefined)
    
    inline def setRuleVariables(value: RuleVariables): Self = StObject.set(x, "RuleVariables", value.asInstanceOf[js.Any])
    
    inline def setRuleVariablesUndefined: Self = StObject.set(x, "RuleVariables", js.undefined)
    
    inline def setRulesSource(value: RulesSource): Self = StObject.set(x, "RulesSource", value.asInstanceOf[js.Any])
    
    inline def setStatefulRuleOptions(value: StatefulRuleOptions): Self = StObject.set(x, "StatefulRuleOptions", value.asInstanceOf[js.Any])
    
    inline def setStatefulRuleOptionsUndefined: Self = StObject.set(x, "StatefulRuleOptions", js.undefined)
  }
}
