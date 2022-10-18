package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArtifactId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.APPROVED
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - java.lang.String
*/
type ArtifactStatus = _ArtifactStatus | String

type AttachmentIdList = js.Array[ArtifactId]

type AttachmentName = String

type AttachmentSizeInBytes = Double

type Attachments = js.Array[AttachmentItem]

type Bool = Boolean

type ChatContent = String

type ChatContentType = String

type ChatItemId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TYPING
  - typings.awsSdk.awsSdkStrings.PARTICIPANT_JOINED
  - typings.awsSdk.awsSdkStrings.PARTICIPANT_LEFT
  - typings.awsSdk.awsSdkStrings.CHAT_ENDED
  - typings.awsSdk.awsSdkStrings.TRANSFER_SUCCEEDED
  - typings.awsSdk.awsSdkStrings.TRANSFER_FAILED
  - typings.awsSdk.awsSdkStrings.MESSAGE
  - typings.awsSdk.awsSdkStrings.EVENT
  - typings.awsSdk.awsSdkStrings.ATTACHMENT
  - typings.awsSdk.awsSdkStrings.CONNECTION_ACK
  - java.lang.String
*/
type ChatItemType = _ChatItemType | String

type ClientToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WEBSOCKET
  - typings.awsSdk.awsSdkStrings.CONNECTION_CREDENTIALS
  - java.lang.String
*/
type ConnectionType = _ConnectionType | String

type ConnectionTypeList = js.Array[ConnectionType]

type ContactId = String

type ContentType = String

type DisplayName = String

type ISO8601Datetime = String

type Instant = String

type MaxResults = Double

type MostRecent = Double

type NextToken = String

type NonEmptyClientToken = String

type ParticipantId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AGENT
  - typings.awsSdk.awsSdkStrings.CUSTOMER
  - typings.awsSdk.awsSdkStrings.SYSTEM
  - java.lang.String
*/
type ParticipantRole = _ParticipantRole | String

type ParticipantToken = String

type PreSignedAttachmentUrl = String

type PreSignedConnectionUrl = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FORWARD
  - typings.awsSdk.awsSdkStrings.BACKWARD
  - java.lang.String
*/
type ScanDirection = _ScanDirection | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - java.lang.String
*/
type SortKey = _SortKey | String

type Transcript = js.Array[Item]

type UploadMetadataSignedHeaders = StringDictionary[UploadMetadataSignedHeadersValue]

type UploadMetadataSignedHeadersKey = String

type UploadMetadataSignedHeadersValue = String

type UploadMetadataUrl = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-09-07`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
