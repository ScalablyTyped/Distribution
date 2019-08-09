package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectEnvironment extends js.Object {
  /**
    * The certificate to use with this build project.
    */
  var certificate: js.UndefOr[String] = js.undefined
  /**
    * Information about the compute resources the build project uses. Available values include:    BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds.    BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds.    BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds.  
    */
  var computeType: ComputeType
  /**
    * A set of environment variables to make available to builds for this build project.
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
  /**
    * The image tag or image digest that identifies the Docker image to use for this build project. Use the following formats:   For an image tag: registry/repository:tag. For example, to specify an image with the tag "latest," use registry/repository:latest.   For an image digest: registry/repository@digest. For example, to specify an image with the digest "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf.  
    */
  var image: NonEmptyString
  /**
    *  The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:     CODEBUILD specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy to trust AWS CodeBuild's service principal.     SERVICE_ROLE specifies that AWS CodeBuild uses your build project's service role.     When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CODEBUILD credentials. 
    */
  var imagePullCredentialsType: js.UndefOr[ImagePullCredentialsType] = js.undefined
  /**
    * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is used to build Docker images. Otherwise, a build that attempts to interact with the Docker daemon fails. You can initialize the Docker daemon during the install phase of your build by adding one of the following sets of commands to the install phase of your buildspec file: If the operating system's base image is Ubuntu Linux:  - nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;   - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"  If the operating system's base image is Alpine Linux and the previous command does not work, add the -t argument to timeout:  - nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;   - timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done" 
    */
  var privilegedMode: js.UndefOr[WrapperBoolean] = js.undefined
  /**
    *  The credentials for access to a private registry.
    */
  var registryCredential: js.UndefOr[RegistryCredential] = js.undefined
  /**
    * The type of build environment to use for related builds.
    */
  var `type`: EnvironmentType
}

object ProjectEnvironment {
  @scala.inline
  def apply(
    computeType: ComputeType,
    image: NonEmptyString,
    `type`: EnvironmentType,
    certificate: String = null,
    environmentVariables: EnvironmentVariables = null,
    imagePullCredentialsType: ImagePullCredentialsType = null,
    privilegedMode: js.UndefOr[WrapperBoolean] = js.undefined,
    registryCredential: RegistryCredential = null
  ): ProjectEnvironment = {
    val __obj = js.Dynamic.literal(computeType = computeType.asInstanceOf[js.Any], image = image)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate)
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables)
    if (imagePullCredentialsType != null) __obj.updateDynamic("imagePullCredentialsType")(imagePullCredentialsType.asInstanceOf[js.Any])
    if (!js.isUndefined(privilegedMode)) __obj.updateDynamic("privilegedMode")(privilegedMode)
    if (registryCredential != null) __obj.updateDynamic("registryCredential")(registryCredential)
    __obj.asInstanceOf[ProjectEnvironment]
  }
}

