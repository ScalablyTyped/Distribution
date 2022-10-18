package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.EXPIRE
import typings.awsSdk.awsSdkStrings.PREFIX_MATCH
import typings.awsSdk.awsSdkStrings.REPOSITORY_NOT_FOUND
import typings.awsSdk.awsSdkStrings.WILDCARD
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arch = String

type Arn = String

type AttributeKey = String

type AttributeList = js.Array[Attribute]

type AttributeValue = String

type Author = String

type AuthorizationDataList = js.Array[AuthorizationData]

type Base64 = String

type BaseScore = Double

type BatchedOperationLayerDigest = String

type BatchedOperationLayerDigestList = js.Array[BatchedOperationLayerDigest]

type CreationTimestamp = js.Date

type CvssScoreAdjustmentList = js.Array[CvssScoreAdjustment]

type CvssScoreList = js.Array[CvssScore]

type Date = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AES256
  - typings.awsSdk.awsSdkStrings.KMS
  - java.lang.String
*/
type EncryptionType = _EncryptionType | String

type EnhancedImageScanFindingList = js.Array[EnhancedImageScanFinding]

type Epoch = Double

type EvaluationTimestamp = js.Date

type ExpirationTimestamp = js.Date

type FilePath = String

type FindingArn = String

type FindingDescription = String

type FindingName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INFORMATIONAL
  - typings.awsSdk.awsSdkStrings.LOW
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.CRITICAL
  - typings.awsSdk.awsSdkStrings.UNDEFINED
  - java.lang.String
*/
type FindingSeverity = _FindingSeverity | String

type FindingSeverityCounts = StringDictionary[SeverityCount]

type ForceFlag = Boolean

type GetAuthorizationTokenRegistryIdList = js.Array[RegistryId]

type ImageActionType = EXPIRE | String

type ImageCount = Double

type ImageDetailList = js.Array[ImageDetail]

type ImageDigest = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InvalidImageDigest
  - typings.awsSdk.awsSdkStrings.InvalidImageTag
  - typings.awsSdk.awsSdkStrings.ImageTagDoesNotMatchDigest
  - typings.awsSdk.awsSdkStrings.ImageNotFound
  - typings.awsSdk.awsSdkStrings.MissingDigestAndTag
  - typings.awsSdk.awsSdkStrings.ImageReferencedByManifestList
  - typings.awsSdk.awsSdkStrings.KmsError
  - java.lang.String
*/
type ImageFailureCode = _ImageFailureCode | String

type ImageFailureList = js.Array[ImageFailure]

type ImageFailureReason = String

type ImageIdentifierList = js.Array[ImageIdentifier]

type ImageList = js.Array[Image]

type ImageManifest = String

type ImageReplicationStatusList = js.Array[ImageReplicationStatus]

type ImageScanFindingList = js.Array[ImageScanFinding]

type ImageSizeInBytes = Double

type ImageTag = String

