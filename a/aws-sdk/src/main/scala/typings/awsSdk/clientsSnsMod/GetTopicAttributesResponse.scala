package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTopicAttributesResponse extends StObject {
  
  /**
    * A map of the topic's attributes. Attributes in this map include the following:    DeliveryPolicy – The JSON serialization of the topic's delivery policy.    DisplayName – The human-readable name used in the From field for notifications to email and email-json endpoints.    Owner – The Amazon Web Services account ID of the topic's owner.    Policy – The JSON serialization of the topic's access control policy.    SubscriptionsConfirmed – The number of confirmed subscriptions for the topic.    SubscriptionsDeleted – The number of deleted subscriptions for the topic.    SubscriptionsPending – The number of subscriptions pending confirmation for the topic.    TopicArn – The topic's ARN.    EffectiveDeliveryPolicy – The JSON serialization of the effective delivery policy, taking system defaults into account.   The following attribute applies only to server-side-encryption:    KmsMasterKeyId - The ID of an Amazon Web Services managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see Key Terms. For more examples, see KeyId in the Key Management Service API Reference.   The following attributes apply only to FIFO topics:    FifoTopic – When this is set to true, a FIFO topic is created.    ContentBasedDeduplication – Enables content-based deduplication for FIFO topics.   By default, ContentBasedDeduplication is set to false. If you create a FIFO topic and this attribute is false, you must specify a value for the MessageDeduplicationId parameter for the Publish action.    When you set ContentBasedDeduplication to true, Amazon SNS uses a SHA-256 hash to generate the MessageDeduplicationId using the body of the message (but not the attributes of the message). (Optional) To override the generated value, you can specify a value for the MessageDeduplicationId parameter for the Publish action.    
    */
  var Attributes: js.UndefOr[TopicAttributesMap] = js.undefined
}
object GetTopicAttributesResponse {
  
  inline def apply(): GetTopicAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTopicAttributesResponse]
  }
  
  extension [Self <: GetTopicAttributesResponse](x: Self) {
    
    inline def setAttributes(value: TopicAttributesMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
  }
}
