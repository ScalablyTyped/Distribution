package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkPayload extends StObject {
  
  /**
    * Settings for Ethernet port 0.
    */
  var Ethernet0: js.UndefOr[EthernetPayload] = js.undefined
  
  /**
    * Settings for Ethernet port 1.
    */
  var Ethernet1: js.UndefOr[EthernetPayload] = js.undefined
  
  /**
    * Network time protocol (NTP) server settings.
    */
  var Ntp: js.UndefOr[NtpPayload] = js.undefined
}
object NetworkPayload {
  
  inline def apply(): NetworkPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPayload]
  }
  
  extension [Self <: NetworkPayload](x: Self) {
    
    inline def setEthernet0(value: EthernetPayload): Self = StObject.set(x, "Ethernet0", value.asInstanceOf[js.Any])
    
    inline def setEthernet0Undefined: Self = StObject.set(x, "Ethernet0", js.undefined)
    
    inline def setEthernet1(value: EthernetPayload): Self = StObject.set(x, "Ethernet1", value.asInstanceOf[js.Any])
    
    inline def setEthernet1Undefined: Self = StObject.set(x, "Ethernet1", js.undefined)
    
    inline def setNtp(value: NtpPayload): Self = StObject.set(x, "Ntp", value.asInstanceOf[js.Any])
    
    inline def setNtpUndefined: Self = StObject.set(x, "Ntp", js.undefined)
  }
}
