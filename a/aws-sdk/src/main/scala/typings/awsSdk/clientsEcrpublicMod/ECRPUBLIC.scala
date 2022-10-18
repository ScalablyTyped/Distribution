package typings.awsSdk.clientsEcrpublicMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECRPUBLIC extends Service {
  
  /**
    * Checks the availability of one or more image layers within a repository in a public registry. When an image is pushed to a repository, each image layer is checked to verify if it has been uploaded before. If it has been uploaded, then the image layer is skipped.  This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def batchCheckLayerAvailability(): Request[BatchCheckLayerAvailabilityResponse, AWSError] = js.native
  def batchCheckLayerAvailability(callback: js.Function2[/* err */ AWSError, /* data */ BatchCheckLayerAvailabilityResponse, Unit]): Request[BatchCheckLayerAvailabilityResponse, AWSError] = js.native
  /**
    * Checks the availability of one or more image layers within a repository in a public registry. When an image is pushed to a repository, each image layer is checked to verify if it has been uploaded before. If it has been uploaded, then the image layer is skipped.  This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def batchCheckLayerAvailability(params: BatchCheckLayerAvailabilityRequest): Request[BatchCheckLayerAvailabilityResponse, AWSError] = js.native
  def batchCheckLayerAvailability(
    params: BatchCheckLayerAvailabilityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCheckLayerAvailabilityResponse, Unit]
  ): Request[BatchCheckLayerAvailabilityResponse, AWSError] = js.native
  
  /**
    * Deletes a list of specified images within a repository in a public registry. Images are specified with either an imageTag or imageDigest. You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag from an image, the image is deleted from your repository. You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
    */
  def batchDeleteImage(): Request[BatchDeleteImageResponse, AWSError] = js.native
  def batchDeleteImage(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteImageResponse, Unit]): Request[BatchDeleteImageResponse, AWSError] = js.native
  /**
    * Deletes a list of specified images within a repository in a public registry. Images are specified with either an imageTag or imageDigest. You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag from an image, the image is deleted from your repository. You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
    */
  def batchDeleteImage(params: BatchDeleteImageRequest): Request[BatchDeleteImageResponse, AWSError] = js.native
  def batchDeleteImage(
    params: BatchDeleteImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteImageResponse, Unit]
  ): Request[BatchDeleteImageResponse, AWSError] = js.native
  
  /**
    * Informs Amazon ECR that the image layer upload has completed for a specified public registry, repository name, and upload ID. You can optionally provide a sha256 digest of the image layer for data validation purposes. When an image is pushed, the CompleteLayerUpload API is called once per each new image layer to verify that the upload has completed.  This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def completeLayerUpload(): Request[CompleteLayerUploadResponse, AWSError] = js.native
  def completeLayerUpload(callback: js.Function2[/* err */ AWSError, /* data */ CompleteLayerUploadResponse, Unit]): Request[CompleteLayerUploadResponse, AWSError] = js.native
  /**
    * Informs Amazon ECR that the image layer upload has completed for a specified public registry, repository name, and upload ID. You can optionally provide a sha256 digest of the image layer for data validation purposes. When an image is pushed, the CompleteLayerUpload API is called once per each new image layer to verify that the upload has completed.  This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def completeLayerUpload(params: CompleteLayerUploadRequest): Request[CompleteLayerUploadResponse, AWSError] = js.native
  def completeLayerUpload(
    params: CompleteLayerUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CompleteLayerUploadResponse, Unit]
  ): Request[CompleteLayerUploadResponse, AWSError] = js.native
  
  @JSName("config")
  var config_ECRPUBLIC: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a repository in a public registry. For more information, see Amazon ECR repositories in the Amazon Elastic Container Registry User Guide.
    */
  def createRepository(): Request[CreateRepositoryResponse, AWSError] = js.native
  def createRepository(callback: js.Function2[/* err */ AWSError, /* data */ CreateRepositoryResponse, Unit]): Request[CreateRepositoryResponse, AWSError] = js.native
  /**
    * Creates a repository in a public registry. For more information, see Amazon ECR repositories in the Amazon Elastic Container Registry User Guide.
    */
  def createRepository(params: CreateRepositoryRequest): Request[CreateRepositoryResponse, AWSError] = js.native
  def createRepository(
    params: CreateRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRepositoryResponse, Unit]
  ): Request[CreateRepositoryResponse, AWSError] = js.native
  
  /**
    * Deletes a repository in a public registry. If the repository contains images, you must either delete all images in the repository or use the force option which deletes all images on your behalf before deleting the repository.
    */
  def deleteRepository(): Request[DeleteRepositoryResponse, AWSError] = js.native
  def deleteRepository(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryResponse, Unit]): Request[DeleteRepositoryResponse, AWSError] = js.native
  /**
    * Deletes a repository in a public registry. If the repository contains images, you must either delete all images in the repository or use the force option which deletes all images on your behalf before deleting the repository.
    */
  def deleteRepository(params: DeleteRepositoryRequest): Request[DeleteRepositoryResponse, AWSError] = js.native
  def deleteRepository(
    params: DeleteRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryResponse, Unit]
  ): Request[DeleteRepositoryResponse, AWSError] = js.native
  
  /**
    * Deletes the repository policy associated with the specified repository.
    */
  def deleteRepositoryPolicy(): Request[DeleteRepositoryPolicyResponse, AWSError] = js.native
  def deleteRepositoryPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryPolicyResponse, Unit]): Request[DeleteRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Deletes the repository policy associated with the specified repository.
    */
  def deleteRepositoryPolicy(params: DeleteRepositoryPolicyRequest): Request[DeleteRepositoryPolicyResponse, AWSError] = js.native
  def deleteRepositoryPolicy(
    params: DeleteRepositoryPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryPolicyResponse, Unit]
  ): Request[DeleteRepositoryPolicyResponse, AWSError] = js.native
  
  /**
    * Returns the image tag details for a repository in a public registry.
    */
  def describeImageTags(): Request[DescribeImageTagsResponse, AWSError] = js.native
  def describeImageTags(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageTagsResponse, Unit]): Request[DescribeImageTagsResponse, AWSError] = js.native
  /**
    * Returns the image tag details for a repository in a public registry.
    */
  def describeImageTags(params: DescribeImageTagsRequest): Request[DescribeImageTagsResponse, AWSError] = js.native
  def describeImageTags(
    params: DescribeImageTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageTagsResponse, Unit]
  ): Request[DescribeImageTagsResponse, AWSError] = js.native
  
  /**
    * Returns metadata about the images in a repository in a public registry.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
    */
  def describeImages(): Request[DescribeImagesResponse, AWSError] = js.native
  def describeImages(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResponse, Unit]): Request[DescribeImagesResponse, AWSError] = js.native
  /**
    * Returns metadata about the images in a repository in a public registry.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
    */
  def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResponse, AWSError] = js.native
  def describeImages(
    params: DescribeImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResponse, Unit]
  ): Request[DescribeImagesResponse, AWSError] = js.native
  
  /**
    * Returns details for a public registry.
    */
  def describeRegistries(): Request[DescribeRegistriesResponse, AWSError] = js.native
  def describeRegistries(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRegistriesResponse, Unit]): Request[DescribeRegistriesResponse, AWSError] = js.native
  /**
    * Returns details for a public registry.
    */
  def describeRegistries(params: DescribeRegistriesRequest): Request[DescribeRegistriesResponse, AWSError] = js.native
  def describeRegistries(
    params: DescribeRegistriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRegistriesResponse, Unit]
  ): Request[DescribeRegistriesResponse, AWSError] = js.native
  
  /**
    * Describes repositories in a public registry.
    */
  def describeRepositories(): Request[DescribeRepositoriesResponse, AWSError] = js.native
  def describeRepositories(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRepositoriesResponse, Unit]): Request[DescribeRepositoriesResponse, AWSError] = js.native
  /**
    * Describes repositories in a public registry.
    */
  def describeRepositories(params: DescribeRepositoriesRequest): Request[DescribeRepositoriesResponse, AWSError] = js.native
  def describeRepositories(
    params: DescribeRepositoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRepositoriesResponse, Unit]
  ): Request[DescribeRepositoriesResponse, AWSError] = js.native
  
  /**
    * Retrieves an authorization token. An authorization token represents your IAM authentication credentials and can be used to access any Amazon ECR registry that your IAM principal has access to. The authorization token is valid for 12 hours. This API requires the ecr-public:GetAuthorizationToken and sts:GetServiceBearerToken permissions.
    */
  def getAuthorizationToken(): Request[GetAuthorizationTokenResponse, AWSError] = js.native
  def getAuthorizationToken(callback: js.Function2[/* err */ AWSError, /* data */ GetAuthorizationTokenResponse, Unit]): Request[GetAuthorizationTokenResponse, AWSError] = js.native
  /**
    * Retrieves an authorization token. An authorization token represents your IAM authentication credentials and can be used to access any Amazon ECR registry that your IAM principal has access to. The authorization token is valid for 12 hours. This API requires the ecr-public:GetAuthorizationToken and sts:GetServiceBearerToken permissions.
    */
  def getAuthorizationToken(params: GetAuthorizationTokenRequest): Request[GetAuthorizationTokenResponse, AWSError] = js.native
  def getAuthorizationToken(
    params: GetAuthorizationTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAuthorizationTokenResponse, Unit]
  ): Request[GetAuthorizationTokenResponse, AWSError] = js.native
  
  /**
    * Retrieves catalog metadata for a public registry.
    */
  def getRegistryCatalogData(): Request[GetRegistryCatalogDataResponse, AWSError] = js.native
  def getRegistryCatalogData(callback: js.Function2[/* err */ AWSError, /* data */ GetRegistryCatalogDataResponse, Unit]): Request[GetRegistryCatalogDataResponse, AWSError] = js.native
  /**
    * Retrieves catalog metadata for a public registry.
    */
  def getRegistryCatalogData(params: GetRegistryCatalogDataRequest): Request[GetRegistryCatalogDataResponse, AWSError] = js.native
  def getRegistryCatalogData(
    params: GetRegistryCatalogDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRegistryCatalogDataResponse, Unit]
  ): Request[GetRegistryCatalogDataResponse, AWSError] = js.native
  
  /**
    * Retrieve catalog metadata for a repository in a public registry. This metadata is displayed publicly in the Amazon ECR Public Gallery.
    */
  def getRepositoryCatalogData(): Request[GetRepositoryCatalogDataResponse, AWSError] = js.native
  def getRepositoryCatalogData(callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryCatalogDataResponse, Unit]): Request[GetRepositoryCatalogDataResponse, AWSError] = js.native
  /**
    * Retrieve catalog metadata for a repository in a public registry. This metadata is displayed publicly in the Amazon ECR Public Gallery.
    */
  def getRepositoryCatalogData(params: GetRepositoryCatalogDataRequest): Request[GetRepositoryCatalogDataResponse, AWSError] = js.native
  def getRepositoryCatalogData(
    params: GetRepositoryCatalogDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryCatalogDataResponse, Unit]
  ): Request[GetRepositoryCatalogDataResponse, AWSError] = js.native
  
  /**
    * Retrieves the repository policy for the specified repository.
    */
  def getRepositoryPolicy(): Request[GetRepositoryPolicyResponse, AWSError] = js.native
  def getRepositoryPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryPolicyResponse, Unit]): Request[GetRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Retrieves the repository policy for the specified repository.
    */
  def getRepositoryPolicy(params: GetRepositoryPolicyRequest): Request[GetRepositoryPolicyResponse, AWSError] = js.native
  def getRepositoryPolicy(
    params: GetRepositoryPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryPolicyResponse, Unit]
  ): Request[GetRepositoryPolicyResponse, AWSError] = js.native
  
  /**
    * Notifies Amazon ECR that you intend to upload an image layer. When an image is pushed, the InitiateLayerUpload API is called once per image layer that has not already been uploaded. Whether or not an image layer has been uploaded is determined by the BatchCheckLayerAvailability API action.  This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def initiateLayerUpload(): Request[InitiateLayerUploadResponse, AWSError] = js.native
  def initiateLayerUpload(callback: js.Function2[/* err */ AWSError, /* data */ InitiateLayerUploadResponse, Unit]): Request[InitiateLayerUploadResponse, AWSError] = js.native
  /**
    * Notifies Amazon ECR that you intend to upload an image layer. When an image is pushed, the InitiateLayerUpload API is called once per image layer that has not already been uploaded. Whether or not an image layer has been uploaded is determined by the BatchCheckLayerAvailability API action.  This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def initiateLayerUpload(params: InitiateLayerUploadRequest): Request[InitiateLayerUploadResponse, AWSError] = js.native
  def initiateLayerUpload(
    params: InitiateLayerUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InitiateLayerUploadResponse, Unit]
  ): Request[InitiateLayerUploadResponse, AWSError] = js.native
  
  /**
    * List the tags for an Amazon ECR Public resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List the tags for an Amazon ECR Public resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Creates or updates the image manifest and tags associated with an image. When an image is pushed and all new image layers have been uploaded, the PutImage API is called once to create or update the image manifest and the tags associated with the image.  This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def putImage(): Request[PutImageResponse, AWSError] = js.native
  def putImage(callback: js.Function2[/* err */ AWSError, /* data */ PutImageResponse, Unit]): Request[PutImageResponse, AWSError] = js.native
  /**
    * Creates or updates the image manifest and tags associated with an image. When an image is pushed and all new image layers have been uploaded, the PutImage API is called once to create or update the image manifest and the tags associated with the image.  This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def putImage(params: PutImageRequest): Request[PutImageResponse, AWSError] = js.native
  def putImage(
    params: PutImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutImageResponse, Unit]
  ): Request[PutImageResponse, AWSError] = js.native
  
  /**
    * Create or updates the catalog data for a public registry.
    */
  def putRegistryCatalogData(): Request[PutRegistryCatalogDataResponse, AWSError] = js.native
  def putRegistryCatalogData(callback: js.Function2[/* err */ AWSError, /* data */ PutRegistryCatalogDataResponse, Unit]): Request[PutRegistryCatalogDataResponse, AWSError] = js.native
  /**
    * Create or updates the catalog data for a public registry.
    */
  def putRegistryCatalogData(params: PutRegistryCatalogDataRequest): Request[PutRegistryCatalogDataResponse, AWSError] = js.native
  def putRegistryCatalogData(
    params: PutRegistryCatalogDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRegistryCatalogDataResponse, Unit]
  ): Request[PutRegistryCatalogDataResponse, AWSError] = js.native
  
  /**
    * Creates or updates the catalog data for a repository in a public registry.
    */
  def putRepositoryCatalogData(): Request[PutRepositoryCatalogDataResponse, AWSError] = js.native
  def putRepositoryCatalogData(callback: js.Function2[/* err */ AWSError, /* data */ PutRepositoryCatalogDataResponse, Unit]): Request[PutRepositoryCatalogDataResponse, AWSError] = js.native
  /**
    * Creates or updates the catalog data for a repository in a public registry.
    */
  def putRepositoryCatalogData(params: PutRepositoryCatalogDataRequest): Request[PutRepositoryCatalogDataResponse, AWSError] = js.native
  def putRepositoryCatalogData(
    params: PutRepositoryCatalogDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRepositoryCatalogDataResponse, Unit]
  ): Request[PutRepositoryCatalogDataResponse, AWSError] = js.native
  
  /**
    * Applies a repository policy to the specified public repository to control access permissions. For more information, see Amazon ECR Repository Policies in the Amazon Elastic Container Registry User Guide.
    */
  def setRepositoryPolicy(): Request[SetRepositoryPolicyResponse, AWSError] = js.native
  def setRepositoryPolicy(callback: js.Function2[/* err */ AWSError, /* data */ SetRepositoryPolicyResponse, Unit]): Request[SetRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Applies a repository policy to the specified public repository to control access permissions. For more information, see Amazon ECR Repository Policies in the Amazon Elastic Container Registry User Guide.
    */
  def setRepositoryPolicy(params: SetRepositoryPolicyRequest): Request[SetRepositoryPolicyResponse, AWSError] = js.native
  def setRepositoryPolicy(
    params: SetRepositoryPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetRepositoryPolicyResponse, Unit]
  ): Request[SetRepositoryPolicyResponse, AWSError] = js.native
  
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Uploads an image layer part to Amazon ECR. When an image is pushed, each new image layer is uploaded in parts. The maximum size of each image layer part can be 20971520 bytes (or about 20MB). The UploadLayerPart API is called once per each new image layer part.  This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def uploadLayerPart(): Request[UploadLayerPartResponse, AWSError] = js.native
  def uploadLayerPart(callback: js.Function2[/* err */ AWSError, /* data */ UploadLayerPartResponse, Unit]): Request[UploadLayerPartResponse, AWSError] = js.native
  /**
    * Uploads an image layer part to Amazon ECR. When an image is pushed, each new image layer is uploaded in parts. The maximum size of each image layer part can be 20971520 bytes (or about 20MB). The UploadLayerPart API is called once per each new image layer part.  This operation is used by the Amazon ECR proxy and is not generally used by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def uploadLayerPart(params: UploadLayerPartRequest): Request[UploadLayerPartResponse, AWSError] = js.native
  def uploadLayerPart(
    params: UploadLayerPartRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UploadLayerPartResponse, Unit]
  ): Request[UploadLayerPartResponse, AWSError] = js.native
}
