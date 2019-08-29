package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessageBatchResultEntry extends js.Object {
  /**
    * An identifier for the message in this batch.
    */
  var Id: String
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.undefined
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageBody: String
  /**
    * An MD5 digest of the non-URL-encoded message system attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageSystemAttributes: js.UndefOr[String] = js.undefined
  /**
    * An identifier for the message.
    */
  var MessageId: String
  /**
    * This parameter applies only to FIFO (first-in-first-out) queues. The large, non-consecutive number that Amazon SQS assigns to each message. The length of SequenceNumber is 128 bits. As SequenceNumber continues to increase for a particular MessageGroupId.
    */
  var SequenceNumber: js.UndefOr[String] = js.undefined
}

object SendMessageBatchResultEntry {
  @scala.inline
  def apply(
    Id: String,
    MD5OfMessageBody: String,
    MessageId: String,
    MD5OfMessageAttributes: String = null,
    MD5OfMessageSystemAttributes: String = null,
    SequenceNumber: String = null
  ): SendMessageBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id, MD5OfMessageBody = MD5OfMessageBody, MessageId = MessageId)
    if (MD5OfMessageAttributes != null) __obj.updateDynamic("MD5OfMessageAttributes")(MD5OfMessageAttributes)
    if (MD5OfMessageSystemAttributes != null) __obj.updateDynamic("MD5OfMessageSystemAttributes")(MD5OfMessageSystemAttributes)
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber)
    __obj.asInstanceOf[SendMessageBatchResultEntry]
  }
}

