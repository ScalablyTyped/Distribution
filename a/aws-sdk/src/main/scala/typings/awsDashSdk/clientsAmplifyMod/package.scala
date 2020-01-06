package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAmplifyMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.WEB
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AccessToken = String
  type ActiveJobId = String
  type AppArn = String
  type AppId = String
  type Apps = js.Array[App]
  type ArtifactFileName = String
  type ArtifactId = String
  type ArtifactUrl = String
  type Artifacts = js.Array[Artifact]
  type ArtifactsUrl = String
  type AssociatedResource = String
  type AssociatedResources = js.Array[AssociatedResource]
  type AutoBranchCreationPattern = String
  type AutoBranchCreationPatterns = js.Array[AutoBranchCreationPattern]
  type BackendEnvironmentArn = String
  type BackendEnvironments = js.Array[BackendEnvironment]
  type BasicAuthCredentials = String
  type BranchArn = String
  type BranchName = String
  type Branches = js.Array[Branch]
  type BuildSpec = String
  type CertificateVerificationDNSRecord = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CommitId = String
  type CommitMessage = String
  type CommitTime = Date
  type Condition = String
  type Context = String
  type CreateTime = Date
  type CustomDomain = String
  type CustomDomains = js.Array[CustomDomain]
  type CustomRules = js.Array[CustomRule]
  type DNSRecord = String
  type DefaultDomain = String
  type DeploymentArtifacts = String
  type Description = String
  type DisplayName = String
  type DomainAssociationArn = String
  type DomainAssociations = js.Array[DomainAssociation]
  type DomainName = String
  type DomainPrefix = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_VERIFICATION
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_DEPLOYMENT
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.REQUESTING_CERTIFICATE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - java.lang.String
  */
  type DomainStatus = _DomainStatus | String
  type EnableAutoBranchCreation = Boolean
  type EnableAutoBuild = Boolean
  type EnableAutoSubDomain = Boolean
  type EnableBasicAuth = Boolean
  type EnableBranchAutoBuild = Boolean
  type EnableNotification = Boolean
  type EnablePullRequestPreview = Boolean
  type EndTime = Date
  type EnvKey = String
  type EnvValue = String
  type EnvironmentName = String
  type EnvironmentVariables = StringDictionary[EnvValue]
  type FileMap = StringDictionary[MD5Hash]
  type FileName = String
  type FileUploadUrls = StringDictionary[UploadUrl]
  type Framework = String
  type JobArn = String
  type JobId = String
  type JobReason = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.PROVISIONING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLING
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - java.lang.String
  */
  type JobStatus = _JobStatus | String
  type JobSummaries = js.Array[JobSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RELEASE
    - typings.awsDashSdk.awsDashSdkStrings.RETRY
    - typings.awsDashSdk.awsDashSdkStrings.MANUAL
    - typings.awsDashSdk.awsDashSdkStrings.WEB_HOOK
    - java.lang.String
  */
  type JobType = _JobType | String
  type LastDeployTime = Date
  type LogUrl = String
  type MD5Hash = String
  type MaxResults = Double
  type Name = String
  type NextToken = String
  type OauthToken = String
  type Platform = WEB | String
  type PullRequestEnvironmentName = String
  type Repository = String
  type ResourceArn = String
  type Screenshots = StringDictionary[ThumbnailUrl]
  type ServiceRoleArn = String
  type Source = String
  type SourceUrl = String
  type StackName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCTION
    - typings.awsDashSdk.awsDashSdkStrings.BETA
    - typings.awsDashSdk.awsDashSdkStrings.DEVELOPMENT
    - typings.awsDashSdk.awsDashSdkStrings.EXPERIMENTAL
    - typings.awsDashSdk.awsDashSdkStrings.PULL_REQUEST
    - java.lang.String
  */
  type Stage = _Stage | String
  type StartTime = Date
  type Status = String
  type StatusReason = String
  type StepName = String
  type Steps = js.Array[Step]
  type SubDomainSettings = js.Array[SubDomainSetting]
  type SubDomains = js.Array[SubDomain]
  type TTL = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = String
  type Target = String
  type TestArtifactsUrl = String
  type TestConfigUrl = String
  type ThumbnailName = String
  type ThumbnailUrl = String
  type TotalNumberOfJobs = String
  type UpdateTime = Date
  type UploadUrl = String
  type Verified = Boolean
  type WebhookArn = String
  type WebhookId = String
  type WebhookUrl = String
  type Webhooks = js.Array[Webhook]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-07-25`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
