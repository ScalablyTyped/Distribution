package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisFirehoseInput extends js.Object {
  /**
    * ARN of the input delivery stream.
    */
  var ResourceARN: typings.awsDashSdk.clientsKinesisanalyticsMod.ResourceARN
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to make sure that the role has the necessary permissions to access the stream.
    */
  var RoleARN: typings.awsDashSdk.clientsKinesisanalyticsMod.RoleARN
}

object KinesisFirehoseInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): KinesisFirehoseInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, RoleARN = RoleARN)
  
    __obj.asInstanceOf[KinesisFirehoseInput]
  }
}

