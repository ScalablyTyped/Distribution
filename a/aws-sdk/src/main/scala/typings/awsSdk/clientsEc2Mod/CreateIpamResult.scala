package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIpamResult extends StObject {
  
  /**
    * Information about the IPAM created.
    */
  var Ipam: js.UndefOr[typings.awsSdk.clientsEc2Mod.Ipam] = js.undefined
}
object CreateIpamResult {
  
  inline def apply(): CreateIpamResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIpamResult]
  }
  
  extension [Self <: CreateIpamResult](x: Self) {
    
    inline def setIpam(value: Ipam): Self = StObject.set(x, "Ipam", value.asInstanceOf[js.Any])
    
    inline def setIpamUndefined: Self = StObject.set(x, "Ipam", js.undefined)
  }
}
