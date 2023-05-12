package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.DEPRECATED
import typings.awsSdk.awsSdkStrings.DOCKER
import typings.awsSdk.awsSdkStrings.ECR
import typings.awsSdk.awsSdkStrings.SHELL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type AccountList = js.Array[AccountId]

type AmiList = js.Array[Ami]

type AmiNameString = String

type Arn = String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER_INITIATED
  - typings.awsSdk.awsSdkStrings.SCHEDULED
  - typings.awsSdk.awsSdkStrings.IMPORT
  - java.lang.String
*/
type BuildType = _BuildType | String

type ClientToken = String

type ComponentBuildVersionArn = String

type ComponentConfigurationList = js.Array[ComponentConfiguration]

type ComponentData = String

type ComponentFormat = SHELL | String

type ComponentParameterDescription = String

type ComponentParameterDetailList = js.Array[ComponentParameterDetail]

type ComponentParameterList = js.Array[ComponentParameter]

type ComponentParameterName = String

type ComponentParameterType = String

type ComponentParameterValue = String

type ComponentParameterValueList = js.Array[ComponentParameterValue]

type ComponentStatus = DEPRECATED | String

type ComponentSummaryList = js.Array[ComponentSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BUILD
  - typings.awsSdk.awsSdkStrings.TEST
  - java.lang.String
*/
type ComponentType = _ComponentType | String

type ComponentVersionArn = String

type ComponentVersionArnOrBuildVersionArn = String

type ComponentVersionList = js.Array[ComponentVersion]

type ContainerList = js.Array[Container]

type ContainerRecipeArn = String

type ContainerRecipeSummaryList = js.Array[ContainerRecipeSummary]

type ContainerRepositoryService = ECR | String

type ContainerType = DOCKER | String

type CvssScoreAdjustmentList = js.Array[CvssScoreAdjustment]

type CvssScoreList = js.Array[CvssScore]

type DateTime = String

type DateTimeTimestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VMDK
  - typings.awsSdk.awsSdkStrings.RAW
  - typings.awsSdk.awsSdkStrings.VHD
  - java.lang.String
*/
type DiskImageFormat = _DiskImageFormat | String

type DistributionConfigurationArn = String

type DistributionConfigurationSummaryList = js.Array[DistributionConfigurationSummary]

type DistributionList = js.Array[Distribution]

type DistributionTimeoutMinutes = Double

type DockerFileTemplate = String

type EbsIopsInteger = Double

type EbsVolumeSizeInteger = Double

type EbsVolumeThroughput = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.standard__
  - typings.awsSdk.awsSdkStrings.io1_
  - typings.awsSdk.awsSdkStrings.io2_
  - typings.awsSdk.awsSdkStrings.gp2_
  - typings.awsSdk.awsSdkStrings.gp3_
  - typings.awsSdk.awsSdkStrings.sc1_
  - typings.awsSdk.awsSdkStrings.st1_
  - java.lang.String
*/
type EbsVolumeType = _EbsVolumeType | String

type EmptyString = String

type FastLaunchConfigurationList = js.Array[FastLaunchConfiguration]

type FilterList = js.Array[Filter]

type FilterName = String

type FilterValue = String

type FilterValues = js.Array[FilterValue]

type HttpPutResponseHopLimit = Double

type HttpTokens = String

type ImageBuildMessage = String

type ImageBuildVersionArn = String

type ImageBuilderArn = String

type ImagePackageList = js.Array[ImagePackage]

type ImagePipelineArn = String

type ImagePipelineList = js.Array[ImagePipeline]

type ImageRecipeArn = String

type ImageRecipeSummaryList = js.Array[ImageRecipeSummary]

type ImageScanFindingAggregationsList = js.Array[ImageScanFindingAggregation]

type ImageScanFindingsFilterList = js.Array[ImageScanFindingsFilter]

type ImageScanFindingsFilterValues = js.Array[FilterValue]

type ImageScanFindingsList = js.Array[ImageScanFinding]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SCANNING
  - typings.awsSdk.awsSdkStrings.COLLECTING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.ABANDONED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
type ImageScanStatus = _ImageScanStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AMAZON_MANAGED
  - typings.awsSdk.awsSdkStrings.AWS_MARKETPLACE
  - typings.awsSdk.awsSdkStrings.IMPORTED
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type ImageSource = _ImageSource | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.BUILDING
  - typings.awsSdk.awsSdkStrings.TESTING
  - typings.awsSdk.awsSdkStrings.DISTRIBUTING
  - typings.awsSdk.awsSdkStrings.INTEGRATING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DEPRECATED
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type ImageStatus = _ImageStatus | String

type ImageSummaryList = js.Array[ImageSummary]

type ImageTestsTimeoutMinutes = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AMI
  - typings.awsSdk.awsSdkStrings.DOCKER
  - java.lang.String
*/
type ImageType = _ImageType | String

type ImageVersionArn = String

type ImageVersionArnOrBuildVersionArn = String

type ImageVersionList = js.Array[ImageVersion]

type InfrastructureConfigurationArn = String

type InfrastructureConfigurationSummaryList = js.Array[InfrastructureConfigurationSummary]

type InlineComponentData = String

type InlineDockerFileTemplate = String

type InstanceBlockDeviceMappings = js.Array[InstanceBlockDeviceMapping]

type InstanceProfileNameType = String

type InstanceType = String

type InstanceTypeList = js.Array[InstanceType]

type LaunchTemplateConfigurationList = js.Array[LaunchTemplateConfiguration]

type LaunchTemplateId = String

type LicenseConfigurationArn = String

type LicenseConfigurationArnList = js.Array[LicenseConfigurationArn]

type MaxParallelLaunches = Double

type NonEmptyString = String

type NonEmptyStringList = js.Array[NonEmptyString]

type NonNegativeDouble = Double

type NullableBoolean = scala.Boolean

type OrganizationArn = String

type OrganizationArnList = js.Array[OrganizationArn]

type OrganizationalUnitArn = String

type OrganizationalUnitArnList = js.Array[OrganizationalUnitArn]

type OsVersion = String

type OsVersionList = js.Array[OsVersion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Self_
  - typings.awsSdk.awsSdkStrings.Shared_
  - typings.awsSdk.awsSdkStrings.Amazon_
  - typings.awsSdk.awsSdkStrings.ThirdParty
  - java.lang.String
*/
type Ownership = _Ownership | String

type PackageArchitecture = String

type PackageEpoch = Double

type PaginationToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXPRESSION_MATCH_ONLY
  - typings.awsSdk.awsSdkStrings.EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE
  - java.lang.String
*/
type PipelineExecutionStartCondition = _PipelineExecutionStartCondition | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.ENABLED
  - java.lang.String
*/
type PipelineStatus = _PipelineStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Windows_
  - typings.awsSdk.awsSdkStrings.Linux_
  - java.lang.String
*/
type Platform = _Platform | String

type RegionList = js.Array[NonEmptyString]

type ResourceName = String

type ResourcePolicyDocument = String

type ResourceTagMap = StringDictionary[TagValue]

type RestrictedInteger = Double

type SecurityGroupIds = js.Array[NonEmptyString]

type SeverityCountNumber = Double

type SnsTopicArn = String

type SourceLayerHash = String

type StringList = js.Array[NonEmptyString]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TargetResourceCount = Double

type Timezone = String

type Uri = String

type UserDataOverride = String

type VersionNumber = String

type VulnerabilityId = String

type VulnerabilityIdList = js.Array[VulnerabilityId]

type VulnerablePackageList = js.Array[VulnerablePackage]

type WorkflowBuildVersionArn = String

type WorkflowExecutionId = String

type WorkflowExecutionMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SKIPPED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.ROLLBACK_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ROLLBACK_COMPLETED
  - java.lang.String
*/
type WorkflowExecutionStatus = _WorkflowExecutionStatus | String

type WorkflowExecutionsList = js.Array[WorkflowExecutionMetadata]

type WorkflowStepAction = String

type WorkflowStepCount = Double

type WorkflowStepDescription = String

type WorkflowStepExecutionId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.SKIPPED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type WorkflowStepExecutionRollbackStatus = _WorkflowStepExecutionRollbackStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SKIPPED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type WorkflowStepExecutionStatus = _WorkflowStepExecutionStatus | String

type WorkflowStepExecutionsList = js.Array[WorkflowStepMetadata]

type WorkflowStepInputs = String

type WorkflowStepMessage = String

type WorkflowStepName = String

type WorkflowStepOutputs = String

type WorkflowStepTimeoutSecondsInteger = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BUILD
  - typings.awsSdk.awsSdkStrings.TEST
  - typings.awsSdk.awsSdkStrings.DISTRIBUTION
  - java.lang.String
*/
type WorkflowType = _WorkflowType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-12-02`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
