package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIpamResult extends StObject {
  
  /**
    * Information about the results of the deletion.
    */
  var Ipam: js.UndefOr[typings.awsSdk.clientsEc2Mod.Ipam] = js.undefined
}
object DeleteIpamResult {
  
  inline def apply(): DeleteIpamResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIpamResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteIpamResult] (val x: Self) extends AnyVal {
    
    inline def setIpam(value: Ipam): Self = StObject.set(x, "Ipam", value.asInstanceOf[js.Any])
    
    inline def setIpamUndefined: Self = StObject.set(x, "Ipam", js.undefined)
  }
}
