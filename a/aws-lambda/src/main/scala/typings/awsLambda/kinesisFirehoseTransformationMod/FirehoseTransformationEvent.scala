package typings.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseTransformationEvent extends js.Object {
  var deliveryStreamArn: String
  var invocationId: String
  var records: js.Array[FirehoseTransformationEventRecord]
  var region: String
}

object FirehoseTransformationEvent {
  @scala.inline
  def apply(
    deliveryStreamArn: String,
    invocationId: String,
    records: js.Array[FirehoseTransformationEventRecord],
    region: String
  ): FirehoseTransformationEvent = {
    val __obj = js.Dynamic.literal(deliveryStreamArn = deliveryStreamArn.asInstanceOf[js.Any], invocationId = invocationId.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseTransformationEvent]
  }
}

