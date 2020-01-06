package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsSqsQueueDetails extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of maxReceiveCount is exceeded. 
    */
  var DeadLetterTargetArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again.
    */
  var KmsDataKeyReusePeriodSeconds: js.UndefOr[Integer] = js.native
  /**
    * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK.
    */
  var KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the new queue.
    */
  var QueueName: js.UndefOr[NonEmptyString] = js.native
}

object AwsSqsQueueDetails {
  @scala.inline
  def apply(
    DeadLetterTargetArn: NonEmptyString = null,
    KmsDataKeyReusePeriodSeconds: Int | scala.Double = null,
    KmsMasterKeyId: NonEmptyString = null,
    QueueName: NonEmptyString = null
  ): AwsSqsQueueDetails = {
    val __obj = js.Dynamic.literal()
    if (DeadLetterTargetArn != null) __obj.updateDynamic("DeadLetterTargetArn")(DeadLetterTargetArn.asInstanceOf[js.Any])
    if (KmsDataKeyReusePeriodSeconds != null) __obj.updateDynamic("KmsDataKeyReusePeriodSeconds")(KmsDataKeyReusePeriodSeconds.asInstanceOf[js.Any])
    if (KmsMasterKeyId != null) __obj.updateDynamic("KmsMasterKeyId")(KmsMasterKeyId.asInstanceOf[js.Any])
    if (QueueName != null) __obj.updateDynamic("QueueName")(QueueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsSqsQueueDetails]
  }
}

