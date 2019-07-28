package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SNSEventRecord extends js.Object {
  var EventSource: String
  var EventSubscriptionArn: String
  var EventVersion: String
  var Sns: SNSMessage
}

object SNSEventRecord {
  @scala.inline
  def apply(EventSource: String, EventSubscriptionArn: String, EventVersion: String, Sns: SNSMessage): SNSEventRecord = {
    val __obj = js.Dynamic.literal(EventSource = EventSource, EventSubscriptionArn = EventSubscriptionArn, EventVersion = EventVersion, Sns = Sns)
  
    __obj.asInstanceOf[SNSEventRecord]
  }
}

