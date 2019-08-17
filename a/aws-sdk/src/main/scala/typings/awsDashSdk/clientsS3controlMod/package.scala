package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsS3controlMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.Report_CSV_20180820
  import typings.awsDashSdk.libConfigUnderscoreUseUnderscoreDualstackMod.UseDualstackConfigOptions
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AccountId = String
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with UseDualstackConfigOptions with ClientApiVersions
  type ConfirmationRequired = scala.Boolean
  type IAMRoleArn = String
  type JobArn = String
  type JobCreationTime = Date
  type JobFailureCode = String
  type JobFailureList = js.Array[JobFailure]
  type JobFailureReason = String
  type JobId = String
  type JobListDescriptorList = js.Array[JobListDescriptor]
  type JobManifestFieldList = js.Array[JobManifestFieldName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ignore
    - typings.awsDashSdk.awsDashSdkStrings.Bucket
    - typings.awsDashSdk.awsDashSdkStrings.Key
    - typings.awsDashSdk.awsDashSdkStrings.VersionId
    - java.lang.String
  */
  type JobManifestFieldName = _JobManifestFieldName | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.S3BatchOperations_CSV_20180820
    - typings.awsDashSdk.awsDashSdkStrings.S3InventoryReport_CSV_20161130
    - java.lang.String
  */
  type JobManifestFormat = _JobManifestFormat | String
  type JobNumberOfTasksFailed = Double
  type JobNumberOfTasksSucceeded = Double
  type JobPriority = Double
  type JobReportFormat = Report_CSV_20180820 | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AllTasks
    - typings.awsDashSdk.awsDashSdkStrings.FailedTasksOnly
    - java.lang.String
  */
  type JobReportScope = _JobReportScope | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - typings.awsDashSdk.awsDashSdkStrings.Cancelling
    - typings.awsDashSdk.awsDashSdkStrings.Complete
    - typings.awsDashSdk.awsDashSdkStrings.Completing
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Failing
    - typings.awsDashSdk.awsDashSdkStrings.New
    - typings.awsDashSdk.awsDashSdkStrings.Paused
    - typings.awsDashSdk.awsDashSdkStrings.Pausing
    - typings.awsDashSdk.awsDashSdkStrings.Preparing
    - typings.awsDashSdk.awsDashSdkStrings.Ready
    - typings.awsDashSdk.awsDashSdkStrings.Suspended
    - java.lang.String
  */
  type JobStatus = _JobStatus | String
  type JobStatusList = js.Array[JobStatus]
  type JobStatusUpdateReason = String
  type JobTerminationDate = Date
  type JobTotalNumberOfTasks = Double
  type KmsKeyArnString = String
  type MaxLength1024String = String
  type MaxResults = Double
  type NonEmptyMaxLength1024String = String
  type NonEmptyMaxLength2048String = String
  type NonEmptyMaxLength256String = String
  type NonEmptyMaxLength64String = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LambdaInvoke
    - typings.awsDashSdk.awsDashSdkStrings.S3PutObjectCopy
    - typings.awsDashSdk.awsDashSdkStrings.S3PutObjectAcl
    - typings.awsDashSdk.awsDashSdkStrings.S3PutObjectTagging
    - typings.awsDashSdk.awsDashSdkStrings.S3InitiateRestoreObject
    - java.lang.String
  */
  type OperationName = _OperationName | String
  type ReportPrefixString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - typings.awsDashSdk.awsDashSdkStrings.Ready
    - java.lang.String
  */
  type RequestedJobStatus = _RequestedJobStatus | String
  type S3BucketArnString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`private`
    - typings.awsDashSdk.awsDashSdkStrings.`public-read`
    - typings.awsDashSdk.awsDashSdkStrings.`public-read-write`
    - typings.awsDashSdk.awsDashSdkStrings.`aws-exec-read`
    - typings.awsDashSdk.awsDashSdkStrings.`authenticated-read`
    - typings.awsDashSdk.awsDashSdkStrings.`bucket-owner-read`
    - typings.awsDashSdk.awsDashSdkStrings.`bucket-owner-full-control`
    - java.lang.String
  */
  type S3CannedAccessControlList = _S3CannedAccessControlList | String
  type S3ContentLength = Double
  type S3ExpirationInDays = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BULK
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - java.lang.String
  */
  type S3GlacierJobTier = _S3GlacierJobTier | String
  type S3GrantList = js.Array[S3Grant]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.id
    - typings.awsDashSdk.awsDashSdkStrings.emailAddress
    - typings.awsDashSdk.awsDashSdkStrings.uri
    - java.lang.String
  */
  type S3GranteeTypeIdentifier = _S3GranteeTypeIdentifier | String
  type S3KeyArnString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COPY
    - typings.awsDashSdk.awsDashSdkStrings.REPLACE
    - java.lang.String
  */
  type S3MetadataDirective = _S3MetadataDirective | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OFF
    - typings.awsDashSdk.awsDashSdkStrings.ON
    - java.lang.String
  */
  type S3ObjectLockLegalHoldStatus = _S3ObjectLockLegalHoldStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COMPLIANCE
    - typings.awsDashSdk.awsDashSdkStrings.GOVERNANCE
    - java.lang.String
  */
  type S3ObjectLockMode = _S3ObjectLockMode | String
  type S3ObjectVersionId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FULL_CONTROL
    - typings.awsDashSdk.awsDashSdkStrings.READ
    - typings.awsDashSdk.awsDashSdkStrings.WRITE
    - typings.awsDashSdk.awsDashSdkStrings.READ_ACP
    - typings.awsDashSdk.awsDashSdkStrings.WRITE_ACP
    - java.lang.String
  */
  type S3Permission = _S3Permission | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AES256
    - typings.awsDashSdk.awsDashSdkStrings.KMS
    - java.lang.String
  */
  type S3SSEAlgorithm = _S3SSEAlgorithm | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD_IA
    - typings.awsDashSdk.awsDashSdkStrings.ONEZONE_IA
    - typings.awsDashSdk.awsDashSdkStrings.GLACIER
    - typings.awsDashSdk.awsDashSdkStrings.INTELLIGENT_TIERING
    - typings.awsDashSdk.awsDashSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type S3StorageClass = _S3StorageClass | String
  type S3TagSet = js.Array[S3Tag]
  type S3UserMetadata = StringDictionary[MaxLength1024String]
  type Setting = scala.Boolean
  type SuspendedCause = String
  type SuspendedDate = Date
  type TimeStamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-08-20`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
