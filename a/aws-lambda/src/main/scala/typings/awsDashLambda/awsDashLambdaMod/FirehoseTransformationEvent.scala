package typings.awsDashLambda.awsDashLambdaMod

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
    val __obj = js.Dynamic.literal(deliveryStreamArn = deliveryStreamArn, invocationId = invocationId, records = records, region = region)
  
    __obj.asInstanceOf[FirehoseTransformationEvent]
  }
}

