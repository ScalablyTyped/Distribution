package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTopicRuleDestinationRequest extends StObject {
  
  /**
    * The ARN of the topic rule destination to delete.
    */
  var arn: AwsArn
}
object DeleteTopicRuleDestinationRequest {
  
  inline def apply(arn: AwsArn): DeleteTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTopicRuleDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTopicRuleDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AwsArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
