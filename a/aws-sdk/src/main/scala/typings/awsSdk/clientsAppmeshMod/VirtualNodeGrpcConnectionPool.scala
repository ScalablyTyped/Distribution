package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeGrpcConnectionPool extends StObject {
  
  /**
    * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster.
    */
  var maxRequests: MaxRequests
}
object VirtualNodeGrpcConnectionPool {
  
  inline def apply(maxRequests: MaxRequests): VirtualNodeGrpcConnectionPool = {
    val __obj = js.Dynamic.literal(maxRequests = maxRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeGrpcConnectionPool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualNodeGrpcConnectionPool] (val x: Self) extends AnyVal {
    
    inline def setMaxRequests(value: MaxRequests): Self = StObject.set(x, "maxRequests", value.asInstanceOf[js.Any])
  }
}
