package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisStreamsOutputUpdate extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the Amazon Kinesis stream where you want to write the output.
    */
  var ResourceARNUpdate: js.UndefOr[ResourceARN] = js.undefined
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
    */
  var RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
}

object KinesisStreamsOutputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN = null, RoleARNUpdate: RoleARN = null): KinesisStreamsOutputUpdate = {
    val __obj = js.Dynamic.literal()
    if (ResourceARNUpdate != null) __obj.updateDynamic("ResourceARNUpdate")(ResourceARNUpdate)
    if (RoleARNUpdate != null) __obj.updateDynamic("RoleARNUpdate")(RoleARNUpdate)
    __obj.asInstanceOf[KinesisStreamsOutputUpdate]
  }
}

