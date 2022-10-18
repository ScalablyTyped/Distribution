package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprovisionIpamPoolCidrResult extends StObject {
  
  /**
    * The deprovisioned pool CIDR.
    */
  var IpamPoolCidr: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamPoolCidr] = js.undefined
}
object DeprovisionIpamPoolCidrResult {
  
  inline def apply(): DeprovisionIpamPoolCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprovisionIpamPoolCidrResult]
  }
  
  extension [Self <: DeprovisionIpamPoolCidrResult](x: Self) {
    
    inline def setIpamPoolCidr(value: IpamPoolCidr): Self = StObject.set(x, "IpamPoolCidr", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolCidrUndefined: Self = StObject.set(x, "IpamPoolCidr", js.undefined)
  }
}
