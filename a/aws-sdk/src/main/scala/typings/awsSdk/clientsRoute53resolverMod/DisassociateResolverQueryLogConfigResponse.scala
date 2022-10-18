package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateResolverQueryLogConfigResponse extends StObject {
  
  /**
    * A complex type that contains settings for the association that you deleted between an Amazon VPC and a query logging configuration.
    */
  var ResolverQueryLogConfigAssociation: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverQueryLogConfigAssociation] = js.undefined
}
object DisassociateResolverQueryLogConfigResponse {
  
  inline def apply(): DisassociateResolverQueryLogConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateResolverQueryLogConfigResponse]
  }
  
  extension [Self <: DisassociateResolverQueryLogConfigResponse](x: Self) {
    
    inline def setResolverQueryLogConfigAssociation(value: ResolverQueryLogConfigAssociation): Self = StObject.set(x, "ResolverQueryLogConfigAssociation", value.asInstanceOf[js.Any])
    
    inline def setResolverQueryLogConfigAssociationUndefined: Self = StObject.set(x, "ResolverQueryLogConfigAssociation", js.undefined)
  }
}
