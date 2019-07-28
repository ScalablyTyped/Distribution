package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisAction extends js.Object {
  /**
    * The partition key.
    */
  var partitionKey: js.UndefOr[PartitionKey] = js.undefined
  /**
    * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
    */
  var roleArn: AwsArn
  /**
    * The name of the Amazon Kinesis stream.
    */
  var streamName: StreamName
}

object KinesisAction {
  @scala.inline
  def apply(roleArn: AwsArn, streamName: StreamName, partitionKey: PartitionKey = null): KinesisAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, streamName = streamName)
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey)
    __obj.asInstanceOf[KinesisAction]
  }
}

