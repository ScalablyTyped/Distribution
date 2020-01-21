package typings.awsLambda.mod

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
    val __obj = js.Dynamic.literal(EventSource = EventSource.asInstanceOf[js.Any], EventSubscriptionArn = EventSubscriptionArn.asInstanceOf[js.Any], EventVersion = EventVersion.asInstanceOf[js.Any], Sns = Sns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SNSEventRecord]
  }
}

