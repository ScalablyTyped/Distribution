package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AcceptCode = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IGNORE
  - typings.awsSdk.awsSdkStrings.ENFORCE
  - java.lang.String
*/
type AcceptCodeValidation = _AcceptCodeValidation | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DELIVERED
  - typings.awsSdk.awsSdkStrings.READ
  - java.lang.String
*/
type AcceptType = _AcceptType | String

type ActivationCode = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVATED
  - typings.awsSdk.awsSdkStrings.NOT_ACTIVATED
  - java.lang.String
*/
type ActivationStatus = _ActivationStatus | String

type AmazonResourceName = String

type ChannelName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SMS
  - typings.awsSdk.awsSdkStrings.VOICE
  - typings.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
type ChannelType = _ChannelType | String

type ContactAlias = String

type ContactChannelList = js.Array[ContactChannel]

type ContactName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PERSONAL
  - typings.awsSdk.awsSdkStrings.ESCALATION
  - java.lang.String
*/
type ContactType = _ContactType | String

type ContactsList = js.Array[Contact]

type Content = String

type DateTime = js.Date

type DeferActivation = Boolean

type EngagementsList = js.Array[Engagement]

type IdempotencyToken = String

type IncidentId = String

type IsEssential = Boolean

type MaxResults = Double

type PagesList = js.Array[Page]

type PaginationToken = String

type Policy = String

type PublicContent = String

type PublicSubject = String

type ReceiptInfo = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DELIVERED
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.READ
  - typings.awsSdk.awsSdkStrings.SENT
  - typings.awsSdk.awsSdkStrings.STOP
  - java.lang.String
*/
type ReceiptType = _ReceiptType | String

type ReceiptsList = js.Array[Receipt]

type RetryIntervalInMinutes = Double

type Sender = String

type SimpleAddress = String

type SsmContactsArn = String

type StageDurationInMins = Double

type StagesList = js.Array[Stage]

type StopReason = String

type Subject = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagValue = String

type TagsList = js.Array[Tag]

type TargetsList = js.Array[Target]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-05-03`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
