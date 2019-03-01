package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/ecr", "ECR")
@js.native
object ECRNs extends js.Object {
  trait AuthorizationData extends js.Object {
    /**
      * A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the string is decoded, it is presented in the format user:password for private registry authentication using docker login.
      */
    var authorizationToken: js.UndefOr[Base64] = js.undefined
    /**
      * The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are valid for 12 hours.
      */
    var expiresAt: js.UndefOr[ExpirationTimestamp] = js.undefined
    /**
      * The registry URL to use for this authorization token in a docker login command. The Amazon ECR registry URL format is https://aws_account_id.dkr.ecr.region.amazonaws.com. For example, https://012345678910.dkr.ecr.us-east-1.amazonaws.com.. 
      */
    var proxyEndpoint: js.UndefOr[ProxyEndpoint] = js.undefined
  }
  
  trait BatchCheckLayerAvailabilityRequest extends js.Object {
    /**
      * The digests of the image layers to check.
      */
    var layerDigests: BatchedOperationLayerDigestList
    /**
      * The AWS account ID associated with the registry that contains the image layers to check. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository that is associated with the image layers to check.
      */
    var repositoryName: RepositoryName
  }
  
  trait BatchCheckLayerAvailabilityResponse extends js.Object {
    /**
      * Any failures associated with the call.
      */
    var failures: js.UndefOr[LayerFailureList] = js.undefined
    /**
      * A list of image layer objects corresponding to the image layer references in the request.
      */
    var layers: js.UndefOr[LayerList] = js.undefined
  }
  
  trait BatchDeleteImageRequest extends js.Object {
    /**
      * A list of image ID references that correspond to images to delete. The format of the imageIds reference is imageTag=tag or imageDigest=digest.
      */
    var imageIds: ImageIdentifierList
    /**
      * The AWS account ID associated with the registry that contains the image to delete. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository that contains the image to delete.
      */
    var repositoryName: RepositoryName
  }
  
  trait BatchDeleteImageResponse extends js.Object {
    /**
      * Any failures associated with the call.
      */
    var failures: js.UndefOr[ImageFailureList] = js.undefined
    /**
      * The image IDs of the deleted images.
      */
    var imageIds: js.UndefOr[ImageIdentifierList] = js.undefined
  }
  
  trait BatchGetImageRequest extends js.Object {
    /**
      * The accepted media types for the request. Valid values: application/vnd.docker.distribution.manifest.v1+json | application/vnd.docker.distribution.manifest.v2+json | application/vnd.oci.image.manifest.v1+json 
      */
    var acceptedMediaTypes: js.UndefOr[MediaTypeList] = js.undefined
    /**
      * A list of image ID references that correspond to images to describe. The format of the imageIds reference is imageTag=tag or imageDigest=digest.
      */
    var imageIds: ImageIdentifierList
    /**
      * The AWS account ID associated with the registry that contains the images to describe. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository that contains the images to describe.
      */
    var repositoryName: RepositoryName
  }
  
  trait BatchGetImageResponse extends js.Object {
    /**
      * Any failures associated with the call.
      */
    var failures: js.UndefOr[ImageFailureList] = js.undefined
    /**
      * A list of image objects corresponding to the image references in the request.
      */
    var images: js.UndefOr[ImageList] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CompleteLayerUploadRequest extends js.Object {
    /**
      * The sha256 digest of the image layer.
      */
    var layerDigests: LayerDigestList
    /**
      * The AWS account ID associated with the registry to which to upload layers. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository to associate with the image layer.
      */
    var repositoryName: RepositoryName
    /**
      * The upload ID from a previous InitiateLayerUpload operation to associate with the image layer.
      */
    var uploadId: UploadId
  }
  
  trait CompleteLayerUploadResponse extends js.Object {
    /**
      * The sha256 digest of the image layer.
      */
    var layerDigest: js.UndefOr[LayerDigest] = js.undefined
    /**
      * The registry ID associated with the request.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository name associated with the request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
    /**
      * The upload ID associated with the layer.
      */
    var uploadId: js.UndefOr[UploadId] = js.undefined
  }
  
  trait CreateRepositoryRequest extends js.Object {
    /**
      * The name to use for the repository. The repository name may be specified on its own (such as nginx-web-app) or it can be prepended with a namespace to group the repository into a category (such as project-a/nginx-web-app).
      */
    var repositoryName: RepositoryName
    /**
      * 
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateRepositoryResponse extends js.Object {
    /**
      * The repository that was created.
      */
    var repository: js.UndefOr[Repository] = js.undefined
  }
  
  trait DeleteLifecyclePolicyRequest extends js.Object {
    /**
      * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository.
      */
    var repositoryName: RepositoryName
  }
  
