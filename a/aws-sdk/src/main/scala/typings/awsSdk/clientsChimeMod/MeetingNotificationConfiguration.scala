package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingNotificationConfiguration extends StObject {
  
  /**
    * The SNS topic ARN.
    */
  var SnsTopicArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The SQS queue ARN.
    */
  var SqsQueueArn: js.UndefOr[Arn] = js.undefined
}
object MeetingNotificationConfiguration {
  
  inline def apply(): MeetingNotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingNotificationConfiguration]
  }
  
  extension [Self <: MeetingNotificationConfiguration](x: Self) {
    
    inline def setSnsTopicArn(value: Arn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    inline def setSqsQueueArn(value: Arn): Self = StObject.set(x, "SqsQueueArn", value.asInstanceOf[js.Any])
    
    inline def setSqsQueueArnUndefined: Self = StObject.set(x, "SqsQueueArn", js.undefined)
  }
}
