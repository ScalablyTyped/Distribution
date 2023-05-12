package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Receipt extends StObject {
  
  /**
    * The time when the message was delivered to the recipient.
    */
  var DeliveredTimestamp: js.UndefOr[Instant] = js.undefined
  
  /**
    * The time when the message was read by the recipient.
    */
  var ReadTimestamp: js.UndefOr[Instant] = js.undefined
  
  /**
    * The identifier of the recipient of the message. 
    */
  var RecipientParticipantId: js.UndefOr[ParticipantId] = js.undefined
}
object Receipt {
  
  inline def apply(): Receipt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Receipt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Receipt] (val x: Self) extends AnyVal {
    
    inline def setDeliveredTimestamp(value: Instant): Self = StObject.set(x, "DeliveredTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDeliveredTimestampUndefined: Self = StObject.set(x, "DeliveredTimestamp", js.undefined)
    
    inline def setReadTimestamp(value: Instant): Self = StObject.set(x, "ReadTimestamp", value.asInstanceOf[js.Any])
    
    inline def setReadTimestampUndefined: Self = StObject.set(x, "ReadTimestamp", js.undefined)
    
    inline def setRecipientParticipantId(value: ParticipantId): Self = StObject.set(x, "RecipientParticipantId", value.asInstanceOf[js.Any])
    
    inline def setRecipientParticipantIdUndefined: Self = StObject.set(x, "RecipientParticipantId", js.undefined)
  }
}
