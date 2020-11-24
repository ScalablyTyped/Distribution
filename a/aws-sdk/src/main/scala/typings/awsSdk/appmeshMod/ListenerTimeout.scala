package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerTimeout extends js.Object {
  
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
  implicit class ListenerTimeoutOps[Self <: ListenerTimeout] (val x: Self) extends AnyVal {
    
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
    def setGrpc(value: GrpcTimeout): Self = this.set("grpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrpc: Self = this.set("grpc", js.undefined)
    
    @scala.inline
    def setHttp(value: HttpTimeout): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setHttp2(value: HttpTimeout): Self = this.set("http2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp2: Self = this.set("http2", js.undefined)
    
    @scala.inline
    def setTcp(value: TcpTimeout): Self = this.set("tcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcp: Self = this.set("tcp", js.undefined)
  }
}
