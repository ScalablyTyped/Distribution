package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkStatus extends StObject {
  
  /**
    * The status of Ethernet port 0.
    */
  var Ethernet0Status: js.UndefOr[EthernetStatus] = js.undefined
  
  /**
    * The status of Ethernet port 1.
    */
  var Ethernet1Status: js.UndefOr[EthernetStatus] = js.undefined
  
  /**
    * When the network status changed.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Details about a network time protocol (NTP) server connection.
    */
  var NtpStatus: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NtpStatus] = js.undefined
}
object NetworkStatus {
  
  inline def apply(): NetworkStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkStatus] (val x: Self) extends AnyVal {
    
    inline def setEthernet0Status(value: EthernetStatus): Self = StObject.set(x, "Ethernet0Status", value.asInstanceOf[js.Any])
    
    inline def setEthernet0StatusUndefined: Self = StObject.set(x, "Ethernet0Status", js.undefined)
    
    inline def setEthernet1Status(value: EthernetStatus): Self = StObject.set(x, "Ethernet1Status", value.asInstanceOf[js.Any])
    
    inline def setEthernet1StatusUndefined: Self = StObject.set(x, "Ethernet1Status", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setNtpStatus(value: NtpStatus): Self = StObject.set(x, "NtpStatus", value.asInstanceOf[js.Any])
    
    inline def setNtpStatusUndefined: Self = StObject.set(x, "NtpStatus", js.undefined)
  }
}