  trait DeleteLifecyclePolicyResponse extends js.Object {
    /**
      * The time stamp of the last time that the lifecycle policy was run.
      */
    var lastEvaluatedAt: js.UndefOr[EvaluationTimestamp] = js.undefined
    /**
      * The JSON lifecycle policy text.
      */
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined
    /**
      * The registry ID associated with the request.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository name associated with the request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait DeleteRepositoryPolicyRequest extends js.Object {
    /**
      * The AWS account ID associated with the registry that contains the repository policy to delete. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository that is associated with the repository policy to delete.
      */
    var repositoryName: RepositoryName
  }
  
  trait DeleteRepositoryPolicyResponse extends js.Object {
    /**
      * The JSON repository policy that was deleted from the repository.
      */
    var policyText: js.UndefOr[RepositoryPolicyText] = js.undefined
    /**
      * The registry ID associated with the request.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository name associated with the request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait DeleteRepositoryRequest extends js.Object {
    /**
      *  If a repository contains images, forces the deletion.
      */
    var force: js.UndefOr[ForceFlag] = js.undefined
    /**
      * The AWS account ID associated with the registry that contains the repository to delete. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository to delete.
      */
    var repositoryName: RepositoryName
  }
  
  trait DeleteRepositoryResponse extends js.Object {
    /**
      * The repository that was deleted.
      */
    var repository: js.UndefOr[Repository] = js.undefined
  }
  
  trait DescribeImagesFilter extends js.Object {
    /**
      * The tag status with which to filter your DescribeImages results. You can filter results based on whether they are TAGGED or UNTAGGED.
      */
    var tagStatus: js.UndefOr[TagStatus] = js.undefined
  }
  
  trait DescribeImagesRequest extends js.Object {
    /**
      * The filter key and value with which to filter your DescribeImages results.
      */
    var filter: js.UndefOr[DescribeImagesFilter] = js.undefined
    /**
      * The list of image IDs for the requested repository.
      */
    var imageIds: js.UndefOr[ImageIdentifierList] = js.undefined
    /**
      * The maximum number of repository results returned by DescribeImages in paginated output. When this parameter is used, DescribeImages only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeImages request with the returned nextToken value. This value can be between 1 and 1000. If this parameter is not used, then DescribeImages returns up to 100 results and a nextToken value, if applicable. This option cannot be used when you specify images with imageIds.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The nextToken value returned from a previous paginated DescribeImages request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return. This option cannot be used when you specify images with imageIds.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The AWS account ID associated with the registry that contains the repository in which to describe images. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * A list of repositories to describe.
      */
    var repositoryName: RepositoryName
  }
  
  trait DescribeImagesResponse extends js.Object {
    /**
      * A list of ImageDetail objects that contain data about the image.
      */
    var imageDetails: js.UndefOr[ImageDetailList] = js.undefined
    /**
      * The nextToken value to include in a future DescribeImages request. When the results of a DescribeImages request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeRepositoriesRequest extends js.Object {
    /**
      * The maximum number of repository results returned by DescribeRepositories in paginated output. When this parameter is used, DescribeRepositories only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeRepositories request with the returned nextToken value. This value can be between 1 and 1000. If this parameter is not used, then DescribeRepositories returns up to 100 results and a nextToken value, if applicable. This option cannot be used when you specify repositories with repositoryNames.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The nextToken value returned from a previous paginated DescribeRepositories request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return. This option cannot be used when you specify repositories with repositoryNames.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The AWS account ID associated with the registry that contains the repositories to be described. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * A list of repositories to describe. If this parameter is omitted, then all repositories in a registry are described.
      */
    var repositoryNames: js.UndefOr[RepositoryNameList] = js.undefined
  }
  
  trait DescribeRepositoriesResponse extends js.Object {
    /**
      * The nextToken value to include in a future DescribeRepositories request. When the results of a DescribeRepositories request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of repository objects corresponding to valid repositories.
      */
    var repositories: js.UndefOr[RepositoryList] = js.undefined
  }
  
  trait GetAuthorizationTokenRequest extends js.Object {
    /**
      * A list of AWS account IDs that are associated with the registries for which to get authorization tokens. If you do not specify a registry, the default registry is assumed.
      */
    var registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList] = js.undefined
  }
  
  trait GetAuthorizationTokenResponse extends js.Object {
    /**
      * A list of authorization token data objects that correspond to the registryIds values in the request.
      */
    var authorizationData: js.UndefOr[AuthorizationDataList] = js.undefined
  }
  
