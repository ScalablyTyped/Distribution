package typings.awsLambda.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SNSEventRecord extends js.Object {
  var EventSource: String = js.native
  var EventSubscriptionArn: String = js.native
  var EventVersion: String = js.native
  var Sns: SNSMessage = js.native
}

object SNSEventRecord {
  @scala.inline
  def apply(EventSource: String, EventSubscriptionArn: String, EventVersion: String, Sns: SNSMessage): SNSEventRecord = {
    val __obj = js.Dynamic.literal(EventSource = EventSource.asInstanceOf[js.Any], EventSubscriptionArn = EventSubscriptionArn.asInstanceOf[js.Any], EventVersion = EventVersion.asInstanceOf[js.Any], Sns = Sns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSEventRecord]
  }
  @scala.inline
  implicit class SNSEventRecordOps[Self <: SNSEventRecord] (val x: Self) extends AnyVal {
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
    def setEventSource(value: String): Self = this.set("EventSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventSubscriptionArn(value: String): Self = this.set("EventSubscriptionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventVersion(value: String): Self = this.set("EventVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSns(value: SNSMessage): Self = this.set("Sns", value.asInstanceOf[js.Any])
  }
  
}

