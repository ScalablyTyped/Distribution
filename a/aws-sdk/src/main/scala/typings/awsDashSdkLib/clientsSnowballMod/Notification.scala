package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /**
    * The list of job states that will trigger a notification for this job.
    */
  var JobStatesToNotify: js.UndefOr[JobStateList] = js.undefined
  /**
    * Any change in job state will trigger a notification for this job.
    */
  var NotifyAll: js.UndefOr[Boolean] = js.undefined
  /**
    * The new SNS TopicArn that you want to associate with this job. You can create Amazon Resource Names (ARNs) for topics by using the CreateTopic Amazon SNS API action. You can subscribe email addresses to an Amazon SNS topic through the AWS Management Console, or by using the Subscribe AWS Simple Notification Service (SNS) API action.
    */
  var SnsTopicARN: js.UndefOr[SnsTopicARN] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    JobStatesToNotify: JobStateList = null,
    NotifyAll: js.UndefOr[Boolean] = js.undefined,
    SnsTopicARN: SnsTopicARN = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (JobStatesToNotify != null) __obj.updateDynamic("JobStatesToNotify")(JobStatesToNotify)
    if (!js.isUndefined(NotifyAll)) __obj.updateDynamic("NotifyAll")(NotifyAll)
    if (SnsTopicARN != null) __obj.updateDynamic("SnsTopicARN")(SnsTopicARN)
    __obj.asInstanceOf[Notification]
  }
}

