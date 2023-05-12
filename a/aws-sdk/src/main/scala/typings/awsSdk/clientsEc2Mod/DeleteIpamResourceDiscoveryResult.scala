package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIpamResourceDiscoveryResult extends StObject {
  
  /**
    * The IPAM resource discovery.
    */
  var IpamResourceDiscovery: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamResourceDiscovery] = js.undefined
}
object DeleteIpamResourceDiscoveryResult {
  
  inline def apply(): DeleteIpamResourceDiscoveryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIpamResourceDiscoveryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteIpamResourceDiscoveryResult] (val x: Self) extends AnyVal {
    
    inline def setIpamResourceDiscovery(value: IpamResourceDiscovery): Self = StObject.set(x, "IpamResourceDiscovery", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryUndefined: Self = StObject.set(x, "IpamResourceDiscovery", js.undefined)
  }
}
