package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenTicketDetailOptions1
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var passId: String
}
object OpenTicketDetailOptions1 {
  
  inline def apply(passId: String): OpenTicketDetailOptions1 = {
    val __obj = js.Dynamic.literal(passId = passId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenTicketDetailOptions1]
  }
  
  extension [Self <: OpenTicketDetailOptions1](x: Self) {
    
    inline def setPassId(value: String): Self = StObject.set(x, "passId", value.asInstanceOf[js.Any])
  }
}
