package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayConnectionPool extends StObject {
  
  /**
    * An object that represents a type of connection pool. 
    */
  var grpc: js.UndefOr[VirtualGatewayGrpcConnectionPool] = js.undefined
  
  /**
    * An object that represents a type of connection pool.
    */
  var http: js.UndefOr[VirtualGatewayHttpConnectionPool] = js.undefined
  
  /**
    * An object that represents a type of connection pool.
    */
  var http2: js.UndefOr[VirtualGatewayHttp2ConnectionPool] = js.undefined
}
object VirtualGatewayConnectionPool {
  
  inline def apply(): VirtualGatewayConnectionPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayConnectionPool]
  }
  
  extension [Self <: VirtualGatewayConnectionPool](x: Self) {
    
    inline def setGrpc(value: VirtualGatewayGrpcConnectionPool): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
    
    inline def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
    
    inline def setHttp(value: VirtualGatewayHttpConnectionPool): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttp2(value: VirtualGatewayHttp2ConnectionPool): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
  }
}
