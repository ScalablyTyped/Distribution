package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayConnectionPool extends StObject {
  
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
  implicit class VirtualGatewayConnectionPoolMutableBuilder[Self <: VirtualGatewayConnectionPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrpc(value: VirtualGatewayGrpcConnectionPool): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
    
    @scala.inline
    def setHttp(value: VirtualGatewayHttpConnectionPool): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2(value: VirtualGatewayHttp2ConnectionPool): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
    
    @scala.inline
    def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
  }
}
