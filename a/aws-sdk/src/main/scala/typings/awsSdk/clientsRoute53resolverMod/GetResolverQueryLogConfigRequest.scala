package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverQueryLogConfigRequest extends StObject {
  
  /**
    * The ID of the Resolver query logging configuration that you want to get information about.
    */
  var ResolverQueryLogConfigId: ResourceId
}
object GetResolverQueryLogConfigRequest {
  
  inline def apply(ResolverQueryLogConfigId: ResourceId): GetResolverQueryLogConfigRequest = {
    val __obj = js.Dynamic.literal(ResolverQueryLogConfigId = ResolverQueryLogConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverQueryLogConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResolverQueryLogConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setResolverQueryLogConfigId(value: ResourceId): Self = StObject.set(x, "ResolverQueryLogConfigId", value.asInstanceOf[js.Any])
  }
}
