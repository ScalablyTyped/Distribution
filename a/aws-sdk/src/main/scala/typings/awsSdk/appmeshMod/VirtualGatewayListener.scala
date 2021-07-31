package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayListener extends StObject {
  
  /**
    * The connection pool information for the virtual gateway listener.
    */
  var connectionPool: js.UndefOr[VirtualGatewayConnectionPool] = js.undefined
  
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[VirtualGatewayHealthCheckPolicy] = js.undefined
  
  /**
    * The port mapping information for the listener.
    */
  var portMapping: VirtualGatewayPortMapping
  
  /**
    * A reference to an object that represents the Transport Layer Security (TLS) properties for the listener.
    */
  var tls: js.UndefOr[VirtualGatewayListenerTls] = js.undefined
}
object VirtualGatewayListener {
  
  @scala.inline
  def apply(portMapping: VirtualGatewayPortMapping): VirtualGatewayListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayListener]
  }
  
  @scala.inline
  implicit class VirtualGatewayListenerMutableBuilder[Self <: VirtualGatewayListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionPool(value: VirtualGatewayConnectionPool): Self = StObject.set(x, "connectionPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPoolUndefined: Self = StObject.set(x, "connectionPool", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: VirtualGatewayHealthCheckPolicy): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    @scala.inline
    def setPortMapping(value: VirtualGatewayPortMapping): Self = StObject.set(x, "portMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls(value: VirtualGatewayListenerTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
