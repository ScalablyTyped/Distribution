package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationChannel extends js.Object {
  /**
    * The ARN of an IAM role that gives Amazon Rekognition publishing permissions to the Amazon SNS topic. 
    */
  var RoleArn: typings.awsDashSdk.clientsRekognitionMod.RoleArn
  /**
    * The Amazon SNS topic to which Amazon Rekognition to posts the completion status.
    */
  var SNSTopicArn: typings.awsDashSdk.clientsRekognitionMod.SNSTopicArn
}

object NotificationChannel {
  @scala.inline
  def apply(RoleArn: RoleArn, SNSTopicArn: SNSTopicArn): NotificationChannel = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn, SNSTopicArn = SNSTopicArn)
  
    __obj.asInstanceOf[NotificationChannel]
  }
}

