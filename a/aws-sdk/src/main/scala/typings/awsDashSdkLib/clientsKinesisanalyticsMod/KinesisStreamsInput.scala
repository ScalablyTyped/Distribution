package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisStreamsInput extends js.Object {
  /**
    * ARN of the input Amazon Kinesis stream to read.
    */
  var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsMod.ResourceARN
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
    */
  var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.RoleARN
}

object KinesisStreamsInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): KinesisStreamsInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, RoleARN = RoleARN)
  
    __obj.asInstanceOf[KinesisStreamsInput]
  }
}

