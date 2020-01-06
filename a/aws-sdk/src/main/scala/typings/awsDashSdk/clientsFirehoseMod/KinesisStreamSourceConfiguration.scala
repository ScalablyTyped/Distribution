package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamSourceConfiguration extends js.Object {
  /**
    * The ARN of the source Kinesis data stream. For more information, see Amazon Kinesis Data Streams ARN Format.
    */
  var KinesisStreamARN: typings.awsDashSdk.clientsFirehoseMod.KinesisStreamARN = js.native
  /**
    * The ARN of the role that provides access to the source Kinesis data stream. For more information, see AWS Identity and Access Management (IAM) ARN Format.
    */
  var RoleARN: typings.awsDashSdk.clientsFirehoseMod.RoleARN = js.native
}

object KinesisStreamSourceConfiguration {
  @scala.inline
  def apply(KinesisStreamARN: KinesisStreamARN, RoleARN: RoleARN): KinesisStreamSourceConfiguration = {
    val __obj = js.Dynamic.literal(KinesisStreamARN = KinesisStreamARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinesisStreamSourceConfiguration]
  }
}

