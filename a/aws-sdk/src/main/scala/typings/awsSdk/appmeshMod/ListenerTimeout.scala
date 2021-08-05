package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerTimeout extends StObject {
  
  var grpc: js.UndefOr[GrpcTimeout] = js.undefined
  
  /**
    * An object that represents types of timeouts. 
    */
  var http: js.UndefOr[HttpTimeout] = js.undefined
  
  /**
    * An object that represents types of timeouts. 
    */
  var http2: js.UndefOr[HttpTimeout] = js.undefined
  
  /**
    * An object that represents types of timeouts. 
    */
  var tcp: js.UndefOr[TcpTimeout] = js.undefined
}
object ListenerTimeout {
  
  inline def apply(): ListenerTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerTimeout]
  }
  
  extension [Self <: ListenerTimeout](x: Self) {
    
    inline def setGrpc(value: GrpcTimeout): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
    
    inline def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
    
    inline def setHttp(value: HttpTimeout): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttp2(value: HttpTimeout): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setTcp(value: TcpTimeout): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
    
    inline def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
  }
}
