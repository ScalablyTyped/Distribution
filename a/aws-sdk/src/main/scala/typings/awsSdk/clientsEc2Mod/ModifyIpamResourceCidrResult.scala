package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIpamResourceCidrResult extends StObject {
  
  /**
    * The CIDR of the resource.
    */
  var IpamResourceCidr: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamResourceCidr] = js.undefined
}
object ModifyIpamResourceCidrResult {
  
  inline def apply(): ModifyIpamResourceCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyIpamResourceCidrResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyIpamResourceCidrResult] (val x: Self) extends AnyVal {
    
    inline def setIpamResourceCidr(value: IpamResourceCidr): Self = StObject.set(x, "IpamResourceCidr", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceCidrUndefined: Self = StObject.set(x, "IpamResourceCidr", js.undefined)
  }
}
