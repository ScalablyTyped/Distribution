package typings
package awsDashSdkLib.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessageResult extends js.Object {
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.undefined
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageBody: js.UndefOr[String] = js.undefined
  /**
    * An attribute containing the MessageId of the message sent to the queue. For more information, see Queue and Message Identifiers in the Amazon Simple Queue Service Developer Guide. 
    */
  var MessageId: js.UndefOr[String] = js.undefined
  /**
    * This parameter applies only to FIFO (first-in-first-out) queues. The large, non-consecutive number that Amazon SQS assigns to each message. The length of SequenceNumber is 128 bits. SequenceNumber continues to increase for a particular MessageGroupId.
    */
  var SequenceNumber: js.UndefOr[String] = js.undefined
}

object SendMessageResult {
  @scala.inline
  def apply(
    MD5OfMessageAttributes: String = null,
    MD5OfMessageBody: String = null,
    MessageId: String = null,
    SequenceNumber: String = null
  ): SendMessageResult = {
    val __obj = js.Dynamic.literal()
    if (MD5OfMessageAttributes != null) __obj.updateDynamic("MD5OfMessageAttributes")(MD5OfMessageAttributes)
    if (MD5OfMessageBody != null) __obj.updateDynamic("MD5OfMessageBody")(MD5OfMessageBody)
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId)
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber)
    __obj.asInstanceOf[SendMessageResult]
  }
}

