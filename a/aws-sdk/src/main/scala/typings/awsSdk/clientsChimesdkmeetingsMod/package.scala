package typings.awsSdk.clientsChimesdkmeetingsMod

import typings.awsSdk.awsSdkStrings.PHI
import typings.awsSdk.awsSdkStrings.PII
import typings.awsSdk.awsSdkStrings.`en-US`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = java.lang.String

type Arn = java.lang.String

type AttendeeIdsList = js.Array[AttendeeIdItem]

type AttendeeList = js.Array[Attendee]

type BatchCreateAttendeeErrorList = js.Array[CreateAttendeeError]

type Boolean = scala.Boolean

type ClientRequestToken = java.lang.String

type CreateAttendeeRequestItemList = js.Array[CreateAttendeeRequestItem]

type CreateMeetingWithAttendeesRequestItemList = js.Array[CreateAttendeeRequestItem]

type ExternalMeetingId = java.lang.String

type ExternalUserId = java.lang.String

type GuidString = java.lang.String

type JoinTokenString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SendReceive
  - typings.awsSdk.awsSdkStrings.Send_
  - typings.awsSdk.awsSdkStrings.Receive_
  - typings.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type MediaCapabilities = _MediaCapabilities | java.lang.String

type MediaRegion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.UNAVAILABLE
  - java.lang.String
*/
type MeetingFeatureStatus = _MeetingFeatureStatus | java.lang.String

type PrimaryMeetingId = java.lang.String

type ResultMax = Double

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TenantId = java.lang.String

type TenantIdList = js.Array[TenantId]

type TranscribeContentIdentificationType = PII | java.lang.String

type TranscribeContentRedactionType = PII | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`en-US`
  - typings.awsSdk.awsSdkStrings.`en-GB`
  - typings.awsSdk.awsSdkStrings.`es-US`
  - typings.awsSdk.awsSdkStrings.`fr-CA`
  - typings.awsSdk.awsSdkStrings.`fr-FR`
  - typings.awsSdk.awsSdkStrings.`en-AU`
  - typings.awsSdk.awsSdkStrings.`it-IT`
  - typings.awsSdk.awsSdkStrings.`de-DE`
  - typings.awsSdk.awsSdkStrings.`pt-BR`
  - typings.awsSdk.awsSdkStrings.`ja-JP`
  - typings.awsSdk.awsSdkStrings.`ko-KR`
  - typings.awsSdk.awsSdkStrings.`zh-CN`
  - java.lang.String
*/
type TranscribeLanguageCode = _TranscribeLanguageCode | java.lang.String

type TranscribeLanguageModelName = java.lang.String

type TranscribeLanguageOptions = java.lang.String

type TranscribeMedicalContentIdentificationType = PHI | java.lang.String

type TranscribeMedicalLanguageCode = `en-US` | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`us-east-1`
  - typings.awsSdk.awsSdkStrings.`us-east-2`
  - typings.awsSdk.awsSdkStrings.`us-west-2`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typings.awsSdk.awsSdkStrings.`ca-central-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-1`
  - typings.awsSdk.awsSdkStrings.auto__
  - java.lang.String
*/
type TranscribeMedicalRegion = _TranscribeMedicalRegion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRIMARYCARE
  - typings.awsSdk.awsSdkStrings.CARDIOLOGY
  - typings.awsSdk.awsSdkStrings.NEUROLOGY
  - typings.awsSdk.awsSdkStrings.ONCOLOGY
  - typings.awsSdk.awsSdkStrings.RADIOLOGY
  - typings.awsSdk.awsSdkStrings.UROLOGY
  - java.lang.String
*/
type TranscribeMedicalSpecialty = _TranscribeMedicalSpecialty | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONVERSATION
  - typings.awsSdk.awsSdkStrings.DICTATION
  - java.lang.String
*/
type TranscribeMedicalType = _TranscribeMedicalType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.low__
  - typings.awsSdk.awsSdkStrings.medium__
  - typings.awsSdk.awsSdkStrings.high__
  - java.lang.String
*/
type TranscribePartialResultsStability = _TranscribePartialResultsStability | java.lang.String

type TranscribePiiEntityTypes = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`us-east-2`
  - typings.awsSdk.awsSdkStrings.`us-east-1`
  - typings.awsSdk.awsSdkStrings.`us-west-2`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typings.awsSdk.awsSdkStrings.`ca-central-1`
  - typings.awsSdk.awsSdkStrings.`eu-central-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-2`
  - typings.awsSdk.awsSdkStrings.`sa-east-1`
  - typings.awsSdk.awsSdkStrings.auto__
  - typings.awsSdk.awsSdkStrings.`us-gov-west-1`
  - java.lang.String
*/
type TranscribeRegion = _TranscribeRegion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.remove__
  - typings.awsSdk.awsSdkStrings.mask__
  - typings.awsSdk.awsSdkStrings.tag_
  - java.lang.String
*/
type TranscribeVocabularyFilterMethod = _TranscribeVocabularyFilterMethod | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-07-15`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
