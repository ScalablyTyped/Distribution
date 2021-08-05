package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeConnectionPool extends StObject {
  
  /**
    * An object that represents a type of connection pool.
    */
  var grpc: js.UndefOr[VirtualNodeGrpcConnectionPool] = js.undefined
  
  /**
    * An object that represents a type of connection pool.
    */
  var http: js.UndefOr[VirtualNodeHttpConnectionPool] = js.undefined
  
  /**
    * An object that represents a type of connection pool.
    */
  var http2: js.UndefOr[VirtualNodeHttp2ConnectionPool] = js.undefined
  
  /**
    * An object that represents a type of connection pool.
    */
  var tcp: js.UndefOr[VirtualNodeTcpConnectionPool] = js.undefined
}
object VirtualNodeConnectionPool {
  
  inline def apply(): VirtualNodeConnectionPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeConnectionPool]
  }
  
  extension [Self <: VirtualNodeConnectionPool](x: Self) {
    
    inline def setGrpc(value: VirtualNodeGrpcConnectionPool): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
    
    inline def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
    
    inline def setHttp(value: VirtualNodeHttpConnectionPool): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttp2(value: VirtualNodeHttp2ConnectionPool): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setTcp(value: VirtualNodeTcpConnectionPool): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
    
    inline def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
  }
}
