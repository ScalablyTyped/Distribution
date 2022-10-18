package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsubscribeFromEventRequest extends StObject {
  
  /**
    * The event for which you want to stop receiving SNS notifications.
    */
  var event: InspectorEvent
  
  /**
    * The ARN of the assessment template that is used during the event for which you want to stop receiving SNS notifications.
    */
  var resourceArn: Arn
  
  /**
    * The ARN of the SNS topic to which SNS notifications are sent.
    */
  var topicArn: Arn
}
object UnsubscribeFromEventRequest {
  
  inline def apply(event: InspectorEvent, resourceArn: Arn, topicArn: Arn): UnsubscribeFromEventRequest = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeFromEventRequest]
  }
  
  extension [Self <: UnsubscribeFromEventRequest](x: Self) {
    
    inline def setEvent(value: InspectorEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArn(value: Arn): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
  }
}
