package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeHttp2ConnectionPool extends StObject {
  
  /**
    * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster.
    */
  var maxRequests: MaxRequests = js.native
}
object VirtualNodeHttp2ConnectionPool {
  
  @scala.inline
  def apply(maxRequests: MaxRequests): VirtualNodeHttp2ConnectionPool = {
    val __obj = js.Dynamic.literal(maxRequests = maxRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeHttp2ConnectionPool]
  }
  
  @scala.inline
  implicit class VirtualNodeHttp2ConnectionPoolMutableBuilder[Self <: VirtualNodeHttp2ConnectionPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxRequests(value: MaxRequests): Self = StObject.set(x, "maxRequests", value.asInstanceOf[js.Any])
  }
}
