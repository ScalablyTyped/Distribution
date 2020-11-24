package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listener extends js.Object {
  
  /**
    * The connection pool information for the listener.
    */
  var connectionPool: js.UndefOr[VirtualNodeConnectionPool] = js.native
  
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[HealthCheckPolicy] = js.native
  
  /**
    * The outlier detection information for the listener.
    */
  var outlierDetection: js.UndefOr[OutlierDetection] = js.native
  
  /**
    * The port mapping information for the listener.
    */
  var portMapping: PortMapping = js.native
  
  /**
    * An object that represents timeouts for different protocols.
    */
  var timeout: js.UndefOr[ListenerTimeout] = js.native
  
  /**
    * A reference to an object that represents the Transport Layer Security (TLS) properties for a listener.
    */
  var tls: js.UndefOr[ListenerTls] = js.native
}
object Listener {
  
  @scala.inline
  def apply(portMapping: PortMapping): Listener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  implicit class ListenerOps[Self <: Listener] (val x: Self) extends AnyVal {
    
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
    def setPortMapping(value: PortMapping): Self = this.set("portMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPool(value: VirtualNodeConnectionPool): Self = this.set("connectionPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionPool: Self = this.set("connectionPool", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: HealthCheckPolicy): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheck: Self = this.set("healthCheck", js.undefined)
    
    @scala.inline
    def setOutlierDetection(value: OutlierDetection): Self = this.set("outlierDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlierDetection: Self = this.set("outlierDetection", js.undefined)
    
    @scala.inline
    def setTimeout(value: ListenerTimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTls(value: ListenerTls): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
  }
}
