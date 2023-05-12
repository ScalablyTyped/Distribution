package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ACTIVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BucketName = java.lang.String

type ChatToken = java.lang.String

type ChatTokenAttributes = StringDictionary[String]

type ChatTokenCapabilities = js.Array[ChatTokenCapability]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SEND_MESSAGE
  - typings.awsSdk.awsSdkStrings.DISCONNECT_USER
  - typings.awsSdk.awsSdkStrings.DELETE_MESSAGE
  - java.lang.String
*/
type ChatTokenCapability = _ChatTokenCapability | java.lang.String

type CreateLoggingConfigurationState = ACTIVE | java.lang.String

type DeliveryStreamName = java.lang.String

type EventAttributes = StringDictionary[String]

type EventName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALLOW
  - typings.awsSdk.awsSdkStrings.DENY
  - java.lang.String
*/
type FallbackResult = _FallbackResult | java.lang.String

type ID = java.lang.String

type LambdaArn = java.lang.String

type LogGroupName = java.lang.String

type LoggingConfigurationArn = java.lang.String

type LoggingConfigurationID = java.lang.String

type LoggingConfigurationIdentifier = java.lang.String

type LoggingConfigurationIdentifierList = js.Array[LoggingConfigurationIdentifier]

type LoggingConfigurationList = js.Array[LoggingConfigurationSummary]

type LoggingConfigurationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type LoggingConfigurationState = _LoggingConfigurationState | java.lang.String

type MaxLoggingConfigurationResults = Double

type MaxRoomResults = Double

type MessageID = java.lang.String

type PaginationToken = java.lang.String

type Reason = java.lang.String

type ResourceArn = java.lang.String

type RoomArn = java.lang.String

type RoomID = java.lang.String

type RoomIdentifier = java.lang.String

type RoomList = js.Array[RoomSummary]

type RoomMaxMessageLength = Double

type RoomMaxMessageRatePerSecond = Double

type RoomName = java.lang.String

type SessionDurationInMinutes = Double

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = StringDictionary[TagValue]

type Time = js.Date

type UpdateLoggingConfigurationState = ACTIVE | java.lang.String

type UserID = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-07-14`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
