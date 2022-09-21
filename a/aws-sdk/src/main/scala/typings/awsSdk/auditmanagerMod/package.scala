package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.S3
import typings.awsSdk.awsSdkStrings.SELECT_FROM_LIST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccounts = js.Array[AWSAccount]

type AWSServiceName = java.lang.String

type AWSServices = js.Array[AWSService]

type AccountId = java.lang.String

type AccountName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.PENDING_ACTIVATION
  - java.lang.String
*/
type AccountStatus = _AccountStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE
  - typings.awsSdk.awsSdkStrings.UPDATE_METADATA
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.DELETE
  - typings.awsSdk.awsSdkStrings.UNDER_REVIEW
  - typings.awsSdk.awsSdkStrings.REVIEWED
  - typings.awsSdk.awsSdkStrings.IMPORT_EVIDENCE
  - java.lang.String
*/
type ActionEnum = _ActionEnum | java.lang.String

type ActionPlanInstructions = java.lang.String

type ActionPlanTitle = java.lang.String

type AssessmentControlSets = js.Array[AssessmentControlSet]

type AssessmentControls = js.Array[AssessmentControl]

type AssessmentDescription = java.lang.String

type AssessmentEvidenceFolderName = java.lang.String

type AssessmentEvidenceFolders = js.Array[AssessmentEvidenceFolder]

type AssessmentFrameworkDescription = java.lang.String

type AssessmentFrameworkShareRequestList = js.Array[AssessmentFrameworkShareRequest]

type AssessmentName = java.lang.String

type AssessmentReportDescription = java.lang.String

type AssessmentReportDestinationType = S3 | java.lang.String

type AssessmentReportEvidenceErrors = js.Array[AssessmentReportEvidenceError]

type AssessmentReportName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AssessmentReportStatus = _AssessmentReportStatus | java.lang.String

