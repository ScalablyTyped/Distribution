package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQSRecordAttributes extends js.Object {
  var ApproximateFirstReceiveTimestamp: String
  var ApproximateReceiveCount: String
  var SenderId: String
  var SentTimestamp: String
}

object SQSRecordAttributes {
  @scala.inline
  def apply(
    ApproximateFirstReceiveTimestamp: String,
    ApproximateReceiveCount: String,
    SenderId: String,
    SentTimestamp: String
  ): SQSRecordAttributes = {
    val __obj = js.Dynamic.literal(ApproximateFirstReceiveTimestamp = ApproximateFirstReceiveTimestamp, ApproximateReceiveCount = ApproximateReceiveCount, SenderId = SenderId, SentTimestamp = SentTimestamp)
  
    __obj.asInstanceOf[SQSRecordAttributes]
  }
}

