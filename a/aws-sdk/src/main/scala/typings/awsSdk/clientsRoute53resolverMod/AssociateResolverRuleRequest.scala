package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResolverRuleRequest extends StObject {
  
  /**
    * A name for the association that you're creating between a Resolver rule and a VPC.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Name] = js.undefined
  
  /**
    * The ID of the Resolver rule that you want to associate with the VPC. To list the existing Resolver rules, use ListResolverRules.
    */
  var ResolverRuleId: ResourceId
  
  /**
    * The ID of the VPC that you want to associate the Resolver rule with.
    */
  var VPCId: ResourceId
}
object AssociateResolverRuleRequest {
  
  inline def apply(ResolverRuleId: ResourceId, VPCId: ResourceId): AssociateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any], VPCId = VPCId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResolverRuleRequest]
  }
  
  extension [Self <: AssociateResolverRuleRequest](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResolverRuleId(value: ResourceId): Self = StObject.set(x, "ResolverRuleId", value.asInstanceOf[js.Any])
    
    inline def setVPCId(value: ResourceId): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
  }
}
