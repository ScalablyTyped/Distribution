package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.anon.Cont
import typings.awsSdk.awsSdkStrings.CSV
import typings.awsSdk.awsSdkStrings.Destination_
import typings.awsSdk.awsSdkStrings.ENABLED
import typings.awsSdk.awsSdkStrings.Enabled_
import typings.awsSdk.awsSdkStrings.SELECT
import typings.awsSdk.awsSdkStrings.SQL
import typings.awsSdk.awsSdkStrings.STANDARD
import typings.awsSdk.awsSdkStrings.V_1
import typings.awsSdk.awsSdkStrings.requester_
import typings.awsSdk.awsSdkStrings.url_
import typings.awsSdk.libEventStreamEventStreamMod.EventStream
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AbortDate = js.Date

type AbortRuleId = String

type AcceptRanges = String

type AccessPointArn = String

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

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ARCHIVE_ACCESS
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE_ACCESS
  - java.lang.String
*/
type ArchiveStatus = _ArchiveStatus | String

type Body = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type BucketAccelerateStatus = _BucketAccelerateStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.private__
  - typings.awsSdk.awsSdkStrings.`public-read`
  - typings.awsSdk.awsSdkStrings.`public-read-write`
  - typings.awsSdk.awsSdkStrings.`authenticated-read`
  - java.lang.String
*/
type BucketCannedACL = _BucketCannedACL | String

type BucketKeyEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`af-south-1`
  - typings.awsSdk.awsSdkStrings.`ap-east-1`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-3`
  - typings.awsSdk.awsSdkStrings.`ap-south-1`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-1`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-3`
  - typings.awsSdk.awsSdkStrings.`ca-central-1`
  - typings.awsSdk.awsSdkStrings.`cn-north-1`
  - typings.awsSdk.awsSdkStrings.`cn-northwest-1`
  - typings.awsSdk.awsSdkStrings.EU
  - typings.awsSdk.awsSdkStrings.`eu-central-1`
  - typings.awsSdk.awsSdkStrings.`eu-north-1`
  - typings.awsSdk.awsSdkStrings.`eu-south-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-2`
  - typings.awsSdk.awsSdkStrings.`eu-west-3`
  - typings.awsSdk.awsSdkStrings.`me-south-1`
  - typings.awsSdk.awsSdkStrings.`sa-east-1`
  - typings.awsSdk.awsSdkStrings.`us-east-2`
  - typings.awsSdk.awsSdkStrings.`us-gov-east-1`
  - typings.awsSdk.awsSdkStrings.`us-gov-west-1`
  - typings.awsSdk.awsSdkStrings.`us-west-1`
  - typings.awsSdk.awsSdkStrings.`us-west-2`
  - java.lang.String
*/
type BucketLocationConstraint = _BucketLocationConstraint | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL_CONTROL
  - typings.awsSdk.awsSdkStrings.READ
  - typings.awsSdk.awsSdkStrings.WRITE
  - java.lang.String
*/
type BucketLogsPermission = _BucketLogsPermission | String

type BucketName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Suspended_
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

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRC32
  - typings.awsSdk.awsSdkStrings.CRC32C
  - typings.awsSdk.awsSdkStrings.SHA1
  - typings.awsSdk.awsSdkStrings.SHA256
  - java.lang.String
*/
type ChecksumAlgorithm = _ChecksumAlgorithm | String

type ChecksumAlgorithmList = js.Array[ChecksumAlgorithm]

type ChecksumCRC32 = String

type ChecksumCRC32C = String

type ChecksumMode = ENABLED | String

type ChecksumSHA1 = String

type ChecksumSHA256 = String

type CloudFunction = String

type CloudFunctionInvocationRole = String

type Code = String

type Comments = String

type CommonPrefixList = js.Array[CommonPrefix]

type CompletedPartList = js.Array[CompletedPart]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.GZIP
  - typings.awsSdk.awsSdkStrings.BZIP2
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

type CopySourceIfModifiedSince = js.Date

type CopySourceIfNoneMatch = String

type CopySourceIfUnmodifiedSince = js.Date

type CopySourceRange = String

type CopySourceSSECustomerAlgorithm = String

type CopySourceSSECustomerKey = Buffer | js.typedarray.Uint8Array | Blob | String

type CopySourceSSECustomerKeyMD5 = String

type CopySourceVersionId = String

type CreationDate = js.Date

type Date = js.Date

type Days = Double

type DaysAfterInitiation = Double

type DeleteMarker = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
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

type ErrorCode = String

type ErrorMessage = String

type Errors = js.Array[Error]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.s3ColonReducedRedundancyLostObject
  - typings.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonAsterisk
  - typings.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonPut
  - typings.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonPost
  - typings.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonCopy
  - typings.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonAsterisk
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonDelete
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonAsterisk
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonPost
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonCompleted
  - typings.awsSdk.awsSdkStrings.s3ColonReplicationColonAsterisk
  - typings.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationFailedReplication
  - typings.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationNotTracked
  - typings.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationMissedThreshold
  - typings.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationReplicatedAfterThreshold
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonDelete
  - typings.awsSdk.awsSdkStrings.s3ColonLifecycleTransition
  - typings.awsSdk.awsSdkStrings.s3ColonIntelligentTiering
  - typings.awsSdk.awsSdkStrings.s3ColonObjectAclColonPut
  - typings.awsSdk.awsSdkStrings.s3ColonLifecycleExpirationColonAsterisk
  - typings.awsSdk.awsSdkStrings.s3ColonLifecycleExpirationColonDelete
  - typings.awsSdk.awsSdkStrings.s3ColonLifecycleExpirationColonDeleteMarkerCreated
  - typings.awsSdk.awsSdkStrings.s3ColonObjectTaggingColonAsterisk
  - typings.awsSdk.awsSdkStrings.s3ColonObjectTaggingColonPut
  - typings.awsSdk.awsSdkStrings.s3ColonObjectTaggingColonDelete
  - java.lang.String
*/
type Event = _Event | String

type EventList = js.Array[Event]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ExistingObjectReplicationStatus = _ExistingObjectReplicationStatus | String

type Expiration = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ExpirationStatus = _ExpirationStatus | String

type ExpiredObjectDeleteMarker = Boolean

type Expires = js.Date

type ExposeHeader = String

type ExposeHeaders = js.Array[ExposeHeader]

type Expression = String

type ExpressionType = SQL | String

type FetchOwner = Boolean

type FieldDelimiter = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USE
  - typings.awsSdk.awsSdkStrings.IGNORE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type FileHeaderInfo = _FileHeaderInfo | String

type FilterRuleList = js.Array[FilterRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.prefix__
  - typings.awsSdk.awsSdkStrings.suffix_
  - java.lang.String
*/
type FilterRuleName = _FilterRuleName | String

type FilterRuleValue = String

type GetObjectResponseStatusCode = Double

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

type IfModifiedSince = js.Date

type IfNoneMatch = String

type IfUnmodifiedSince = js.Date

type Initiated = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ARCHIVE_ACCESS
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE_ACCESS
  - java.lang.String
*/
type IntelligentTieringAccessTier = _IntelligentTieringAccessTier | String

type IntelligentTieringConfigurationList = js.Array[IntelligentTieringConfiguration]

type IntelligentTieringDays = Double

type IntelligentTieringId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type IntelligentTieringStatus = _IntelligentTieringStatus | String

type InventoryConfigurationList = js.Array[InventoryConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.ORC
  - typings.awsSdk.awsSdkStrings.Parquet_
  - java.lang.String
*/
type InventoryFormat = _InventoryFormat | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Daily_
  - typings.awsSdk.awsSdkStrings.Weekly_
  - java.lang.String
*/
type InventoryFrequency = _InventoryFrequency | String

type InventoryId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.All_
  - typings.awsSdk.awsSdkStrings.Current_
  - java.lang.String
*/
type InventoryIncludedObjectVersions = _InventoryIncludedObjectVersions | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Size_
  - typings.awsSdk.awsSdkStrings.LastModifiedDate
  - typings.awsSdk.awsSdkStrings.StorageClass
  - typings.awsSdk.awsSdkStrings.ETag
  - typings.awsSdk.awsSdkStrings.IsMultipartUploaded
  - typings.awsSdk.awsSdkStrings.ReplicationStatus
  - typings.awsSdk.awsSdkStrings.EncryptionStatus
  - typings.awsSdk.awsSdkStrings.ObjectLockRetainUntilDate
  - typings.awsSdk.awsSdkStrings.ObjectLockMode
  - typings.awsSdk.awsSdkStrings.ObjectLockLegalHoldStatus
  - typings.awsSdk.awsSdkStrings.IntelligentTieringAccessTier
  - typings.awsSdk.awsSdkStrings.BucketKeyStatus
  - typings.awsSdk.awsSdkStrings.ChecksumAlgorithm
  - java.lang.String
*/
type InventoryOptionalField = _InventoryOptionalField | String

type InventoryOptionalFields = js.Array[InventoryOptionalField]

type IsEnabled = Boolean

type IsLatest = Boolean

type IsPublic = Boolean

type IsTruncated = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DOCUMENT
  - typings.awsSdk.awsSdkStrings.LINES
  - java.lang.String
*/
type JSONType = _JSONType | String

type KMSContext = String

type KeyCount = Double

type KeyMarker = String

type KeyPrefixEquals = String

type LambdaFunctionArn = String

type LambdaFunctionConfigurationList = js.Array[LambdaFunctionConfiguration]

type LastModified = js.Date

type LifecycleRules = js.Array[LifecycleRule]

type Location = String

type LocationPrefix = String

type MFA = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type MFADelete = _MFADelete | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
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
  - typings.awsSdk.awsSdkStrings.COPY
  - typings.awsSdk.awsSdkStrings.REPLACE
  - java.lang.String
*/
type MetadataDirective = _MetadataDirective | String

type MetadataKey = String

type MetadataValue = String

type MetricsConfigurationList = js.Array[MetricsConfiguration]

type MetricsId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
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
  - typings.awsSdk.awsSdkStrings.ETag
  - typings.awsSdk.awsSdkStrings.Checksum
  - typings.awsSdk.awsSdkStrings.ObjectParts
  - typings.awsSdk.awsSdkStrings.StorageClass
  - typings.awsSdk.awsSdkStrings.ObjectSize
  - java.lang.String
*/
type ObjectAttributes = _ObjectAttributes | String

type ObjectAttributesList = js.Array[ObjectAttributes]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.private__
  - typings.awsSdk.awsSdkStrings.`public-read`
  - typings.awsSdk.awsSdkStrings.`public-read-write`
  - typings.awsSdk.awsSdkStrings.`authenticated-read`
  - typings.awsSdk.awsSdkStrings.`aws-exec-read`
  - typings.awsSdk.awsSdkStrings.`bucket-owner-read`
  - typings.awsSdk.awsSdkStrings.`bucket-owner-full-control`
  - java.lang.String
*/
type ObjectCannedACL = _ObjectCannedACL | String

type ObjectIdentifierList = js.Array[ObjectIdentifier]

type ObjectKey = String

type ObjectList = js.Array[Object]

type ObjectLockEnabled = Enabled_ | String

type ObjectLockEnabledForBucket = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ON
  - typings.awsSdk.awsSdkStrings.OFF
  - java.lang.String
*/
type ObjectLockLegalHoldStatus = _ObjectLockLegalHoldStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GOVERNANCE
  - typings.awsSdk.awsSdkStrings.COMPLIANCE
  - java.lang.String
*/
type ObjectLockMode = _ObjectLockMode | String

type ObjectLockRetainUntilDate = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GOVERNANCE
  - typings.awsSdk.awsSdkStrings.COMPLIANCE
  - java.lang.String
*/
type ObjectLockRetentionMode = _ObjectLockRetentionMode | String

type ObjectLockToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BucketOwnerPreferred
  - typings.awsSdk.awsSdkStrings.ObjectWriter
  - typings.awsSdk.awsSdkStrings.BucketOwnerEnforced
  - java.lang.String
*/
type ObjectOwnership = _ObjectOwnership | String

type ObjectSize = Double

type ObjectSizeGreaterThanBytes = Double

type ObjectSizeLessThanBytes = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
  - typings.awsSdk.awsSdkStrings.GLACIER
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - typings.awsSdk.awsSdkStrings.ONEZONE_IA
  - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typings.awsSdk.awsSdkStrings.OUTPOSTS
  - typings.awsSdk.awsSdkStrings.GLACIER_IR
  - typings.awsSdk.awsSdkStrings.SNOW
  - java.lang.String
*/
type ObjectStorageClass = _ObjectStorageClass | String

type ObjectVersionId = String

type ObjectVersionList = js.Array[ObjectVersion]

type ObjectVersionStorageClass = STANDARD | String

type OwnerOverride = Destination_ | String

type OwnershipControlsRules = js.Array[OwnershipControlsRule]

type PartNumber = Double

type PartNumberMarker = Double

type Parts = js.Array[Part]

type PartsCount = Double

type PartsList = js.Array[ObjectPart]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Requester
  - typings.awsSdk.awsSdkStrings.BucketOwner
  - java.lang.String
*/
type Payer = _Payer | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL_CONTROL
  - typings.awsSdk.awsSdkStrings.WRITE
  - typings.awsSdk.awsSdkStrings.WRITE_ACP
  - typings.awsSdk.awsSdkStrings.READ
  - typings.awsSdk.awsSdkStrings.READ_ACP
  - java.lang.String
*/
type Permission = _Permission | String

type Policy = String

type Prefix = String

type Priority = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.http_
  - typings.awsSdk.awsSdkStrings.https_
  - java.lang.String
*/
type Protocol = _Protocol | String

type QueueArn = String

type QueueConfigurationList = js.Array[QueueConfiguration]

type Quiet = Boolean

type QuoteCharacter = String

type QuoteEscapeCharacter = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALWAYS
  - typings.awsSdk.awsSdkStrings.ASNEEDED
  - java.lang.String
*/
type QuoteFields = _QuoteFields | String

type Range = String

type RecordDelimiter = String

type ReplaceKeyPrefixWith = String

type ReplaceKeyWith = String

type ReplicaKmsKeyID = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ReplicaModificationsStatus = _ReplicaModificationsStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ReplicationRuleStatus = _ReplicationRuleStatus | String

type ReplicationRules = js.Array[ReplicationRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.REPLICA
  - java.lang.String
*/
type ReplicationStatus = _ReplicationStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ReplicationTimeStatus = _ReplicationTimeStatus | String

type RequestCharged = requester_ | String

type RequestPayer = requester_ | String

type RequestRoute = String

type RequestToken = String

type ResponseCacheControl = String

type ResponseContentDisposition = String

type ResponseContentEncoding = String

type ResponseContentLanguage = String

type ResponseContentType = String

type ResponseExpires = js.Date

type Restore = String

type RestoreOutputPath = String

type RestoreRequestType = SELECT | String

type Role = String

type RoutingRules = js.Array[RoutingRule]

type Rules = js.Array[Rule]

type SSECustomerAlgorithm = String

type SSECustomerKey = Buffer | js.typedarray.Uint8Array | Blob | String

type SSECustomerKeyMD5 = String

type SSEKMSEncryptionContext = String

type SSEKMSKeyId = String

type SelectObjectContentEventStream = EventStream[Cont]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AES256
  - typings.awsSdk.awsSdkStrings.awsColonkms
  - java.lang.String
*/
type ServerSideEncryption = _ServerSideEncryption | String

type ServerSideEncryptionRules = js.Array[ServerSideEncryptionRule]

type Setting = Boolean

type Size = Double

type SkipValidation = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type SseKmsEncryptedObjectsStatus = _SseKmsEncryptedObjectsStatus | String

type Start = Double

type StartAfter = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - typings.awsSdk.awsSdkStrings.ONEZONE_IA
  - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typings.awsSdk.awsSdkStrings.GLACIER
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typings.awsSdk.awsSdkStrings.OUTPOSTS
  - typings.awsSdk.awsSdkStrings.GLACIER_IR
  - typings.awsSdk.awsSdkStrings.SNOW
  - java.lang.String
*/
type StorageClass = _StorageClass | String

type StorageClassAnalysisSchemaVersion = V_1 | String

type Suffix = String

type TagCount = Double

type TagSet = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COPY
  - typings.awsSdk.awsSdkStrings.REPLACE
  - java.lang.String
*/
type TaggingDirective = _TaggingDirective | String

type TaggingHeader = String

type TargetBucket = String

type TargetGrants = js.Array[TargetGrant]

type TargetPrefix = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Standard_
  - typings.awsSdk.awsSdkStrings.Bulk_
  - typings.awsSdk.awsSdkStrings.Expedited
  - java.lang.String
*/
type Tier = _Tier | String

type TieringList = js.Array[Tiering]

type Token = String

type TopicArn = String

type TopicConfigurationList = js.Array[TopicConfiguration]

type TransitionList = js.Array[Transition]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GLACIER
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - typings.awsSdk.awsSdkStrings.ONEZONE_IA
  - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typings.awsSdk.awsSdkStrings.GLACIER_IR
  - java.lang.String
*/
type TransitionStorageClass = _TransitionStorageClass | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CanonicalUser
  - typings.awsSdk.awsSdkStrings.AmazonCustomerByEmail
  - typings.awsSdk.awsSdkStrings.Group_
  - java.lang.String
*/
type Type = _Type | String

type URI = String

type UploadIdMarker = String

type UserMetadata = js.Array[MetadataEntry]

type Value = String

type VersionCount = Double

type VersionIdMarker = String

type WebsiteRedirectLocation = String

type Years = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2006-03-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
