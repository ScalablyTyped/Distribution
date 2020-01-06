package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageResult extends js.Object {
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.native
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageBody: js.UndefOr[String] = js.native
  /**
    * An MD5 digest of the non-URL-encoded message system attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest.
    */
  var MD5OfMessageSystemAttributes: js.UndefOr[String] = js.native
  /**
    * An attribute containing the MessageId of the message sent to the queue. For more information, see Queue and Message Identifiers in the Amazon Simple Queue Service Developer Guide. 
    */
  var MessageId: js.UndefOr[String] = js.native
  /**
    * This parameter applies only to FIFO (first-in-first-out) queues. The large, non-consecutive number that Amazon SQS assigns to each message. The length of SequenceNumber is 128 bits. SequenceNumber continues to increase for a particular MessageGroupId.
    */
  var SequenceNumber: js.UndefOr[String] = js.native
}

object SendMessageResult {
  @scala.inline
  def apply(
    MD5OfMessageAttributes: String = null,
    MD5OfMessageBody: String = null,
    MD5OfMessageSystemAttributes: String = null,
    MessageId: String = null,
    SequenceNumber: String = null
  ): SendMessageResult = {
    val __obj = js.Dynamic.literal()
    if (MD5OfMessageAttributes != null) __obj.updateDynamic("MD5OfMessageAttributes")(MD5OfMessageAttributes.asInstanceOf[js.Any])
    if (MD5OfMessageBody != null) __obj.updateDynamic("MD5OfMessageBody")(MD5OfMessageBody.asInstanceOf[js.Any])
    if (MD5OfMessageSystemAttributes != null) __obj.updateDynamic("MD5OfMessageSystemAttributes")(MD5OfMessageSystemAttributes.asInstanceOf[js.Any])
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId.asInstanceOf[js.Any])
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageResult]
  }
}

