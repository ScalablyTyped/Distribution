package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WiFiAccessPoint extends StObject {
  
  /**
    * Wi-Fi MAC Address.
    */
  var MacAddress: typings.awsSdk.clientsIotwirelessMod.MacAddress
  
  /**
    * Received signal strength (dBm) of the WLAN measurement data.
    */
  var Rss: RSS
}
object WiFiAccessPoint {
  
  inline def apply(MacAddress: MacAddress, Rss: RSS): WiFiAccessPoint = {
    val __obj = js.Dynamic.literal(MacAddress = MacAddress.asInstanceOf[js.Any], Rss = Rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiAccessPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WiFiAccessPoint] (val x: Self) extends AnyVal {
    
    inline def setMacAddress(value: MacAddress): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    inline def setRss(value: RSS): Self = StObject.set(x, "Rss", value.asInstanceOf[js.Any])
  }
}