  trait GetDownloadUrlForLayerRequest extends js.Object {
    /**
      * The digest of the image layer to download.
      */
    var layerDigest: LayerDigest
    /**
      * The AWS account ID associated with the registry that contains the image layer to download. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository that is associated with the image layer to download.
      */
    var repositoryName: RepositoryName
  }
  
  trait GetDownloadUrlForLayerResponse extends js.Object {
    /**
      * The pre-signed Amazon S3 download URL for the requested layer.
      */
    var downloadUrl: js.UndefOr[Url] = js.undefined
    /**
      * The digest of the image layer to download.
      */
    var layerDigest: js.UndefOr[LayerDigest] = js.undefined
  }
  
  trait GetLifecyclePolicyPreviewRequest extends js.Object {
    /**
      * An optional parameter that filters results based on image tag status and all tags, if tagged.
      */
    var filter: js.UndefOr[LifecyclePolicyPreviewFilter] = js.undefined
    /**
      * The list of imageIDs to be included.
      */
    var imageIds: js.UndefOr[ImageIdentifierList] = js.undefined
    /**
      * The maximum number of repository results returned by GetLifecyclePolicyPreviewRequest in&#x2028; paginated output. When this parameter is used, GetLifecyclePolicyPreviewRequest only returns&#x2028; maxResults results in a single page along with a nextToken&#x2028; response element. The remaining results of the initial request can be seen by sending&#x2028; another GetLifecyclePolicyPreviewRequest request with the returned nextToken&#x2028; value. This value can be between 1 and 1000. If this&#x2028; parameter is not used, then GetLifecyclePolicyPreviewRequest returns up to&#x2028; 100 results and a nextToken value, if&#x2028; applicable. This option cannot be used when you specify images with imageIds.
      */
    var maxResults: js.UndefOr[LifecyclePreviewMaxResults] = js.undefined
    /**
      * The nextToken value returned from a previous paginated&#x2028; GetLifecyclePolicyPreviewRequest request where maxResults was used and the&#x2028; results exceeded the value of that parameter. Pagination continues from the end of the&#x2028; previous results that returned the nextToken value. This value is&#x2028; null when there are no more results to return. This option cannot be used when you specify images with imageIds.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository.
      */
    var repositoryName: RepositoryName
  }
  
  trait GetLifecyclePolicyPreviewResponse extends js.Object {
    /**
      * The JSON lifecycle policy text.
      */
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined
    /**
      * The nextToken value to include in a future GetLifecyclePolicyPreview request. When the results of a GetLifecyclePolicyPreview request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The results of the lifecycle policy preview request.
      */
    var previewResults: js.UndefOr[LifecyclePolicyPreviewResultList] = js.undefined
    /**
      * The registry ID associated with the request.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository name associated with the request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
    /**
      * The status of the lifecycle policy preview request.
      */
    var status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined
    /**
      * The list of images that is returned as a result of the action.
      */
    var summary: js.UndefOr[LifecyclePolicyPreviewSummary] = js.undefined
  }
  
  trait GetLifecyclePolicyRequest extends js.Object {
    /**
      * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository.
      */
    var repositoryName: RepositoryName
  }
  
  trait GetLifecyclePolicyResponse extends js.Object {
    /**
      * The time stamp of the last time that the lifecycle policy was run.
      */
    var lastEvaluatedAt: js.UndefOr[EvaluationTimestamp] = js.undefined
    /**
      * The JSON lifecycle policy text.
      */
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined
    /**
      * The registry ID associated with the request.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository name associated with the request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait GetRepositoryPolicyRequest extends js.Object {
    /**
      * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository with the policy to retrieve.
      */
    var repositoryName: RepositoryName
  }
  
  trait GetRepositoryPolicyResponse extends js.Object {
    /**
      * The JSON repository policy text associated with the repository.
      */
    var policyText: js.UndefOr[RepositoryPolicyText] = js.undefined
    /**
      * The registry ID associated with the request.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository name associated with the request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait Image extends js.Object {
    /**
      * An object containing the image tag and image digest associated with an image.
      */
    var imageId: js.UndefOr[ImageIdentifier] = js.undefined
    /**
      * The image manifest associated with the image.
      */
    var imageManifest: js.UndefOr[ImageManifest] = js.undefined
    /**
      * The AWS account ID associated with the registry containing the image.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository associated with the image.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait ImageDetail extends js.Object {
    /**
      * The sha256 digest of the image manifest.
      */
    var imageDigest: js.UndefOr[ImageDigest] = js.undefined
    /**
      * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. 
      */
    var imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined
    /**
      * The size, in bytes, of the image in the repository.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
      */
    var imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.undefined
    /**
      * The list of tags associated with this image.
      */
    var imageTags: js.UndefOr[ImageTagList] = js.undefined
    /**
      * The AWS account ID associated with the registry to which this image belongs.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository to which this image belongs.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait ImageFailure extends js.Object {
    /**
      * The code associated with the failure.
      */
    var failureCode: js.UndefOr[ImageFailureCode] = js.undefined
    /**
      * The reason for the failure.
      */
    var failureReason: js.UndefOr[ImageFailureReason] = js.undefined
    /**
      * The image ID associated with the failure.
      */
    var imageId: js.UndefOr[ImageIdentifier] = js.undefined
  }
  
