package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIpamPoolResult extends StObject {
  
  /**
    * The results of the modification.
    */
  var IpamPool: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamPool] = js.undefined
}
object ModifyIpamPoolResult {
  
  inline def apply(): ModifyIpamPoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyIpamPoolResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyIpamPoolResult] (val x: Self) extends AnyVal {
    
    inline def setIpamPool(value: IpamPool): Self = StObject.set(x, "IpamPool", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolUndefined: Self = StObject.set(x, "IpamPool", js.undefined)
  }
}
