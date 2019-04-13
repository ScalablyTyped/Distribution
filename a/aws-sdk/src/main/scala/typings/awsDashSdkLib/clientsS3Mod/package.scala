package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsS3Mod {
  type AbortDate = stdLib.Date
  type AbortRuleId = java.lang.String
  type AcceptRanges = java.lang.String
  type AccountId = java.lang.String
  type AllowQuotedRecordDelimiter = scala.Boolean
  type AllowedHeader = java.lang.String
  type AllowedHeaders = js.Array[AllowedHeader]
  type AllowedMethod = java.lang.String
  type AllowedMethods = js.Array[AllowedMethod]
  type AllowedOrigin = java.lang.String
  type AllowedOrigins = js.Array[AllowedOrigin]
  type AnalyticsConfigurationList = js.Array[AnalyticsConfiguration]
  type AnalyticsId = java.lang.String
  type AnalyticsS3ExportFileFormat = awsDashSdkLib.awsDashSdkLibStrings.CSV | java.lang.String
  type Body = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String | nodeLib.streamMod.Readable
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Suspended
    - java.lang.String
  */
  type BucketAccelerateStatus = _BucketAccelerateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`private`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read-write`
    - awsDashSdkLib.awsDashSdkLibStrings.`authenticated-read`
    - java.lang.String
  */
  type BucketCannedACL = _BucketCannedACL | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EU
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`us-west-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-south-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-2`
    - awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`sa-east-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`cn-north-1`
    - awsDashSdkLib.awsDashSdkLibStrings.`eu-central-1`
    - java.lang.String
  */
  type BucketLocationConstraint = _BucketLocationConstraint | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FULL_CONTROL
    - awsDashSdkLib.awsDashSdkLibStrings.READ
    - awsDashSdkLib.awsDashSdkLibStrings.WRITE
    - java.lang.String
  */
  type BucketLogsPermission = _BucketLogsPermission | java.lang.String
  type BucketName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Suspended
    - java.lang.String
  */
  type BucketVersioningStatus = _BucketVersioningStatus | java.lang.String
  type Buckets = js.Array[Bucket]
  type BypassGovernanceRetention = scala.Boolean
  type BytesProcessed = scala.Double
  type BytesReturned = scala.Double
  type BytesScanned = scala.Double
  type CORSRules = js.Array[CORSRule]
  type CacheControl = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with awsDashSdkLib.libConfigUnderscoreUseUnderscoreDualstackMod.UseDualstackConfigOptions with ClientApiVersions
  type CloudFunction = java.lang.String
  type CloudFunctionInvocationRole = java.lang.String
  type Code = java.lang.String
  type Comments = java.lang.String
  type CommonPrefixList = js.Array[CommonPrefix]
  type CompletedPartList = js.Array[CompletedPart]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.GZIP
    - awsDashSdkLib.awsDashSdkLibStrings.BZIP2
    - java.lang.String
  */
  type CompressionType = _CompressionType | java.lang.String
  type ConfirmRemoveSelfBucketAccess = scala.Boolean
  type ContentDisposition = java.lang.String
  type ContentEncoding = java.lang.String
  type ContentLanguage = java.lang.String
  type ContentLength = scala.Double
  type ContentMD5 = java.lang.String
  type ContentRange = java.lang.String
  type ContentType = java.lang.String
  type CopySource = java.lang.String
  type CopySourceIfMatch = java.lang.String
  type CopySourceIfModifiedSince = stdLib.Date
  type CopySourceIfNoneMatch = java.lang.String
  type CopySourceIfUnmodifiedSince = stdLib.Date
  type CopySourceRange = java.lang.String
  type CopySourceSSECustomerAlgorithm = java.lang.String
  type CopySourceSSECustomerKey = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type CopySourceSSECustomerKeyMD5 = java.lang.String
  type CopySourceVersionId = java.lang.String
  type CreationDate = stdLib.Date
  type Days = scala.Double
  type DaysAfterInitiation = scala.Double
  type DeleteMarker = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - java.lang.String
  */
  type DeleteMarkerReplicationStatus = _DeleteMarkerReplicationStatus | java.lang.String
  type DeleteMarkerVersionId = java.lang.String
  type DeleteMarkers = js.Array[DeleteMarkerEntry]
  type DeletedObjects = js.Array[DeletedObject]
  type Delimiter = java.lang.String
  type Description = java.lang.String
  type DisplayName = java.lang.String
  type ETag = java.lang.String
  type EmailAddress = java.lang.String
  type EnableRequestProgress = scala.Boolean
  type EncodingType = awsDashSdkLib.awsDashSdkLibStrings.url | java.lang.String
  type Errors = js.Array[Error]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`s3:ReducedRedundancyLostObject`
    - awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectCreated:*`
    - awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectCreated:Put`
    - awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectCreated:Post`
    - awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectCreated:Copy`
    - awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectCreated:CompleteMultipartUpload`
    - awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectRemoved:*`
    - awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectRemoved:Delete`
    - awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectRemoved:DeleteMarkerCreated`
    - awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectRestore:Post`
    - awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectRestore:Completed`
    - java.lang.String
  */
  type Event = _Event | java.lang.String
  type EventList = js.Array[Event]
  type Expiration = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - java.lang.String
  */
  type ExpirationStatus = _ExpirationStatus | java.lang.String
  type ExpiredObjectDeleteMarker = scala.Boolean
  type Expires = stdLib.Date
  type ExposeHeader = java.lang.String
  type ExposeHeaders = js.Array[ExposeHeader]
  type Expression = java.lang.String
  type ExpressionType = awsDashSdkLib.awsDashSdkLibStrings.SQL | java.lang.String
  type FetchOwner = scala.Boolean
  type FieldDelimiter = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USE
    - awsDashSdkLib.awsDashSdkLibStrings.IGNORE
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - java.lang.String
  */
  type FileHeaderInfo = _FileHeaderInfo | java.lang.String
  type FilterRuleList = js.Array[FilterRule]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.prefix
    - awsDashSdkLib.awsDashSdkLibStrings.suffix
    - java.lang.String
  */
  type FilterRuleName = _FilterRuleName | java.lang.String
  type FilterRuleValue = java.lang.String
  type GrantFullControl = java.lang.String
  type GrantRead = java.lang.String
  type GrantReadACP = java.lang.String
  type GrantWrite = java.lang.String
  type GrantWriteACP = java.lang.String
  type Grants = js.Array[Grant]
  type HostName = java.lang.String
  type HttpErrorCodeReturnedEquals = java.lang.String
  type HttpRedirectCode = java.lang.String
  type ID = java.lang.String
  type IfMatch = java.lang.String
  type IfModifiedSince = stdLib.Date
  type IfNoneMatch = java.lang.String
  type IfUnmodifiedSince = stdLib.Date
  type Initiated = stdLib.Date
  type InventoryConfigurationList = js.Array[InventoryConfiguration]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CSV
    - awsDashSdkLib.awsDashSdkLibStrings.ORC
    - awsDashSdkLib.awsDashSdkLibStrings.Parquet
    - java.lang.String
  */
  type InventoryFormat = _InventoryFormat | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Daily
    - awsDashSdkLib.awsDashSdkLibStrings.Weekly
    - java.lang.String
  */
  type InventoryFrequency = _InventoryFrequency | java.lang.String
  type InventoryId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.All
    - awsDashSdkLib.awsDashSdkLibStrings.Current
    - java.lang.String
  */
  type InventoryIncludedObjectVersions = _InventoryIncludedObjectVersions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Size
    - awsDashSdkLib.awsDashSdkLibStrings.LastModifiedDate
    - awsDashSdkLib.awsDashSdkLibStrings.StorageClass
    - awsDashSdkLib.awsDashSdkLibStrings.ETag
    - awsDashSdkLib.awsDashSdkLibStrings.IsMultipartUploaded
    - awsDashSdkLib.awsDashSdkLibStrings.ReplicationStatus
    - awsDashSdkLib.awsDashSdkLibStrings.EncryptionStatus
    - awsDashSdkLib.awsDashSdkLibStrings.ObjectLockRetainUntilDate
    - awsDashSdkLib.awsDashSdkLibStrings.ObjectLockMode
    - awsDashSdkLib.awsDashSdkLibStrings.ObjectLockLegalHoldStatus
    - java.lang.String
  */
  type InventoryOptionalField = _InventoryOptionalField | java.lang.String
  type InventoryOptionalFields = js.Array[InventoryOptionalField]
  type IsEnabled = scala.Boolean
  type IsLatest = scala.Boolean
  type IsPublic = scala.Boolean
  type IsTruncated = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT
    - awsDashSdkLib.awsDashSdkLibStrings.LINES
    - java.lang.String
  */
  type JSONType = _JSONType | java.lang.String
  type KMSContext = java.lang.String
  type KeyCount = scala.Double
  type KeyMarker = java.lang.String
  type KeyPrefixEquals = java.lang.String
  type LambdaFunctionArn = java.lang.String
  type LambdaFunctionConfigurationList = js.Array[LambdaFunctionConfiguration]
  type LastModified = stdLib.Date
  type LifecycleRules = js.Array[LifecycleRule]
  type Location = java.lang.String
  type LocationPrefix = java.lang.String
  type MFA = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - java.lang.String
  */
  type MFADelete = _MFADelete | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - java.lang.String
  */
  type MFADeleteStatus = _MFADeleteStatus | java.lang.String
  type Marker = java.lang.String
  type MaxAgeSeconds = scala.Double
  type MaxKeys = scala.Double
  type MaxParts = scala.Double
  type MaxUploads = scala.Double
  type Message = java.lang.String
  type Metadata = org.scalablytyped.runtime.StringDictionary[MetadataValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COPY
    - awsDashSdkLib.awsDashSdkLibStrings.REPLACE
    - java.lang.String
  */
  type MetadataDirective = _MetadataDirective | java.lang.String
  type MetadataKey = java.lang.String
  type MetadataValue = java.lang.String
  type MetricsConfigurationList = js.Array[MetricsConfiguration]
  type MetricsId = java.lang.String
  type MissingMeta = scala.Double
  type MultipartUploadId = java.lang.String
  type MultipartUploadList = js.Array[MultipartUpload]
  type NextKeyMarker = java.lang.String
  type NextMarker = java.lang.String
  type NextPartNumberMarker = scala.Double
  type NextToken = java.lang.String
  type NextUploadIdMarker = java.lang.String
  type NextVersionIdMarker = java.lang.String
  type NoncurrentVersionTransitionList = js.Array[NoncurrentVersionTransition]
  type NotificationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`private`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read-write`
    - awsDashSdkLib.awsDashSdkLibStrings.`authenticated-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-exec-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-full-control`
    - java.lang.String
  */
  type ObjectCannedACL = _ObjectCannedACL | java.lang.String
  type ObjectIdentifierList = js.Array[ObjectIdentifier]
  type ObjectKey = java.lang.String
  type ObjectList = js.Array[Object]
  type ObjectLockEnabled = awsDashSdkLib.awsDashSdkLibStrings.Enabled | java.lang.String
  type ObjectLockEnabledForBucket = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ON
    - awsDashSdkLib.awsDashSdkLibStrings.OFF
    - java.lang.String
  */
  type ObjectLockLegalHoldStatus = _ObjectLockLegalHoldStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GOVERNANCE
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLIANCE
    - java.lang.String
  */
  type ObjectLockMode = _ObjectLockMode | java.lang.String
  type ObjectLockRetainUntilDate = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GOVERNANCE
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLIANCE
    - java.lang.String
  */
  type ObjectLockRetentionMode = _ObjectLockRetentionMode | java.lang.String
  type ObjectLockToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD
    - awsDashSdkLib.awsDashSdkLibStrings.REDUCED_REDUNDANCY
    - awsDashSdkLib.awsDashSdkLibStrings.GLACIER
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD_IA
    - awsDashSdkLib.awsDashSdkLibStrings.ONEZONE_IA
    - awsDashSdkLib.awsDashSdkLibStrings.INTELLIGENT_TIERING
    - awsDashSdkLib.awsDashSdkLibStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type ObjectStorageClass = _ObjectStorageClass | java.lang.String
  type ObjectVersionId = java.lang.String
  type ObjectVersionList = js.Array[ObjectVersion]
  type ObjectVersionStorageClass = awsDashSdkLib.awsDashSdkLibStrings.STANDARD | java.lang.String
  type OwnerOverride = awsDashSdkLib.awsDashSdkLibStrings.Destination | java.lang.String
  type PartNumber = scala.Double
  type PartNumberMarker = scala.Double
  type Parts = js.Array[Part]
  type PartsCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Requester
    - awsDashSdkLib.awsDashSdkLibStrings.BucketOwner
    - java.lang.String
  */
  type Payer = _Payer | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FULL_CONTROL
    - awsDashSdkLib.awsDashSdkLibStrings.WRITE
    - awsDashSdkLib.awsDashSdkLibStrings.WRITE_ACP
    - awsDashSdkLib.awsDashSdkLibStrings.READ
    - awsDashSdkLib.awsDashSdkLibStrings.READ_ACP
    - java.lang.String
  */
  type Permission = _Permission | java.lang.String
  type Policy = java.lang.String
  type Prefix = java.lang.String
  type Priority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.http
    - awsDashSdkLib.awsDashSdkLibStrings.https
    - java.lang.String
  */
  type Protocol = _Protocol | java.lang.String
  type QueueArn = java.lang.String
  type QueueConfigurationList = js.Array[QueueConfiguration]
  type Quiet = scala.Boolean
  type QuoteCharacter = java.lang.String
  type QuoteEscapeCharacter = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALWAYS
    - awsDashSdkLib.awsDashSdkLibStrings.ASNEEDED
    - java.lang.String
  */
  type QuoteFields = _QuoteFields | java.lang.String
  type Range = java.lang.String
  type RecordDelimiter = java.lang.String
  type ReplaceKeyPrefixWith = java.lang.String
  type ReplaceKeyWith = java.lang.String
  type ReplicaKmsKeyID = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - java.lang.String
  */
  type ReplicationRuleStatus = _ReplicationRuleStatus | java.lang.String
  type ReplicationRules = js.Array[ReplicationRule]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICA
    - java.lang.String
  */
  type ReplicationStatus = _ReplicationStatus | java.lang.String
  type RequestCharged = awsDashSdkLib.awsDashSdkLibStrings.requester | java.lang.String
  type RequestPayer = awsDashSdkLib.awsDashSdkLibStrings.requester | java.lang.String
  type ResponseCacheControl = java.lang.String
  type ResponseContentDisposition = java.lang.String
  type ResponseContentEncoding = java.lang.String
  type ResponseContentLanguage = java.lang.String
  type ResponseContentType = java.lang.String
  type ResponseExpires = stdLib.Date
  type Restore = java.lang.String
  type RestoreOutputPath = java.lang.String
  type RestoreRequestType = awsDashSdkLib.awsDashSdkLibStrings.SELECT | java.lang.String
  type Role = java.lang.String
  type RoutingRules = js.Array[RoutingRule]
  type Rules = js.Array[Rule]
  type SSECustomerAlgorithm = java.lang.String
  type SSECustomerKey = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type SSECustomerKeyMD5 = java.lang.String
  type SSEKMSKeyId = java.lang.String
  type SelectObjectContentEventStream = awsDashSdkLib.libEventDashStreamEventDashStreamMod.EventStream[awsDashSdkLib.Anon_Cont]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AES256
    - awsDashSdkLib.awsDashSdkLibStrings.`aws:kms`
    - java.lang.String
  */
  type ServerSideEncryption = _ServerSideEncryption | java.lang.String
  type ServerSideEncryptionRules = js.Array[ServerSideEncryptionRule]
  type Setting = scala.Boolean
  type Size = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - java.lang.String
  */
  type SseKmsEncryptedObjectsStatus = _SseKmsEncryptedObjectsStatus | java.lang.String
  type StartAfter = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD
    - awsDashSdkLib.awsDashSdkLibStrings.REDUCED_REDUNDANCY
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD_IA
    - awsDashSdkLib.awsDashSdkLibStrings.ONEZONE_IA
    - awsDashSdkLib.awsDashSdkLibStrings.INTELLIGENT_TIERING
    - awsDashSdkLib.awsDashSdkLibStrings.GLACIER
    - awsDashSdkLib.awsDashSdkLibStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type StorageClass = _StorageClass | java.lang.String
  type StorageClassAnalysisSchemaVersion = awsDashSdkLib.awsDashSdkLibStrings.V_1 | java.lang.String
  type Suffix = java.lang.String
  type TagCount = scala.Double
  type TagSet = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COPY
    - awsDashSdkLib.awsDashSdkLibStrings.REPLACE
    - java.lang.String
  */
  type TaggingDirective = _TaggingDirective | java.lang.String
  type TaggingHeader = java.lang.String
  type TargetBucket = java.lang.String
  type TargetGrants = js.Array[TargetGrant]
  type TargetPrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Standard
    - awsDashSdkLib.awsDashSdkLibStrings.Bulk
    - awsDashSdkLib.awsDashSdkLibStrings.Expedited
    - java.lang.String
  */
  type Tier = _Tier | java.lang.String
  type Token = java.lang.String
  type TopicArn = java.lang.String
  type TopicConfigurationList = js.Array[TopicConfiguration]
  type TransitionList = js.Array[Transition]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GLACIER
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD_IA
    - awsDashSdkLib.awsDashSdkLibStrings.ONEZONE_IA
    - awsDashSdkLib.awsDashSdkLibStrings.INTELLIGENT_TIERING
    - awsDashSdkLib.awsDashSdkLibStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type TransitionStorageClass = _TransitionStorageClass | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CanonicalUser
    - awsDashSdkLib.awsDashSdkLibStrings.AmazonCustomerByEmail
    - awsDashSdkLib.awsDashSdkLibStrings.Group
    - java.lang.String
  */
  type Type = _Type | java.lang.String
  type URI = java.lang.String
  type UploadIdMarker = java.lang.String
  type UserMetadata = js.Array[MetadataEntry]
  type Value = java.lang.String
  type VersionIdMarker = java.lang.String
  type WebsiteRedirectLocation = java.lang.String
  type Years = scala.Double
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2006-03-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