  trait ImageIdentifier extends js.Object {
    /**
      * The sha256 digest of the image manifest.
      */
    var imageDigest: js.UndefOr[ImageDigest] = js.undefined
    /**
      * The tag used for the image.
      */
    var imageTag: js.UndefOr[ImageTag] = js.undefined
  }
  
  trait InitiateLayerUploadRequest extends js.Object {
    /**
      * The AWS account ID associated with the registry to which you intend to upload layers. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository to which you intend to upload layers.
      */
    var repositoryName: RepositoryName
  }
  
  trait InitiateLayerUploadResponse extends js.Object {
    /**
      * The size, in bytes, that Amazon ECR expects future layer part uploads to be.
      */
    var partSize: js.UndefOr[PartSize] = js.undefined
    /**
      * The upload ID for the layer upload. This parameter is passed to further UploadLayerPart and CompleteLayerUpload operations.
      */
    var uploadId: js.UndefOr[UploadId] = js.undefined
  }
  
  trait Layer extends js.Object {
    /**
      * The availability status of the image layer.
      */
    var layerAvailability: js.UndefOr[LayerAvailability] = js.undefined
    /**
      * The sha256 digest of the image layer.
      */
    var layerDigest: js.UndefOr[LayerDigest] = js.undefined
    /**
      * The size, in bytes, of the image layer.
      */
    var layerSize: js.UndefOr[LayerSizeInBytes] = js.undefined
    /**
      * The media type of the layer, such as application/vnd.docker.image.rootfs.diff.tar.gzip or application/vnd.oci.image.layer.v1.tar+gzip.
      */
    var mediaType: js.UndefOr[MediaType] = js.undefined
  }
  
  trait LayerFailure extends js.Object {
    /**
      * The failure code associated with the failure.
      */
    var failureCode: js.UndefOr[LayerFailureCode] = js.undefined
    /**
      * The reason for the failure.
      */
    var failureReason: js.UndefOr[LayerFailureReason] = js.undefined
    /**
      * The layer digest associated with the failure.
      */
    var layerDigest: js.UndefOr[BatchedOperationLayerDigest] = js.undefined
  }
  
  trait LifecyclePolicyPreviewFilter extends js.Object {
    /**
      * The tag status of the image.
      */
    var tagStatus: js.UndefOr[TagStatus] = js.undefined
  }
  
  trait LifecyclePolicyPreviewResult extends js.Object {
    /**
      * The type of action to be taken.
      */
    var action: js.UndefOr[LifecyclePolicyRuleAction] = js.undefined
    /**
      * The priority of the applied rule.
      */
    var appliedRulePriority: js.UndefOr[LifecyclePolicyRulePriority] = js.undefined
    /**
      * The sha256 digest of the image manifest.
      */
    var imageDigest: js.UndefOr[ImageDigest] = js.undefined
    /**
      * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository.
      */
    var imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined
    /**
      * The list of tags associated with this image.
      */
    var imageTags: js.UndefOr[ImageTagList] = js.undefined
  }
  
  trait LifecyclePolicyPreviewSummary extends js.Object {
    /**
      * The number of expiring images.
      */
    var expiringImageTotalCount: js.UndefOr[ImageCount] = js.undefined
  }
  
  trait LifecyclePolicyRuleAction extends js.Object {
    /**
      * The type of action to be taken.
      */
    var `type`: js.UndefOr[ImageActionType] = js.undefined
  }
  
  trait ListImagesFilter extends js.Object {
    /**
      * The tag status with which to filter your ListImages results. You can filter results based on whether they are TAGGED or UNTAGGED.
      */
    var tagStatus: js.UndefOr[TagStatus] = js.undefined
  }
  
  trait ListImagesRequest extends js.Object {
    /**
      * The filter key and value with which to filter your ListImages results.
      */
    var filter: js.UndefOr[ListImagesFilter] = js.undefined
    /**
      * The maximum number of image results returned by ListImages in paginated output. When this parameter is used, ListImages only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListImages request with the returned nextToken value. This value can be between 1 and 1000. If this parameter is not used, then ListImages returns up to 100 results and a nextToken value, if applicable.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The nextToken value returned from a previous paginated ListImages request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The AWS account ID associated with the registry that contains the repository in which to list images. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository with image IDs to be listed.
      */
    var repositoryName: RepositoryName
  }
  
