package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECR
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ECR: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsEcrMod.ECRNs.ClientConfiguration = js.native
  /**
     * Check the availability of multiple image layers in a specified registry and repository.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def batchCheckLayerAvailability(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.BatchCheckLayerAvailabilityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Check the availability of multiple image layers in a specified registry and repository.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def batchCheckLayerAvailability(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.BatchCheckLayerAvailabilityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.BatchCheckLayerAvailabilityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Check the availability of multiple image layers in a specified registry and repository.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def batchCheckLayerAvailability(params: awsDashSdkLib.clientsEcrMod.ECRNs.BatchCheckLayerAvailabilityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.BatchCheckLayerAvailabilityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Check the availability of multiple image layers in a specified registry and repository.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def batchCheckLayerAvailability(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.BatchCheckLayerAvailabilityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.BatchCheckLayerAvailabilityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.BatchCheckLayerAvailabilityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a list of specified images within a specified repository. Images are specified with either imageTag or imageDigest. You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag from an image, the image is deleted from your repository. You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
     */
  def batchDeleteImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.BatchDeleteImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a list of specified images within a specified repository. Images are specified with either imageTag or imageDigest. You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag from an image, the image is deleted from your repository. You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
     */
  def batchDeleteImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.BatchDeleteImageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.BatchDeleteImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a list of specified images within a specified repository. Images are specified with either imageTag or imageDigest. You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag from an image, the image is deleted from your repository. You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
     */
  def batchDeleteImage(params: awsDashSdkLib.clientsEcrMod.ECRNs.BatchDeleteImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.BatchDeleteImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a list of specified images within a specified repository. Images are specified with either imageTag or imageDigest. You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag from an image, the image is deleted from your repository. You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
     */
  def batchDeleteImage(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.BatchDeleteImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.BatchDeleteImageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.BatchDeleteImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets detailed information for specified images within a specified repository. Images are specified with either imageTag or imageDigest.
     */
  def batchGetImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.BatchGetImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets detailed information for specified images within a specified repository. Images are specified with either imageTag or imageDigest.
     */
  def batchGetImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.BatchGetImageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.BatchGetImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets detailed information for specified images within a specified repository. Images are specified with either imageTag or imageDigest.
     */
  def batchGetImage(params: awsDashSdkLib.clientsEcrMod.ECRNs.BatchGetImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.BatchGetImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets detailed information for specified images within a specified repository. Images are specified with either imageTag or imageDigest.
     */
  def batchGetImage(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.BatchGetImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.BatchGetImageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.BatchGetImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and upload ID. You can optionally provide a sha256 digest of the image layer for data validation purposes.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def completeLayerUpload(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.CompleteLayerUploadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and upload ID. You can optionally provide a sha256 digest of the image layer for data validation purposes.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def completeLayerUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.CompleteLayerUploadResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.CompleteLayerUploadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and upload ID. You can optionally provide a sha256 digest of the image layer for data validation purposes.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def completeLayerUpload(params: awsDashSdkLib.clientsEcrMod.ECRNs.CompleteLayerUploadRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.CompleteLayerUploadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and upload ID. You can optionally provide a sha256 digest of the image layer for data validation purposes.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def completeLayerUpload(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.CompleteLayerUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.CompleteLayerUploadResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.CompleteLayerUploadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an image repository.
     */
  def createRepository(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.CreateRepositoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an image repository.
     */
  def createRepository(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.CreateRepositoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.CreateRepositoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an image repository.
     */
  def createRepository(params: awsDashSdkLib.clientsEcrMod.ECRNs.CreateRepositoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.CreateRepositoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an image repository.
     */
  def createRepository(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.CreateRepositoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.CreateRepositoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.CreateRepositoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified lifecycle policy.
     */
  def deleteLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DeleteLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified lifecycle policy.
     */
  def deleteLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.DeleteLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DeleteLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified lifecycle policy.
     */
  def deleteLifecyclePolicy(params: awsDashSdkLib.clientsEcrMod.ECRNs.DeleteLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DeleteLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified lifecycle policy.
     */
  def deleteLifecyclePolicy(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.DeleteLifecyclePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.DeleteLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DeleteLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing image repository. If a repository contains images, you must use the force option to delete it.
     */
  def deleteRepository(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing image repository. If a repository contains images, you must use the force option to delete it.
     */
  def deleteRepository(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing image repository. If a repository contains images, you must use the force option to delete it.
     */
  def deleteRepository(params: awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an existing image repository. If a repository contains images, you must use the force option to delete it.
     */
  def deleteRepository(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the repository policy from a specified repository.
     */
  def deleteRepositoryPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the repository policy from a specified repository.
     */
  def deleteRepositoryPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the repository policy from a specified repository.
     */
  def deleteRepositoryPolicy(params: awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the repository policy from a specified repository.
     */
  def deleteRepositoryPolicy(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DeleteRepositoryPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns metadata about the images in a repository, including image size, image tags, and creation date.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
     */
  def describeImages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DescribeImagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns metadata about the images in a repository, including image size, image tags, and creation date.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
     */
  def describeImages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.DescribeImagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DescribeImagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns metadata about the images in a repository, including image size, image tags, and creation date.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
     */
  def describeImages(params: awsDashSdkLib.clientsEcrMod.ECRNs.DescribeImagesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DescribeImagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns metadata about the images in a repository, including image size, image tags, and creation date.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
     */
  def describeImages(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.DescribeImagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.DescribeImagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DescribeImagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes image repositories in a registry.
     */
  def describeRepositories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DescribeRepositoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes image repositories in a registry.
     */
  def describeRepositories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.DescribeRepositoriesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DescribeRepositoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes image repositories in a registry.
     */
  def describeRepositories(params: awsDashSdkLib.clientsEcrMod.ECRNs.DescribeRepositoriesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DescribeRepositoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes image repositories in a registry.
     */
  def describeRepositories(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.DescribeRepositoriesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.DescribeRepositoriesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.DescribeRepositoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a token that is valid for a specified registry for 12 hours. This command allows you to use the docker CLI to push and pull images with Amazon ECR. If you do not specify a registry, the default registry is assumed. The authorizationToken returned for each registry specified is a base64 encoded string that can be decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an aws ecr get-login command that simplifies the login process.
     */
  def getAuthorizationToken(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetAuthorizationTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a token that is valid for a specified registry for 12 hours. This command allows you to use the docker CLI to push and pull images with Amazon ECR. If you do not specify a registry, the default registry is assumed. The authorizationToken returned for each registry specified is a base64 encoded string that can be decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an aws ecr get-login command that simplifies the login process.
     */
  def getAuthorizationToken(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.GetAuthorizationTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetAuthorizationTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a token that is valid for a specified registry for 12 hours. This command allows you to use the docker CLI to push and pull images with Amazon ECR. If you do not specify a registry, the default registry is assumed. The authorizationToken returned for each registry specified is a base64 encoded string that can be decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an aws ecr get-login command that simplifies the login process.
     */
  def getAuthorizationToken(params: awsDashSdkLib.clientsEcrMod.ECRNs.GetAuthorizationTokenRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetAuthorizationTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a token that is valid for a specified registry for 12 hours. This command allows you to use the docker CLI to push and pull images with Amazon ECR. If you do not specify a registry, the default registry is assumed. The authorizationToken returned for each registry specified is a base64 encoded string that can be decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an aws ecr get-login command that simplifies the login process.
     */
  def getAuthorizationToken(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.GetAuthorizationTokenRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.GetAuthorizationTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetAuthorizationTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image layers that are referenced in an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def getDownloadUrlForLayer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetDownloadUrlForLayerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image layers that are referenced in an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def getDownloadUrlForLayer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.GetDownloadUrlForLayerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetDownloadUrlForLayerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image layers that are referenced in an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def getDownloadUrlForLayer(params: awsDashSdkLib.clientsEcrMod.ECRNs.GetDownloadUrlForLayerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetDownloadUrlForLayerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image layers that are referenced in an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def getDownloadUrlForLayer(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.GetDownloadUrlForLayerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.GetDownloadUrlForLayerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetDownloadUrlForLayerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified lifecycle policy.
     */
  def getLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified lifecycle policy.
     */
  def getLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified lifecycle policy.
     */
  def getLifecyclePolicy(params: awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified lifecycle policy.
     */
  def getLifecyclePolicy(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the results of the specified lifecycle policy preview request.
     */
  def getLifecyclePolicyPreview(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyPreviewResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the results of the specified lifecycle policy preview request.
     */
  def getLifecyclePolicyPreview(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyPreviewResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyPreviewResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the results of the specified lifecycle policy preview request.
     */
  def getLifecyclePolicyPreview(params: awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyPreviewRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyPreviewResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the results of the specified lifecycle policy preview request.
     */
  def getLifecyclePolicyPreview(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyPreviewRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyPreviewResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetLifecyclePolicyPreviewResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the repository policy for a specified repository.
     */
  def getRepositoryPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetRepositoryPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the repository policy for a specified repository.
     */
  def getRepositoryPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.GetRepositoryPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetRepositoryPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the repository policy for a specified repository.
     */
  def getRepositoryPolicy(params: awsDashSdkLib.clientsEcrMod.ECRNs.GetRepositoryPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetRepositoryPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the repository policy for a specified repository.
     */
  def getRepositoryPolicy(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.GetRepositoryPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.GetRepositoryPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.GetRepositoryPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Notify Amazon ECR that you intend to upload an image layer.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def initiateLayerUpload(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.InitiateLayerUploadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Notify Amazon ECR that you intend to upload an image layer.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def initiateLayerUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.InitiateLayerUploadResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.InitiateLayerUploadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Notify Amazon ECR that you intend to upload an image layer.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def initiateLayerUpload(params: awsDashSdkLib.clientsEcrMod.ECRNs.InitiateLayerUploadRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.InitiateLayerUploadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Notify Amazon ECR that you intend to upload an image layer.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def initiateLayerUpload(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.InitiateLayerUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.InitiateLayerUploadResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.InitiateLayerUploadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the image IDs for a given repository. You can filter images based on whether or not they are tagged by setting the tagStatus parameter to TAGGED or UNTAGGED. For example, you can filter your results to return only UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or, you can filter your results to return only TAGGED images to list all of the tags in your repository.
     */
  def listImages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.ListImagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the image IDs for a given repository. You can filter images based on whether or not they are tagged by setting the tagStatus parameter to TAGGED or UNTAGGED. For example, you can filter your results to return only UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or, you can filter your results to return only TAGGED images to list all of the tags in your repository.
     */
  def listImages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.ListImagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.ListImagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the image IDs for a given repository. You can filter images based on whether or not they are tagged by setting the tagStatus parameter to TAGGED or UNTAGGED. For example, you can filter your results to return only UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or, you can filter your results to return only TAGGED images to list all of the tags in your repository.
     */
  def listImages(params: awsDashSdkLib.clientsEcrMod.ECRNs.ListImagesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.ListImagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the image IDs for a given repository. You can filter images based on whether or not they are tagged by setting the tagStatus parameter to TAGGED or UNTAGGED. For example, you can filter your results to return only UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or, you can filter your results to return only TAGGED images to list all of the tags in your repository.
     */
  def listImages(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.ListImagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.ListImagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.ListImagesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the tags for an Amazon ECR resource.
     */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the tags for an Amazon ECR resource.
     */
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the tags for an Amazon ECR resource.
     */
  def listTagsForResource(params: awsDashSdkLib.clientsEcrMod.ECRNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the tags for an Amazon ECR resource.
     */
  def listTagsForResource(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates the image manifest and tags associated with an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def putImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.PutImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates the image manifest and tags associated with an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def putImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.PutImageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.PutImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates the image manifest and tags associated with an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def putImage(params: awsDashSdkLib.clientsEcrMod.ECRNs.PutImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.PutImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates the image manifest and tags associated with an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def putImage(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.PutImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.PutImageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.PutImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a lifecycle policy. For information about lifecycle policy syntax, see Lifecycle Policy Template.
     */
  def putLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.PutLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a lifecycle policy. For information about lifecycle policy syntax, see Lifecycle Policy Template.
     */
  def putLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.PutLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.PutLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a lifecycle policy. For information about lifecycle policy syntax, see Lifecycle Policy Template.
     */
  def putLifecyclePolicy(params: awsDashSdkLib.clientsEcrMod.ECRNs.PutLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.PutLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a lifecycle policy. For information about lifecycle policy syntax, see Lifecycle Policy Template.
     */
  def putLifecyclePolicy(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.PutLifecyclePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.PutLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.PutLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Applies a repository policy on a specified repository to control access permissions.
     */
  def setRepositoryPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.SetRepositoryPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Applies a repository policy on a specified repository to control access permissions.
     */
  def setRepositoryPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.SetRepositoryPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.SetRepositoryPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Applies a repository policy on a specified repository to control access permissions.
     */
  def setRepositoryPolicy(params: awsDashSdkLib.clientsEcrMod.ECRNs.SetRepositoryPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.SetRepositoryPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Applies a repository policy on a specified repository to control access permissions.
     */
  def setRepositoryPolicy(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.SetRepositoryPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.SetRepositoryPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.SetRepositoryPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a preview of the specified lifecycle policy. This allows you to see the results before creating the lifecycle policy.
     */
  def startLifecyclePolicyPreview(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.StartLifecyclePolicyPreviewResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a preview of the specified lifecycle policy. This allows you to see the results before creating the lifecycle policy.
     */
  def startLifecyclePolicyPreview(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.StartLifecyclePolicyPreviewResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.StartLifecyclePolicyPreviewResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a preview of the specified lifecycle policy. This allows you to see the results before creating the lifecycle policy.
     */
  def startLifecyclePolicyPreview(params: awsDashSdkLib.clientsEcrMod.ECRNs.StartLifecyclePolicyPreviewRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.StartLifecyclePolicyPreviewResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a preview of the specified lifecycle policy. This allows you to see the results before creating the lifecycle policy.
     */
  def startLifecyclePolicyPreview(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.StartLifecyclePolicyPreviewRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.StartLifecyclePolicyPreviewResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.StartLifecyclePolicyPreviewResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are not specified in the request parameters.
     */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are not specified in the request parameters.
     */
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are not specified in the request parameters.
     */
  def tagResource(params: awsDashSdkLib.clientsEcrMod.ECRNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are not specified in the request parameters.
     */
  def tagResource(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes specified tags from a resource.
     */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes specified tags from a resource.
     */
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes specified tags from a resource.
     */
  def untagResource(params: awsDashSdkLib.clientsEcrMod.ECRNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes specified tags from a resource.
     */
  def untagResource(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an image layer part to Amazon ECR.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def uploadLayerPart(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.UploadLayerPartResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an image layer part to Amazon ECR.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def uploadLayerPart(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.UploadLayerPartResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.UploadLayerPartResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an image layer part to Amazon ECR.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def uploadLayerPart(params: awsDashSdkLib.clientsEcrMod.ECRNs.UploadLayerPartRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.UploadLayerPartResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an image layer part to Amazon ECR.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
     */
  def uploadLayerPart(
    params: awsDashSdkLib.clientsEcrMod.ECRNs.UploadLayerPartRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcrMod.ECRNs.UploadLayerPartResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcrMod.ECRNs.UploadLayerPartResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

