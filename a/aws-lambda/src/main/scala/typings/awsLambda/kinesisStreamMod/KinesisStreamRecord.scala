package typings.awsLambda.kinesisStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamRecord extends js.Object {
  var awsRegion: String = js.native
  var eventID: String = js.native
  var eventName: String = js.native
  var eventSource: String = js.native
  var eventSourceARN: String = js.native
  var eventVersion: String = js.native
  var invokeIdentityArn: String = js.native
  var kinesis: KinesisStreamRecordPayload = js.native
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
  @scala.inline
  implicit class KinesisStreamRecordOps[Self <: KinesisStreamRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAwsRegion(value: String): Self = this.set("awsRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventID(value: String): Self = this.set("eventID", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventSource(value: String): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventSourceARN(value: String): Self = this.set("eventSourceARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventVersion(value: String): Self = this.set("eventVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvokeIdentityArn(value: String): Self = this.set("invokeIdentityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setKinesis(value: KinesisStreamRecordPayload): Self = this.set("kinesis", value.asInstanceOf[js.Any])
  }
  
}

