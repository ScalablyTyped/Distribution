package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisStreamRecord extends js.Object {
  var awsRegion: java.lang.String
  var eventID: java.lang.String
  var eventName: java.lang.String
  var eventSource: java.lang.String
  var eventSourceARN: java.lang.String
  var eventVersion: java.lang.String
  var invokeIdentityArn: java.lang.String
  var kinesis: KinesisStreamRecordPayload
}

object KinesisStreamRecord {
  @scala.inline
  def apply(
    awsRegion: java.lang.String,
    eventID: java.lang.String,
    eventName: java.lang.String,
    eventSource: java.lang.String,
    eventSourceARN: java.lang.String,
    eventVersion: java.lang.String,
    invokeIdentityArn: java.lang.String,
    kinesis: KinesisStreamRecordPayload
  ): KinesisStreamRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, eventID = eventID, eventName = eventName, eventSource = eventSource, eventSourceARN = eventSourceARN, eventVersion = eventVersion, invokeIdentityArn = invokeIdentityArn, kinesis = kinesis)
  
    __obj.asInstanceOf[KinesisStreamRecord]
  }
}

