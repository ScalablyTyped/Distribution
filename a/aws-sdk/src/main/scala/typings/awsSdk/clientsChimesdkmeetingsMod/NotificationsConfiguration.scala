package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationsConfiguration extends StObject {
  
  /**
    * The ARN of the AWS Lambda function in the notifications configuration.
    */
  var LambdaFunctionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the SNS topic.
    */
  var SnsTopicArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the SQS queue.
    */
  var SqsQueueArn: js.UndefOr[Arn] = js.undefined
}
object NotificationsConfiguration {
  
  inline def apply(): NotificationsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLambdaFunctionArn(value: Arn): Self = StObject.set(x, "LambdaFunctionArn", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionArnUndefined: Self = StObject.set(x, "LambdaFunctionArn", js.undefined)
    
    inline def setSnsTopicArn(value: Arn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    inline def setSqsQueueArn(value: Arn): Self = StObject.set(x, "SqsQueueArn", value.asInstanceOf[js.Any])
    
    inline def setSqsQueueArnUndefined: Self = StObject.set(x, "SqsQueueArn", js.undefined)
  }
}
