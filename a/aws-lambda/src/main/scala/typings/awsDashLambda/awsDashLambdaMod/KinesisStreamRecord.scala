package typings.awsDashLambda.awsDashLambdaMod

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
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, eventID = eventID, eventName = eventName, eventSource = eventSource, eventSourceARN = eventSourceARN, eventVersion = eventVersion, invokeIdentityArn = invokeIdentityArn, kinesis = kinesis)
  
    __obj.asInstanceOf[KinesisStreamRecord]
  }
}

