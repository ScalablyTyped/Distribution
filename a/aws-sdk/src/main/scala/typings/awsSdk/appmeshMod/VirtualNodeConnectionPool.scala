package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeConnectionPool extends js.Object {
  
  /**
    * An object that represents a type of connection pool.
    */
  var grpc: js.UndefOr[VirtualNodeGrpcConnectionPool] = js.native
  
  /**
    * An object that represents a type of connection pool.
    */
  var http: js.UndefOr[VirtualNodeHttpConnectionPool] = js.native
  
  /**
    * An object that represents a type of connection pool.
    */
  var http2: js.UndefOr[VirtualNodeHttp2ConnectionPool] = js.native
  
  /**
    * An object that represents a type of connection pool.
    */
  var tcp: js.UndefOr[VirtualNodeTcpConnectionPool] = js.native
}
object VirtualNodeConnectionPool {
  
  @scala.inline
  def apply(): VirtualNodeConnectionPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeConnectionPool]
  }
  
  @scala.inline
  implicit class VirtualNodeConnectionPoolOps[Self <: VirtualNodeConnectionPool] (val x: Self) extends AnyVal {
    
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
    def setGrpc(value: VirtualNodeGrpcConnectionPool): Self = this.set("grpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrpc: Self = this.set("grpc", js.undefined)
    
    @scala.inline
    def setHttp(value: VirtualNodeHttpConnectionPool): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setHttp2(value: VirtualNodeHttp2ConnectionPool): Self = this.set("http2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp2: Self = this.set("http2", js.undefined)
    
    @scala.inline
    def setTcp(value: VirtualNodeTcpConnectionPool): Self = this.set("tcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcp: Self = this.set("tcp", js.undefined)
  }
}
