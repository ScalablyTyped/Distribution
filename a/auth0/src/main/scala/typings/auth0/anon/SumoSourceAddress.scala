package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SumoSourceAddress extends StObject {
  
  var sumoSourceAddress: String
}
object SumoSourceAddress {
  
  inline def apply(sumoSourceAddress: String): SumoSourceAddress = {
    val __obj = js.Dynamic.literal(sumoSourceAddress = sumoSourceAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SumoSourceAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SumoSourceAddress] (val x: Self) extends AnyVal {
    
    inline def setSumoSourceAddress(value: String): Self = StObject.set(x, "sumoSourceAddress", value.asInstanceOf[js.Any])
  }
}
