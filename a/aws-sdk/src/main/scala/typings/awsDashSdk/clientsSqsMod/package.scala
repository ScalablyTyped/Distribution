package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSqsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.AWSTraceHeader
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Uint8Array

  type AWSAccountIdList = js.Array[String]
  type ActionNameList = js.Array[String]
  type AttributeNameList = js.Array[QueueAttributeName]
  type BatchResultErrorEntryList = js.Array[BatchResultErrorEntry]
  type Binary = Buffer | Uint8Array | Blob | java.lang.String
  type BinaryList = js.Array[Binary]
  type Boolean = scala.Boolean
  type ChangeMessageVisibilityBatchRequestEntryList = js.Array[ChangeMessageVisibilityBatchRequestEntry]
  type ChangeMessageVisibilityBatchResultEntryList = js.Array[ChangeMessageVisibilityBatchResultEntry]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DeleteMessageBatchRequestEntryList = js.Array[DeleteMessageBatchRequestEntry]
  type DeleteMessageBatchResultEntryList = js.Array[DeleteMessageBatchResultEntry]
  type Integer = Double
  type MessageAttributeName = java.lang.String
  type MessageAttributeNameList = js.Array[MessageAttributeName]
  type MessageBodyAttributeMap = StringDictionary[MessageAttributeValue]
  type MessageBodySystemAttributeMap = StringDictionary[MessageSystemAttributeValue]
  type MessageList = js.Array[Message]
  type MessageSystemAttributeMap = StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SenderId
    - typings.awsDashSdk.awsDashSdkStrings.SentTimestamp
    - typings.awsDashSdk.awsDashSdkStrings.ApproximateReceiveCount
    - typings.awsDashSdk.awsDashSdkStrings.ApproximateFirstReceiveTimestamp
    - typings.awsDashSdk.awsDashSdkStrings.SequenceNumber
    - typings.awsDashSdk.awsDashSdkStrings.MessageDeduplicationId
    - typings.awsDashSdk.awsDashSdkStrings.MessageGroupId
    - typings.awsDashSdk.awsDashSdkStrings.AWSTraceHeader
    - java.lang.String
  */
  type MessageSystemAttributeName = _MessageSystemAttributeName | java.lang.String
  type MessageSystemAttributeNameForSends = AWSTraceHeader | java.lang.String
  type QueueAttributeMap = StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.All
    - typings.awsDashSdk.awsDashSdkStrings.Policy
    - typings.awsDashSdk.awsDashSdkStrings.VisibilityTimeout
    - typings.awsDashSdk.awsDashSdkStrings.MaximumMessageSize
    - typings.awsDashSdk.awsDashSdkStrings.MessageRetentionPeriod
    - typings.awsDashSdk.awsDashSdkStrings.ApproximateNumberOfMessages
    - typings.awsDashSdk.awsDashSdkStrings.ApproximateNumberOfMessagesNotVisible
    - typings.awsDashSdk.awsDashSdkStrings.CreatedTimestamp
    - typings.awsDashSdk.awsDashSdkStrings.LastModifiedTimestamp
    - typings.awsDashSdk.awsDashSdkStrings.QueueArn
    - typings.awsDashSdk.awsDashSdkStrings.ApproximateNumberOfMessagesDelayed
    - typings.awsDashSdk.awsDashSdkStrings.DelaySeconds
    - typings.awsDashSdk.awsDashSdkStrings.ReceiveMessageWaitTimeSeconds
    - typings.awsDashSdk.awsDashSdkStrings.RedrivePolicy
    - typings.awsDashSdk.awsDashSdkStrings.FifoQueue
    - typings.awsDashSdk.awsDashSdkStrings.ContentBasedDeduplication
    - typings.awsDashSdk.awsDashSdkStrings.KmsMasterKeyId
    - typings.awsDashSdk.awsDashSdkStrings.KmsDataKeyReusePeriodSeconds
    - java.lang.String
  */
  type QueueAttributeName = _QueueAttributeName | java.lang.String
  type QueueUrlList = js.Array[String]
  type SendMessageBatchRequestEntryList = js.Array[SendMessageBatchRequestEntry]
  type SendMessageBatchResultEntryList = js.Array[SendMessageBatchResultEntry]
  type String = java.lang.String
  type StringList = js.Array[String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2012-11-05`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
