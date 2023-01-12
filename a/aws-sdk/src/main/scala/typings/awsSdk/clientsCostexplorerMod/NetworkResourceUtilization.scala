package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkResourceUtilization extends StObject {
  
  /**
    * The network inbound throughput utilization measured in Bytes per second (Bps). 
    */
  var NetworkInBytesPerSecond: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The network outbound throughput utilization measured in Bytes per second (Bps). 
    */
  var NetworkOutBytesPerSecond: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The network inbound packets that are measured in packets per second. 
    */
  var NetworkPacketsInPerSecond: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The network outbound packets that are measured in packets per second. 
    */
  var NetworkPacketsOutPerSecond: js.UndefOr[GenericString] = js.undefined
}
object NetworkResourceUtilization {
  
  inline def apply(): NetworkResourceUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkResourceUtilization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkResourceUtilization] (val x: Self) extends AnyVal {
    
    inline def setNetworkInBytesPerSecond(value: GenericString): Self = StObject.set(x, "NetworkInBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setNetworkInBytesPerSecondUndefined: Self = StObject.set(x, "NetworkInBytesPerSecond", js.undefined)
    
    inline def setNetworkOutBytesPerSecond(value: GenericString): Self = StObject.set(x, "NetworkOutBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setNetworkOutBytesPerSecondUndefined: Self = StObject.set(x, "NetworkOutBytesPerSecond", js.undefined)
    
    inline def setNetworkPacketsInPerSecond(value: GenericString): Self = StObject.set(x, "NetworkPacketsInPerSecond", value.asInstanceOf[js.Any])
    
    inline def setNetworkPacketsInPerSecondUndefined: Self = StObject.set(x, "NetworkPacketsInPerSecond", js.undefined)
    
    inline def setNetworkPacketsOutPerSecond(value: GenericString): Self = StObject.set(x, "NetworkPacketsOutPerSecond", value.asInstanceOf[js.Any])
    
    inline def setNetworkPacketsOutPerSecondUndefined: Self = StObject.set(x, "NetworkPacketsOutPerSecond", js.undefined)
  }
}
