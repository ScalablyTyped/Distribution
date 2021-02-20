package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeetingNotificationConfiguration extends StObject {
  
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
  implicit class MeetingNotificationConfigurationMutableBuilder[Self <: MeetingNotificationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnsTopicArn(value: Arn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    @scala.inline
    def setSqsQueueArn(value: Arn): Self = StObject.set(x, "SqsQueueArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqsQueueArnUndefined: Self = StObject.set(x, "SqsQueueArn", js.undefined)
  }
}
