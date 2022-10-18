package typings.awsSdk.clientsAppmeshMod

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
  
  inline def apply(portMapping: VirtualGatewayPortMapping): VirtualGatewayListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayListener]
  }
  
  extension [Self <: VirtualGatewayListener](x: Self) {
    
    inline def setConnectionPool(value: VirtualGatewayConnectionPool): Self = StObject.set(x, "connectionPool", value.asInstanceOf[js.Any])
    
    inline def setConnectionPoolUndefined: Self = StObject.set(x, "connectionPool", js.undefined)
    
    inline def setHealthCheck(value: VirtualGatewayHealthCheckPolicy): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    inline def setPortMapping(value: VirtualGatewayPortMapping): Self = StObject.set(x, "portMapping", value.asInstanceOf[js.Any])
    
    inline def setTls(value: VirtualGatewayListenerTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
