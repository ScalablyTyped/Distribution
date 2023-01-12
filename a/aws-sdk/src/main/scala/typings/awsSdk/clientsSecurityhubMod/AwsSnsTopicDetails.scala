package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSnsTopicDetails extends StObject {
  
  /**
    * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to a platform application endpoint. 
    */
  var ApplicationSuccessFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data Firehose endpoint. 
    */
  var FirehoseFailureFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data Firehose endpoint. 
    */
  var FirehoseSuccessFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint. 
    */
  var HttpFailureFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint. 
    */
  var HttpSuccessFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of an Amazon Web Services managed key for Amazon SNS or a customer managed key.
    */
  var KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The subscription's owner.
    */
  var Owner: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS endpoint. 
    */
  var SqsFailureFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS endpoint. 
    */
  var SqsSuccessFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
    */
  var Subscription: js.UndefOr[AwsSnsTopicSubscriptionList] = js.undefined
  
  /**
    * The name of the Amazon SNS topic.
    */
  var TopicName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsSnsTopicDetails {
  
  inline def apply(): AwsSnsTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSnsTopicDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsSnsTopicDetails] (val x: Self) extends AnyVal {
    
    inline def setApplicationSuccessFeedbackRoleArn(value: NonEmptyString): Self = StObject.set(x, "ApplicationSuccessFeedbackRoleArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationSuccessFeedbackRoleArnUndefined: Self = StObject.set(x, "ApplicationSuccessFeedbackRoleArn", js.undefined)
    
    inline def setFirehoseFailureFeedbackRoleArn(value: NonEmptyString): Self = StObject.set(x, "FirehoseFailureFeedbackRoleArn", value.asInstanceOf[js.Any])
    
    inline def setFirehoseFailureFeedbackRoleArnUndefined: Self = StObject.set(x, "FirehoseFailureFeedbackRoleArn", js.undefined)
    
    inline def setFirehoseSuccessFeedbackRoleArn(value: NonEmptyString): Self = StObject.set(x, "FirehoseSuccessFeedbackRoleArn", value.asInstanceOf[js.Any])
    
    inline def setFirehoseSuccessFeedbackRoleArnUndefined: Self = StObject.set(x, "FirehoseSuccessFeedbackRoleArn", js.undefined)
    
    inline def setHttpFailureFeedbackRoleArn(value: NonEmptyString): Self = StObject.set(x, "HttpFailureFeedbackRoleArn", value.asInstanceOf[js.Any])
    
    inline def setHttpFailureFeedbackRoleArnUndefined: Self = StObject.set(x, "HttpFailureFeedbackRoleArn", js.undefined)
    
    inline def setHttpSuccessFeedbackRoleArn(value: NonEmptyString): Self = StObject.set(x, "HttpSuccessFeedbackRoleArn", value.asInstanceOf[js.Any])
    
    inline def setHttpSuccessFeedbackRoleArnUndefined: Self = StObject.set(x, "HttpSuccessFeedbackRoleArn", js.undefined)
    
    inline def setKmsMasterKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "KmsMasterKeyId", js.undefined)
    
    inline def setOwner(value: NonEmptyString): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setSqsFailureFeedbackRoleArn(value: NonEmptyString): Self = StObject.set(x, "SqsFailureFeedbackRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSqsFailureFeedbackRoleArnUndefined: Self = StObject.set(x, "SqsFailureFeedbackRoleArn", js.undefined)
    
    inline def setSqsSuccessFeedbackRoleArn(value: NonEmptyString): Self = StObject.set(x, "SqsSuccessFeedbackRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSqsSuccessFeedbackRoleArnUndefined: Self = StObject.set(x, "SqsSuccessFeedbackRoleArn", js.undefined)
    
    inline def setSubscription(value: AwsSnsTopicSubscriptionList): Self = StObject.set(x, "Subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "Subscription", js.undefined)
    
    inline def setSubscriptionVarargs(value: AwsSnsTopicSubscription*): Self = StObject.set(x, "Subscription", js.Array(value*))
    
    inline def setTopicName(value: NonEmptyString): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "TopicName", js.undefined)
  }
}
