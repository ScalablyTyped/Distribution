package typings.awsLambda.dynamodbStreamMod

import typings.awsLambda.awsLambdaStrings.INSERT
import typings.awsLambda.awsLambdaStrings.MODIFY
import typings.awsLambda.awsLambdaStrings.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBRecord extends js.Object {
  var awsRegion: js.UndefOr[String] = js.native
  var dynamodb: js.UndefOr[StreamRecord] = js.native
  var eventID: js.UndefOr[String] = js.native
  var eventName: js.UndefOr[INSERT | MODIFY | REMOVE] = js.native
  var eventSource: js.UndefOr[String] = js.native
  var eventSourceARN: js.UndefOr[String] = js.native
  var eventVersion: js.UndefOr[String] = js.native
  var userIdentity: js.UndefOr[js.Any] = js.native
}

object DynamoDBRecord {
  @scala.inline
  def apply(): DynamoDBRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamoDBRecord]
  }
  @scala.inline
  implicit class DynamoDBRecordOps[Self <: DynamoDBRecord] (val x: Self) extends AnyVal {
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
    def deleteAwsRegion: Self = this.set("awsRegion", js.undefined)
    @scala.inline
    def setDynamodb(value: StreamRecord): Self = this.set("dynamodb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamodb: Self = this.set("dynamodb", js.undefined)
    @scala.inline
    def setEventID(value: String): Self = this.set("eventID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventID: Self = this.set("eventID", js.undefined)
    @scala.inline
    def setEventName(value: INSERT | MODIFY | REMOVE): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventName: Self = this.set("eventName", js.undefined)
    @scala.inline
    def setEventSource(value: String): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventSource: Self = this.set("eventSource", js.undefined)
    @scala.inline
    def setEventSourceARN(value: String): Self = this.set("eventSourceARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventSourceARN: Self = this.set("eventSourceARN", js.undefined)
    @scala.inline
    def setEventVersion(value: String): Self = this.set("eventVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventVersion: Self = this.set("eventVersion", js.undefined)
    @scala.inline
    def setUserIdentity(value: js.Any): Self = this.set("userIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIdentity: Self = this.set("userIdentity", js.undefined)
  }
  
}

