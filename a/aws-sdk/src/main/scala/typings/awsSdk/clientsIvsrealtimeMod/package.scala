package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.INSUFFICIENT_CAPABILITIES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DisconnectParticipantReason = java.lang.String

type EventErrorCode = INSUFFICIENT_CAPABILITIES | java.lang.String

type EventList = js.Array[Event]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JOINED
  - typings.awsSdk.awsSdkStrings.LEFT
  - typings.awsSdk.awsSdkStrings.PUBLISH_STARTED
  - typings.awsSdk.awsSdkStrings.PUBLISH_STOPPED
  - typings.awsSdk.awsSdkStrings.SUBSCRIBE_STARTED
  - typings.awsSdk.awsSdkStrings.SUBSCRIBE_STOPPED
  - typings.awsSdk.awsSdkStrings.PUBLISH_ERROR
  - typings.awsSdk.awsSdkStrings.SUBSCRIBE_ERROR
  - typings.awsSdk.awsSdkStrings.JOIN_ERROR
  - java.lang.String
*/
type EventName = _EventName | java.lang.String

type MaxParticipantEventResults = Double

type MaxParticipantResults = Double

type MaxStageResults = Double

type MaxStageSessionResults = Double

type PaginationToken = java.lang.String

type ParticipantAttributes = StringDictionary[String]

type ParticipantId = java.lang.String

type ParticipantList = js.Array[ParticipantSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONNECTED
  - typings.awsSdk.awsSdkStrings.DISCONNECTED
  - java.lang.String
*/
type ParticipantState = _ParticipantState | java.lang.String

type ParticipantTokenAttributes = StringDictionary[String]

type ParticipantTokenCapabilities = js.Array[ParticipantTokenCapability]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLISH
  - typings.awsSdk.awsSdkStrings.SUBSCRIBE
  - java.lang.String
*/
type ParticipantTokenCapability = _ParticipantTokenCapability | java.lang.String

type ParticipantTokenConfigurations = js.Array[ParticipantTokenConfiguration]

type ParticipantTokenDurationMinutes = Double

type ParticipantTokenExpirationTime = js.Date

type ParticipantTokenId = java.lang.String

type ParticipantTokenList = js.Array[ParticipantToken]

type ParticipantTokenString = java.lang.String

type ParticipantTokenUserId = java.lang.String

type Published = Boolean

type ResourceArn = java.lang.String

type StageArn = java.lang.String

type StageName = java.lang.String

type StageSessionId = java.lang.String

type StageSessionList = js.Array[StageSessionSummary]

type StageSummaryList = js.Array[StageSummary]

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = StringDictionary[TagValue]

type Time = js.Date

type UserId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-07-14`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
