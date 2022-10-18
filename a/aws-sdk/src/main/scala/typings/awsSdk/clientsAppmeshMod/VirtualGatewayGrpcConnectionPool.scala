package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayGrpcConnectionPool extends StObject {
  
  /**
    * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster.
    */
  var maxRequests: MaxRequests
}
object VirtualGatewayGrpcConnectionPool {
  
  inline def apply(maxRequests: MaxRequests): VirtualGatewayGrpcConnectionPool = {
    val __obj = js.Dynamic.literal(maxRequests = maxRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayGrpcConnectionPool]
  }
  
  extension [Self <: VirtualGatewayGrpcConnectionPool](x: Self) {
    
    inline def setMaxRequests(value: MaxRequests): Self = StObject.set(x, "maxRequests", value.asInstanceOf[js.Any])
  }
}
