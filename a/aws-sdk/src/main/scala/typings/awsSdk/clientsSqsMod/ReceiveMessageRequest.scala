package typings.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiveMessageRequest extends StObject {
  
  /**
    * A list of attributes that need to be returned along with each message. These attributes include:    All – Returns all values.    ApproximateFirstReceiveTimestamp – Returns the time the message was first received from the queue (epoch time in milliseconds).    ApproximateReceiveCount – Returns the number of times a message has been received across all queues but not deleted.    AWSTraceHeader – Returns the X-Ray trace header string.     SenderId    For an IAM user, returns the IAM user ID, for example ABCDEFGHI1JKLMNOPQ23R.   For an IAM role, returns the IAM role ID, for example ABCDE1F2GH3I4JK5LMNOP:i-a123b456.      SentTimestamp – Returns the time the message was sent to the queue (epoch time in milliseconds).    SqsManagedSseEnabled – Enables server-side queue encryption using SQS owned encryption keys. Only one server-side encryption option is supported per queue (e.g. SSE-KMS or SSE-SQS).    MessageDeduplicationId – Returns the value provided by the producer that calls the  SendMessage  action.    MessageGroupId – Returns the value provided by the producer that calls the  SendMessage  action. Messages with the same MessageGroupId are returned in sequence.    SequenceNumber – Returns the value provided by Amazon SQS.  
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
  
  /**
    * The maximum number of messages to return. Amazon SQS never returns more messages than this value (however, fewer messages might be returned). Valid values: 1 to 10. Default: 1.
    */
  var MaxNumberOfMessages: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the message attribute, where N is the index.   The name can contain alphanumeric characters and the underscore (_), hyphen (-), and period (.).   The name is case-sensitive and must be unique among all attribute names for the message.   The name must not start with AWS-reserved prefixes such as AWS. or Amazon. (or any casing variants).   The name must not start or end with a period (.), and it should not have periods in succession (..).   The name can be up to 256 characters long.   When using ReceiveMessage, you can send a list of attribute names to receive, or you can return all of the attributes by specifying All or .* in your request. You can also use all message attributes starting with a prefix, for example bar.*.
    */
  var MessageAttributeNames: js.UndefOr[MessageAttributeNameList] = js.undefined
  
  /**
    * The URL of the Amazon SQS queue from which messages are received. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
  
  /**
    * This parameter applies only to FIFO (first-in-first-out) queues. The token used for deduplication of ReceiveMessage calls. If a networking issue occurs after a ReceiveMessage action, and instead of a response you receive a generic error, it is possible to retry the same action with an identical ReceiveRequestAttemptId to retrieve the same set of messages, even if their visibility timeout has not yet expired.   You can use ReceiveRequestAttemptId only for 5 minutes after a ReceiveMessage action.   When you set FifoQueue, a caller of the ReceiveMessage action can provide a ReceiveRequestAttemptId explicitly.   If a caller of the ReceiveMessage action doesn't provide a ReceiveRequestAttemptId, Amazon SQS generates a ReceiveRequestAttemptId.   It is possible to retry the ReceiveMessage action with the same ReceiveRequestAttemptId if none of the messages have been modified (deleted or had their visibility changes).   During a visibility timeout, subsequent calls with the same ReceiveRequestAttemptId return the same messages and receipt handles. If a retry occurs within the deduplication interval, it resets the visibility timeout. For more information, see Visibility Timeout in the Amazon SQS Developer Guide.  If a caller of the ReceiveMessage action still processes messages when the visibility timeout expires and messages become visible, another worker consuming from the same queue can receive the same messages and therefore process duplicates. Also, if a consumer whose message processing time is longer than the visibility timeout tries to delete the processed messages, the action fails with an error. To mitigate this effect, ensure that your application observes a safe threshold before the visibility timeout expires and extend the visibility timeout as necessary.    While messages with a particular MessageGroupId are invisible, no more messages belonging to the same MessageGroupId are returned until the visibility timeout expires. You can still receive messages with another MessageGroupId as long as it is also visible.   If a caller of ReceiveMessage can't track the ReceiveRequestAttemptId, no retries work until the original visibility timeout expires. As a result, delays might occur but the messages in the queue remain in a strict order.   The maximum length of ReceiveRequestAttemptId is 128 characters. ReceiveRequestAttemptId can contain alphanumeric characters (a-z, A-Z, 0-9) and punctuation (!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~). For best practices of using ReceiveRequestAttemptId, see Using the ReceiveRequestAttemptId Request Parameter in the Amazon SQS Developer Guide.
    */
  var ReceiveRequestAttemptId: js.UndefOr[String] = js.undefined
  
  /**
    * The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after being retrieved by a ReceiveMessage request.
    */
  var VisibilityTimeout: js.UndefOr[Integer] = js.undefined
  
  /**
    * The duration (in seconds) for which the call waits for a message to arrive in the queue before returning. If a message is available, the call returns sooner than WaitTimeSeconds. If no messages are available and the wait time expires, the call returns successfully with an empty list of messages.  To avoid HTTP errors, ensure that the HTTP response timeout for ReceiveMessage requests is longer than the WaitTimeSeconds parameter. For example, with the Java SDK, you can set HTTP transport settings using the  NettyNioAsyncHttpClient for asynchronous clients, or the  ApacheHttpClient for synchronous clients.  
    */
  var WaitTimeSeconds: js.UndefOr[Integer] = js.undefined
}
object ReceiveMessageRequest {
  
  inline def apply(QueueUrl: String): ReceiveMessageRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveMessageRequest]
  }
  
  extension [Self <: ReceiveMessageRequest](x: Self) {
    
    inline def setAttributeNames(value: AttributeNameList): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamesUndefined: Self = StObject.set(x, "AttributeNames", js.undefined)
    
    inline def setAttributeNamesVarargs(value: QueueAttributeName*): Self = StObject.set(x, "AttributeNames", js.Array(value*))
    
    inline def setMaxNumberOfMessages(value: Integer): Self = StObject.set(x, "MaxNumberOfMessages", value.asInstanceOf[js.Any])
    
    inline def setMaxNumberOfMessagesUndefined: Self = StObject.set(x, "MaxNumberOfMessages", js.undefined)
    
    inline def setMessageAttributeNames(value: MessageAttributeNameList): Self = StObject.set(x, "MessageAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setMessageAttributeNamesUndefined: Self = StObject.set(x, "MessageAttributeNames", js.undefined)
    
    inline def setMessageAttributeNamesVarargs(value: MessageAttributeName*): Self = StObject.set(x, "MessageAttributeNames", js.Array(value*))
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setReceiveRequestAttemptId(value: String): Self = StObject.set(x, "ReceiveRequestAttemptId", value.asInstanceOf[js.Any])
    
    inline def setReceiveRequestAttemptIdUndefined: Self = StObject.set(x, "ReceiveRequestAttemptId", js.undefined)
    
    inline def setVisibilityTimeout(value: Integer): Self = StObject.set(x, "VisibilityTimeout", value.asInstanceOf[js.Any])
    
    inline def setVisibilityTimeoutUndefined: Self = StObject.set(x, "VisibilityTimeout", js.undefined)
    
    inline def setWaitTimeSeconds(value: Integer): Self = StObject.set(x, "WaitTimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setWaitTimeSecondsUndefined: Self = StObject.set(x, "WaitTimeSeconds", js.undefined)
  }
}
