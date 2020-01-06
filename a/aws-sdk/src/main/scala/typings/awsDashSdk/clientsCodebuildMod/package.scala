package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodebuildMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.OAUTH
  import typings.awsDashSdk.awsDashSdkStrings.SECRETS_MANAGER
  import typings.awsDashSdk.awsDashSdkStrings.TEST
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.BUILD_ID
    - java.lang.String
  */
  type ArtifactNamespace = _ArtifactNamespace | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.ZIP
    - java.lang.String
  */
  type ArtifactPackaging = _ArtifactPackaging | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CODEPIPELINE
    - typings.awsDashSdk.awsDashSdkStrings.S3
    - typings.awsDashSdk.awsDashSdkStrings.NO_ARTIFACTS
    - java.lang.String
  */
  type ArtifactsType = _ArtifactsType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OAUTH
    - typings.awsDashSdk.awsDashSdkStrings.BASIC_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.PERSONAL_ACCESS_TOKEN
    - java.lang.String
  */
  type AuthType = _AuthType | java.lang.String
  type Boolean = scala.Boolean
  type BuildArtifactsList = js.Array[BuildArtifacts]
  type BuildIds = js.Array[NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUBMITTED
    - typings.awsDashSdk.awsDashSdkStrings.QUEUED
    - typings.awsDashSdk.awsDashSdkStrings.PROVISIONING
    - typings.awsDashSdk.awsDashSdkStrings.DOWNLOAD_SOURCE
    - typings.awsDashSdk.awsDashSdkStrings.INSTALL
    - typings.awsDashSdk.awsDashSdkStrings.PRE_BUILD
    - typings.awsDashSdk.awsDashSdkStrings.BUILD
    - typings.awsDashSdk.awsDashSdkStrings.POST_BUILD
    - typings.awsDashSdk.awsDashSdkStrings.UPLOAD_ARTIFACTS
    - typings.awsDashSdk.awsDashSdkStrings.FINALIZING
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - java.lang.String
  */
  type BuildPhaseType = _BuildPhaseType | java.lang.String
  type BuildPhases = js.Array[BuildPhase]
  type BuildReportArns = js.Array[String]
  type Builds = js.Array[Build]
  type BuildsNotDeleted = js.Array[BuildNotDeleted]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LOCAL_DOCKER_LAYER_CACHE
    - typings.awsDashSdk.awsDashSdkStrings.LOCAL_SOURCE_CACHE
    - typings.awsDashSdk.awsDashSdkStrings.LOCAL_CUSTOM_CACHE
    - java.lang.String
  */
  type CacheMode = _CacheMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NO_CACHE
    - typings.awsDashSdk.awsDashSdkStrings.S3
    - typings.awsDashSdk.awsDashSdkStrings.LOCAL
    - java.lang.String
  */
  type CacheType = _CacheType | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BUILD_GENERAL1_SMALL
    - typings.awsDashSdk.awsDashSdkStrings.BUILD_GENERAL1_MEDIUM
    - typings.awsDashSdk.awsDashSdkStrings.BUILD_GENERAL1_LARGE
    - typings.awsDashSdk.awsDashSdkStrings.BUILD_GENERAL1_2XLARGE
    - java.lang.String
  */
  type ComputeType = _ComputeType | java.lang.String
  type CredentialProviderType = SECRETS_MANAGER | java.lang.String
  type EnvironmentImages = js.Array[EnvironmentImage]
  type EnvironmentLanguages = js.Array[EnvironmentLanguage]
  type EnvironmentPlatforms = js.Array[EnvironmentPlatform]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WINDOWS_CONTAINER
    - typings.awsDashSdk.awsDashSdkStrings.LINUX_CONTAINER
    - typings.awsDashSdk.awsDashSdkStrings.LINUX_GPU_CONTAINER
    - typings.awsDashSdk.awsDashSdkStrings.ARM_CONTAINER
    - java.lang.String
  */
  type EnvironmentType = _EnvironmentType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PLAINTEXT
    - typings.awsDashSdk.awsDashSdkStrings.PARAMETER_STORE
    - typings.awsDashSdk.awsDashSdkStrings.SECRETS_MANAGER
    - java.lang.String
  */
  type EnvironmentVariableType = _EnvironmentVariableType | java.lang.String
  type EnvironmentVariables = js.Array[EnvironmentVariable]
  type ExportedEnvironmentVariables = js.Array[ExportedEnvironmentVariable]
  type FilterGroup = js.Array[WebhookFilter]
  type FilterGroups = js.Array[FilterGroup]
  type GitCloneDepth = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CODEBUILD
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_ROLE
    - java.lang.String
  */
  type ImagePullCredentialsType = _ImagePullCredentialsType | java.lang.String
  type ImageVersions = js.Array[String]
  type KeyInput = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.JAVA
    - typings.awsDashSdk.awsDashSdkStrings.PYTHON
    - typings.awsDashSdk.awsDashSdkStrings.NODE_JS
    - typings.awsDashSdk.awsDashSdkStrings.RUBY
    - typings.awsDashSdk.awsDashSdkStrings.GOLANG
    - typings.awsDashSdk.awsDashSdkStrings.DOCKER
    - typings.awsDashSdk.awsDashSdkStrings.ANDROID
    - typings.awsDashSdk.awsDashSdkStrings.DOTNET
    - typings.awsDashSdk.awsDashSdkStrings.BASE
    - typings.awsDashSdk.awsDashSdkStrings.PHP
    - java.lang.String
  */
  type LanguageType = _LanguageType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type LogsConfigStatusType = _LogsConfigStatusType | java.lang.String
  type NonEmptyString = java.lang.String
  type PageSize = Double
  type PhaseContexts = js.Array[PhaseContext]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEBIAN
    - typings.awsDashSdk.awsDashSdkStrings.AMAZON_LINUX
    - typings.awsDashSdk.awsDashSdkStrings.UBUNTU
    - typings.awsDashSdk.awsDashSdkStrings.WINDOWS_SERVER
    - java.lang.String
  */
  type PlatformType = _PlatformType | java.lang.String
  type ProjectArns = js.Array[NonEmptyString]
  type ProjectArtifactsList = js.Array[ProjectArtifacts]
  type ProjectCacheModes = js.Array[CacheMode]
  type ProjectDescription = java.lang.String
  type ProjectName = java.lang.String
  type ProjectNames = js.Array[NonEmptyString]
  type ProjectSecondarySourceVersions = js.Array[ProjectSourceVersion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NAME
    - typings.awsDashSdk.awsDashSdkStrings.CREATED_TIME
    - typings.awsDashSdk.awsDashSdkStrings.LAST_MODIFIED_TIME
    - java.lang.String
  */
  type ProjectSortByType = _ProjectSortByType | java.lang.String
  type ProjectSources = js.Array[ProjectSource]
  type Projects = js.Array[Project]
  type ReportArns = js.Array[NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.S3
    - typings.awsDashSdk.awsDashSdkStrings.NO_EXPORT
    - java.lang.String
  */
  type ReportExportConfigType = _ReportExportConfigType | java.lang.String
  type ReportGroupArns = js.Array[NonEmptyString]
  type ReportGroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NAME
    - typings.awsDashSdk.awsDashSdkStrings.CREATED_TIME
    - typings.awsDashSdk.awsDashSdkStrings.LAST_MODIFIED_TIME
    - java.lang.String
  */
  type ReportGroupSortByType = _ReportGroupSortByType | java.lang.String
  type ReportGroups = js.Array[ReportGroup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ZIP
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type ReportPackagingType = _ReportPackagingType | java.lang.String
  type ReportStatusCounts = StringDictionary[WrapperInt]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GENERATING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.INCOMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type ReportStatusType = _ReportStatusType | java.lang.String
  type ReportType = TEST | java.lang.String
  type Reports = js.Array[Report]
  type SecurityGroupIds = js.Array[NonEmptyString]
  type SensitiveNonEmptyString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GITHUB
    - typings.awsDashSdk.awsDashSdkStrings.BITBUCKET
    - typings.awsDashSdk.awsDashSdkStrings.GITHUB_ENTERPRISE
    - java.lang.String
  */
  type ServerType = _ServerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ARN
    - typings.awsDashSdk.awsDashSdkStrings.MODIFIED_TIME
    - java.lang.String
  */
  type SharedResourceSortByType = _SharedResourceSortByType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASCENDING
    - typings.awsDashSdk.awsDashSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrderType = _SortOrderType | java.lang.String
  type SourceAuthType = OAUTH | java.lang.String
  type SourceCredentialsInfos = js.Array[SourceCredentialsInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CODECOMMIT
    - typings.awsDashSdk.awsDashSdkStrings.CODEPIPELINE
    - typings.awsDashSdk.awsDashSdkStrings.GITHUB
    - typings.awsDashSdk.awsDashSdkStrings.S3
    - typings.awsDashSdk.awsDashSdkStrings.BITBUCKET
    - typings.awsDashSdk.awsDashSdkStrings.GITHUB_ENTERPRISE
    - typings.awsDashSdk.awsDashSdkStrings.NO_SOURCE
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.FAULT
    - typings.awsDashSdk.awsDashSdkStrings.TIMED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - java.lang.String
  */
  type StatusType = _StatusType | java.lang.String
  type String = java.lang.String
  type Subnets = js.Array[NonEmptyString]
  type TagList = js.Array[Tag]
  type TestCases = js.Array[TestCase]
  type TimeOut = Double
  type Timestamp = Date
  type ValueInput = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EVENT
    - typings.awsDashSdk.awsDashSdkStrings.BASE_REF
    - typings.awsDashSdk.awsDashSdkStrings.HEAD_REF
    - typings.awsDashSdk.awsDashSdkStrings.ACTOR_ACCOUNT_ID
    - typings.awsDashSdk.awsDashSdkStrings.FILE_PATH
    - java.lang.String
  */
  type WebhookFilterType = _WebhookFilterType | java.lang.String
  type WrapperBoolean = scala.Boolean
  type WrapperInt = Double
  type WrapperLong = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-10-06`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
