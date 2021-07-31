package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listener extends StObject {
  
  /**
    * The connection pool information for the listener.
    */
  var connectionPool: js.UndefOr[VirtualNodeConnectionPool] = js.undefined
  
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[HealthCheckPolicy] = js.undefined
  
  /**
    * The outlier detection information for the listener.
    */
  var outlierDetection: js.UndefOr[OutlierDetection] = js.undefined
  
  /**
    * The port mapping information for the listener.
    */
  var portMapping: PortMapping
  
  /**
    * An object that represents timeouts for different protocols.
    */
  var timeout: js.UndefOr[ListenerTimeout] = js.undefined
  
  /**
    * A reference to an object that represents the Transport Layer Security (TLS) properties for a listener.
    */
  var tls: js.UndefOr[ListenerTls] = js.undefined
}
object Listener {
  
  @scala.inline
  def apply(portMapping: PortMapping): Listener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  implicit class ListenerMutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionPool(value: VirtualNodeConnectionPool): Self = StObject.set(x, "connectionPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPoolUndefined: Self = StObject.set(x, "connectionPool", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: HealthCheckPolicy): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    @scala.inline
    def setOutlierDetection(value: OutlierDetection): Self = StObject.set(x, "outlierDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlierDetectionUndefined: Self = StObject.set(x, "outlierDetection", js.undefined)
    
    @scala.inline
    def setPortMapping(value: PortMapping): Self = StObject.set(x, "portMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: ListenerTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTls(value: ListenerTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
