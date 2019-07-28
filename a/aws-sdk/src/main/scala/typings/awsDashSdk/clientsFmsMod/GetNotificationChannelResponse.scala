package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNotificationChannelResponse extends js.Object {
  /**
    * The IAM role that is used by AWS Firewall Manager to record activity to SNS.
    */
  var SnsRoleName: js.UndefOr[ResourceArn] = js.undefined
  /**
    * The SNS topic that records AWS Firewall Manager activity. 
    */
  var SnsTopicArn: js.UndefOr[ResourceArn] = js.undefined
}

object GetNotificationChannelResponse {
  @scala.inline
  def apply(SnsRoleName: ResourceArn = null, SnsTopicArn: ResourceArn = null): GetNotificationChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (SnsRoleName != null) __obj.updateDynamic("SnsRoleName")(SnsRoleName)
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn)
    __obj.asInstanceOf[GetNotificationChannelResponse]
  }
}

