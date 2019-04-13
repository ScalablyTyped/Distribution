package typings
package awsDashSdkLib.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutNotificationChannelRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall Manager activity. 
    */
  var SnsRoleName: ResourceArn
  /**
    * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall Manager.
    */
  var SnsTopicArn: ResourceArn
}

object PutNotificationChannelRequest {
  @scala.inline
  def apply(SnsRoleName: ResourceArn, SnsTopicArn: ResourceArn): PutNotificationChannelRequest = {
    val __obj = js.Dynamic.literal(SnsRoleName = SnsRoleName, SnsTopicArn = SnsTopicArn)
  
    __obj.asInstanceOf[PutNotificationChannelRequest]
  }
}

