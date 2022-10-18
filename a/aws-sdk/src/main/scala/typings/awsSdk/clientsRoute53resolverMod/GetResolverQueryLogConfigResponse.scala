package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverQueryLogConfigResponse extends StObject {
  
  /**
    * Information about the Resolver query logging configuration that you specified in a GetQueryLogConfig request.
    */
  var ResolverQueryLogConfig: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverQueryLogConfig] = js.undefined
}
object GetResolverQueryLogConfigResponse {
  
  inline def apply(): GetResolverQueryLogConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverQueryLogConfigResponse]
  }
  
  extension [Self <: GetResolverQueryLogConfigResponse](x: Self) {
    
    inline def setResolverQueryLogConfig(value: ResolverQueryLogConfig): Self = StObject.set(x, "ResolverQueryLogConfig", value.asInstanceOf[js.Any])
    
    inline def setResolverQueryLogConfigUndefined: Self = StObject.set(x, "ResolverQueryLogConfig", js.undefined)
  }
}
