package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprovisionByoipCidrRequest extends StObject {
  
  /**
    * The address range, in CIDR notation. The prefix must be the same prefix that you specified when you provisioned the address range.
    */
  var Cidr: GenericString
}
object DeprovisionByoipCidrRequest {
  
  inline def apply(Cidr: GenericString): DeprovisionByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprovisionByoipCidrRequest]
  }
  
  extension [Self <: DeprovisionByoipCidrRequest](x: Self) {
    
    inline def setCidr(value: GenericString): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
  }
}
