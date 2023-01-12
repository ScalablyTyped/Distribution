package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NtpPayload extends StObject {
  
  /**
    * NTP servers to use, in order of preference.
    */
  var NtpServers: NtpServerList
}
object NtpPayload {
  
  inline def apply(NtpServers: NtpServerList): NtpPayload = {
    val __obj = js.Dynamic.literal(NtpServers = NtpServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NtpPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NtpPayload] (val x: Self) extends AnyVal {
    
    inline def setNtpServers(value: NtpServerList): Self = StObject.set(x, "NtpServers", value.asInstanceOf[js.Any])
    
    inline def setNtpServersVarargs(value: IpAddressOrServerName*): Self = StObject.set(x, "NtpServers", js.Array(value*))
  }
}