type ImageTagList = js.Array[ImageTag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MUTABLE
  - typings.awsSdk.awsSdkStrings.IMMUTABLE
  - java.lang.String
*/
type ImageTagMutability = _ImageTagMutability | String

type ImageTagsList = js.Array[ImageTag]

type KmsKey = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.UNAVAILABLE
  - java.lang.String
*/
type LayerAvailability = _LayerAvailability | String

type LayerDigest = String

type LayerDigestList = js.Array[LayerDigest]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InvalidLayerDigest
  - typings.awsSdk.awsSdkStrings.MissingLayerDigest
  - java.lang.String
*/
type LayerFailureCode = _LayerFailureCode | String

type LayerFailureList = js.Array[LayerFailure]

type LayerFailureReason = String

type LayerList = js.Array[Layer]

type LayerPartBlob = Buffer | js.typedarray.Uint8Array | Blob | String

type LayerSizeInBytes = Double

type LifecyclePolicyPreviewResultList = js.Array[LifecyclePolicyPreviewResult]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type LifecyclePolicyPreviewStatus = _LifecyclePolicyPreviewStatus | String

type LifecyclePolicyRulePriority = Double

type LifecyclePolicyText = String

type LifecyclePreviewMaxResults = Double

type MaxResults = Double

type MediaType = String

type MediaTypeList = js.Array[MediaType]

type Metric = String

type NextToken = String

type PackageManager = String

type PartSize = Double

type Platform = String

type ProxyEndpoint = String

type PullThroughCacheRuleList = js.Array[PullThroughCacheRule]

type PullThroughCacheRuleRepositoryPrefix = String

type PullThroughCacheRuleRepositoryPrefixList = js.Array[PullThroughCacheRuleRepositoryPrefix]

type PushTimestamp = js.Date

type Reason = String

type RecommendationText = String

type RecordedPullTimestamp = js.Date

type ReferenceUrlsList = js.Array[Url]

type Region = String

type RegistryId = String

type RegistryPolicyText = String

type RegistryScanningRuleList = js.Array[RegistryScanningRule]

type RelatedVulnerabilitiesList = js.Array[RelatedVulnerability]

type RelatedVulnerability = String

type Release = String

type ReplicationDestinationList = js.Array[ReplicationDestination]

type ReplicationError = String

type ReplicationRuleList = js.Array[ReplicationRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ReplicationStatus = _ReplicationStatus | String

type RepositoryFilterList = js.Array[RepositoryFilter]

type RepositoryFilterType = PREFIX_MATCH | String

type RepositoryFilterValue = String

type RepositoryList = js.Array[Repository]

type RepositoryName = String

type RepositoryNameList = js.Array[RepositoryName]

type RepositoryPolicyText = String

type RepositoryScanningConfigurationFailureList = js.Array[RepositoryScanningConfigurationFailure]

type RepositoryScanningConfigurationList = js.Array[RepositoryScanningConfiguration]

type ResourceId = String

type ResourceList = js.Array[Resource]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SCAN_ON_PUSH
  - typings.awsSdk.awsSdkStrings.CONTINUOUS_SCAN
  - typings.awsSdk.awsSdkStrings.MANUAL
  - java.lang.String
*/
type ScanFrequency = _ScanFrequency | String

type ScanOnPushFlag = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.UNSUPPORTED_IMAGE
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SCAN_ELIGIBILITY_EXPIRED
  - typings.awsSdk.awsSdkStrings.FINDINGS_UNAVAILABLE
  - java.lang.String
*/
type ScanStatus = _ScanStatus | String

type ScanStatusDescription = String

type ScanTimestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BASIC
  - typings.awsSdk.awsSdkStrings.ENHANCED
  - java.lang.String
*/
type ScanType = _ScanType | String

type ScanningConfigurationFailureCode = REPOSITORY_NOT_FOUND | String

type ScanningConfigurationFailureReason = String

type ScanningConfigurationRepositoryNameList = js.Array[RepositoryName]

type ScanningRepositoryFilterList = js.Array[ScanningRepositoryFilter]

type ScanningRepositoryFilterType = WILDCARD | String

type ScanningRepositoryFilterValue = String

type Score = Double

type ScoringVector = String

type Severity = String

type SeverityCount = Double

type Source = String

type SourceLayerHash = String

type Status = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TAGGED
  - typings.awsSdk.awsSdkStrings.UNTAGGED
  - typings.awsSdk.awsSdkStrings.ANY
  - java.lang.String
*/
type TagStatus = _TagStatus | String

type TagValue = String

type Tags = StringDictionary[TagValue]

type Title = String

type Type = String

type UploadId = String

type Url = String

type Version = String

type VulnerabilityId = String

type VulnerabilitySourceUpdateTimestamp = js.Date

type VulnerablePackageName = String

type VulnerablePackagesList = js.Array[VulnerablePackage]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-09-21`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
