package typings.awsLambda.kinesisStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisStreamRecord extends js.Object {
  var awsRegion: String
  var eventID: String
  var eventName: String
  var eventSource: String
  var eventSourceARN: String
  var eventVersion: String
  var invokeIdentityArn: String
  var kinesis: KinesisStreamRecordPayload
}

object KinesisStreamRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    eventID: String,
    eventName: String,
    eventSource: String,
    eventSourceARN: String,
    eventVersion: String,
    invokeIdentityArn: String,
    kinesis: KinesisStreamRecordPayload
  ): KinesisStreamRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventID = eventID.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventSourceARN = eventSourceARN.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], invokeIdentityArn = invokeIdentityArn.asInstanceOf[js.Any], kinesis = kinesis.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamRecord]
  }
}

