package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodebuildMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.BUILD_ID
    - java.lang.String
  */
  type ArtifactNamespace = _ArtifactNamespace | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.ZIP
    - java.lang.String
  */
  type ArtifactPackaging = _ArtifactPackaging | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CODEPIPELINE
    - awsDashSdkLib.awsDashSdkLibStrings.S3
    - awsDashSdkLib.awsDashSdkLibStrings.NO_ARTIFACTS
    - java.lang.String
  */
  type ArtifactsType = _ArtifactsType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OAUTH
    - awsDashSdkLib.awsDashSdkLibStrings.BASIC_AUTH
    - awsDashSdkLib.awsDashSdkLibStrings.PERSONAL_ACCESS_TOKEN
    - java.lang.String
  */
  type AuthType = _AuthType | java.lang.String
  type Boolean = scala.Boolean
  type BuildArtifactsList = js.Array[BuildArtifacts]
  type BuildIds = js.Array[NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUBMITTED
    - awsDashSdkLib.awsDashSdkLibStrings.QUEUED
    - awsDashSdkLib.awsDashSdkLibStrings.PROVISIONING
    - awsDashSdkLib.awsDashSdkLibStrings.DOWNLOAD_SOURCE
    - awsDashSdkLib.awsDashSdkLibStrings.INSTALL
    - awsDashSdkLib.awsDashSdkLibStrings.PRE_BUILD
    - awsDashSdkLib.awsDashSdkLibStrings.BUILD
    - awsDashSdkLib.awsDashSdkLibStrings.POST_BUILD
    - awsDashSdkLib.awsDashSdkLibStrings.UPLOAD_ARTIFACTS
    - awsDashSdkLib.awsDashSdkLibStrings.FINALIZING
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - java.lang.String
  */
  type BuildPhaseType = _BuildPhaseType | java.lang.String
  type BuildPhases = js.Array[BuildPhase]
  type Builds = js.Array[Build]
  type BuildsNotDeleted = js.Array[BuildNotDeleted]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LOCAL_DOCKER_LAYER_CACHE
    - awsDashSdkLib.awsDashSdkLibStrings.LOCAL_SOURCE_CACHE
    - awsDashSdkLib.awsDashSdkLibStrings.LOCAL_CUSTOM_CACHE
    - java.lang.String
  */
  type CacheMode = _CacheMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NO_CACHE
    - awsDashSdkLib.awsDashSdkLibStrings.S3
    - awsDashSdkLib.awsDashSdkLibStrings.LOCAL
    - java.lang.String
  */
  type CacheType = _CacheType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BUILD_GENERAL1_SMALL
    - awsDashSdkLib.awsDashSdkLibStrings.BUILD_GENERAL1_MEDIUM
    - awsDashSdkLib.awsDashSdkLibStrings.BUILD_GENERAL1_LARGE
    - java.lang.String
  */
  type ComputeType = _ComputeType | java.lang.String
  type CredentialProviderType = awsDashSdkLib.awsDashSdkLibStrings.SECRETS_MANAGER | java.lang.String
  type EnvironmentImages = js.Array[EnvironmentImage]
  type EnvironmentLanguages = js.Array[EnvironmentLanguage]
  type EnvironmentPlatforms = js.Array[EnvironmentPlatform]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WINDOWS_CONTAINER
    - awsDashSdkLib.awsDashSdkLibStrings.LINUX_CONTAINER
    - java.lang.String
  */
  type EnvironmentType = _EnvironmentType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PLAINTEXT
    - awsDashSdkLib.awsDashSdkLibStrings.PARAMETER_STORE
    - java.lang.String
  */
  type EnvironmentVariableType = _EnvironmentVariableType | java.lang.String
  type EnvironmentVariables = js.Array[EnvironmentVariable]
  type FilterGroup = js.Array[WebhookFilter]
  type FilterGroups = js.Array[FilterGroup]
  type GitCloneDepth = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CODEBUILD
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE_ROLE
    - java.lang.String
  */
  type ImagePullCredentialsType = _ImagePullCredentialsType | java.lang.String
  type ImageVersions = js.Array[String]
  type KeyInput = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.JAVA
    - awsDashSdkLib.awsDashSdkLibStrings.PYTHON
    - awsDashSdkLib.awsDashSdkLibStrings.NODE_JS
    - awsDashSdkLib.awsDashSdkLibStrings.RUBY
    - awsDashSdkLib.awsDashSdkLibStrings.GOLANG
    - awsDashSdkLib.awsDashSdkLibStrings.DOCKER
    - awsDashSdkLib.awsDashSdkLibStrings.ANDROID
    - awsDashSdkLib.awsDashSdkLibStrings.DOTNET
    - awsDashSdkLib.awsDashSdkLibStrings.BASE
    - awsDashSdkLib.awsDashSdkLibStrings.PHP
    - java.lang.String
  */
  type LanguageType = _LanguageType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type LogsConfigStatusType = _LogsConfigStatusType | java.lang.String
  type NonEmptyString = java.lang.String
  type PhaseContexts = js.Array[PhaseContext]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEBIAN
    - awsDashSdkLib.awsDashSdkLibStrings.AMAZON_LINUX
    - awsDashSdkLib.awsDashSdkLibStrings.UBUNTU
    - awsDashSdkLib.awsDashSdkLibStrings.WINDOWS_SERVER
    - java.lang.String
  */
  type PlatformType = _PlatformType | java.lang.String
  type ProjectArtifactsList = js.Array[ProjectArtifacts]
  type ProjectCacheModes = js.Array[CacheMode]
  type ProjectDescription = java.lang.String
  type ProjectName = java.lang.String
  type ProjectNames = js.Array[NonEmptyString]
  type ProjectSecondarySourceVersions = js.Array[ProjectSourceVersion]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NAME
    - awsDashSdkLib.awsDashSdkLibStrings.CREATED_TIME
    - awsDashSdkLib.awsDashSdkLibStrings.LAST_MODIFIED_TIME
    - java.lang.String
  */
  type ProjectSortByType = _ProjectSortByType | java.lang.String
  type ProjectSources = js.Array[ProjectSource]
  type Projects = js.Array[Project]
  type SecurityGroupIds = js.Array[NonEmptyString]
  type SensitiveNonEmptyString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GITHUB
    - awsDashSdkLib.awsDashSdkLibStrings.BITBUCKET
    - awsDashSdkLib.awsDashSdkLibStrings.GITHUB_ENTERPRISE
    - java.lang.String
  */
  type ServerType = _ServerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASCENDING
    - awsDashSdkLib.awsDashSdkLibStrings.DESCENDING
    - java.lang.String
  */
  type SortOrderType = _SortOrderType | java.lang.String
  type SourceAuthType = awsDashSdkLib.awsDashSdkLibStrings.OAUTH | java.lang.String
  type SourceCredentialsInfos = js.Array[SourceCredentialsInfo]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CODECOMMIT
    - awsDashSdkLib.awsDashSdkLibStrings.CODEPIPELINE
    - awsDashSdkLib.awsDashSdkLibStrings.GITHUB
    - awsDashSdkLib.awsDashSdkLibStrings.S3
    - awsDashSdkLib.awsDashSdkLibStrings.BITBUCKET
    - awsDashSdkLib.awsDashSdkLibStrings.GITHUB_ENTERPRISE
    - awsDashSdkLib.awsDashSdkLibStrings.NO_SOURCE
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.FAULT
    - awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - java.lang.String
  */
  type StatusType = _StatusType | java.lang.String
  type String = java.lang.String
  type Subnets = js.Array[NonEmptyString]
  type TagList = js.Array[Tag]
  type TimeOut = scala.Double
  type Timestamp = stdLib.Date
  type ValueInput = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EVENT
    - awsDashSdkLib.awsDashSdkLibStrings.BASE_REF
    - awsDashSdkLib.awsDashSdkLibStrings.HEAD_REF
    - awsDashSdkLib.awsDashSdkLibStrings.ACTOR_ACCOUNT_ID
    - awsDashSdkLib.awsDashSdkLibStrings.FILE_PATH
    - java.lang.String
  */
  type WebhookFilterType = _WebhookFilterType | java.lang.String
  type WrapperBoolean = scala.Boolean
  type WrapperInt = scala.Double
  type WrapperLong = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-10-06`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
