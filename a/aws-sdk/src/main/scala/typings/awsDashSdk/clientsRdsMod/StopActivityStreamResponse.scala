package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopActivityStreamResponse extends js.Object {
  /**
    * The name of the Amazon Kinesis data stream used for the database activity stream.
    */
  var KinesisStreamName: js.UndefOr[String] = js.native
  /**
    * The AWS KMS key identifier used for encrypting messages in the database activity stream.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The status of the database activity stream.
    */
  var Status: js.UndefOr[ActivityStreamStatus] = js.native
}

object StopActivityStreamResponse {
  @scala.inline
  def apply(KinesisStreamName: String = null, KmsKeyId: String = null, Status: ActivityStreamStatus = null): StopActivityStreamResponse = {
    val __obj = js.Dynamic.literal()
    if (KinesisStreamName != null) __obj.updateDynamic("KinesisStreamName")(KinesisStreamName.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopActivityStreamResponse]
  }
}

