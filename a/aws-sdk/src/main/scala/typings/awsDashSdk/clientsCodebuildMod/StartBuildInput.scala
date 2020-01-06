package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBuildInput extends js.Object {
  /**
    * Build output artifact settings that override, for this build only, the latest ones already defined in the build project.
    */
  var artifactsOverride: js.UndefOr[ProjectArtifacts] = js.native
  /**
    * A build spec declaration that overrides, for this build only, the latest one already defined in the build project.
    */
  var buildspecOverride: js.UndefOr[String] = js.native
  /**
    * A ProjectCache object specified for this build that overrides the one defined in the build project.
    */
  var cacheOverride: js.UndefOr[ProjectCache] = js.native
  /**
    * The name of a certificate for this build that overrides the one specified in the build project.
    */
  var certificateOverride: js.UndefOr[String] = js.native
  /**
    * The name of a compute type for this build that overrides the one specified in the build project.
    */
  var computeTypeOverride: js.UndefOr[ComputeType] = js.native
  /**
    * A container type for this build that overrides the one specified in the build project.
    */
  var environmentTypeOverride: js.UndefOr[EnvironmentType] = js.native
  /**
    * A set of environment variables that overrides, for this build only, the latest ones already defined in the build project.
    */
  var environmentVariablesOverride: js.UndefOr[EnvironmentVariables] = js.native
  /**
    * The user-defined depth of history, with a minimum value of 0, that overrides, for this build only, any previous depth of history defined in the build project.
    */
  var gitCloneDepthOverride: js.UndefOr[GitCloneDepth] = js.native
  /**
    *  Information about the Git submodules configuration for this build of an AWS CodeBuild build project. 
    */
  var gitSubmodulesConfigOverride: js.UndefOr[GitSubmodulesConfig] = js.native
  /**
    * A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuild request. The token is included in the StartBuild request and is valid for 12 hours. If you repeat the StartBuild request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error. 
    */
  var idempotencyToken: js.UndefOr[String] = js.native
  /**
    * The name of an image for this build that overrides the one specified in the build project.
    */
  var imageOverride: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:     CODEBUILD specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy to trust AWS CodeBuild's service principal.    SERVICE_ROLE specifies that AWS CodeBuild uses your build project's service role.     When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an AWS CodeBuild curated image, you must use CODEBUILD credentials. 
    */
  var imagePullCredentialsTypeOverride: js.UndefOr[ImagePullCredentialsType] = js.native
  /**
    * Enable this flag to override the insecure SSL setting that is specified in the build project. The insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This override applies only if the build's source is GitHub Enterprise.
    */
  var insecureSslOverride: js.UndefOr[WrapperBoolean] = js.native
  /**
    *  Log settings for this build that override the log settings defined in the build project. 
    */
  var logsConfigOverride: js.UndefOr[LogsConfig] = js.native
  /**
    * Enable this flag to override privileged mode in the build project.
    */
  var privilegedModeOverride: js.UndefOr[WrapperBoolean] = js.native
  /**
    * The name of the AWS CodeBuild build project to start running a build.
    */
  var projectName: NonEmptyString = js.native
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutesOverride: js.UndefOr[TimeOut] = js.native
  /**
    *  The credentials for access to a private registry. 
    */
  var registryCredentialOverride: js.UndefOr[RegistryCredential] = js.native
  /**
    *  Set to true to report to your source provider the status of a build's start and completion. If you use this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is thrown.    The status of a build triggered by a webhook is always reported to your source provider.  
    */
  var reportBuildStatusOverride: js.UndefOr[WrapperBoolean] = js.native
  /**
    *  An array of ProjectArtifacts objects. 
    */
  var secondaryArtifactsOverride: js.UndefOr[ProjectArtifactsList] = js.native
  /**
    *  An array of ProjectSource objects. 
    */
  var secondarySourcesOverride: js.UndefOr[ProjectSources] = js.native
  /**
    *  An array of ProjectSourceVersion objects that specify one or more versions of the project's secondary sources to be used for this build only. 
    */
  var secondarySourcesVersionOverride: js.UndefOr[ProjectSecondarySourceVersions] = js.native
  /**
    * The name of a service role for this build that overrides the one specified in the build project.
    */
  var serviceRoleOverride: js.UndefOr[NonEmptyString] = js.native
  /**
    * An authorization type for this build that overrides the one defined in the build project. This override applies only if the build project's source is BitBucket or GitHub.
    */
  var sourceAuthOverride: js.UndefOr[SourceAuth] = js.native
  /**
    * A location that overrides, for this build, the source location for the one defined in the build project.
    */
  var sourceLocationOverride: js.UndefOr[String] = js.native
  /**
    * A source input type, for this build, that overrides the source input defined in the build project.
    */
  var sourceTypeOverride: js.UndefOr[SourceType] = js.native
  /**
    * A version of the build input to be built, for this build only. If not specified, the latest version is used. If specified, must be one of:   For AWS CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.    If sourceVersion is specified at the project level, then this sourceVersion (at the build level) takes precedence.   For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.native
  /**
    * The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the latest setting already defined in the build project.
    */
  var timeoutInMinutesOverride: js.UndefOr[TimeOut] = js.native
}

