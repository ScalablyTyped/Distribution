package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishBatchResultEntry extends StObject {
  
  /**
    * The Id of an entry in a batch request.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * An identifier for the message.
    */
  var MessageId: js.UndefOr[messageId] = js.undefined
  
  /**
    * This parameter applies only to FIFO (first-in-first-out) topics. The large, non-consecutive number that Amazon SNS assigns to each message. The length of SequenceNumber is 128 bits. SequenceNumber continues to increase for a particular MessageGroupId.
    */
  var SequenceNumber: js.UndefOr[String] = js.undefined
}
object PublishBatchResultEntry {
  
  inline def apply(): PublishBatchResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishBatchResultEntry]
  }
  
  extension [Self <: PublishBatchResultEntry](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMessageId(value: messageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    inline def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
  }
}
