package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsS3Mod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.Anon_Cont
  import typings.awsDashSdk.awsDashSdkStrings.CSV
  import typings.awsDashSdk.awsDashSdkStrings.Enabled_
  import typings.awsDashSdk.awsDashSdkStrings.SELECT
  import typings.awsDashSdk.awsDashSdkStrings.SQL
  import typings.awsDashSdk.awsDashSdkStrings.STANDARD
  import typings.awsDashSdk.awsDashSdkStrings.V_1
  import typings.awsDashSdk.awsDashSdkStrings.requester_
  import typings.awsDashSdk.awsDashSdkStrings.url_
  import typings.awsDashSdk.libConfigUnderscoreUseUnderscoreDualstackMod.UseDualstackConfigOptions
  import typings.awsDashSdk.libEventDashStreamEventDashStreamMod.EventStream
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.node.streamMod.Readable
  import typings.std.Date
  import typings.std.Uint8Array

  type AbortDate = Date
  type AbortRuleId = String
  type AcceptRanges = String
  type AccountId = String
  type AllowQuotedRecordDelimiter = Boolean
  type AllowedHeader = String
  type AllowedHeaders = js.Array[AllowedHeader]
  type AllowedMethod = String
  type AllowedMethods = js.Array[AllowedMethod]
  type AllowedOrigin = String
  type AllowedOrigins = js.Array[AllowedOrigin]
  type AnalyticsConfigurationList = js.Array[AnalyticsConfiguration]
  type AnalyticsId = String
  type AnalyticsS3ExportFileFormat = CSV | String
  type Body = Buffer | Uint8Array | Blob | String | Readable
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Suspended_
    - java.lang.String
  */
  type BucketAccelerateStatus = _BucketAccelerateStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.private__
    - typings.awsDashSdk.awsDashSdkStrings.`public-read`
    - typings.awsDashSdk.awsDashSdkStrings.`public-read-write`
    - typings.awsDashSdk.awsDashSdkStrings.`authenticated-read`
    - java.lang.String
  */
  type BucketCannedACL = _BucketCannedACL | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EU
    - typings.awsDashSdk.awsDashSdkStrings.`eu-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-south-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-southeast-2`
    - typings.awsDashSdk.awsDashSdkStrings.`ap-northeast-1`
    - typings.awsDashSdk.awsDashSdkStrings.`sa-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`cn-north-1`
    - typings.awsDashSdk.awsDashSdkStrings.`eu-central-1`
    - java.lang.String
  */
  type BucketLocationConstraint = _BucketLocationConstraint | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FULL_CONTROL
    - typings.awsDashSdk.awsDashSdkStrings.READ
    - typings.awsDashSdk.awsDashSdkStrings.WRITE
    - java.lang.String
  */
  type BucketLogsPermission = _BucketLogsPermission | String
  type BucketName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Suspended_
    - java.lang.String
  */
  type BucketVersioningStatus = _BucketVersioningStatus | String
  type Buckets = js.Array[Bucket]
  type BypassGovernanceRetention = Boolean
  type BytesProcessed = Double
  type BytesReturned = Double
  type BytesScanned = Double
  type CORSRules = js.Array[CORSRule]
  type CacheControl = String
  type ClientConfiguration = ServiceConfigurationOptions with UseDualstackConfigOptions with ClientApiVersions
  type CloudFunction = String
  type CloudFunctionInvocationRole = String
  type Code = String
  type Comments = String
  type CommonPrefixList = js.Array[CommonPrefix]
  type CompletedPartList = js.Array[CompletedPart]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.GZIP
    - typings.awsDashSdk.awsDashSdkStrings.BZIP2
    - java.lang.String
  */
  type CompressionType = _CompressionType | String
  type ConfirmRemoveSelfBucketAccess = Boolean
  type ContentDisposition = String
  type ContentEncoding = String
  type ContentLanguage = String
  type ContentLength = Double
  type ContentMD5 = String
  type ContentRange = String
  type ContentType = String
  type CopySource = String
  type CopySourceIfMatch = String
  type CopySourceIfModifiedSince = Date
  type CopySourceIfNoneMatch = String
  type CopySourceIfUnmodifiedSince = Date
  type CopySourceRange = String
  type CopySourceSSECustomerAlgorithm = String
  type CopySourceSSECustomerKey = Buffer | Uint8Array | Blob | String
  type CopySourceSSECustomerKeyMD5 = String
  type CopySourceVersionId = String
  type CreationDate = Date
  type Days = Double
  type DaysAfterInitiation = Double
  type DeleteMarker = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type DeleteMarkerReplicationStatus = _DeleteMarkerReplicationStatus | String
  type DeleteMarkerVersionId = String
  type DeleteMarkers = js.Array[DeleteMarkerEntry]
  type DeletedObjects = js.Array[DeletedObject]
  type Delimiter = String
  type Description = String
  type DisplayName = String
  type ETag = String
  type EmailAddress = String
  type EnableRequestProgress = Boolean
  type EncodingType = url_ | String
  type End = Double
  type Errors = js.Array[Error]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonReducedRedundancyLostObject
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonObjectCreatedColonAsterisk
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonObjectCreatedColonPut
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonObjectCreatedColonPost
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonObjectCreatedColonCopy
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonObjectRemovedColonAsterisk
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonObjectRemovedColonDelete
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonObjectRestoreColonAsterisk
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonObjectRestoreColonPost
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonObjectRestoreColonCompleted
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonReplicationColonAsterisk
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonReplicationColonOperationFailedReplication
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonReplicationColonOperationNotTracked
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonReplicationColonOperationMissedThreshold
    - typings.awsDashSdk.awsDashSdkStrings.s3ColonReplicationColonOperationReplicatedAfterThreshold
    - java.lang.String
  */
  type Event = _Event | String
  type EventList = js.Array[Event]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type ExistingObjectReplicationStatus = _ExistingObjectReplicationStatus | String
  type Expiration = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type ExpirationStatus = _ExpirationStatus | String
  type ExpiredObjectDeleteMarker = Boolean
  type Expires = Date
  type ExposeHeader = String
  type ExposeHeaders = js.Array[ExposeHeader]
  type Expression = String
  type ExpressionType = SQL | String
  type FetchOwner = Boolean
  type FieldDelimiter = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USE
    - typings.awsDashSdk.awsDashSdkStrings.IGNORE
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type FileHeaderInfo = _FileHeaderInfo | String
  type FilterRuleList = js.Array[FilterRule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.prefix_
    - typings.awsDashSdk.awsDashSdkStrings.suffix
    - java.lang.String
  */
  type FilterRuleName = _FilterRuleName | String
  type FilterRuleValue = String
  type GrantFullControl = String
  type GrantRead = String
  type GrantReadACP = String
  type GrantWrite = String
  type GrantWriteACP = String
  type Grants = js.Array[Grant]
  type HostName = String
  type HttpErrorCodeReturnedEquals = String
  type HttpRedirectCode = String
  type ID = String
  type IfMatch = String
  type IfModifiedSince = Date
  type IfNoneMatch = String
  type IfUnmodifiedSince = Date
  type Initiated = Date
  type InventoryConfigurationList = js.Array[InventoryConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CSV
    - typings.awsDashSdk.awsDashSdkStrings.ORC
    - typings.awsDashSdk.awsDashSdkStrings.Parquet
    - java.lang.String
  */
  type InventoryFormat = _InventoryFormat | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Daily_
    - typings.awsDashSdk.awsDashSdkStrings.Weekly_
    - java.lang.String
  */
  type InventoryFrequency = _InventoryFrequency | String
  type InventoryId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.All_
    - typings.awsDashSdk.awsDashSdkStrings.Current_
    - java.lang.String
  */
  type InventoryIncludedObjectVersions = _InventoryIncludedObjectVersions | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Size_
    - typings.awsDashSdk.awsDashSdkStrings.LastModifiedDate
    - typings.awsDashSdk.awsDashSdkStrings.StorageClass
    - typings.awsDashSdk.awsDashSdkStrings.ETag
    - typings.awsDashSdk.awsDashSdkStrings.IsMultipartUploaded
    - typings.awsDashSdk.awsDashSdkStrings.ReplicationStatus
    - typings.awsDashSdk.awsDashSdkStrings.EncryptionStatus
    - typings.awsDashSdk.awsDashSdkStrings.ObjectLockRetainUntilDate
    - typings.awsDashSdk.awsDashSdkStrings.ObjectLockMode
    - typings.awsDashSdk.awsDashSdkStrings.ObjectLockLegalHoldStatus
    - typings.awsDashSdk.awsDashSdkStrings.IntelligentTieringAccessTier
    - java.lang.String
  */
  type InventoryOptionalField = _InventoryOptionalField | String
  type InventoryOptionalFields = js.Array[InventoryOptionalField]
  type IsEnabled = Boolean
  type IsLatest = Boolean
  type IsPublic = Boolean
  type IsTruncated = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT
    - typings.awsDashSdk.awsDashSdkStrings.LINES
    - java.lang.String
  */
  type JSONType = _JSONType | String
  type KMSContext = String
  type KeyCount = Double
  type KeyMarker = String
  type KeyPrefixEquals = String
  type LambdaFunctionArn = String
  type LambdaFunctionConfigurationList = js.Array[LambdaFunctionConfiguration]
  type LastModified = Date
  type LifecycleRules = js.Array[LifecycleRule]
  type Location = String
  type LocationPrefix = String
  type MFA = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type MFADelete = _MFADelete | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type MFADeleteStatus = _MFADeleteStatus | String
  type Marker = String
  type MaxAgeSeconds = Double
  type MaxKeys = Double
  type MaxParts = Double
  type MaxUploads = Double
  type Message = String
  type Metadata = StringDictionary[MetadataValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COPY
    - typings.awsDashSdk.awsDashSdkStrings.REPLACE
    - java.lang.String
  */
  type MetadataDirective = _MetadataDirective | String
  type MetadataKey = String
  type MetadataValue = String
  type MetricsConfigurationList = js.Array[MetricsConfiguration]
  type MetricsId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type MetricsStatus = _MetricsStatus | String
  type Minutes = Double
  type MissingMeta = Double
  type MultipartUploadId = String
  type MultipartUploadList = js.Array[MultipartUpload]
  type NextKeyMarker = String
  type NextMarker = String
  type NextPartNumberMarker = Double
  type NextToken = String
  type NextUploadIdMarker = String
  type NextVersionIdMarker = String
  type NoncurrentVersionTransitionList = js.Array[NoncurrentVersionTransition]
  type NotificationId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.private__
    - typings.awsDashSdk.awsDashSdkStrings.`public-read`
    - typings.awsDashSdk.awsDashSdkStrings.`public-read-write`
    - typings.awsDashSdk.awsDashSdkStrings.`authenticated-read`
    - typings.awsDashSdk.awsDashSdkStrings.`aws-exec-read`
    - typings.awsDashSdk.awsDashSdkStrings.`bucket-owner-read`
    - typings.awsDashSdk.awsDashSdkStrings.`bucket-owner-full-control`
    - java.lang.String
  */
  type ObjectCannedACL = _ObjectCannedACL | String
  type ObjectIdentifierList = js.Array[ObjectIdentifier]
  type ObjectKey = String
  type ObjectList = js.Array[Object]
  type ObjectLockEnabled = Enabled_ | String
  type ObjectLockEnabledForBucket = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ON
    - typings.awsDashSdk.awsDashSdkStrings.OFF
    - java.lang.String
  */
  type ObjectLockLegalHoldStatus = _ObjectLockLegalHoldStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GOVERNANCE
    - typings.awsDashSdk.awsDashSdkStrings.COMPLIANCE
    - java.lang.String
  */
  type ObjectLockMode = _ObjectLockMode | String
  type ObjectLockRetainUntilDate = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GOVERNANCE
    - typings.awsDashSdk.awsDashSdkStrings.COMPLIANCE
    - java.lang.String
  */
  type ObjectLockRetentionMode = _ObjectLockRetentionMode | String
  type ObjectLockToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.REDUCED_REDUNDANCY
    - typings.awsDashSdk.awsDashSdkStrings.GLACIER
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD_IA
    - typings.awsDashSdk.awsDashSdkStrings.ONEZONE_IA
    - typings.awsDashSdk.awsDashSdkStrings.INTELLIGENT_TIERING
    - typings.awsDashSdk.awsDashSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type ObjectStorageClass = _ObjectStorageClass | String
  type ObjectVersionId = String
  type ObjectVersionList = js.Array[ObjectVersion]
  type ObjectVersionStorageClass = STANDARD | String
  type OwnerOverride = typings.awsDashSdk.awsDashSdkStrings.Destination | String
  type PartNumber = Double
  type PartNumberMarker = Double
  type Parts = js.Array[Part]
  type PartsCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Requester
    - typings.awsDashSdk.awsDashSdkStrings.BucketOwner
    - java.lang.String
  */
  type Payer = _Payer | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FULL_CONTROL
    - typings.awsDashSdk.awsDashSdkStrings.WRITE
    - typings.awsDashSdk.awsDashSdkStrings.WRITE_ACP
    - typings.awsDashSdk.awsDashSdkStrings.READ
    - typings.awsDashSdk.awsDashSdkStrings.READ_ACP
    - java.lang.String
  */
  type Permission = _Permission | String
  type Policy = String
  type Prefix = String
  type Priority = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.http_
    - typings.awsDashSdk.awsDashSdkStrings.https_
    - java.lang.String
  */
  type Protocol = _Protocol | String
  type QueueArn = String
  type QueueConfigurationList = js.Array[QueueConfiguration]
  type Quiet = Boolean
  type QuoteCharacter = String
  type QuoteEscapeCharacter = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS
    - typings.awsDashSdk.awsDashSdkStrings.ASNEEDED
    - java.lang.String
  */
  type QuoteFields = _QuoteFields | String
  type Range = String
  type RecordDelimiter = String
  type ReplaceKeyPrefixWith = String
  type ReplaceKeyWith = String
  type ReplicaKmsKeyID = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type ReplicationRuleStatus = _ReplicationRuleStatus | String
  type ReplicationRules = js.Array[ReplicationRule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.REPLICA
    - java.lang.String
  */
  type ReplicationStatus = _ReplicationStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type ReplicationTimeStatus = _ReplicationTimeStatus | String
  type RequestCharged = requester_ | String
  type RequestPayer = requester_ | String
  type ResponseCacheControl = String
  type ResponseContentDisposition = String
  type ResponseContentEncoding = String
  type ResponseContentLanguage = String
  type ResponseContentType = String
  type ResponseExpires = Date
  type Restore = String
  type RestoreOutputPath = String
  type RestoreRequestType = SELECT | String
  type Role = String
  type RoutingRules = js.Array[RoutingRule]
  type Rules = js.Array[Rule]
  type SSECustomerAlgorithm = String
  type SSECustomerKey = Buffer | Uint8Array | Blob | String
  type SSECustomerKeyMD5 = String
  type SSEKMSEncryptionContext = String
  type SSEKMSKeyId = String
  type SelectObjectContentEventStream = EventStream[Anon_Cont]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AES256
    - typings.awsDashSdk.awsDashSdkStrings.awsColonkms
    - java.lang.String
  */
  type ServerSideEncryption = _ServerSideEncryption | String
  type ServerSideEncryptionRules = js.Array[ServerSideEncryptionRule]
  type Setting = Boolean
  type Size = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type SseKmsEncryptedObjectsStatus = _SseKmsEncryptedObjectsStatus | String
  type Start = Double
  type StartAfter = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.REDUCED_REDUNDANCY
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD_IA
    - typings.awsDashSdk.awsDashSdkStrings.ONEZONE_IA
    - typings.awsDashSdk.awsDashSdkStrings.INTELLIGENT_TIERING
    - typings.awsDashSdk.awsDashSdkStrings.GLACIER
    - typings.awsDashSdk.awsDashSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type StorageClass = _StorageClass | String
  type StorageClassAnalysisSchemaVersion = V_1 | String
  type Suffix = String
  type TagCount = Double
  type TagSet = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COPY
    - typings.awsDashSdk.awsDashSdkStrings.REPLACE
    - java.lang.String
  */
  type TaggingDirective = _TaggingDirective | String
  type TaggingHeader = String
  type TargetBucket = String
  type TargetGrants = js.Array[TargetGrant]
  type TargetPrefix = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Standard_
    - typings.awsDashSdk.awsDashSdkStrings.Bulk_
    - typings.awsDashSdk.awsDashSdkStrings.Expedited
    - java.lang.String
  */
  type Tier = _Tier | String
  type Token = String
  type TopicArn = String
  type TopicConfigurationList = js.Array[TopicConfiguration]
  type TransitionList = js.Array[Transition]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GLACIER
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD_IA
    - typings.awsDashSdk.awsDashSdkStrings.ONEZONE_IA
    - typings.awsDashSdk.awsDashSdkStrings.INTELLIGENT_TIERING
    - typings.awsDashSdk.awsDashSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type TransitionStorageClass = _TransitionStorageClass | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CanonicalUser
    - typings.awsDashSdk.awsDashSdkStrings.AmazonCustomerByEmail
    - typings.awsDashSdk.awsDashSdkStrings.Group_
    - java.lang.String
  */
  type Type = _Type | String
  type URI = String
  type UploadIdMarker = String
  type UserMetadata = js.Array[MetadataEntry]
  type Value = String
  type VersionIdMarker = String
  type WebsiteRedirectLocation = String
  type Years = Double
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2006-03-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
