package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithdrawByoipCidrRequest extends StObject {
  
  /**
    * The address range, in CIDR notation.
    */
  var Cidr: GenericString
}
object WithdrawByoipCidrRequest {
  
  inline def apply(Cidr: GenericString): WithdrawByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithdrawByoipCidrRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WithdrawByoipCidrRequest] (val x: Self) extends AnyVal {
    
    inline def setCidr(value: GenericString): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
  }
}
