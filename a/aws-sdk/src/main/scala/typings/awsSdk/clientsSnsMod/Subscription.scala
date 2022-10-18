package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  /**
    * The subscription's endpoint (format depends on the protocol).
    */
  var Endpoint: js.UndefOr[endpoint] = js.undefined
  
  /**
    * The subscription's owner.
    */
  var Owner: js.UndefOr[account] = js.undefined
  
  /**
    * The subscription's protocol.
    */
  var Protocol: js.UndefOr[protocol] = js.undefined
  
  /**
    * The subscription's ARN.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
  
  /**
    * The ARN of the subscription's topic.
    */
  var TopicArn: js.UndefOr[topicARN] = js.undefined
}
object Subscription {
  
  inline def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setEndpoint(value: endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setOwner(value: account): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setProtocol(value: protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSubscriptionArn(value: subscriptionARN): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionArnUndefined: Self = StObject.set(x, "SubscriptionArn", js.undefined)
    
    inline def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
  }
}
