package typings.awsDashSdk

import typings.awsDashSdk.awsDashSdkStrings.EXPIRE
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEcrMod {
  type Arn = String
  type AuthorizationDataList = js.Array[AuthorizationData]
  type Base64 = String
  type BatchedOperationLayerDigest = String
  type BatchedOperationLayerDigestList = js.Array[BatchedOperationLayerDigest]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CreationTimestamp = Date
  type EvaluationTimestamp = Date
  type ExpirationTimestamp = Date
  type ForceFlag = Boolean
  type GetAuthorizationTokenRegistryIdList = js.Array[RegistryId]
  type ImageActionType = EXPIRE | String
  type ImageCount = Double
  type ImageDetailList = js.Array[ImageDetail]
  type ImageDigest = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InvalidImageDigest
    - typings.awsDashSdk.awsDashSdkStrings.InvalidImageTag
    - typings.awsDashSdk.awsDashSdkStrings.ImageTagDoesNotMatchDigest
    - typings.awsDashSdk.awsDashSdkStrings.ImageNotFound
    - typings.awsDashSdk.awsDashSdkStrings.MissingDigestAndTag
    - java.lang.String
  */
  type ImageFailureCode = _ImageFailureCode | String
  type ImageFailureList = js.Array[ImageFailure]
  type ImageFailureReason = String
  type ImageIdentifierList = js.Array[ImageIdentifier]
  type ImageList = js.Array[Image]
  type ImageManifest = String
  type ImageSizeInBytes = Double
  type ImageTag = String
  type ImageTagList = js.Array[ImageTag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MUTABLE
    - typings.awsDashSdk.awsDashSdkStrings.IMMUTABLE
    - java.lang.String
  */
  type ImageTagMutability = _ImageTagMutability | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.UNAVAILABLE
    - java.lang.String
  */
  type LayerAvailability = _LayerAvailability | String
  type LayerDigest = String
  type LayerDigestList = js.Array[LayerDigest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InvalidLayerDigest
    - typings.awsDashSdk.awsDashSdkStrings.MissingLayerDigest
    - java.lang.String
  */
  type LayerFailureCode = _LayerFailureCode | String
  type LayerFailureList = js.Array[LayerFailure]
  type LayerFailureReason = String
  type LayerList = js.Array[Layer]
  type LayerPartBlob = Buffer | Uint8Array | Blob | String
  type LayerSizeInBytes = Double
  type LifecyclePolicyPreviewResultList = js.Array[LifecyclePolicyPreviewResult]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type LifecyclePolicyPreviewStatus = _LifecyclePolicyPreviewStatus | String
  type LifecyclePolicyRulePriority = Double
  type LifecyclePolicyText = String
  type LifecyclePreviewMaxResults = Double
  type MaxResults = Double
  type MediaType = String
  type MediaTypeList = js.Array[MediaType]
  type NextToken = String
  type PartSize = Double
  type ProxyEndpoint = String
  type PushTimestamp = Date
  type RegistryId = String
  type RepositoryList = js.Array[Repository]
  type RepositoryName = String
  type RepositoryNameList = js.Array[RepositoryName]
  type RepositoryPolicyText = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TAGGED
    - typings.awsDashSdk.awsDashSdkStrings.UNTAGGED
    - typings.awsDashSdk.awsDashSdkStrings.ANY
    - java.lang.String
  */
  type TagStatus = _TagStatus | String
  type TagValue = String
  type UploadId = String
  type Url = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-09-21`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