type AssessmentReportsMetadata = js.Array[AssessmentReportMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type AssessmentStatus = _AssessmentStatus | java.lang.String

type AuditManagerArn = java.lang.String

type BatchCreateDelegationByAssessmentErrors = js.Array[BatchCreateDelegationByAssessmentError]

type BatchDeleteDelegationByAssessmentErrors = js.Array[BatchDeleteDelegationByAssessmentError]

type BatchImportEvidenceToAssessmentControlErrors = js.Array[BatchImportEvidenceToAssessmentControlError]

type Boolean = scala.Boolean

type ChangeLogs = js.Array[ChangeLog]

type ComplianceType = java.lang.String

type ControlCommentBody = java.lang.String

type ControlComments = js.Array[ControlComment]

type ControlDescription = java.lang.String

type ControlDomainInsightsList = js.Array[ControlDomainInsights]

type ControlInsightsMetadata = js.Array[ControlInsightsMetadataItem]

type ControlInsightsMetadataByAssessment = js.Array[ControlInsightsMetadataByAssessmentItem]

type ControlMappingSources = js.Array[ControlMappingSource]

type ControlMetadataList = js.Array[ControlMetadata]

type ControlName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MANUAL
  - typings.awsSdk.awsSdkStrings.AUTOMATE
  - typings.awsSdk.awsSdkStrings.DEFER
  - typings.awsSdk.awsSdkStrings.IGNORE
  - java.lang.String
*/
type ControlResponse = _ControlResponse | java.lang.String

type ControlSetId = java.lang.String

type ControlSetName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UNDER_REVIEW
  - typings.awsSdk.awsSdkStrings.REVIEWED
  - java.lang.String
*/
type ControlSetStatus = _ControlSetStatus | java.lang.String

type ControlSets = js.Array[ControlSet]

type ControlSetsCount = Double

type ControlSources = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNDER_REVIEW
  - typings.awsSdk.awsSdkStrings.REVIEWED
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type ControlStatus = _ControlStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Standard_
  - typings.awsSdk.awsSdkStrings.Custom_
  - java.lang.String
*/
type ControlType = _ControlType | java.lang.String

type Controls = js.Array[Control]

type ControlsCount = Double

type CreateAssessmentFrameworkControlSets = js.Array[CreateAssessmentFrameworkControlSet]

type CreateAssessmentFrameworkControls = js.Array[CreateAssessmentFrameworkControl]

type CreateControlMappingSources = js.Array[CreateControlMappingSource]

type CreateDelegationRequests = js.Array[CreateDelegationRequest]

type CreatedBy = java.lang.String

type DelegationComment = java.lang.String

type DelegationIds = js.Array[UUID]

type DelegationMetadataList = js.Array[DelegationMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UNDER_REVIEW
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - java.lang.String
*/
type DelegationStatus = _DelegationStatus | java.lang.String

type Delegations = js.Array[Delegation]

type EmailAddress = java.lang.String

type ErrorCode = java.lang.String

type ErrorMessage = java.lang.String

type EventName = java.lang.String

type EvidenceAttributeKey = java.lang.String

type EvidenceAttributeValue = java.lang.String

type EvidenceAttributes = StringDictionary[EvidenceAttributeValue]

type EvidenceIds = js.Array[UUID]

type EvidenceList = js.Array[Evidence]

type EvidenceSources = js.Array[NonEmptyString]

type Filename = java.lang.String

type FrameworkDescription = java.lang.String

type FrameworkMetadataList = js.Array[AssessmentFrameworkMetadata]

type FrameworkName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Standard_
  - typings.awsSdk.awsSdkStrings.Custom_
  - java.lang.String
*/
type FrameworkType = _FrameworkType | java.lang.String

type GenericArn = java.lang.String

type HyperlinkName = java.lang.String

type IamArn = java.lang.String

type Integer = Double

type KeywordInputType = SELECT_FROM_LIST | java.lang.String

type KeywordValue = java.lang.String

type Keywords = js.Array[KeywordValue]

type KmsKey = java.lang.String

type LastUpdatedBy = java.lang.String

type ListAssessmentMetadata = js.Array[AssessmentMetadataItem]

type ManualEvidenceList = js.Array[ManualEvidence]

type MaxResults = Double

type NonEmptyString = java.lang.String

type Notifications = js.Array[Notification]

type NullableInteger = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASSESSMENT
  - typings.awsSdk.awsSdkStrings.CONTROL_SET
  - typings.awsSdk.awsSdkStrings.CONTROL
  - typings.awsSdk.awsSdkStrings.DELEGATION
  - typings.awsSdk.awsSdkStrings.ASSESSMENT_REPORT
  - java.lang.String
*/
type ObjectTypeEnum = _ObjectTypeEnum | java.lang.String

type Region = java.lang.String

type Resources = js.Array[Resource]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROCESS_OWNER
  - typings.awsSdk.awsSdkStrings.RESOURCE_OWNER
  - java.lang.String
*/
type RoleType = _RoleType | java.lang.String

type Roles = js.Array[Role]

type S3Url = java.lang.String

type SNSTopic = java.lang.String

type ServiceMetadataList = js.Array[ServiceMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.IS_AWS_ORG_ENABLED
  - typings.awsSdk.awsSdkStrings.SNS_TOPIC
  - typings.awsSdk.awsSdkStrings.DEFAULT_ASSESSMENT_REPORTS_DESTINATION
  - typings.awsSdk.awsSdkStrings.DEFAULT_PROCESS_OWNERS
  - java.lang.String
*/
type SettingAttribute = _SettingAttribute | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCEPT
  - typings.awsSdk.awsSdkStrings.DECLINE
  - typings.awsSdk.awsSdkStrings.REVOKE
  - java.lang.String
*/
type ShareRequestAction = _ShareRequestAction | java.lang.String

type ShareRequestComment = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.REPLICATING
  - typings.awsSdk.awsSdkStrings.SHARED
  - typings.awsSdk.awsSdkStrings.EXPIRING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - typings.awsSdk.awsSdkStrings.DECLINED
  - typings.awsSdk.awsSdkStrings.REVOKED
  - java.lang.String
*/
type ShareRequestStatus = _ShareRequestStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SENT
  - typings.awsSdk.awsSdkStrings.RECEIVED
  - java.lang.String
*/
type ShareRequestType = _ShareRequestType | java.lang.String

type SnsArn = java.lang.String

type SourceDescription = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DAILY
  - typings.awsSdk.awsSdkStrings.WEEKLY
  - typings.awsSdk.awsSdkStrings.MONTHLY
  - java.lang.String
*/
type SourceFrequency = _SourceFrequency | java.lang.String

type SourceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.System_Controls_Mapping
  - typings.awsSdk.awsSdkStrings.Procedural_Controls_Mapping
  - java.lang.String
*/
type SourceSetUpOption = _SourceSetUpOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_Cloudtrail
  - typings.awsSdk.awsSdkStrings.AWS_Config
  - typings.awsSdk.awsSdkStrings.AWS_Security_Hub
  - typings.awsSdk.awsSdkStrings.AWS_API_Call_
  - typings.awsSdk.awsSdkStrings.MANUAL
  - java.lang.String
*/
type SourceType = _SourceType | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TestingInformation = java.lang.String

type Timestamp = js.Date

type TimestampUUID = java.lang.String

type Token = java.lang.String

type TroubleshootingText = java.lang.String

type UUID = java.lang.String

type UpdateAssessmentFrameworkControlSets = js.Array[UpdateAssessmentFrameworkControlSet]

type UrlLink = java.lang.String

type Username = java.lang.String

type ValidationErrors = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-07-25`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type organizationId = java.lang.String
