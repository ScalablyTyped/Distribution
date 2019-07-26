package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEcrMod {
  type Arn = java.lang.String
  type AuthorizationDataList = js.Array[AuthorizationData]
  type Base64 = java.lang.String
  type BatchedOperationLayerDigest = java.lang.String
  type BatchedOperationLayerDigestList = js.Array[BatchedOperationLayerDigest]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CreationTimestamp = stdLib.Date
  type EvaluationTimestamp = stdLib.Date
  type ExpirationTimestamp = stdLib.Date
  type ForceFlag = scala.Boolean
  type GetAuthorizationTokenRegistryIdList = js.Array[RegistryId]
  type ImageActionType = awsDashSdkLib.awsDashSdkLibStrings.EXPIRE | java.lang.String
  type ImageCount = scala.Double
  type ImageDetailList = js.Array[ImageDetail]
  type ImageDigest = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidImageDigest
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidImageTag
    - awsDashSdkLib.awsDashSdkLibStrings.ImageTagDoesNotMatchDigest
    - awsDashSdkLib.awsDashSdkLibStrings.ImageNotFound
    - awsDashSdkLib.awsDashSdkLibStrings.MissingDigestAndTag
    - java.lang.String
  */
  type ImageFailureCode = _ImageFailureCode | java.lang.String
  type ImageFailureList = js.Array[ImageFailure]
  type ImageFailureReason = java.lang.String
  type ImageIdentifierList = js.Array[ImageIdentifier]
  type ImageList = js.Array[Image]
  type ImageManifest = java.lang.String
  type ImageSizeInBytes = scala.Double
  type ImageTag = java.lang.String
  type ImageTagList = js.Array[ImageTag]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MUTABLE
    - awsDashSdkLib.awsDashSdkLibStrings.IMMUTABLE
    - java.lang.String
  */
  type ImageTagMutability = _ImageTagMutability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.UNAVAILABLE
    - java.lang.String
  */
  type LayerAvailability = _LayerAvailability | java.lang.String
  type LayerDigest = java.lang.String
  type LayerDigestList = js.Array[LayerDigest]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidLayerDigest
    - awsDashSdkLib.awsDashSdkLibStrings.MissingLayerDigest
    - java.lang.String
  */
  type LayerFailureCode = _LayerFailureCode | java.lang.String
  type LayerFailureList = js.Array[LayerFailure]
  type LayerFailureReason = java.lang.String
  type LayerList = js.Array[Layer]
  type LayerPartBlob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type LayerSizeInBytes = scala.Double
  type LifecyclePolicyPreviewResultList = js.Array[LifecyclePolicyPreviewResult]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type LifecyclePolicyPreviewStatus = _LifecyclePolicyPreviewStatus | java.lang.String
  type LifecyclePolicyRulePriority = scala.Double
  type LifecyclePolicyText = java.lang.String
  type LifecyclePreviewMaxResults = scala.Double
  type MaxResults = scala.Double
  type MediaType = java.lang.String
  type MediaTypeList = js.Array[MediaType]
  type NextToken = java.lang.String
  type PartSize = scala.Double
  type ProxyEndpoint = java.lang.String
  type PushTimestamp = stdLib.Date
  type RegistryId = java.lang.String
  type RepositoryList = js.Array[Repository]
  type RepositoryName = java.lang.String
  type RepositoryNameList = js.Array[RepositoryName]
  type RepositoryPolicyText = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TAGGED
    - awsDashSdkLib.awsDashSdkLibStrings.UNTAGGED
    - awsDashSdkLib.awsDashSdkLibStrings.ANY
    - java.lang.String
  */
  type TagStatus = _TagStatus | java.lang.String
  type TagValue = java.lang.String
  type UploadId = java.lang.String
  type Url = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-09-21`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
