package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayHttp2ConnectionPool extends StObject {
  
  /**
    * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster.
    */
  var maxRequests: MaxRequests
}
object VirtualGatewayHttp2ConnectionPool {
  
  inline def apply(maxRequests: MaxRequests): VirtualGatewayHttp2ConnectionPool = {
    val __obj = js.Dynamic.literal(maxRequests = maxRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayHttp2ConnectionPool]
  }
  
  extension [Self <: VirtualGatewayHttp2ConnectionPool](x: Self) {
    
    inline def setMaxRequests(value: MaxRequests): Self = StObject.set(x, "maxRequests", value.asInstanceOf[js.Any])
  }
}
