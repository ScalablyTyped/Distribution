package typings
package awsDashSdkLib.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * A map of the attributes requested in  ReceiveMessage  to their respective values. Supported attributes:    ApproximateReceiveCount     ApproximateFirstReceiveTimestamp     MessageDeduplicationId     MessageGroupId     SenderId     SentTimestamp     SequenceNumber     ApproximateFirstReceiveTimestamp and SentTimestamp are each returned as an integer representing the epoch time in milliseconds.
    */
  var Attributes: js.UndefOr[MessageSystemAttributeMap] = js.undefined
  /**
    * The message's contents (not URL-encoded).
    */
  var Body: js.UndefOr[String] = js.undefined
  /**
    * An MD5 digest of the non-URL-encoded message body string.
    */
  var MD5OfBody: js.UndefOr[String] = js.undefined
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.undefined
  /**
    * Each message attribute consists of a Name, Type, and Value. For more information, see Amazon SQS Message Attributes in the Amazon Simple Queue Service Developer Guide.
    */
  var MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined
  /**
    * A unique identifier for the message. A MessageIdis considered unique across all AWS accounts for an extended period of time.
    */
  var MessageId: js.UndefOr[String] = js.undefined
  /**
    * An identifier associated with the act of receiving the message. A new receipt handle is returned every time you receive a message. When deleting a message, you provide the last received receipt handle to delete the message.
    */
  var ReceiptHandle: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    Attributes: MessageSystemAttributeMap = null,
    Body: String = null,
    MD5OfBody: String = null,
    MD5OfMessageAttributes: String = null,
    MessageAttributes: MessageBodyAttributeMap = null,
    MessageId: String = null,
    ReceiptHandle: String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (MD5OfBody != null) __obj.updateDynamic("MD5OfBody")(MD5OfBody)
    if (MD5OfMessageAttributes != null) __obj.updateDynamic("MD5OfMessageAttributes")(MD5OfMessageAttributes)
    if (MessageAttributes != null) __obj.updateDynamic("MessageAttributes")(MessageAttributes)
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId)
    if (ReceiptHandle != null) __obj.updateDynamic("ReceiptHandle")(ReceiptHandle)
    __obj.asInstanceOf[Message]
  }
}

