package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverRuleAssociationResponse extends StObject {
  
  /**
    * Information about the Resolver rule association that you specified in a GetResolverRuleAssociation request.
    */
  var ResolverRuleAssociation: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverRuleAssociation] = js.undefined
}
object GetResolverRuleAssociationResponse {
  
  inline def apply(): GetResolverRuleAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRuleAssociationResponse]
  }
  
  extension [Self <: GetResolverRuleAssociationResponse](x: Self) {
    
    inline def setResolverRuleAssociation(value: ResolverRuleAssociation): Self = StObject.set(x, "ResolverRuleAssociation", value.asInstanceOf[js.Any])
    
    inline def setResolverRuleAssociationUndefined: Self = StObject.set(x, "ResolverRuleAssociation", js.undefined)
  }
}
