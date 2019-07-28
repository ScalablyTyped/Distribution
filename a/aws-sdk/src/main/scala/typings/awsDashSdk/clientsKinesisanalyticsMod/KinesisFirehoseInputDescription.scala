package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisFirehoseInputDescription extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the Amazon Kinesis Firehose delivery stream.
    */
  var ResourceARN: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.ResourceARN] = js.undefined
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics assumes to access the stream.
    */
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.RoleARN] = js.undefined
}

object KinesisFirehoseInputDescription {
  @scala.inline
  def apply(ResourceARN: ResourceARN = null, RoleARN: RoleARN = null): KinesisFirehoseInputDescription = {
    val __obj = js.Dynamic.literal()
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    __obj.asInstanceOf[KinesisFirehoseInputDescription]
  }
}

