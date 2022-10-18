package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResolverQueryLogConfigResponse extends StObject {
  
  /**
    * Information about the CreateResolverQueryLogConfig request, including the status of the request.
    */
  var ResolverQueryLogConfig: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverQueryLogConfig] = js.undefined
}
object CreateResolverQueryLogConfigResponse {
  
  inline def apply(): CreateResolverQueryLogConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResolverQueryLogConfigResponse]
  }
  
  extension [Self <: CreateResolverQueryLogConfigResponse](x: Self) {
    
    inline def setResolverQueryLogConfig(value: ResolverQueryLogConfig): Self = StObject.set(x, "ResolverQueryLogConfig", value.asInstanceOf[js.Any])
    
    inline def setResolverQueryLogConfigUndefined: Self = StObject.set(x, "ResolverQueryLogConfig", js.undefined)
  }
}
