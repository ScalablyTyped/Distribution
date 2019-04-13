package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECR
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ECR: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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

