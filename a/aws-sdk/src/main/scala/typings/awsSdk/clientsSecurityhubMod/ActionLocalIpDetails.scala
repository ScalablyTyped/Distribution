package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionLocalIpDetails extends StObject {
  
  /**
    * The IP address.
    */
  var IpAddressV4: js.UndefOr[NonEmptyString] = js.undefined
}
object ActionLocalIpDetails {
  
  inline def apply(): ActionLocalIpDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionLocalIpDetails]
  }
  
  extension [Self <: ActionLocalIpDetails](x: Self) {
    
    inline def setIpAddressV4(value: NonEmptyString): Self = StObject.set(x, "IpAddressV4", value.asInstanceOf[js.Any])
    
    inline def setIpAddressV4Undefined: Self = StObject.set(x, "IpAddressV4", js.undefined)
  }
}
