package typings.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var Address: String
  
  var Expire: Double
}
object Address {
  
  @scala.inline
  def apply(Address: String, Expire: Double): Address = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Expire = Expire.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpire(value: Double): Self = StObject.set(x, "Expire", value.asInstanceOf[js.Any])
  }
}
