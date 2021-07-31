package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeHttpConnectionPool extends StObject {
  
  /**
    * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster.
    */
  var maxConnections: MaxConnections
  
  /**
    * Number of overflowing requests after max_connections Envoy will queue to upstream cluster.
    */
  var maxPendingRequests: js.UndefOr[MaxPendingRequests] = js.undefined
}
object VirtualNodeHttpConnectionPool {
  
  @scala.inline
  def apply(maxConnections: MaxConnections): VirtualNodeHttpConnectionPool = {
    val __obj = js.Dynamic.literal(maxConnections = maxConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeHttpConnectionPool]
  }
  
  @scala.inline
  implicit class VirtualNodeHttpConnectionPoolMutableBuilder[Self <: VirtualNodeHttpConnectionPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxConnections(value: MaxConnections): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPendingRequests(value: MaxPendingRequests): Self = StObject.set(x, "maxPendingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPendingRequestsUndefined: Self = StObject.set(x, "maxPendingRequests", js.undefined)
  }
}
