package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseTransformationEvent extends js.Object {
  var deliveryStreamArn: java.lang.String
  var invocationId: java.lang.String
  var records: js.Array[FirehoseTransformationEventRecord]
  var region: java.lang.String
}

object FirehoseTransformationEvent {
  @scala.inline
  def apply(
    deliveryStreamArn: java.lang.String,
    invocationId: java.lang.String,
    records: js.Array[FirehoseTransformationEventRecord],
    region: java.lang.String
  ): FirehoseTransformationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deliveryStreamArn")(deliveryStreamArn)
    __obj.updateDynamic("invocationId")(invocationId)
    __obj.updateDynamic("records")(records)
    __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[FirehoseTransformationEvent]
  }
}

