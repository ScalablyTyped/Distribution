package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDynamodbstreamsMod {
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type AttributeName = java.lang.String
  type BinaryAttributeValue = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type KeySchema = js.Array[KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HASH
    - awsDashSdkLib.awsDashSdkLibStrings.RANGE
    - java.lang.String
  */
  type KeyType = _KeyType | java.lang.String
  type ListAttributeValue = js.Array[AttributeValue]
  type MapAttributeValue = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type NullAttributeValue = scala.Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INSERT
    - awsDashSdkLib.awsDashSdkLibStrings.MODIFY
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVE
    - java.lang.String
  */
  type OperationType = _OperationType | java.lang.String
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type RecordList = js.Array[Record]
  type SequenceNumber = java.lang.String
  type ShardDescriptionList = js.Array[Shard]
  type ShardId = java.lang.String
  type ShardIterator = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TRIM_HORIZON
    - awsDashSdkLib.awsDashSdkLibStrings.LATEST
    - awsDashSdkLib.awsDashSdkLibStrings.AT_SEQUENCE_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.AFTER_SEQUENCE_NUMBER
    - java.lang.String
  */
  type ShardIteratorType = _ShardIteratorType | java.lang.String
  type StreamArn = java.lang.String
  type StreamList = js.Array[Stream]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLING
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLING
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type StreamStatus = _StreamStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NEW_IMAGE
    - awsDashSdkLib.awsDashSdkLibStrings.OLD_IMAGE
    - awsDashSdkLib.awsDashSdkLibStrings.NEW_AND_OLD_IMAGES
    - awsDashSdkLib.awsDashSdkLibStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = _StreamViewType | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  type TableName = java.lang.String
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2012-08-10`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
