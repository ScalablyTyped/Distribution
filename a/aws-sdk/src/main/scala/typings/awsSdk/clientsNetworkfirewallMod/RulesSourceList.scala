package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesSourceList extends StObject {
  
  /**
    * Whether you want to allow or deny access to the domains in your target list.
    */
  var GeneratedRulesType: typings.awsSdk.clientsNetworkfirewallMod.GeneratedRulesType
  
  /**
    * The protocols you want to inspect. Specify TLS_SNI for HTTPS. Specify HTTP_HOST for HTTP. You can specify either or both. 
    */
  var TargetTypes: typings.awsSdk.clientsNetworkfirewallMod.TargetTypes
  
  /**
    * The domains that you want to inspect for in your traffic flows. Valid domain specifications are the following:   Explicit names. For example, abc.example.com matches only the domain abc.example.com.   Names that use a domain wildcard, which you indicate with an initial '.'. For example,.example.com matches example.com and matches all subdomains of example.com, such as abc.example.com and www.example.com.   
    */
  var Targets: RuleTargets
}
object RulesSourceList {
  
  inline def apply(GeneratedRulesType: GeneratedRulesType, TargetTypes: TargetTypes, Targets: RuleTargets): RulesSourceList = {
    val __obj = js.Dynamic.literal(GeneratedRulesType = GeneratedRulesType.asInstanceOf[js.Any], TargetTypes = TargetTypes.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesSourceList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RulesSourceList] (val x: Self) extends AnyVal {
    
    inline def setGeneratedRulesType(value: GeneratedRulesType): Self = StObject.set(x, "GeneratedRulesType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypes(value: TargetTypes): Self = StObject.set(x, "TargetTypes", value.asInstanceOf[js.Any])
    
    inline def setTargetTypesVarargs(value: TargetType*): Self = StObject.set(x, "TargetTypes", js.Array(value*))
    
    inline def setTargets(value: RuleTargets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: CollectionMemberString*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
