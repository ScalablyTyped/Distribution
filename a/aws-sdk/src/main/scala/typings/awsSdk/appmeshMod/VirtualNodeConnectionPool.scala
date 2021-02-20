package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeConnectionPool extends StObject {
  
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
  implicit class VirtualNodeConnectionPoolMutableBuilder[Self <: VirtualNodeConnectionPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrpc(value: VirtualNodeGrpcConnectionPool): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
    
    @scala.inline
    def setHttp(value: VirtualNodeHttpConnectionPool): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2(value: VirtualNodeHttp2ConnectionPool): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
    
    @scala.inline
    def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    @scala.inline
    def setTcp(value: VirtualNodeTcpConnectionPool): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
  }
}
