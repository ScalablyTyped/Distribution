package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionPublicIpv4PoolCidrResult extends StObject {
  
  /**
    * Information about the address range of the public IPv4 pool.
    */
  var PoolAddressRange: js.UndefOr[PublicIpv4PoolRange] = js.undefined
  
  /**
    * The ID of the pool that you want to provision the CIDR to.
    */
  var PoolId: js.UndefOr[Ipv4PoolEc2Id] = js.undefined
}
object ProvisionPublicIpv4PoolCidrResult {
  
  inline def apply(): ProvisionPublicIpv4PoolCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionPublicIpv4PoolCidrResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionPublicIpv4PoolCidrResult] (val x: Self) extends AnyVal {
    
    inline def setPoolAddressRange(value: PublicIpv4PoolRange): Self = StObject.set(x, "PoolAddressRange", value.asInstanceOf[js.Any])
    
    inline def setPoolAddressRangeUndefined: Self = StObject.set(x, "PoolAddressRange", js.undefined)
    
    inline def setPoolId(value: Ipv4PoolEc2Id): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
  }
}
