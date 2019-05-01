package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsS3controlMod {
  type AccountId = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with awsDashSdkLib.libConfigUnderscoreUseUnderscoreDualstackMod.UseDualstackConfigOptions with ClientApiVersions
  type ConfirmationRequired = scala.Boolean
  type IAMRoleArn = java.lang.String
  type JobArn = java.lang.String
  type JobCreationTime = stdLib.Date
  type JobFailureCode = java.lang.String
  type JobFailureList = js.Array[JobFailure]
  type JobFailureReason = java.lang.String
  type JobId = java.lang.String
  type JobListDescriptorList = js.Array[JobListDescriptor]
  type JobManifestFieldList = js.Array[JobManifestFieldName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Ignore
    - awsDashSdkLib.awsDashSdkLibStrings.Bucket
    - awsDashSdkLib.awsDashSdkLibStrings.Key
    - awsDashSdkLib.awsDashSdkLibStrings.VersionId
    - java.lang.String
  */
  type JobManifestFieldName = _JobManifestFieldName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.S3BatchOperations_CSV_20180820
    - awsDashSdkLib.awsDashSdkLibStrings.S3InventoryReport_CSV_20161130
    - java.lang.String
  */
  type JobManifestFormat = _JobManifestFormat | java.lang.String
  type JobNumberOfTasksFailed = scala.Double
  type JobNumberOfTasksSucceeded = scala.Double
  type JobPriority = scala.Double
  type JobReportFormat = awsDashSdkLib.awsDashSdkLibStrings.Report_CSV_20180820 | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AllTasks
    - awsDashSdkLib.awsDashSdkLibStrings.FailedTasksOnly
    - java.lang.String
  */
  type JobReportScope = _JobReportScope | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelling
    - awsDashSdkLib.awsDashSdkLibStrings.Complete
    - awsDashSdkLib.awsDashSdkLibStrings.Completing
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Failing
    - awsDashSdkLib.awsDashSdkLibStrings.New
    - awsDashSdkLib.awsDashSdkLibStrings.Paused
    - awsDashSdkLib.awsDashSdkLibStrings.Pausing
    - awsDashSdkLib.awsDashSdkLibStrings.Preparing
    - awsDashSdkLib.awsDashSdkLibStrings.Ready
    - awsDashSdkLib.awsDashSdkLibStrings.Suspended
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type JobStatusList = js.Array[JobStatus]
  type JobStatusUpdateReason = java.lang.String
  type JobTerminationDate = stdLib.Date
  type JobTotalNumberOfTasks = scala.Double
  type KmsKeyArnString = java.lang.String
  type MaxLength1024String = java.lang.String
  type MaxResults = scala.Double
  type NonEmptyMaxLength1024String = java.lang.String
  type NonEmptyMaxLength2048String = java.lang.String
  type NonEmptyMaxLength256String = java.lang.String
  type NonEmptyMaxLength64String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaInvoke
    - awsDashSdkLib.awsDashSdkLibStrings.S3PutObjectCopy
    - awsDashSdkLib.awsDashSdkLibStrings.S3PutObjectAcl
    - awsDashSdkLib.awsDashSdkLibStrings.S3PutObjectTagging
    - awsDashSdkLib.awsDashSdkLibStrings.S3InitiateRestoreObject
    - java.lang.String
  */
  type OperationName = _OperationName | java.lang.String
  type ReportPrefixString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.Ready
    - java.lang.String
  */
  type RequestedJobStatus = _RequestedJobStatus | java.lang.String
  type S3BucketArnString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`private`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read-write`
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-exec-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`authenticated-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-full-control`
    - java.lang.String
  */
  type S3CannedAccessControlList = _S3CannedAccessControlList | java.lang.String
  type S3ContentLength = scala.Double
  type S3ExpirationInDays = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BULK
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD
    - java.lang.String
  */
  type S3GlacierJobTier = _S3GlacierJobTier | java.lang.String
  type S3GrantList = js.Array[S3Grant]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.id
    - awsDashSdkLib.awsDashSdkLibStrings.emailAddress
    - awsDashSdkLib.awsDashSdkLibStrings.uri
    - java.lang.String
  */
  type S3GranteeTypeIdentifier = _S3GranteeTypeIdentifier | java.lang.String
  type S3KeyArnString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COPY
    - awsDashSdkLib.awsDashSdkLibStrings.REPLACE
    - java.lang.String
  */
  type S3MetadataDirective = _S3MetadataDirective | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OFF
    - awsDashSdkLib.awsDashSdkLibStrings.ON
    - java.lang.String
  */
  type S3ObjectLockLegalHoldStatus = _S3ObjectLockLegalHoldStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLIANCE
    - awsDashSdkLib.awsDashSdkLibStrings.GOVERNANCE
    - java.lang.String
  */
  type S3ObjectLockMode = _S3ObjectLockMode | java.lang.String
  type S3ObjectVersionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FULL_CONTROL
    - awsDashSdkLib.awsDashSdkLibStrings.READ
    - awsDashSdkLib.awsDashSdkLibStrings.WRITE
    - awsDashSdkLib.awsDashSdkLibStrings.READ_ACP
    - awsDashSdkLib.awsDashSdkLibStrings.WRITE_ACP
    - java.lang.String
  */
  type S3Permission = _S3Permission | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AES256
    - awsDashSdkLib.awsDashSdkLibStrings.KMS
    - java.lang.String
  */
  type S3SSEAlgorithm = _S3SSEAlgorithm | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD_IA
    - awsDashSdkLib.awsDashSdkLibStrings.ONEZONE_IA
    - awsDashSdkLib.awsDashSdkLibStrings.GLACIER
    - awsDashSdkLib.awsDashSdkLibStrings.INTELLIGENT_TIERING
    - awsDashSdkLib.awsDashSdkLibStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type S3StorageClass = _S3StorageClass | java.lang.String
  type S3TagSet = js.Array[S3Tag]
  type S3UserMetadata = org.scalablytyped.runtime.StringDictionary[MaxLength1024String]
  type Setting = scala.Boolean
  type SuspendedCause = java.lang.String
  type SuspendedDate = stdLib.Date
  type TimeStamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-08-20`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
