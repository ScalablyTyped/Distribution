package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverQueryLogConfigAssociationRequest extends StObject {
  
  /**
    * The ID of the Resolver query logging configuration association that you want to get information about.
    */
  var ResolverQueryLogConfigAssociationId: ResourceId
}
object GetResolverQueryLogConfigAssociationRequest {
  
  inline def apply(ResolverQueryLogConfigAssociationId: ResourceId): GetResolverQueryLogConfigAssociationRequest = {
    val __obj = js.Dynamic.literal(ResolverQueryLogConfigAssociationId = ResolverQueryLogConfigAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverQueryLogConfigAssociationRequest]
  }
  
  extension [Self <: GetResolverQueryLogConfigAssociationRequest](x: Self) {
    
    inline def setResolverQueryLogConfigAssociationId(value: ResourceId): Self = StObject.set(x, "ResolverQueryLogConfigAssociationId", value.asInstanceOf[js.Any])
  }
}
