package typings.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.AWSTraceHeader
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountIdList = js.Array[String]

type ActionNameList = js.Array[String]

type AttributeNameList = js.Array[QueueAttributeName]

type BatchResultErrorEntryList = js.Array[BatchResultErrorEntry]

type Binary = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type BinaryList = js.Array[Binary]

type Boolean = scala.Boolean

type BoxedInteger = Double

type ChangeMessageVisibilityBatchRequestEntryList = js.Array[ChangeMessageVisibilityBatchRequestEntry]

type ChangeMessageVisibilityBatchResultEntryList = js.Array[ChangeMessageVisibilityBatchResultEntry]

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
  - typings.awsSdk.awsSdkStrings.SenderId
  - typings.awsSdk.awsSdkStrings.SentTimestamp
  - typings.awsSdk.awsSdkStrings.ApproximateReceiveCount
  - typings.awsSdk.awsSdkStrings.ApproximateFirstReceiveTimestamp
  - typings.awsSdk.awsSdkStrings.SequenceNumber
  - typings.awsSdk.awsSdkStrings.MessageDeduplicationId
  - typings.awsSdk.awsSdkStrings.MessageGroupId
  - typings.awsSdk.awsSdkStrings.AWSTraceHeader
  - java.lang.String
*/
type MessageSystemAttributeName = _MessageSystemAttributeName | java.lang.String

type MessageSystemAttributeNameForSends = AWSTraceHeader | java.lang.String

type QueueAttributeMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.All_
  - typings.awsSdk.awsSdkStrings.Policy_
  - typings.awsSdk.awsSdkStrings.VisibilityTimeout
  - typings.awsSdk.awsSdkStrings.MaximumMessageSize
  - typings.awsSdk.awsSdkStrings.MessageRetentionPeriod
  - typings.awsSdk.awsSdkStrings.ApproximateNumberOfMessages
  - typings.awsSdk.awsSdkStrings.ApproximateNumberOfMessagesNotVisible
  - typings.awsSdk.awsSdkStrings.CreatedTimestamp
  - typings.awsSdk.awsSdkStrings.LastModifiedTimestamp
  - typings.awsSdk.awsSdkStrings.QueueArn
  - typings.awsSdk.awsSdkStrings.ApproximateNumberOfMessagesDelayed
  - typings.awsSdk.awsSdkStrings.DelaySeconds
  - typings.awsSdk.awsSdkStrings.ReceiveMessageWaitTimeSeconds
  - typings.awsSdk.awsSdkStrings.RedrivePolicy
  - typings.awsSdk.awsSdkStrings.FifoQueue
  - typings.awsSdk.awsSdkStrings.ContentBasedDeduplication
  - typings.awsSdk.awsSdkStrings.KmsMasterKeyId
  - typings.awsSdk.awsSdkStrings.KmsDataKeyReusePeriodSeconds
  - typings.awsSdk.awsSdkStrings.DeduplicationScope
  - typings.awsSdk.awsSdkStrings.FifoThroughputLimit
  - typings.awsSdk.awsSdkStrings.RedriveAllowPolicy
  - typings.awsSdk.awsSdkStrings.SqsManagedSseEnabled
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

type Token = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2012-11-05`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
