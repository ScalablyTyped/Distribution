package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.SSM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AdditionalInfoMap = StringDictionary[AdditionalInfoValueList]

type AdditionalInfoValueList = js.Array[String1024]

type AlarmRecommendationList = js.Array[AlarmRecommendation]

type AlarmReferenceIdList = js.Array[String500]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Metric_
  - typings.awsSdk.awsSdkStrings.Composite
  - typings.awsSdk.awsSdkStrings.Canary_
  - typings.awsSdk.awsSdkStrings.Logs
  - typings.awsSdk.awsSdkStrings.Event_
  - java.lang.String
*/
type AlarmType = _AlarmType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Disabled_
  - typings.awsSdk.awsSdkStrings.Daily_
  - java.lang.String
*/
type AppAssessmentScheduleType = _AppAssessmentScheduleType | String

type AppAssessmentSummaryList = js.Array[AppAssessmentSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PolicyBreached
  - typings.awsSdk.awsSdkStrings.PolicyMet
  - typings.awsSdk.awsSdkStrings.NotAssessed
  - typings.awsSdk.awsSdkStrings.ChangesDetected
  - java.lang.String
*/
type AppComplianceStatusType = _AppComplianceStatusType | String

type AppComponentList = js.Array[AppComponent]

type AppComponentNameList = js.Array[String255]

type AppInputSourceList = js.Array[AppInputSource]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - java.lang.String
*/
type AppStatusType = _AppStatusType | String

type AppSummaryList = js.Array[AppSummary]

type AppTemplateBody = String

type AppVersionList = js.Array[AppVersionSummary]

type Arn = String

type ArnList = js.Array[Arn]

type AssessmentCompliance = StringDictionary[DisruptionCompliance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.User_
  - typings.awsSdk.awsSdkStrings.System_
  - java.lang.String
*/
type AssessmentInvoker = _AssessmentInvoker | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Success_
  - java.lang.String
*/
type AssessmentStatus = _AssessmentStatus | String

type AssessmentStatusList = js.Array[AssessmentStatus]

type AwsRegion = String

type BooleanOptional = Boolean

type ClientToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PolicyBreached
  - typings.awsSdk.awsSdkStrings.PolicyMet
  - java.lang.String
*/
type ComplianceStatus = _ComplianceStatus | String

type ComponentCompliancesList = js.Array[AppComponentCompliance]

type ComponentRecommendationList = js.Array[ComponentRecommendation]

type ConfigRecommendationList = js.Array[ConfigRecommendation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LeastCost
  - typings.awsSdk.awsSdkStrings.LeastChange
  - typings.awsSdk.awsSdkStrings.BestAZRecovery
  - typings.awsSdk.awsSdkStrings.LeastErrors
  - typings.awsSdk.awsSdkStrings.BestAttainable
  - typings.awsSdk.awsSdkStrings.BestRegionRecovery
  - java.lang.String
*/
type ConfigRecommendationOptimizationType = _ConfigRecommendationOptimizationType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Hourly_
  - typings.awsSdk.awsSdkStrings.Daily_
  - typings.awsSdk.awsSdkStrings.Monthly_
  - typings.awsSdk.awsSdkStrings.Yearly_
  - java.lang.String
*/
type CostFrequency = _CostFrequency | String

type CurrencyCode = String

type CustomerId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AnyLocation
  - typings.awsSdk.awsSdkStrings.SameContinent
  - typings.awsSdk.awsSdkStrings.SameCountry
  - java.lang.String
*/
type DataLocationConstraint = _DataLocationConstraint | String

type DisruptionPolicy = StringDictionary[FailurePolicy]

type DisruptionResiliencyScore = StringDictionary[Double]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Software_
  - typings.awsSdk.awsSdkStrings.Hardware
  - typings.awsSdk.awsSdkStrings.AZ
  - typings.awsSdk.awsSdkStrings.Region_
  - java.lang.String
*/
type DisruptionType = _DisruptionType | String

type DocumentName = String

type Double = scala.Double

type EksNamespace = String

type EksNamespaceList = js.Array[EksNamespace]

type EksSourceList = js.Array[EksSource]

type EntityDescription = String

type EntityId = String

type EntityName = String

type EntityNameList = js.Array[EntityName]

type EntityVersion = String

type ErrorMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.L1
  - typings.awsSdk.awsSdkStrings.L2
  - typings.awsSdk.awsSdkStrings.L3
  - typings.awsSdk.awsSdkStrings.L4
  - java.lang.String
*/
type EstimatedCostTier = _EstimatedCostTier | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MultiSite
  - typings.awsSdk.awsSdkStrings.WarmStandby
  - typings.awsSdk.awsSdkStrings.PilotLight
  - typings.awsSdk.awsSdkStrings.BackupAndRestore
  - typings.awsSdk.awsSdkStrings.NoRecoveryPlan
  - java.lang.String
*/
type HaArchitecture = _HaArchitecture | String

type Integer = scala.Double

type MaxResults = scala.Double

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Arn_
  - typings.awsSdk.awsSdkStrings.Native
  - java.lang.String
*/
type PhysicalIdentifierType = _PhysicalIdentifierType | String

type PhysicalResourceList = js.Array[PhysicalResource]

type RecommendationCompliance = StringDictionary[RecommendationDisruptionCompliance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BreachedUnattainable
  - typings.awsSdk.awsSdkStrings.BreachedCanMeet
  - typings.awsSdk.awsSdkStrings.MetCanImprove
  - java.lang.String
*/
type RecommendationComplianceStatus = _RecommendationComplianceStatus | String

type RecommendationIdList = js.Array[Uuid]

type RecommendationItemList = js.Array[RecommendationItem]

type RecommendationTemplateList = js.Array[RecommendationTemplate]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Success_
  - java.lang.String
*/
type RecommendationTemplateStatus = _RecommendationTemplateStatus | String

type RecommendationTemplateStatusList = js.Array[RecommendationTemplateStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Alarm_
  - typings.awsSdk.awsSdkStrings.Sop
  - typings.awsSdk.awsSdkStrings.Test_
  - java.lang.String
*/
type RenderRecommendationType = _RenderRecommendationType | String

type RenderRecommendationTypeList = js.Array[RenderRecommendationType]

type ResiliencyPolicies = js.Array[ResiliencyPolicy]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MissionCritical
  - typings.awsSdk.awsSdkStrings.Critical_
  - typings.awsSdk.awsSdkStrings.Important
  - typings.awsSdk.awsSdkStrings.CoreServices
  - typings.awsSdk.awsSdkStrings.NonCritical
  - java.lang.String
*/
type ResiliencyPolicyTier = _ResiliencyPolicyTier | String

type ResourceErrorList = js.Array[ResourceError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Success_
  - java.lang.String
*/
type ResourceImportStatusType = _ResourceImportStatusType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AddOnly
  - typings.awsSdk.awsSdkStrings.ReplaceAll
  - java.lang.String
*/
type ResourceImportStrategyType = _ResourceImportStrategyType | String

type ResourceMappingList = js.Array[ResourceMapping]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CfnStack
  - typings.awsSdk.awsSdkStrings.Resource_
  - typings.awsSdk.awsSdkStrings.AppRegistryApp
  - typings.awsSdk.awsSdkStrings.ResourceGroup
  - typings.awsSdk.awsSdkStrings.Terraform_
  - typings.awsSdk.awsSdkStrings.EKS
  - java.lang.String
*/
type ResourceMappingType = _ResourceMappingType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Success_
  - java.lang.String
*/
type ResourceResolutionStatusType = _ResourceResolutionStatusType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AppTemplate
  - typings.awsSdk.awsSdkStrings.Discovered_
  - java.lang.String
*/
type ResourceSourceType = _ResourceSourceType | String

type S3Url = String

type Seconds = scala.Double

type SopRecommendationList = js.Array[SopRecommendation]

type SopServiceType = SSM | String

type SpecReferenceId = String

type String1024 = String

type String128WithoutWhitespace = String

type String2048 = String

type String255 = String

type String255List = js.Array[String255]

type String500 = String

type SuggestedChangesList = js.Array[EntityDescription]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CfnYaml
  - typings.awsSdk.awsSdkStrings.CfnJson
  - java.lang.String
*/
type TemplateFormat = _TemplateFormat | String

type TerraformSourceList = js.Array[TerraformSource]

type TestRecommendationList = js.Array[TestRecommendation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Small_
  - typings.awsSdk.awsSdkStrings.Medium_
  - typings.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
type TestRisk = _TestRisk | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Software_
  - typings.awsSdk.awsSdkStrings.Hardware
  - typings.awsSdk.awsSdkStrings.AZ
  - typings.awsSdk.awsSdkStrings.Region_
  - java.lang.String
*/
type TestType = _TestType | String

type TimeStamp = js.Date

type UnsupportedResourceList = js.Array[UnsupportedResource]

type Uuid = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-04-30`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
