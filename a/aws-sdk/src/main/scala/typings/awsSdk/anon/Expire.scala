package typings.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expire extends StObject {
  
  var Address: String
  
  var Expire: Double
}
object Expire {
  
  inline def apply(Address: String, Expire: Double): Expire = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Expire = Expire.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expire]
  }
  
  extension [Self <: Expire](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setExpire(value: Double): Self = StObject.set(x, "Expire", value.asInstanceOf[js.Any])
  }
}
