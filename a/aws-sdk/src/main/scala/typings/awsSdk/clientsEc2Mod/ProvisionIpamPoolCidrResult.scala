package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionIpamPoolCidrResult extends StObject {
  
  /**
    * Information about the provisioned CIDR.
    */
  var IpamPoolCidr: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamPoolCidr] = js.undefined
}
object ProvisionIpamPoolCidrResult {
  
  inline def apply(): ProvisionIpamPoolCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionIpamPoolCidrResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionIpamPoolCidrResult] (val x: Self) extends AnyVal {
    
    inline def setIpamPoolCidr(value: IpamPoolCidr): Self = StObject.set(x, "IpamPoolCidr", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolCidrUndefined: Self = StObject.set(x, "IpamPoolCidr", js.undefined)
  }
}
