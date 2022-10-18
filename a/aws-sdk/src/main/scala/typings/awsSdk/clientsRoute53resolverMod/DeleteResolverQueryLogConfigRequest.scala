package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResolverQueryLogConfigRequest extends StObject {
  
  /**
    * The ID of the query logging configuration that you want to delete.
    */
  var ResolverQueryLogConfigId: ResourceId
}
object DeleteResolverQueryLogConfigRequest {
  
  inline def apply(ResolverQueryLogConfigId: ResourceId): DeleteResolverQueryLogConfigRequest = {
    val __obj = js.Dynamic.literal(ResolverQueryLogConfigId = ResolverQueryLogConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResolverQueryLogConfigRequest]
  }
  
  extension [Self <: DeleteResolverQueryLogConfigRequest](x: Self) {
    
    inline def setResolverQueryLogConfigId(value: ResourceId): Self = StObject.set(x, "ResolverQueryLogConfigId", value.asInstanceOf[js.Any])
  }
}
