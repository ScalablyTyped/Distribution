package typings.awsSdk.clientsCodecatalystMod

import typings.awsSdk.awsSdkStrings.hasAccessTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessTokenId = java.lang.String

type AccessTokenName = java.lang.String

type AccessTokenSecret = java.lang.String

type AccessTokenSummaries = js.Array[AccessTokenSummary]

type Boolean = scala.Boolean

type ClientToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQ
  - typings.awsSdk.awsSdkStrings.GT
  - typings.awsSdk.awsSdkStrings.GE
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.LE
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | java.lang.String

type CreateDevEnvironmentRequestAliasString = java.lang.String

type DevEnvironmentRepositorySummaries = js.Array[DevEnvironmentRepositorySummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SSM
  - typings.awsSdk.awsSdkStrings.SSH
  - java.lang.String
*/
type DevEnvironmentSessionType = _DevEnvironmentSessionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type DevEnvironmentStatus = _DevEnvironmentStatus | java.lang.String

type DevEnvironmentSummaryAliasString = java.lang.String

type DevEnvironmentSummaryCreatorIdString = java.lang.String

type DevEnvironmentSummaryList = js.Array[DevEnvironmentSummary]

type EventLogEntries = js.Array[EventLogEntry]

type ExecuteCommandSessionConfigurationArguments = js.Array[ExecuteCommandSessionConfigurationArgumentsMemberString]

type ExecuteCommandSessionConfigurationArgumentsMemberString = java.lang.String

type ExecuteCommandSessionConfigurationCommandString = java.lang.String

type FilterKey = hasAccessTo | java.lang.String

type Filters = js.Array[Filter]

type GetDevEnvironmentResponseAliasString = java.lang.String

type GetDevEnvironmentResponseCreatorIdString = java.lang.String

type GetUserDetailsRequestIdString = java.lang.String

type GetUserDetailsRequestUserNameString = java.lang.String

type IdeConfigurationList = js.Array[IdeConfiguration]

type IdeConfigurationNameString = java.lang.String

type IdeConfigurationRuntimeString = java.lang.String

type IdeNameString = java.lang.String

type IdeRuntimeString = java.lang.String

type Ides = js.Array[Ide]

type InactivityTimeoutMinutes = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.devDotstandard1Dotsmall
  - typings.awsSdk.awsSdkStrings.devDotstandard1Dotmedium
  - typings.awsSdk.awsSdkStrings.devDotstandard1Dotlarge
  - typings.awsSdk.awsSdkStrings.devDotstandard1Dotxlarge
  - java.lang.String
*/
type InstanceType = _InstanceType | java.lang.String

type ListAccessTokensRequestMaxResultsInteger = Double

type ListAccessTokensRequestNextTokenString = java.lang.String

type ListDevEnvironmentsRequestMaxResultsInteger = Double

type ListDevEnvironmentsRequestNextTokenString = java.lang.String

type ListEventLogsRequestMaxResultsInteger = Double

type ListEventLogsRequestNextTokenString = java.lang.String

type ListProjectsRequestMaxResultsInteger = Double

type ListProjectsRequestNextTokenString = java.lang.String

type ListSourceRepositoriesItems = js.Array[ListSourceRepositoriesItem]

type ListSourceRepositoriesRequestMaxResultsInteger = Double

type ListSourceRepositoriesRequestNextTokenString = java.lang.String

type ListSourceRepositoryBranchesItems = js.Array[ListSourceRepositoryBranchesItem]

type ListSourceRepositoryBranchesRequestMaxResultsInteger = Double

type ListSourceRepositoryBranchesRequestNextTokenString = java.lang.String

type ListSpacesRequestNextTokenString = java.lang.String

type NameString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READONLY
  - typings.awsSdk.awsSdkStrings.MUTATION
  - java.lang.String
*/
type OperationType = _OperationType | java.lang.String

type PersistentStorageConfigurationSizeInGiBInteger = Double

type PersistentStorageSizeInGiBInteger = Double

type ProjectDescription = java.lang.String

type ProjectDisplayName = java.lang.String

type ProjectListFilters = js.Array[ProjectListFilter]

type ProjectSummaries = js.Array[ProjectSummary]

type RegionString = java.lang.String

type RepositoriesInput = js.Array[RepositoryInput]

type SensitiveString = java.lang.String

type SourceRepositoryBranchRefString = java.lang.String

type SourceRepositoryBranchString = java.lang.String

type SourceRepositoryDescriptionString = java.lang.String

type SourceRepositoryIdString = java.lang.String

type SourceRepositoryNameString = java.lang.String

type SpaceSummaries = js.Array[SpaceSummary]

type StartDevEnvironmentSessionResponseSessionIdString = java.lang.String

type StatusReason = java.lang.String

type StopDevEnvironmentSessionRequestSessionIdString = java.lang.String

type StopDevEnvironmentSessionResponseSessionIdString = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type SyntheticTimestampDateTime = js.Date

type Timestamp = js.Date

type UpdateDevEnvironmentRequestAliasString = java.lang.String

type UpdateDevEnvironmentResponseAliasString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.AWS_ACCOUNT
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type UserType = _UserType | java.lang.String

type Uuid = java.lang.String

type VerifySessionResponseIdentityString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2022-09-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
