package typings.awsLambda.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQSRecordAttributes extends js.Object {
  var AWSTraceHeader: js.UndefOr[String] = js.undefined
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
    SentTimestamp: String,
    AWSTraceHeader: String = null
  ): SQSRecordAttributes = {
    val __obj = js.Dynamic.literal(ApproximateFirstReceiveTimestamp = ApproximateFirstReceiveTimestamp.asInstanceOf[js.Any], ApproximateReceiveCount = ApproximateReceiveCount.asInstanceOf[js.Any], SenderId = SenderId.asInstanceOf[js.Any], SentTimestamp = SentTimestamp.asInstanceOf[js.Any])
    if (AWSTraceHeader != null) __obj.updateDynamic("AWSTraceHeader")(AWSTraceHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQSRecordAttributes]
  }
}

