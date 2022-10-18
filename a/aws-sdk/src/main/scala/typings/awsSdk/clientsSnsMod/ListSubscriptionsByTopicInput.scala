package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscriptionsByTopicInput extends StObject {
  
  /**
    * Token returned by the previous ListSubscriptionsByTopic request.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
  
  /**
    * The ARN of the topic for which you wish to find subscriptions.
    */
  var TopicArn: topicARN
}
object ListSubscriptionsByTopicInput {
  
  inline def apply(TopicArn: topicARN): ListSubscriptionsByTopicInput = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubscriptionsByTopicInput]
  }
  
  extension [Self <: ListSubscriptionsByTopicInput](x: Self) {
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
