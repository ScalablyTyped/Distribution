package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayGrpcConnectionPool extends StObject {
  
  /**
    * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster.
    */
  var maxRequests: MaxRequests = js.native
}
object VirtualGatewayGrpcConnectionPool {
  
  @scala.inline
  def apply(maxRequests: MaxRequests): VirtualGatewayGrpcConnectionPool = {
    val __obj = js.Dynamic.literal(maxRequests = maxRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayGrpcConnectionPool]
  }
  
  @scala.inline
  implicit class VirtualGatewayGrpcConnectionPoolMutableBuilder[Self <: VirtualGatewayGrpcConnectionPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxRequests(value: MaxRequests): Self = StObject.set(x, "maxRequests", value.asInstanceOf[js.Any])
  }
}
