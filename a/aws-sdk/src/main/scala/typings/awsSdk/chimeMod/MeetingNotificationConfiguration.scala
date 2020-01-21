package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeetingNotificationConfiguration extends js.Object {
  /**
    * The SNS topic ARN.
    */
  var SnsTopicArn: js.UndefOr[Arn] = js.native
  /**
    * The SQS queue ARN.
    */
  var SqsQueueArn: js.UndefOr[Arn] = js.native
}

object MeetingNotificationConfiguration {
  @scala.inline
  def apply(SnsTopicArn: Arn = null, SqsQueueArn: Arn = null): MeetingNotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn.asInstanceOf[js.Any])
    if (SqsQueueArn != null) __obj.updateDynamic("SqsQueueArn")(SqsQueueArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeetingNotificationConfiguration]
  }
}

