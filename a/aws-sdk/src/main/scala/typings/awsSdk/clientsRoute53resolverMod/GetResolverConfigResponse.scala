package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverConfigResponse extends StObject {
  
  /**
    * Information about the behavior configuration of Route 53 Resolver behavior for the VPC you specified in the GetResolverConfig request.
    */
  var ResolverConfig: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverConfig] = js.undefined
}
object GetResolverConfigResponse {
  
  inline def apply(): GetResolverConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverConfigResponse]
  }
  
  extension [Self <: GetResolverConfigResponse](x: Self) {
    
    inline def setResolverConfig(value: ResolverConfig): Self = StObject.set(x, "ResolverConfig", value.asInstanceOf[js.Any])
    
    inline def setResolverConfigUndefined: Self = StObject.set(x, "ResolverConfig", js.undefined)
  }
}
