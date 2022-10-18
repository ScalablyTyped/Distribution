package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type AccountIdExtendedList = js.Array[AccountId]

type AccountIdList = js.Array[AccountId]

type AccountList = js.Array[Account]

type AdministratorList = js.Array[Administrator]

type Boolean = scala.Boolean

type ByteValue = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DETECTIVE_CORE
  - typings.awsSdk.awsSdkStrings.EKS_AUDIT
  - java.lang.String
*/
type DatasourcePackage = _DatasourcePackage | String

type DatasourcePackageIngestDetails = StringDictionary[DatasourcePackageIngestDetail]

type DatasourcePackageIngestHistory = StringDictionary[LastIngestStateChangeDates]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DatasourcePackageIngestState = _DatasourcePackageIngestState | String

type DatasourcePackageIngestStates = StringDictionary[DatasourcePackageIngestState]

type DatasourcePackageList = js.Array[DatasourcePackage]

type EmailAddress = String

type EmailMessage = String

type GraphArn = String

type GraphArnList = js.Array[GraphArn]

type GraphList = js.Array[Graph]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INVITATION
  - typings.awsSdk.awsSdkStrings.ORGANIZATION
  - java.lang.String
*/
type InvitationType = _InvitationType | String

type LastIngestStateChangeDates = StringDictionary[TimestampForCollection]

type MemberDetailList = js.Array[MemberDetail]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VOLUME_TOO_HIGH
  - typings.awsSdk.awsSdkStrings.VOLUME_UNKNOWN
  - java.lang.String
*/
type MemberDisabledReason = _MemberDisabledReason | String

type MemberResultsLimit = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INVITED
  - typings.awsSdk.awsSdkStrings.VERIFICATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.VERIFICATION_FAILED
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.ACCEPTED_BUT_DISABLED
  - java.lang.String
*/
type MemberStatus = _MemberStatus | String

type MembershipDatasourcesList = js.Array[MembershipDatasources]

type PaginationToken = String

type Percentage = Double

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type Timestamp = js.Date

type UnprocessedAccountList = js.Array[UnprocessedAccount]

type UnprocessedGraphList = js.Array[UnprocessedGraph]

type UnprocessedReason = String

type VolumeUsageByDatasourcePackage = StringDictionary[DatasourcePackageUsageInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-10-26`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
