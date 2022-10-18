package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResolverRuleResponse extends StObject {
  
  /**
    * Information about the AssociateResolverRule request, including the status of the request.
    */
  var ResolverRuleAssociation: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverRuleAssociation] = js.undefined
}
object AssociateResolverRuleResponse {
  
  inline def apply(): AssociateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResolverRuleResponse]
  }
  
  extension [Self <: AssociateResolverRuleResponse](x: Self) {
    
    inline def setResolverRuleAssociation(value: ResolverRuleAssociation): Self = StObject.set(x, "ResolverRuleAssociation", value.asInstanceOf[js.Any])
    
    inline def setResolverRuleAssociationUndefined: Self = StObject.set(x, "ResolverRuleAssociation", js.undefined)
  }
}
