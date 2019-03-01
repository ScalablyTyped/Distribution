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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EventSource")(EventSource)
    __obj.updateDynamic("EventSubscriptionArn")(EventSubscriptionArn)
    __obj.updateDynamic("EventVersion")(EventVersion)
    __obj.updateDynamic("Sns")(Sns)
    __obj.asInstanceOf[SNSEventRecord]
  }
}