object StartBuildInput {
  @scala.inline
  def apply(
    projectName: NonEmptyString,
    artifactsOverride: ProjectArtifacts = null,
    buildspecOverride: String = null,
    cacheOverride: ProjectCache = null,
    certificateOverride: String = null,
    computeTypeOverride: ComputeType = null,
    environmentTypeOverride: EnvironmentType = null,
    environmentVariablesOverride: EnvironmentVariables = null,
    gitCloneDepthOverride: Int | Double = null,
    gitSubmodulesConfigOverride: GitSubmodulesConfig = null,
    idempotencyToken: String = null,
    imageOverride: NonEmptyString = null,
    imagePullCredentialsTypeOverride: ImagePullCredentialsType = null,
    insecureSslOverride: js.UndefOr[scala.Boolean] = js.undefined,
    logsConfigOverride: LogsConfig = null,
    privilegedModeOverride: js.UndefOr[scala.Boolean] = js.undefined,
    queuedTimeoutInMinutesOverride: Int | Double = null,
    registryCredentialOverride: RegistryCredential = null,
    reportBuildStatusOverride: js.UndefOr[scala.Boolean] = js.undefined,
    secondaryArtifactsOverride: ProjectArtifactsList = null,
    secondarySourcesOverride: ProjectSources = null,
    secondarySourcesVersionOverride: ProjectSecondarySourceVersions = null,
    serviceRoleOverride: NonEmptyString = null,
    sourceAuthOverride: SourceAuth = null,
    sourceLocationOverride: String = null,
    sourceTypeOverride: SourceType = null,
    sourceVersion: String = null,
    timeoutInMinutesOverride: Int | Double = null
  ): StartBuildInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    if (artifactsOverride != null) __obj.updateDynamic("artifactsOverride")(artifactsOverride.asInstanceOf[js.Any])
    if (buildspecOverride != null) __obj.updateDynamic("buildspecOverride")(buildspecOverride.asInstanceOf[js.Any])
    if (cacheOverride != null) __obj.updateDynamic("cacheOverride")(cacheOverride.asInstanceOf[js.Any])
    if (certificateOverride != null) __obj.updateDynamic("certificateOverride")(certificateOverride.asInstanceOf[js.Any])
    if (computeTypeOverride != null) __obj.updateDynamic("computeTypeOverride")(computeTypeOverride.asInstanceOf[js.Any])
    if (environmentTypeOverride != null) __obj.updateDynamic("environmentTypeOverride")(environmentTypeOverride.asInstanceOf[js.Any])
    if (environmentVariablesOverride != null) __obj.updateDynamic("environmentVariablesOverride")(environmentVariablesOverride.asInstanceOf[js.Any])
    if (gitCloneDepthOverride != null) __obj.updateDynamic("gitCloneDepthOverride")(gitCloneDepthOverride.asInstanceOf[js.Any])
    if (gitSubmodulesConfigOverride != null) __obj.updateDynamic("gitSubmodulesConfigOverride")(gitSubmodulesConfigOverride.asInstanceOf[js.Any])
    if (idempotencyToken != null) __obj.updateDynamic("idempotencyToken")(idempotencyToken.asInstanceOf[js.Any])
    if (imageOverride != null) __obj.updateDynamic("imageOverride")(imageOverride.asInstanceOf[js.Any])
    if (imagePullCredentialsTypeOverride != null) __obj.updateDynamic("imagePullCredentialsTypeOverride")(imagePullCredentialsTypeOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureSslOverride)) __obj.updateDynamic("insecureSslOverride")(insecureSslOverride.asInstanceOf[js.Any])
    if (logsConfigOverride != null) __obj.updateDynamic("logsConfigOverride")(logsConfigOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(privilegedModeOverride)) __obj.updateDynamic("privilegedModeOverride")(privilegedModeOverride.asInstanceOf[js.Any])
    if (queuedTimeoutInMinutesOverride != null) __obj.updateDynamic("queuedTimeoutInMinutesOverride")(queuedTimeoutInMinutesOverride.asInstanceOf[js.Any])
    if (registryCredentialOverride != null) __obj.updateDynamic("registryCredentialOverride")(registryCredentialOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(reportBuildStatusOverride)) __obj.updateDynamic("reportBuildStatusOverride")(reportBuildStatusOverride.asInstanceOf[js.Any])
    if (secondaryArtifactsOverride != null) __obj.updateDynamic("secondaryArtifactsOverride")(secondaryArtifactsOverride.asInstanceOf[js.Any])
    if (secondarySourcesOverride != null) __obj.updateDynamic("secondarySourcesOverride")(secondarySourcesOverride.asInstanceOf[js.Any])
    if (secondarySourcesVersionOverride != null) __obj.updateDynamic("secondarySourcesVersionOverride")(secondarySourcesVersionOverride.asInstanceOf[js.Any])
    if (serviceRoleOverride != null) __obj.updateDynamic("serviceRoleOverride")(serviceRoleOverride.asInstanceOf[js.Any])
    if (sourceAuthOverride != null) __obj.updateDynamic("sourceAuthOverride")(sourceAuthOverride.asInstanceOf[js.Any])
    if (sourceLocationOverride != null) __obj.updateDynamic("sourceLocationOverride")(sourceLocationOverride.asInstanceOf[js.Any])
    if (sourceTypeOverride != null) __obj.updateDynamic("sourceTypeOverride")(sourceTypeOverride.asInstanceOf[js.Any])
    if (sourceVersion != null) __obj.updateDynamic("sourceVersion")(sourceVersion.asInstanceOf[js.Any])
    if (timeoutInMinutesOverride != null) __obj.updateDynamic("timeoutInMinutesOverride")(timeoutInMinutesOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBuildInput]
  }
}

