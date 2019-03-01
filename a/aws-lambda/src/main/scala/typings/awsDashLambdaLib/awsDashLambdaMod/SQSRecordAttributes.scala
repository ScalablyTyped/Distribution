package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQSRecordAttributes extends js.Object {
  var ApproximateFirstReceiveTimestamp: java.lang.String
  var ApproximateReceiveCount: java.lang.String
  var SenderId: java.lang.String
  var SentTimestamp: java.lang.String
}

object SQSRecordAttributes {
  @scala.inline
  def apply(
    ApproximateFirstReceiveTimestamp: java.lang.String,
    ApproximateReceiveCount: java.lang.String,
    SenderId: java.lang.String,
    SentTimestamp: java.lang.String
  ): SQSRecordAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ApproximateFirstReceiveTimestamp")(ApproximateFirstReceiveTimestamp)
    __obj.updateDynamic("ApproximateReceiveCount")(ApproximateReceiveCount)
    __obj.updateDynamic("SenderId")(SenderId)
    __obj.updateDynamic("SentTimestamp")(SentTimestamp)
    __obj.asInstanceOf[SQSRecordAttributes]
  }
}

