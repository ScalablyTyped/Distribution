package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDynamodbstreamsMod {
  type AttributeMap = StringDictionary[AttributeValue]
  type AttributeName = java.lang.String
  type BinaryAttributeValue = Buffer | Uint8Array | Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue = Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type KeySchema = js.Array[KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HASH
    - typings.awsDashSdk.awsDashSdkStrings.RANGE
    - java.lang.String
  */
  type KeyType = _KeyType | java.lang.String
  type ListAttributeValue = js.Array[AttributeValue]
  type MapAttributeValue = StringDictionary[AttributeValue]
  type NullAttributeValue = Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INSERT
    - typings.awsDashSdk.awsDashSdkStrings.MODIFY
    - typings.awsDashSdk.awsDashSdkStrings.REMOVE
    - java.lang.String
  */
  type OperationType = _OperationType | java.lang.String
  type PositiveIntegerObject = Double
  type PositiveLongObject = Double
  type RecordList = js.Array[Record]
  type SequenceNumber = java.lang.String
  type ShardDescriptionList = js.Array[Shard]
  type ShardId = java.lang.String
  type ShardIterator = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TRIM_HORIZON
    - typings.awsDashSdk.awsDashSdkStrings.LATEST
    - typings.awsDashSdk.awsDashSdkStrings.AT_SEQUENCE_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.AFTER_SEQUENCE_NUMBER
    - java.lang.String
  */
  type ShardIteratorType = _ShardIteratorType | java.lang.String
  type StreamArn = java.lang.String
  type StreamList = js.Array[Stream]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLING
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLING
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type StreamStatus = _StreamStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NEW_IMAGE
    - typings.awsDashSdk.awsDashSdkStrings.OLD_IMAGE
    - typings.awsDashSdk.awsDashSdkStrings.NEW_AND_OLD_IMAGES
    - typings.awsDashSdk.awsDashSdkStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = _StreamViewType | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  type TableName = java.lang.String
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2012-08-10`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
