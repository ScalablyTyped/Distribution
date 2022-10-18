package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTopicRuleDestinationRequest extends StObject {
  
  /**
    * The ARN of the topic rule destination.
    */
  var arn: AwsArn
  
  /**
    * The status of the topic rule destination. Valid values are:  IN_PROGRESS  A topic rule destination was created but has not been confirmed. You can set status to IN_PROGRESS by calling UpdateTopicRuleDestination. Calling UpdateTopicRuleDestination causes a new confirmation challenge to be sent to your confirmation endpoint.  ENABLED  Confirmation was completed, and traffic to this destination is allowed. You can set status to DISABLED by calling UpdateTopicRuleDestination.  DISABLED  Confirmation was completed, and traffic to this destination is not allowed. You can set status to ENABLED by calling UpdateTopicRuleDestination.  ERROR  Confirmation could not be completed, for example if the confirmation timed out. You can call GetTopicRuleDestination for details about the error. You can set status to IN_PROGRESS by calling UpdateTopicRuleDestination. Calling UpdateTopicRuleDestination causes a new confirmation challenge to be sent to your confirmation endpoint.  
    */
  var status: TopicRuleDestinationStatus
}
object UpdateTopicRuleDestinationRequest {
  
  inline def apply(arn: AwsArn, status: TopicRuleDestinationStatus): UpdateTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTopicRuleDestinationRequest]
  }
  
  extension [Self <: UpdateTopicRuleDestinationRequest](x: Self) {
    
    inline def setArn(value: AwsArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TopicRuleDestinationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
