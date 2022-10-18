package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishBatchRequestEntry extends StObject {
  
  /**
    * An identifier for the message in this batch.  The Ids of a batch request must be unique within a request.  This identifier can have up to 80 characters. The following characters are accepted: alphanumeric characters, hyphens(-), and underscores (_).  
    */
  var Id: String
  
  /**
    * The body of the message.
    */
  var Message: message
  
  /**
    * Each message attribute consists of a Name, Type, and Value. For more information, see Amazon SNS message attributes in the Amazon SNS Developer Guide.
    */
  var MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined
  
  /**
    * This parameter applies only to FIFO (first-in-first-out) topics. The token used for deduplication of messages within a 5-minute minimum deduplication interval. If a message with a particular MessageDeduplicationId is sent successfully, subsequent messages with the same MessageDeduplicationId are accepted successfully but aren't delivered.   Every message must have a unique MessageDeduplicationId.   You may provide a MessageDeduplicationId explicitly.   If you aren't able to provide a MessageDeduplicationId and you enable ContentBasedDeduplication for your topic, Amazon SNS uses a SHA-256 hash to generate the MessageDeduplicationId using the body of the message (but not the attributes of the message).   If you don't provide a MessageDeduplicationId and the topic doesn't have ContentBasedDeduplication set, the action fails with an error.   If the topic has a ContentBasedDeduplication set, your MessageDeduplicationId overrides the generated one.      When ContentBasedDeduplication is in effect, messages with identical content sent within the deduplication interval are treated as duplicates and only one copy of the message is delivered.   If you send one message with ContentBasedDeduplication enabled, and then another message with a MessageDeduplicationId that is the same as the one generated for the first MessageDeduplicationId, the two messages are treated as duplicates and only one copy of the message is delivered.     The MessageDeduplicationId is available to the consumer of the message (this can be useful for troubleshooting delivery issues). If a message is sent successfully but the acknowledgement is lost and the message is resent with the same MessageDeduplicationId after the deduplication interval, Amazon SNS can't detect duplicate messages.  Amazon SNS continues to keep track of the message deduplication ID even after the message is received and deleted.   The length of MessageDeduplicationId is 128 characters.  MessageDeduplicationId can contain alphanumeric characters (a-z, A-Z, 0-9) and punctuation (!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~).
    */
  var MessageDeduplicationId: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter applies only to FIFO (first-in-first-out) topics. The tag that specifies that a message belongs to a specific message group. Messages that belong to the same message group are processed in a FIFO manner (however, messages in different message groups might be processed out of order). To interleave multiple ordered streams within a single topic, use MessageGroupId values (for example, session data for multiple users). In this scenario, multiple consumers can process the topic, but the session data of each user is processed in a FIFO fashion.  You must associate a non-empty MessageGroupId with a message. If you don't provide a MessageGroupId, the action fails.  The length of MessageGroupId is 128 characters.  MessageGroupId can contain alphanumeric characters (a-z, A-Z, 0-9) and punctuation (!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~).   MessageGroupId is required for FIFO topics. You can't use it for standard topics.  
    */
  var MessageGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Set MessageStructure to json if you want to send a different message for each protocol. For example, using one publish action, you can send a short message to your SMS subscribers and a longer message to your email subscribers. If you set MessageStructure to json, the value of the Message parameter must:    be a syntactically valid JSON object; and   contain at least a top-level JSON key of "default" with a value that is a string.   You can define other top-level keys that define the message you want to send to a specific transport protocol (e.g. http). 
    */
  var MessageStructure: js.UndefOr[messageStructure] = js.undefined
  
  /**
    * The subject of the batch message.
    */
  var Subject: js.UndefOr[subject] = js.undefined
}
object PublishBatchRequestEntry {
  
  inline def apply(Id: String, Message: message): PublishBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishBatchRequestEntry]
  }
  
  extension [Self <: PublishBatchRequestEntry](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageAttributes(value: MessageAttributeMap): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
    
    inline def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
    
    inline def setMessageDeduplicationId(value: String): Self = StObject.set(x, "MessageDeduplicationId", value.asInstanceOf[js.Any])
    
    inline def setMessageDeduplicationIdUndefined: Self = StObject.set(x, "MessageDeduplicationId", js.undefined)
    
    inline def setMessageGroupId(value: String): Self = StObject.set(x, "MessageGroupId", value.asInstanceOf[js.Any])
    
    inline def setMessageGroupIdUndefined: Self = StObject.set(x, "MessageGroupId", js.undefined)
    
    inline def setMessageStructure(value: messageStructure): Self = StObject.set(x, "MessageStructure", value.asInstanceOf[js.Any])
    
    inline def setMessageStructureUndefined: Self = StObject.set(x, "MessageStructure", js.undefined)
    
    inline def setSubject(value: subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
  }
}