  trait ListImagesResponse extends js.Object {
    /**
      * The list of image IDs for the requested repository.
      */
    var imageIds: js.UndefOr[ImageIdentifierList] = js.undefined
    /**
      * The nextToken value to include in a future ListImages request. When the results of a ListImages request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that identifies the resource for which to list the tags. Currently, the only supported resource is an Amazon ECR repository.
      */
    var resourceArn: Arn
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
      * The tags for the resource.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait PutImageRequest extends js.Object {
    /**
      * The image manifest corresponding to the image to be uploaded.
      */
    var imageManifest: ImageManifest
    /**
      * The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or OCI formats.
      */
    var imageTag: js.UndefOr[ImageTag] = js.undefined
    /**
      * The AWS account ID associated with the registry that contains the repository in which to put the image. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository in which to put the image.
      */
    var repositoryName: RepositoryName
  }
  
  trait PutImageResponse extends js.Object {
    /**
      * Details of the image uploaded.
      */
    var image: js.UndefOr[Image] = js.undefined
  }
  
  trait PutLifecyclePolicyRequest extends js.Object {
    /**
      * The JSON repository policy text to apply to the repository.
      */
    var lifecyclePolicyText: LifecyclePolicyText
    /**
      * The AWS account ID associated with the registry that contains the repository. If you do&#x2028; not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository to receive the policy.
      */
    var repositoryName: RepositoryName
  }
  
  trait PutLifecyclePolicyResponse extends js.Object {
    /**
      * The JSON repository policy text.
      */
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined
    /**
      * The registry ID associated with the request.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository name associated with the request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait Repository extends js.Object {
    /**
      * The date and time, in JavaScript date format, when the repository was created.
      */
    var createdAt: js.UndefOr[CreationTimestamp] = js.undefined
    /**
      * The AWS account ID associated with the registry that contains the repository.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the arn:aws:ecr namespace, followed by the region of the repository, AWS account ID of the repository owner, repository namespace, and repository name. For example, arn:aws:ecr:region:012345678910:repository/test.
      */
    var repositoryArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of the repository.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
    /**
      * The URI for the repository. You can use this URI for Docker push or pull operations.
      */
    var repositoryUri: js.UndefOr[Url] = js.undefined
  }
  
  trait SetRepositoryPolicyRequest extends js.Object {
    /**
      * If the policy you are attempting to set on a repository policy would prevent you from setting another policy in the future, you must force the SetRepositoryPolicy operation. This is intended to prevent accidental repository lock outs.
      */
    var force: js.UndefOr[ForceFlag] = js.undefined
    /**
      * The JSON repository policy text to apply to the repository.
      */
    var policyText: RepositoryPolicyText
    /**
      * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository to receive the policy.
      */
    var repositoryName: RepositoryName
  }
  
  trait SetRepositoryPolicyResponse extends js.Object {
    /**
      * The JSON repository policy text applied to the repository.
      */
    var policyText: js.UndefOr[RepositoryPolicyText] = js.undefined
    /**
      * The registry ID associated with the request.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository name associated with the request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  }
  
  trait StartLifecyclePolicyPreviewRequest extends js.Object {
    /**
      * The policy to be evaluated against. If you do not specify a policy, the current policy for the repository is used.
      */
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined
    /**
      * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository to be evaluated.
      */
    var repositoryName: RepositoryName
  }
  
  trait StartLifecyclePolicyPreviewResponse extends js.Object {
    /**
      * The JSON repository policy text.
      */
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined
    /**
      * The registry ID associated with the request.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository name associated with the request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
    /**
      * The status of the lifecycle policy preview request.
      */
    var status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more specific tag values.
      */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
      * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key).
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the the resource to which to add tags. Currently, the only supported resource is an Amazon ECR repository.
      */
    var resourceArn: Arn
    /**
      * The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
      */
    var tags: TagList
  }
  
