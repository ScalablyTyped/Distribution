package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTopicAttributesInput extends StObject {
  
  /**
    * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the SetTopicAttributes action uses:    ApplicationSuccessFeedbackRoleArn – Indicates failed message delivery status for an Amazon SNS topic that is subscribed to a platform application endpoint.    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    DisplayName – The display name to use for a topic with SMS subscriptions.    Policy – The policy that defines who can access your topic. By default, only the topic owner can publish or subscribe to the topic.    TracingConfig – Tracing mode of an Amazon SNS topic. By default TracingConfig is set to PassThrough, and the topic passes through the tracing header it receives from an Amazon SNS publisher to its subscriptions. If set to Active, Amazon SNS will vend X-Ray segment data to topic owner account if the sampled flag in the tracing header is true. This is only supported on standard topics.   HTTP    HTTPSuccessFeedbackRoleArn – Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.     HTTPSuccessFeedbackSampleRate – Indicates percentage of successful messages to sample for an Amazon SNS topic that is subscribed to an HTTP endpoint.    HTTPFailureFeedbackRoleArn – Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.     Amazon Kinesis Data Firehose    FirehoseSuccessFeedbackRoleArn – Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data Firehose endpoint.    FirehoseSuccessFeedbackSampleRate – Indicates percentage of successful messages to sample for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data Firehose endpoint.    FirehoseFailureFeedbackRoleArn – Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data Firehose endpoint.      Lambda    LambdaSuccessFeedbackRoleArn – Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Lambda endpoint.    LambdaSuccessFeedbackSampleRate – Indicates percentage of successful messages to sample for an Amazon SNS topic that is subscribed to an Lambda endpoint.    LambdaFailureFeedbackRoleArn – Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Lambda endpoint.      Platform application endpoint    ApplicationSuccessFeedbackRoleArn – Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon Web Services application endpoint.    ApplicationSuccessFeedbackSampleRate – Indicates percentage of successful messages to sample for an Amazon SNS topic that is subscribed to an Amazon Web Services application endpoint.    ApplicationFailureFeedbackRoleArn – Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon Web Services application endpoint.    In addition to being able to configure topic attributes for message delivery status of notification messages sent to Amazon SNS application endpoints, you can also configure application attributes for the delivery status of push notification messages sent to push notification services. For example, For more information, see Using Amazon SNS Application Attributes for Message Delivery Status.     Amazon SQS    SQSSuccessFeedbackRoleArn – Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS endpoint.     SQSSuccessFeedbackSampleRate – Indicates percentage of successful messages to sample for an Amazon SNS topic that is subscribed to an Amazon SQS endpoint.     SQSFailureFeedbackRoleArn – Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS endpoint.       The &lt;ENDPOINT&gt;SuccessFeedbackRoleArn and &lt;ENDPOINT&gt;FailureFeedbackRoleArn attributes are used to give Amazon SNS write access to use CloudWatch Logs on your behalf. The &lt;ENDPOINT&gt;SuccessFeedbackSampleRate attribute is for specifying the sample rate percentage (0-100) of successfully delivered messages. After you configure the &lt;ENDPOINT&gt;FailureFeedbackRoleArn attribute, then all failed message deliveries generate CloudWatch Logs.   The following attribute applies only to server-side-encryption:    KmsMasterKeyId – The ID of an Amazon Web Services managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see Key Terms. For more examples, see KeyId in the Key Management Service API Reference.     SignatureVersion – The signature version corresponds to the hashing algorithm used while creating the signature of the notifications, subscription confirmations, or unsubscribe confirmation messages sent by Amazon SNS. By default, SignatureVersion is set to 1.   The following attribute applies only to FIFO topics:    ContentBasedDeduplication – Enables content-based deduplication for FIFO topics.   By default, ContentBasedDeduplication is set to false. If you create a FIFO topic and this attribute is false, you must specify a value for the MessageDeduplicationId parameter for the Publish action.    When you set ContentBasedDeduplication to true, Amazon SNS uses a SHA-256 hash to generate the MessageDeduplicationId using the body of the message (but not the attributes of the message). (Optional) To override the generated value, you can specify a value for the MessageDeduplicationId parameter for the Publish action.    
    */
  var AttributeName: attributeName
  
  /**
    * The new value for the attribute.
    */
  var AttributeValue: js.UndefOr[attributeValue] = js.undefined
  
  /**
    * The ARN of the topic to modify.
    */
  var TopicArn: topicARN
}
object SetTopicAttributesInput {
  
  inline def apply(AttributeName: attributeName, TopicArn: topicARN): SetTopicAttributesInput = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTopicAttributesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetTopicAttributesInput] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: attributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeValue(value: attributeValue): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueUndefined: Self = StObject.set(x, "AttributeValue", js.undefined)
    
    inline def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
