package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIpamResult extends StObject {
  
  /**
    * The results of the modification.
    */
  var Ipam: js.UndefOr[typings.awsSdk.clientsEc2Mod.Ipam] = js.undefined
}
object ModifyIpamResult {
  
  inline def apply(): ModifyIpamResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyIpamResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyIpamResult] (val x: Self) extends AnyVal {
    
    inline def setIpam(value: Ipam): Self = StObject.set(x, "Ipam", value.asInstanceOf[js.Any])
    
    inline def setIpamUndefined: Self = StObject.set(x, "Ipam", js.undefined)
  }
}
