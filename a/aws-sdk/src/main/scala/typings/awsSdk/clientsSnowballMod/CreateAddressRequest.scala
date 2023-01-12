package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAddressRequest extends StObject {
  
  /**
    * The address that you want the Snow device shipped to.
    */
  var Address: typings.awsSdk.clientsSnowballMod.Address
}
object CreateAddressRequest {
  
  inline def apply(Address: Address): CreateAddressRequest = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAddressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAddressRequest] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
  }
}
