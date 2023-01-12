package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentNetworkInfo extends StObject {
  
  /**
    * The IP address for the host where the agent/connector resides.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The MAC address for the host where the agent/connector resides.
    */
  var macAddress: js.UndefOr[String] = js.undefined
}
object AgentNetworkInfo {
  
  inline def apply(): AgentNetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentNetworkInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentNetworkInfo] (val x: Self) extends AnyVal {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
  }
}
