package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSqsMod {
  type AWSAccountIdList = js.Array[String]
  type ActionNameList = js.Array[String]
  type AttributeNameList = js.Array[QueueAttributeName]
  type BatchResultErrorEntryList = js.Array[BatchResultErrorEntry]
  type Binary = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type BinaryList = js.Array[Binary]
  type Boolean = scala.Boolean
  type ChangeMessageVisibilityBatchRequestEntryList = js.Array[ChangeMessageVisibilityBatchRequestEntry]
  type ChangeMessageVisibilityBatchResultEntryList = js.Array[ChangeMessageVisibilityBatchResultEntry]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DeleteMessageBatchRequestEntryList = js.Array[DeleteMessageBatchRequestEntry]
  type DeleteMessageBatchResultEntryList = js.Array[DeleteMessageBatchResultEntry]
  type Integer = scala.Double
  type MessageAttributeName = java.lang.String
  type MessageAttributeNameList = js.Array[MessageAttributeName]
  type MessageBodyAttributeMap = org.scalablytyped.runtime.StringDictionary[MessageAttributeValue]
  type MessageList = js.Array[Message]
  type MessageSystemAttributeMap = org.scalablytyped.runtime.StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SenderId
    - awsDashSdkLib.awsDashSdkLibStrings.SentTimestamp
    - awsDashSdkLib.awsDashSdkLibStrings.ApproximateReceiveCount
    - awsDashSdkLib.awsDashSdkLibStrings.ApproximateFirstReceiveTimestamp
    - awsDashSdkLib.awsDashSdkLibStrings.SequenceNumber
    - awsDashSdkLib.awsDashSdkLibStrings.MessageDeduplicationId
    - awsDashSdkLib.awsDashSdkLibStrings.MessageGroupId
    - java.lang.String
  */
  type MessageSystemAttributeName = _MessageSystemAttributeName | java.lang.String
  type QueueAttributeMap = org.scalablytyped.runtime.StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.All
    - awsDashSdkLib.awsDashSdkLibStrings.Policy
    - awsDashSdkLib.awsDashSdkLibStrings.VisibilityTimeout
    - awsDashSdkLib.awsDashSdkLibStrings.MaximumMessageSize
    - awsDashSdkLib.awsDashSdkLibStrings.MessageRetentionPeriod
    - awsDashSdkLib.awsDashSdkLibStrings.ApproximateNumberOfMessages
    - awsDashSdkLib.awsDashSdkLibStrings.ApproximateNumberOfMessagesNotVisible
    - awsDashSdkLib.awsDashSdkLibStrings.CreatedTimestamp
    - awsDashSdkLib.awsDashSdkLibStrings.LastModifiedTimestamp
    - awsDashSdkLib.awsDashSdkLibStrings.QueueArn
    - awsDashSdkLib.awsDashSdkLibStrings.ApproximateNumberOfMessagesDelayed
    - awsDashSdkLib.awsDashSdkLibStrings.DelaySeconds
    - awsDashSdkLib.awsDashSdkLibStrings.ReceiveMessageWaitTimeSeconds
    - awsDashSdkLib.awsDashSdkLibStrings.RedrivePolicy
    - awsDashSdkLib.awsDashSdkLibStrings.FifoQueue
    - awsDashSdkLib.awsDashSdkLibStrings.ContentBasedDeduplication
    - awsDashSdkLib.awsDashSdkLibStrings.KmsMasterKeyId
    - awsDashSdkLib.awsDashSdkLibStrings.KmsDataKeyReusePeriodSeconds
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
  type TagMap = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2012-11-05`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
