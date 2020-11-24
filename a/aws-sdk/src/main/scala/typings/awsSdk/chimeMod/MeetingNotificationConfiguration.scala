package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): MeetingNotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingNotificationConfiguration]
  }
  
  @scala.inline
  implicit class MeetingNotificationConfigurationOps[Self <: MeetingNotificationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSnsTopicArn(value: Arn): Self = this.set("SnsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("SnsTopicArn", js.undefined)
    
    @scala.inline
    def setSqsQueueArn(value: Arn): Self = this.set("SqsQueueArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqsQueueArn: Self = this.set("SqsQueueArn", js.undefined)
  }
}
