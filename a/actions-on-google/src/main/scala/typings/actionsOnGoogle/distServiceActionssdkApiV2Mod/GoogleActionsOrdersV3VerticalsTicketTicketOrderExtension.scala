package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension extends StObject {
  
  /**
    * The event applied to all line item tickets.
    */
  var ticketEvent: js.UndefOr[GoogleActionsOrdersV3VerticalsTicketTicketEvent] = js.undefined
}
object GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension {
  
  inline def apply(): GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension] (val x: Self) extends AnyVal {
    
    inline def setTicketEvent(value: GoogleActionsOrdersV3VerticalsTicketTicketEvent): Self = StObject.set(x, "ticketEvent", value.asInstanceOf[js.Any])
    
    inline def setTicketEventUndefined: Self = StObject.set(x, "ticketEvent", js.undefined)
  }
}
