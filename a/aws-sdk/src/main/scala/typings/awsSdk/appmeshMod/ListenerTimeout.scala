package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerTimeout extends StObject {
  
  var grpc: js.UndefOr[GrpcTimeout] = js.native
  
  /**
    * An object that represents types of timeouts. 
    */
  var http: js.UndefOr[HttpTimeout] = js.native
  
  /**
    * An object that represents types of timeouts. 
    */
  var http2: js.UndefOr[HttpTimeout] = js.native
  
  /**
    * An object that represents types of timeouts. 
    */
  var tcp: js.UndefOr[TcpTimeout] = js.native
}
object ListenerTimeout {
  
  @scala.inline
  def apply(): ListenerTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerTimeout]
  }
  
  @scala.inline
  implicit class ListenerTimeoutMutableBuilder[Self <: ListenerTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrpc(value: GrpcTimeout): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
    
    @scala.inline
    def setHttp(value: HttpTimeout): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2(value: HttpTimeout): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
    
    @scala.inline
    def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    @scala.inline
    def setTcp(value: TcpTimeout): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
  }
}
