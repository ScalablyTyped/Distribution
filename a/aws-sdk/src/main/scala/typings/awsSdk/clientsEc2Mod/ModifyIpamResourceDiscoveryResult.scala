package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIpamResourceDiscoveryResult extends StObject {
  
  /**
    * A resource discovery.
    */
  var IpamResourceDiscovery: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamResourceDiscovery] = js.undefined
}
object ModifyIpamResourceDiscoveryResult {
  
  inline def apply(): ModifyIpamResourceDiscoveryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyIpamResourceDiscoveryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyIpamResourceDiscoveryResult] (val x: Self) extends AnyVal {
    
    inline def setIpamResourceDiscovery(value: IpamResourceDiscovery): Self = StObject.set(x, "IpamResourceDiscovery", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryUndefined: Self = StObject.set(x, "IpamResourceDiscovery", js.undefined)
  }
}
