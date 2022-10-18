package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectivityInfo extends StObject {
  
  /**
    * The IP address or DNS address where client devices can connect to an MQTT broker on the Greengrass core device.
    */
  var hostAddress: js.UndefOr[String] = js.undefined
  
  /**
    * An ID for the connectivity information.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Additional metadata to provide to client devices that connect to this core device.
    */
  var metadata: js.UndefOr[String] = js.undefined
  
  /**
    * The port where the MQTT broker operates on the core device. This port is typically 8883, which is the default port for the MQTT broker component that runs on core devices.
    */
  var portNumber: js.UndefOr[PortNumberInt] = js.undefined
}
object ConnectivityInfo {
  
  inline def apply(): ConnectivityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectivityInfo]
  }
  
  extension [Self <: ConnectivityInfo](x: Self) {
    
    inline def setHostAddress(value: String): Self = StObject.set(x, "hostAddress", value.asInstanceOf[js.Any])
    
    inline def setHostAddressUndefined: Self = StObject.set(x, "hostAddress", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPortNumber(value: PortNumberInt): Self = StObject.set(x, "portNumber", value.asInstanceOf[js.Any])
    
    inline def setPortNumberUndefined: Self = StObject.set(x, "portNumber", js.undefined)
  }
}
