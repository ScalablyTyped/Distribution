package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisStreamsOutput extends js.Object {
  /**
    * ARN of the destination Amazon Kinesis stream to write to.
    */
  var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsMod.ResourceARN
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination stream on your behalf. You need to grant the necessary permissions to this role.
    */
  var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.RoleARN
}

object KinesisStreamsOutput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): KinesisStreamsOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, RoleARN = RoleARN)
  
    __obj.asInstanceOf[KinesisStreamsOutput]
  }
}

