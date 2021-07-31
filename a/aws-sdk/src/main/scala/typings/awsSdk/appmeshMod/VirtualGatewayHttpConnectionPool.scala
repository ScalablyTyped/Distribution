package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayHttpConnectionPool extends StObject {
  
  /**
    * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster.
    */
  var maxConnections: MaxConnections
  
  /**
    * Number of overflowing requests after max_connections Envoy will queue to upstream cluster.
    */
  var maxPendingRequests: js.UndefOr[MaxPendingRequests] = js.undefined
}
object VirtualGatewayHttpConnectionPool {
  
  @scala.inline
  def apply(maxConnections: MaxConnections): VirtualGatewayHttpConnectionPool = {
    val __obj = js.Dynamic.literal(maxConnections = maxConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayHttpConnectionPool]
  }
  
  @scala.inline
  implicit class VirtualGatewayHttpConnectionPoolMutableBuilder[Self <: VirtualGatewayHttpConnectionPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxConnections(value: MaxConnections): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPendingRequests(value: MaxPendingRequests): Self = StObject.set(x, "maxPendingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPendingRequestsUndefined: Self = StObject.set(x, "maxPendingRequests", js.undefined)
  }
}
