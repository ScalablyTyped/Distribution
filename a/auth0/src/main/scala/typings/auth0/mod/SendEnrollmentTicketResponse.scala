package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendEnrollmentTicketResponse extends StObject {
  
  var ticket_id: String
  
  var ticket_url: String
}
object SendEnrollmentTicketResponse {
  
  inline def apply(ticket_id: String, ticket_url: String): SendEnrollmentTicketResponse = {
    val __obj = js.Dynamic.literal(ticket_id = ticket_id.asInstanceOf[js.Any], ticket_url = ticket_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEnrollmentTicketResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendEnrollmentTicketResponse] (val x: Self) extends AnyVal {
    
    inline def setTicket_id(value: String): Self = StObject.set(x, "ticket_id", value.asInstanceOf[js.Any])
    
    inline def setTicket_url(value: String): Self = StObject.set(x, "ticket_url", value.asInstanceOf[js.Any])
  }
}
