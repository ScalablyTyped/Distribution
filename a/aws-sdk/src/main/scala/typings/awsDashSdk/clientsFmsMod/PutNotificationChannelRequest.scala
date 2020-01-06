package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutNotificationChannelRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall Manager activity. 
    */
  var SnsRoleName: ResourceArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall Manager.
    */
  var SnsTopicArn: ResourceArn = js.native
}

object PutNotificationChannelRequest {
  @scala.inline
  def apply(SnsRoleName: ResourceArn, SnsTopicArn: ResourceArn): PutNotificationChannelRequest = {
    val __obj = js.Dynamic.literal(SnsRoleName = SnsRoleName.asInstanceOf[js.Any], SnsTopicArn = SnsTopicArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutNotificationChannelRequest]
  }
}

