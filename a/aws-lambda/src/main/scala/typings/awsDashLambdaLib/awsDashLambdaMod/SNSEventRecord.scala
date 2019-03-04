package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SNSEventRecord extends js.Object {
  var EventSource: java.lang.String
  var EventSubscriptionArn: java.lang.String
  var EventVersion: java.lang.String
  var Sns: SNSMessage
}

object SNSEventRecord {
  @scala.inline
  def apply(
    EventSource: java.lang.String,
    EventSubscriptionArn: java.lang.String,
    EventVersion: java.lang.String,
    Sns: SNSMessage
  ): SNSEventRecord = {
    val __obj = js.Dynamic.literal(EventSource = EventSource, EventSubscriptionArn = EventSubscriptionArn, EventVersion = EventVersion, Sns = Sns)
  
    __obj.asInstanceOf[SNSEventRecord]
  }
}

