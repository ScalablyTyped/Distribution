package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayConnectionPool extends js.Object {
  
  /**
    * An object that represents a type of connection pool. 
    */
  var grpc: js.UndefOr[VirtualGatewayGrpcConnectionPool] = js.native
  
  /**
    * An object that represents a type of connection pool.
    */
  var http: js.UndefOr[VirtualGatewayHttpConnectionPool] = js.native
  
  /**
    * An object that represents a type of connection pool.
    */
  var http2: js.UndefOr[VirtualGatewayHttp2ConnectionPool] = js.native
}
object VirtualGatewayConnectionPool {
  
  @scala.inline
  def apply(): VirtualGatewayConnectionPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayConnectionPool]
  }
  
  @scala.inline
  implicit class VirtualGatewayConnectionPoolOps[Self <: VirtualGatewayConnectionPool] (val x: Self) extends AnyVal {
    
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
    def setGrpc(value: VirtualGatewayGrpcConnectionPool): Self = this.set("grpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrpc: Self = this.set("grpc", js.undefined)
    
    @scala.inline
    def setHttp(value: VirtualGatewayHttpConnectionPool): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setHttp2(value: VirtualGatewayHttp2ConnectionPool): Self = this.set("http2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp2: Self = this.set("http2", js.undefined)
  }
}
