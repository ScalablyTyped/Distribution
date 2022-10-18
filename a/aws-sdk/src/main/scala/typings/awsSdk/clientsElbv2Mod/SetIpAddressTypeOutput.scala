package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIpAddressTypeOutput extends StObject {
  
  /**
    * The IP address type.
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.clientsElbv2Mod.IpAddressType] = js.undefined
}
object SetIpAddressTypeOutput {
  
  inline def apply(): SetIpAddressTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetIpAddressTypeOutput]
  }
  
  extension [Self <: SetIpAddressTypeOutput](x: Self) {
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
  }
}
