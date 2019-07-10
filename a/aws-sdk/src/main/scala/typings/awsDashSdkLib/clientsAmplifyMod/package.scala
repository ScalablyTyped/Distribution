package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAmplifyMod {
  type AccessToken = java.lang.String
  type ActiveJobId = java.lang.String
  type AppArn = java.lang.String
  type AppId = java.lang.String
  type Apps = js.Array[App]
  type ArtifactsUrl = java.lang.String
  type AssociatedResource = java.lang.String
  type AssociatedResources = js.Array[AssociatedResource]
  type AutoBranchCreationPattern = java.lang.String
  type AutoBranchCreationPatterns = js.Array[AutoBranchCreationPattern]
  type BasicAuthCredentials = java.lang.String
  type BranchArn = java.lang.String
  type BranchName = java.lang.String
  type Branches = js.Array[Branch]
  type BuildSpec = java.lang.String
  type CertificateVerificationDNSRecord = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CommitId = java.lang.String
  type CommitMessage = java.lang.String
  type CommitTime = stdLib.Date
  type Condition = java.lang.String
  type Context = java.lang.String
  type CreateTime = stdLib.Date
  type CustomDomain = java.lang.String
  type CustomDomains = js.Array[CustomDomain]
  type CustomRules = js.Array[CustomRule]
  type DNSRecord = java.lang.String
  type DefaultDomain = java.lang.String
  type Description = java.lang.String
  type DisplayName = java.lang.String
  type DomainAssociationArn = java.lang.String
  type DomainAssociations = js.Array[DomainAssociation]
  type DomainName = java.lang.String
  type DomainPrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_VERIFICATION
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_DEPLOYMENT
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.REQUESTING_CERTIFICATE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - java.lang.String
  */
  type DomainStatus = _DomainStatus | java.lang.String
  type EnableAutoBranchCreation = scala.Boolean
  type EnableAutoBuild = scala.Boolean
  type EnableAutoSubDomain = scala.Boolean
  type EnableBasicAuth = scala.Boolean
  type EnableBranchAutoBuild = scala.Boolean
  type EnableNotification = scala.Boolean
  type EndTime = stdLib.Date
  type EnvKey = java.lang.String
  type EnvValue = java.lang.String
  type EnvironmentVariables = org.scalablytyped.runtime.StringDictionary[EnvValue]
  type FileMap = org.scalablytyped.runtime.StringDictionary[MD5Hash]
  type FileName = java.lang.String
  type FileUploadUrls = org.scalablytyped.runtime.StringDictionary[UploadUrl]
  type Framework = java.lang.String
  type JobArn = java.lang.String
  type JobId = java.lang.String
  type JobReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.PROVISIONING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLING
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLED
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type JobSummaries = js.Array[JobSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RELEASE
    - awsDashSdkLib.awsDashSdkLibStrings.RETRY
    - awsDashSdkLib.awsDashSdkLibStrings.MANUAL
    - awsDashSdkLib.awsDashSdkLibStrings.WEB_HOOK
    - java.lang.String
  */
  type JobType = _JobType | java.lang.String
  type LastDeployTime = stdLib.Date
  type LogUrl = java.lang.String
  type MD5Hash = java.lang.String
  type MaxResults = scala.Double
  type Name = java.lang.String
  type NextToken = java.lang.String
  type OauthToken = java.lang.String
  type Platform = awsDashSdkLib.awsDashSdkLibStrings.WEB | java.lang.String
  type Repository = java.lang.String
  type ResourceArn = java.lang.String
  type Screenshots = org.scalablytyped.runtime.StringDictionary[ThumbnailUrl]
  type ServiceRoleArn = java.lang.String
  type Source = java.lang.String
  type SourceUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PRODUCTION
    - awsDashSdkLib.awsDashSdkLibStrings.BETA
    - awsDashSdkLib.awsDashSdkLibStrings.DEVELOPMENT
    - awsDashSdkLib.awsDashSdkLibStrings.EXPERIMENTAL
    - java.lang.String
  */
  type Stage = _Stage | java.lang.String
  type StartTime = stdLib.Date
  type Status = java.lang.String
  type StatusReason = java.lang.String
  type StepName = java.lang.String
  type Steps = js.Array[Step]
  type SubDomainSettings = js.Array[SubDomainSetting]
  type SubDomains = js.Array[SubDomain]
  type TTL = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TagValue = java.lang.String
  type Target = java.lang.String
  type ThumbnailName = java.lang.String
  type ThumbnailUrl = java.lang.String
  type TotalNumberOfJobs = java.lang.String
  type UpdateTime = stdLib.Date
  type UploadUrl = java.lang.String
  type Verified = scala.Boolean
  type WebhookArn = java.lang.String
  type WebhookId = java.lang.String
  type WebhookUrl = java.lang.String
  type Webhooks = js.Array[Webhook]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-07-25`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
