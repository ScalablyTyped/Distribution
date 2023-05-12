package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageMetadata extends StObject {
  
  /**
    * The identifier of the message that contains the metadata information. 
    */
  var MessageId: js.UndefOr[ChatItemId] = js.undefined
  
  /**
    * The list of receipt information for a message for different recipients.
    */
  var Receipts: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.Receipts] = js.undefined
}
object MessageMetadata {
  
  inline def apply(): MessageMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageMetadata] (val x: Self) extends AnyVal {
    
    inline def setMessageId(value: ChatItemId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    inline def setReceipts(value: Receipts): Self = StObject.set(x, "Receipts", value.asInstanceOf[js.Any])
    
    inline def setReceiptsUndefined: Self = StObject.set(x, "Receipts", js.undefined)
    
    inline def setReceiptsVarargs(value: Receipt*): Self = StObject.set(x, "Receipts", js.Array(value*))
  }
}
