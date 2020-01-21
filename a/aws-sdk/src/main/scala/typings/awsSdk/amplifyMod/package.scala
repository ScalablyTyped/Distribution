package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amplifyMod {
  type AccessToken = java.lang.String
  type ActiveJobId = java.lang.String
  type AppArn = java.lang.String
  type AppId = java.lang.String
  type Apps = js.Array[typings.awsSdk.amplifyMod.App]
  type ArtifactFileName = java.lang.String
  type ArtifactId = java.lang.String
  type ArtifactUrl = java.lang.String
  type Artifacts = js.Array[typings.awsSdk.amplifyMod.Artifact]
  type ArtifactsUrl = java.lang.String
  type AssociatedResource = java.lang.String
  type AssociatedResources = js.Array[typings.awsSdk.amplifyMod.AssociatedResource]
  type AutoBranchCreationPattern = java.lang.String
  type AutoBranchCreationPatterns = js.Array[typings.awsSdk.amplifyMod.AutoBranchCreationPattern]
  type BackendEnvironmentArn = java.lang.String
  type BackendEnvironments = js.Array[typings.awsSdk.amplifyMod.BackendEnvironment]
  type BasicAuthCredentials = java.lang.String
  type BranchArn = java.lang.String
  type BranchName = java.lang.String
  type Branches = js.Array[typings.awsSdk.amplifyMod.Branch]
  type BuildSpec = java.lang.String
  type CertificateVerificationDNSRecord = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.amplifyMod.ClientApiVersions
  type CommitId = java.lang.String
  type CommitMessage = java.lang.String
  type CommitTime = typings.std.Date
  type Condition = java.lang.String
  type Context = java.lang.String
  type CreateTime = typings.std.Date
  type CustomDomain = java.lang.String
  type CustomDomains = js.Array[typings.awsSdk.amplifyMod.CustomDomain]
  type CustomRules = js.Array[typings.awsSdk.amplifyMod.CustomRule]
  type DNSRecord = java.lang.String
  type DefaultDomain = java.lang.String
  type DeploymentArtifacts = java.lang.String
  type Description = java.lang.String
  type DisplayName = java.lang.String
  type DomainAssociationArn = java.lang.String
  type DomainAssociations = js.Array[typings.awsSdk.amplifyMod.DomainAssociation]
  type DomainName = java.lang.String
  type DomainPrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING_VERIFICATION
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.PENDING_DEPLOYMENT
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.REQUESTING_CERTIFICATE
    - typings.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type DomainStatus = typings.awsSdk.amplifyMod._DomainStatus | java.lang.String
  type EnableAutoBranchCreation = scala.Boolean
  type EnableAutoBuild = scala.Boolean
  type EnableAutoSubDomain = scala.Boolean
  type EnableBasicAuth = scala.Boolean
  type EnableBranchAutoBuild = scala.Boolean
  type EnableNotification = scala.Boolean
  type EnablePullRequestPreview = scala.Boolean
  type EndTime = typings.std.Date
  type EnvKey = java.lang.String
  type EnvValue = java.lang.String
  type EnvironmentName = java.lang.String
  type EnvironmentVariables = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.amplifyMod.EnvValue]
  type FileMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.amplifyMod.MD5Hash]
  type FileName = java.lang.String
  type FileUploadUrls = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.amplifyMod.UploadUrl]
  type Framework = java.lang.String
  type JobArn = java.lang.String
  type JobId = java.lang.String
  type JobReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.PROVISIONING
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.SUCCEED
    - typings.awsSdk.awsSdkStrings.CANCELLING
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type JobStatus = typings.awsSdk.amplifyMod._JobStatus | java.lang.String
  type JobSummaries = js.Array[typings.awsSdk.amplifyMod.JobSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RELEASE
    - typings.awsSdk.awsSdkStrings.RETRY
    - typings.awsSdk.awsSdkStrings.MANUAL
    - typings.awsSdk.awsSdkStrings.WEB_HOOK
    - java.lang.String
  */
  type JobType = typings.awsSdk.amplifyMod._JobType | java.lang.String
  type LastDeployTime = typings.std.Date
  type LogUrl = java.lang.String
  type MD5Hash = java.lang.String
  type MaxResults = scala.Double
  type Name = java.lang.String
  type NextToken = java.lang.String
  type OauthToken = java.lang.String
  type Platform = typings.awsSdk.awsSdkStrings.WEB | java.lang.String
  type PullRequestEnvironmentName = java.lang.String
  type Repository = java.lang.String
  type ResourceArn = java.lang.String
  type Screenshots = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.amplifyMod.ThumbnailUrl]
  type ServiceRoleArn = java.lang.String
  type Source = java.lang.String
  type SourceUrl = java.lang.String
  type StackName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PRODUCTION
    - typings.awsSdk.awsSdkStrings.BETA
    - typings.awsSdk.awsSdkStrings.DEVELOPMENT
    - typings.awsSdk.awsSdkStrings.EXPERIMENTAL
    - typings.awsSdk.awsSdkStrings.PULL_REQUEST
    - java.lang.String
  */
  type Stage = typings.awsSdk.amplifyMod._Stage | java.lang.String
  type StartTime = typings.std.Date
  type Status = java.lang.String
  type StatusReason = java.lang.String
  type StepName = java.lang.String
  type Steps = js.Array[typings.awsSdk.amplifyMod.Step]
  type SubDomainSettings = js.Array[typings.awsSdk.amplifyMod.SubDomainSetting]
  type SubDomains = js.Array[typings.awsSdk.amplifyMod.SubDomain]
  type TTL = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.amplifyMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.amplifyMod.TagValue]
  type TagValue = java.lang.String
  type Target = java.lang.String
  type TestArtifactsUrl = java.lang.String
  type TestConfigUrl = java.lang.String
  type ThumbnailName = java.lang.String
  type ThumbnailUrl = java.lang.String
  type TotalNumberOfJobs = java.lang.String
  type UpdateTime = typings.std.Date
  type UploadUrl = java.lang.String
  type Verified = scala.Boolean
  type WebhookArn = java.lang.String
  type WebhookId = java.lang.String
  type WebhookUrl = java.lang.String
  type Webhooks = js.Array[typings.awsSdk.amplifyMod.Webhook]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-07-25`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.amplifyMod._apiVersion | java.lang.String
}
