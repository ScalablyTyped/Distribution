package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsServersOptionsModifyStructure extends StObject {
  
  /**
    * The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS servers. Ensure that the DNS servers can be reached by the clients. The specified values overwrite the existing values.
    */
  var CustomDnsServers: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * Indicates whether DNS servers should be used. Specify False to delete the existing DNS servers.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object DnsServersOptionsModifyStructure {
  
  inline def apply(): DnsServersOptionsModifyStructure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsServersOptionsModifyStructure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DnsServersOptionsModifyStructure] (val x: Self) extends AnyVal {
    
    inline def setCustomDnsServers(value: ValueStringList): Self = StObject.set(x, "CustomDnsServers", value.asInstanceOf[js.Any])
    
    inline def setCustomDnsServersUndefined: Self = StObject.set(x, "CustomDnsServers", js.undefined)
    
    inline def setCustomDnsServersVarargs(value: String*): Self = StObject.set(x, "CustomDnsServers", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
