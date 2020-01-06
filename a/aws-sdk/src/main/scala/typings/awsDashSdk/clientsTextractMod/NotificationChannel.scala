package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationChannel extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an IAM role that gives Amazon Textract publishing permissions to the Amazon SNS topic. 
    */
  var RoleArn: typings.awsDashSdk.clientsTextractMod.RoleArn = js.native
  /**
    * The Amazon SNS topic that Amazon Textract posts the completion status to.
    */
  var SNSTopicArn: typings.awsDashSdk.clientsTextractMod.SNSTopicArn = js.native
}

object NotificationChannel {
  @scala.inline
  def apply(RoleArn: RoleArn, SNSTopicArn: SNSTopicArn): NotificationChannel = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], SNSTopicArn = SNSTopicArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationChannel]
  }
}

