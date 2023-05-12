package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPositionEstimateRequest extends StObject {
  
  /**
    * Retrieves an estimated device position by resolving measurement data from cellular radio towers. The position is resolved using HERE's cellular-based solver.
    */
  var CellTowers: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.CellTowers] = js.undefined
  
  /**
    * Retrieves an estimated device position by resolving the global navigation satellite system (GNSS) scan data. The position is resolved using the GNSS solver powered by LoRa Cloud.
    */
  var Gnss: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Gnss] = js.undefined
  
  /**
    * Retrieves an estimated device position by resolving the IP address information from the device. The position is resolved using MaxMind's IP-based solver.
    */
  var Ip: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Ip] = js.undefined
  
  /**
    * Optional information that specifies the time when the position information will be resolved. It uses the Unix timestamp format. If not specified, the time at which the request was received will be used.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Retrieves an estimated device position by resolving WLAN measurement data. The position is resolved using HERE's Wi-Fi based solver.
    */
  var WiFiAccessPoints: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.WiFiAccessPoints] = js.undefined
}
object GetPositionEstimateRequest {
  
  inline def apply(): GetPositionEstimateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPositionEstimateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPositionEstimateRequest] (val x: Self) extends AnyVal {
    
    inline def setCellTowers(value: CellTowers): Self = StObject.set(x, "CellTowers", value.asInstanceOf[js.Any])
    
    inline def setCellTowersUndefined: Self = StObject.set(x, "CellTowers", js.undefined)
    
    inline def setGnss(value: Gnss): Self = StObject.set(x, "Gnss", value.asInstanceOf[js.Any])
    
    inline def setGnssUndefined: Self = StObject.set(x, "Gnss", js.undefined)
    
    inline def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "Ip", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    inline def setWiFiAccessPoints(value: WiFiAccessPoints): Self = StObject.set(x, "WiFiAccessPoints", value.asInstanceOf[js.Any])
    
    inline def setWiFiAccessPointsUndefined: Self = StObject.set(x, "WiFiAccessPoints", js.undefined)
    
    inline def setWiFiAccessPointsVarargs(value: WiFiAccessPoint*): Self = StObject.set(x, "WiFiAccessPoints", js.Array(value*))
  }
}
