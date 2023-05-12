package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalDetail extends StObject {
  
  /**
    * The additional detail code.
    */
  var AdditionalDetailType: js.UndefOr[String] = js.undefined
  
  /**
    * The path component.
    */
  var Component: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The load balancers.
    */
  var LoadBalancers: js.UndefOr[AnalysisComponentList] = js.undefined
  
  /**
    * The rule options.
    */
  var RuleGroupRuleOptionsPairs: js.UndefOr[RuleGroupRuleOptionsPairList] = js.undefined
  
  /**
    * The rule group type.
    */
  var RuleGroupTypePairs: js.UndefOr[RuleGroupTypePairList] = js.undefined
  
  /**
    * The rule options.
    */
  var RuleOptions: js.UndefOr[RuleOptionList] = js.undefined
  
  /**
    * The name of the VPC endpoint service.
    */
  var ServiceName: js.UndefOr[String] = js.undefined
  
  /**
    * The VPC endpoint service.
    */
  var VpcEndpointService: js.UndefOr[AnalysisComponent] = js.undefined
}
object AdditionalDetail {
  
  inline def apply(): AdditionalDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalDetail] (val x: Self) extends AnyVal {
    
    inline def setAdditionalDetailType(value: String): Self = StObject.set(x, "AdditionalDetailType", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDetailTypeUndefined: Self = StObject.set(x, "AdditionalDetailType", js.undefined)
    
    inline def setComponent(value: AnalysisComponent): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setLoadBalancers(value: AnalysisComponentList): Self = StObject.set(x, "LoadBalancers", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancersUndefined: Self = StObject.set(x, "LoadBalancers", js.undefined)
    
    inline def setLoadBalancersVarargs(value: AnalysisComponent*): Self = StObject.set(x, "LoadBalancers", js.Array(value*))
    
    inline def setRuleGroupRuleOptionsPairs(value: RuleGroupRuleOptionsPairList): Self = StObject.set(x, "RuleGroupRuleOptionsPairs", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupRuleOptionsPairsUndefined: Self = StObject.set(x, "RuleGroupRuleOptionsPairs", js.undefined)
    
    inline def setRuleGroupRuleOptionsPairsVarargs(value: RuleGroupRuleOptionsPair*): Self = StObject.set(x, "RuleGroupRuleOptionsPairs", js.Array(value*))
    
    inline def setRuleGroupTypePairs(value: RuleGroupTypePairList): Self = StObject.set(x, "RuleGroupTypePairs", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupTypePairsUndefined: Self = StObject.set(x, "RuleGroupTypePairs", js.undefined)
    
    inline def setRuleGroupTypePairsVarargs(value: RuleGroupTypePair*): Self = StObject.set(x, "RuleGroupTypePairs", js.Array(value*))
    
    inline def setRuleOptions(value: RuleOptionList): Self = StObject.set(x, "RuleOptions", value.asInstanceOf[js.Any])
    
    inline def setRuleOptionsUndefined: Self = StObject.set(x, "RuleOptions", js.undefined)
    
    inline def setRuleOptionsVarargs(value: RuleOption*): Self = StObject.set(x, "RuleOptions", js.Array(value*))
    
    inline def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setVpcEndpointService(value: AnalysisComponent): Self = StObject.set(x, "VpcEndpointService", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointServiceUndefined: Self = StObject.set(x, "VpcEndpointService", js.undefined)
  }
}
