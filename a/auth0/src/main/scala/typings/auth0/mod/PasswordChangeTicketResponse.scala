package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordChangeTicketResponse extends StObject {
  
  var ticket: String
}
object PasswordChangeTicketResponse {
  
  inline def apply(ticket: String): PasswordChangeTicketResponse = {
    val __obj = js.Dynamic.literal(ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordChangeTicketResponse]
  }
  
  extension [Self <: PasswordChangeTicketResponse](x: Self) {
    
    inline def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
  }
}
