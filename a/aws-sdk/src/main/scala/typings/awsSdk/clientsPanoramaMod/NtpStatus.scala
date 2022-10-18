package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NtpStatus extends StObject {
  
  /**
    * The connection's status.
    */
  var ConnectionStatus: js.UndefOr[NetworkConnectionStatus] = js.undefined
  
  /**
    * The IP address of the server.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.clientsPanoramaMod.IpAddress] = js.undefined
  
  /**
    * The domain name of the server.
    */
  var NtpServerName: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NtpServerName] = js.undefined
}
object NtpStatus {
  
  inline def apply(): NtpStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NtpStatus]
  }
  
  extension [Self <: NtpStatus](x: Self) {
    
    inline def setConnectionStatus(value: NetworkConnectionStatus): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setNtpServerName(value: NtpServerName): Self = StObject.set(x, "NtpServerName", value.asInstanceOf[js.Any])
    
    inline def setNtpServerNameUndefined: Self = StObject.set(x, "NtpServerName", js.undefined)
  }
}