  trait TagResourceResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Check the availability of multiple image layers in a specified registry and repository.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
      */
    def batchCheckLayerAvailability(): awsDashSdkLib.libRequestMod.Request[BatchCheckLayerAvailabilityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchCheckLayerAvailability(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchCheckLayerAvailabilityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchCheckLayerAvailabilityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Check the availability of multiple image layers in a specified registry and repository.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
      */
    def batchCheckLayerAvailability(params: BatchCheckLayerAvailabilityRequest): awsDashSdkLib.libRequestMod.Request[BatchCheckLayerAvailabilityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchCheckLayerAvailability(
      params: BatchCheckLayerAvailabilityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchCheckLayerAvailabilityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchCheckLayerAvailabilityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a list of specified images within a specified repository. Images are specified with either imageTag or imageDigest. You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag from an image, the image is deleted from your repository. You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
      */
    def batchDeleteImage(): awsDashSdkLib.libRequestMod.Request[BatchDeleteImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDeleteImage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteImageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a list of specified images within a specified repository. Images are specified with either imageTag or imageDigest. You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag from an image, the image is deleted from your repository. You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
      */
    def batchDeleteImage(params: BatchDeleteImageRequest): awsDashSdkLib.libRequestMod.Request[BatchDeleteImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDeleteImage(
      params: BatchDeleteImageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteImageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets detailed information for specified images within a specified repository. Images are specified with either imageTag or imageDigest.
      */
    def batchGetImage(): awsDashSdkLib.libRequestMod.Request[BatchGetImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetImage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetImageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets detailed information for specified images within a specified repository. Images are specified with either imageTag or imageDigest.
      */
    def batchGetImage(params: BatchGetImageRequest): awsDashSdkLib.libRequestMod.Request[BatchGetImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetImage(
      params: BatchGetImageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetImageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and upload ID. You can optionally provide a sha256 digest of the image layer for data validation purposes.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
      */
    def completeLayerUpload(): awsDashSdkLib.libRequestMod.Request[CompleteLayerUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def completeLayerUpload(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CompleteLayerUploadResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CompleteLayerUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and upload ID. You can optionally provide a sha256 digest of the image layer for data validation purposes.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
      */
    def completeLayerUpload(params: CompleteLayerUploadRequest): awsDashSdkLib.libRequestMod.Request[CompleteLayerUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def completeLayerUpload(
      params: CompleteLayerUploadRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CompleteLayerUploadResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CompleteLayerUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an image repository.
      */
    def createRepository(): awsDashSdkLib.libRequestMod.Request[CreateRepositoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRepository(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRepositoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRepositoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an image repository.
      */
    def createRepository(params: CreateRepositoryRequest): awsDashSdkLib.libRequestMod.Request[CreateRepositoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRepository(
      params: CreateRepositoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRepositoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRepositoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified lifecycle policy.
      */
    def deleteLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLifecyclePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified lifecycle policy.
      */
    def deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLifecyclePolicy(
      params: DeleteLifecyclePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing image repository. If a repository contains images, you must use the force option to delete it.
      */
    def deleteRepository(): awsDashSdkLib.libRequestMod.Request[DeleteRepositoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRepository(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRepositoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRepositoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing image repository. If a repository contains images, you must use the force option to delete it.
      */
    def deleteRepository(params: DeleteRepositoryRequest): awsDashSdkLib.libRequestMod.Request[DeleteRepositoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRepository(
      params: DeleteRepositoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRepositoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRepositoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the repository policy from a specified repository.
      */
    def deleteRepositoryPolicy(): awsDashSdkLib.libRequestMod.Request[DeleteRepositoryPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRepositoryPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRepositoryPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRepositoryPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the repository policy from a specified repository.
      */
    def deleteRepositoryPolicy(params: DeleteRepositoryPolicyRequest): awsDashSdkLib.libRequestMod.Request[DeleteRepositoryPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRepositoryPolicy(
      params: DeleteRepositoryPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRepositoryPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRepositoryPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata about the images in a repository, including image size, image tags, and creation date.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
      */
    def describeImages(): awsDashSdkLib.libRequestMod.Request[DescribeImagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeImages(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeImagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeImagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata about the images in a repository, including image size, image tags, and creation date.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
      */
    def describeImages(params: DescribeImagesRequest): awsDashSdkLib.libRequestMod.Request[DescribeImagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeImages(
      params: DescribeImagesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeImagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeImagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes image repositories in a registry.
      */
    def describeRepositories(): awsDashSdkLib.libRequestMod.Request[DescribeRepositoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRepositories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRepositoriesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRepositoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes image repositories in a registry.
      */
    def describeRepositories(params: DescribeRepositoriesRequest): awsDashSdkLib.libRequestMod.Request[DescribeRepositoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRepositories(
      params: DescribeRepositoriesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRepositoriesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRepositoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a token that is valid for a specified registry for 12 hours. This command allows you to use the docker CLI to push and pull images with Amazon ECR. If you do not specify a registry, the default registry is assumed. The authorizationToken returned for each registry specified is a base64 encoded string that can be decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an aws ecr get-login command that simplifies the login process.
      */
    def getAuthorizationToken(): awsDashSdkLib.libRequestMod.Request[GetAuthorizationTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAuthorizationToken(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAuthorizationTokenResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAuthorizationTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a token that is valid for a specified registry for 12 hours. This command allows you to use the docker CLI to push and pull images with Amazon ECR. If you do not specify a registry, the default registry is assumed. The authorizationToken returned for each registry specified is a base64 encoded string that can be decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an aws ecr get-login command that simplifies the login process.
      */
    def getAuthorizationToken(params: GetAuthorizationTokenRequest): awsDashSdkLib.libRequestMod.Request[GetAuthorizationTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAuthorizationToken(
      params: GetAuthorizationTokenRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAuthorizationTokenResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAuthorizationTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image layers that are referenced in an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
      */
    def getDownloadUrlForLayer(): awsDashSdkLib.libRequestMod.Request[GetDownloadUrlForLayerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDownloadUrlForLayer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDownloadUrlForLayerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDownloadUrlForLayerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image layers that are referenced in an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
      */
    def getDownloadUrlForLayer(params: GetDownloadUrlForLayerRequest): awsDashSdkLib.libRequestMod.Request[GetDownloadUrlForLayerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDownloadUrlForLayer(
      params: GetDownloadUrlForLayerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDownloadUrlForLayerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDownloadUrlForLayerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the specified lifecycle policy.
      */
    def getLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLifecyclePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the specified lifecycle policy.
      */
    def getLifecyclePolicy(params: GetLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLifecyclePolicy(
      params: GetLifecyclePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the results of the specified lifecycle policy preview request.
      */
    def getLifecyclePolicyPreview(): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLifecyclePolicyPreview(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLifecyclePolicyPreviewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the results of the specified lifecycle policy preview request.
      */
    def getLifecyclePolicyPreview(params: GetLifecyclePolicyPreviewRequest): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLifecyclePolicyPreview(
      params: GetLifecyclePolicyPreviewRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLifecyclePolicyPreviewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the repository policy for a specified repository.
      */
    def getRepositoryPolicy(): awsDashSdkLib.libRequestMod.Request[GetRepositoryPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRepositoryPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRepositoryPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRepositoryPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the repository policy for a specified repository.
      */
    def getRepositoryPolicy(params: GetRepositoryPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetRepositoryPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRepositoryPolicy(
      params: GetRepositoryPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRepositoryPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRepositoryPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Notify Amazon ECR that you intend to upload an image layer.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
      */
    def initiateLayerUpload(): awsDashSdkLib.libRequestMod.Request[InitiateLayerUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def initiateLayerUpload(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InitiateLayerUploadResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InitiateLayerUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Notify Amazon ECR that you intend to upload an image layer.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
      */
    def initiateLayerUpload(params: InitiateLayerUploadRequest): awsDashSdkLib.libRequestMod.Request[InitiateLayerUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def initiateLayerUpload(
      params: InitiateLayerUploadRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InitiateLayerUploadResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InitiateLayerUploadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all the image IDs for a given repository. You can filter images based on whether or not they are tagged by setting the tagStatus parameter to TAGGED or UNTAGGED. For example, you can filter your results to return only UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or, you can filter your results to return only TAGGED images to list all of the tags in your repository.
      */
    def listImages(): awsDashSdkLib.libRequestMod.Request[ListImagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listImages(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListImagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListImagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all the image IDs for a given repository. You can filter images based on whether or not they are tagged by setting the tagStatus parameter to TAGGED or UNTAGGED. For example, you can filter your results to return only UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or, you can filter your results to return only TAGGED images to list all of the tags in your repository.
      */
    def listImages(params: ListImagesRequest): awsDashSdkLib.libRequestMod.Request[ListImagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listImages(
      params: ListImagesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListImagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListImagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the tags for an Amazon ECR resource.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the tags for an Amazon ECR resource.
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates the image manifest and tags associated with an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
      */
    def putImage(): awsDashSdkLib.libRequestMod.Request[PutImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putImage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutImageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates the image manifest and tags associated with an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
      */
    def putImage(params: PutImageRequest): awsDashSdkLib.libRequestMod.Request[PutImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putImage(
      params: PutImageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutImageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a lifecycle policy. For information about lifecycle policy syntax, see Lifecycle Policy Template.
      */
    def putLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[PutLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putLifecyclePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a lifecycle policy. For information about lifecycle policy syntax, see Lifecycle Policy Template.
      */
    def putLifecyclePolicy(params: PutLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[PutLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putLifecyclePolicy(
      params: PutLifecyclePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Applies a repository policy on a specified repository to control access permissions.
      */
    def setRepositoryPolicy(): awsDashSdkLib.libRequestMod.Request[SetRepositoryPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setRepositoryPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetRepositoryPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetRepositoryPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Applies a repository policy on a specified repository to control access permissions.
      */
    def setRepositoryPolicy(params: SetRepositoryPolicyRequest): awsDashSdkLib.libRequestMod.Request[SetRepositoryPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setRepositoryPolicy(
      params: SetRepositoryPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetRepositoryPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetRepositoryPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a preview of the specified lifecycle policy. This allows you to see the results before creating the lifecycle policy.
      */
    def startLifecyclePolicyPreview(): awsDashSdkLib.libRequestMod.Request[StartLifecyclePolicyPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startLifecyclePolicyPreview(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartLifecyclePolicyPreviewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartLifecyclePolicyPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a preview of the specified lifecycle policy. This allows you to see the results before creating the lifecycle policy.
      */
    def startLifecyclePolicyPreview(params: StartLifecyclePolicyPreviewRequest): awsDashSdkLib.libRequestMod.Request[StartLifecyclePolicyPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startLifecyclePolicyPreview(
      params: StartLifecyclePolicyPreviewRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartLifecyclePolicyPreviewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartLifecyclePolicyPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are not specified in the request parameters.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are not specified in the request parameters.
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes specified tags from a resource.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes specified tags from a resource.
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads an image layer part to Amazon ECR.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
      */
    def uploadLayerPart(): awsDashSdkLib.libRequestMod.Request[UploadLayerPartResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadLayerPart(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadLayerPartResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadLayerPartResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads an image layer part to Amazon ECR.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
      */
    def uploadLayerPart(params: UploadLayerPartRequest): awsDashSdkLib.libRequestMod.Request[UploadLayerPartResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadLayerPart(
      params: UploadLayerPartRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadLayerPartResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadLayerPartResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource from which to remove tags. Currently, the only supported resource is an Amazon ECR repository.
      */
    var resourceArn: Arn
    /**
      * The keys of the tags to be removed.
      */
    var tagKeys: TagKeyList
  }
  
  trait UntagResourceResponse extends js.Object
  
  trait UploadLayerPartRequest extends js.Object {
    /**
      * The base64-encoded layer part payload.
      */
    var layerPartBlob: LayerPartBlob
    /**
      * The integer value of the first byte of the layer part.
      */
    var partFirstByte: PartSize
    /**
      * The integer value of the last byte of the layer part.
      */
    var partLastByte: PartSize
    /**
      * The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The name of the repository to which you are uploading layer parts.
      */
    var repositoryName: RepositoryName
    /**
      * The upload ID from a previous InitiateLayerUpload operation to associate with the layer part upload.
      */
    var uploadId: UploadId
  }
  
  trait UploadLayerPartResponse extends js.Object {
    /**
      * The integer value of the last byte received in the request.
      */
    var lastByteReceived: js.UndefOr[PartSize] = js.undefined
    /**
      * The registry ID associated with the request.
      */
    var registryId: js.UndefOr[RegistryId] = js.undefined
    /**
      * The repository name associated with the request.
      */
    var repositoryName: js.UndefOr[RepositoryName] = js.undefined
    /**
      * The upload ID associated with the request.
      */
    var uploadId: js.UndefOr[UploadId] = js.undefined
  }
  
  trait _ImageFailureCode extends js.Object
  
  trait _LayerAvailability extends js.Object
  
  trait _LayerFailureCode extends js.Object
  
  trait _LifecyclePolicyPreviewStatus extends js.Object
  
  trait _TagStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
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
  type ImageFailureCode = _ImageFailureCode | java.lang.String
  type ImageFailureList = js.Array[ImageFailure]
  type ImageFailureReason = java.lang.String
  type ImageIdentifierList = js.Array[ImageIdentifier]
  type ImageList = js.Array[Image]
  type ImageManifest = java.lang.String
  type ImageSizeInBytes = scala.Double
  type ImageTag = java.lang.String
  type ImageTagList = js.Array[ImageTag]
  type LayerAvailability = _LayerAvailability | java.lang.String
  type LayerDigest = java.lang.String
  type LayerDigestList = js.Array[LayerDigest]
  type LayerFailureCode = _LayerFailureCode | java.lang.String
  type LayerFailureList = js.Array[LayerFailure]
  type LayerFailureReason = java.lang.String
  type LayerList = js.Array[Layer]
  type LayerPartBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsEcrMod.Blob | java.lang.String
  type LayerSizeInBytes = scala.Double
  type LifecyclePolicyPreviewResultList = js.Array[LifecyclePolicyPreviewResult]
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
  type TagStatus = _TagStatus | java.lang.String
  type TagValue = java.lang.String
  type UploadId = java.lang.String
  type Url = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

