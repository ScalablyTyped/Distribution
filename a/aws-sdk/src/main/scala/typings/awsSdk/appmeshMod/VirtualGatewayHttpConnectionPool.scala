package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayHttpConnectionPool extends js.Object {
  
  /**
    * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster.
    */
  var maxConnections: MaxConnections = js.native
  
  /**
    * Number of overflowing requests after max_connections Envoy will queue to upstream cluster.
    */
  var maxPendingRequests: js.UndefOr[MaxPendingRequests] = js.native
}
object VirtualGatewayHttpConnectionPool {
  
  @scala.inline
  def apply(maxConnections: MaxConnections): VirtualGatewayHttpConnectionPool = {
    val __obj = js.Dynamic.literal(maxConnections = maxConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayHttpConnectionPool]
  }
  
  @scala.inline
  implicit class VirtualGatewayHttpConnectionPoolOps[Self <: VirtualGatewayHttpConnectionPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxConnections(value: MaxConnections): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPendingRequests(value: MaxPendingRequests): Self = this.set("maxPendingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPendingRequests: Self = this.set("maxPendingRequests", js.undefined)
  }
}
