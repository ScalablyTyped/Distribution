package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartBuildInput extends js.Object {
  /**
    * Build output artifact settings that override, for this build only, the latest ones already defined in the build project.
    */
  var artifactsOverride: js.UndefOr[ProjectArtifacts] = js.undefined
  /**
    * A build spec declaration that overrides, for this build only, the latest one already defined in the build project.
    */
  var buildspecOverride: js.UndefOr[String] = js.undefined
  /**
    * A ProjectCache object specified for this build that overrides the one defined in the build project.
    */
  var cacheOverride: js.UndefOr[ProjectCache] = js.undefined
  /**
    * The name of a certificate for this build that overrides the one specified in the build project.
    */
  var certificateOverride: js.UndefOr[String] = js.undefined
  /**
    * The name of a compute type for this build that overrides the one specified in the build project.
    */
  var computeTypeOverride: js.UndefOr[ComputeType] = js.undefined
  /**
    * A container type for this build that overrides the one specified in the build project.
    */
  var environmentTypeOverride: js.UndefOr[EnvironmentType] = js.undefined
  /**
    * A set of environment variables that overrides, for this build only, the latest ones already defined in the build project.
    */
  var environmentVariablesOverride: js.UndefOr[EnvironmentVariables] = js.undefined
  /**
    * The user-defined depth of history, with a minimum value of 0, that overrides, for this build only, any previous depth of history defined in the build project.
    */
  var gitCloneDepthOverride: js.UndefOr[GitCloneDepth] = js.undefined
  /**
    *  Information about the Git submodules configuration for this build of an AWS CodeBuild build project. 
    */
  var gitSubmodulesConfigOverride: js.UndefOr[GitSubmodulesConfig] = js.undefined
  /**
    * A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuild request. The token is included in the StartBuild request and is valid for 12 hours. If you repeat the StartBuild request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error. 
    */
  var idempotencyToken: js.UndefOr[String] = js.undefined
  /**
    * The name of an image for this build that overrides the one specified in the build project.
    */
  var imageOverride: js.UndefOr[NonEmptyString] = js.undefined
  /**
    *  The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:     CODEBUILD specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy to trust AWS CodeBuild's service principal.    SERVICE_ROLE specifies that AWS CodeBuild uses your build project's service role.     When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an AWS CodeBuild curated image, you must use CODEBUILD credentials. 
    */
  var imagePullCredentialsTypeOverride: js.UndefOr[ImagePullCredentialsType] = js.undefined
  /**
    * Enable this flag to override the insecure SSL setting that is specified in the build project. The insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This override applies only if the build's source is GitHub Enterprise.
    */
  var insecureSslOverride: js.UndefOr[WrapperBoolean] = js.undefined
  /**
    *  Log settings for this build that override the log settings defined in the build project. 
    */
  var logsConfigOverride: js.UndefOr[LogsConfig] = js.undefined
  /**
    * Enable this flag to override privileged mode in the build project.
    */
  var privilegedModeOverride: js.UndefOr[WrapperBoolean] = js.undefined
  /**
    * The name of the AWS CodeBuild build project to start running a build.
    */
  var projectName: NonEmptyString
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutesOverride: js.UndefOr[TimeOut] = js.undefined
  /**
    *  The credentials for access to a private registry. 
    */
  var registryCredentialOverride: js.UndefOr[RegistryCredential] = js.undefined
  /**
    *  Set to true to report to your source provider the status of a build's start and completion. If you use this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is thrown. 
    */
  var reportBuildStatusOverride: js.UndefOr[WrapperBoolean] = js.undefined
  /**
    *  An array of ProjectArtifacts objects. 
    */
  var secondaryArtifactsOverride: js.UndefOr[ProjectArtifactsList] = js.undefined
  /**
    *  An array of ProjectSource objects. 
    */
  var secondarySourcesOverride: js.UndefOr[ProjectSources] = js.undefined
  /**
    *  An array of ProjectSourceVersion objects that specify one or more versions of the project's secondary sources to be used for this build only. 
    */
  var secondarySourcesVersionOverride: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined
  /**
    * The name of a service role for this build that overrides the one specified in the build project.
    */
  var serviceRoleOverride: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * An authorization type for this build that overrides the one defined in the build project. This override applies only if the build project's source is BitBucket or GitHub.
    */
  var sourceAuthOverride: js.UndefOr[SourceAuth] = js.undefined
  /**
    * A location that overrides, for this build, the source location for the one defined in the build project.
    */
  var sourceLocationOverride: js.UndefOr[String] = js.undefined
  /**
    * A source input type, for this build, that overrides the source input defined in the build project.
    */
  var sourceTypeOverride: js.UndefOr[SourceType] = js.undefined
  /**
    * A version of the build input to be built, for this build only. If not specified, the latest version is used. If specified, must be one of:   For AWS CodeCommit: the commit ID to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.    If sourceVersion is specified at the project level, then this sourceVersion (at the build level) takes precedence.   For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.undefined
  /**
    * The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the latest setting already defined in the build project.
    */
  var timeoutInMinutesOverride: js.UndefOr[TimeOut] = js.undefined
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
    gitCloneDepthOverride: js.UndefOr[GitCloneDepth] = js.undefined,
    gitSubmodulesConfigOverride: GitSubmodulesConfig = null,
    idempotencyToken: String = null,
    imageOverride: NonEmptyString = null,
    imagePullCredentialsTypeOverride: ImagePullCredentialsType = null,
    insecureSslOverride: js.UndefOr[WrapperBoolean] = js.undefined,
    logsConfigOverride: LogsConfig = null,
    privilegedModeOverride: js.UndefOr[WrapperBoolean] = js.undefined,
    queuedTimeoutInMinutesOverride: js.UndefOr[TimeOut] = js.undefined,
    registryCredentialOverride: RegistryCredential = null,
    reportBuildStatusOverride: js.UndefOr[WrapperBoolean] = js.undefined,
    secondaryArtifactsOverride: ProjectArtifactsList = null,
    secondarySourcesOverride: ProjectSources = null,
    secondarySourcesVersionOverride: ProjectSecondarySourceVersions = null,
    serviceRoleOverride: NonEmptyString = null,
    sourceAuthOverride: SourceAuth = null,
    sourceLocationOverride: String = null,
    sourceTypeOverride: SourceType = null,
    sourceVersion: String = null,
    timeoutInMinutesOverride: js.UndefOr[TimeOut] = js.undefined
  ): StartBuildInput = {
    val __obj = js.Dynamic.literal(projectName = projectName)
    if (artifactsOverride != null) __obj.updateDynamic("artifactsOverride")(artifactsOverride)
    if (buildspecOverride != null) __obj.updateDynamic("buildspecOverride")(buildspecOverride)
    if (cacheOverride != null) __obj.updateDynamic("cacheOverride")(cacheOverride)
    if (certificateOverride != null) __obj.updateDynamic("certificateOverride")(certificateOverride)
    if (computeTypeOverride != null) __obj.updateDynamic("computeTypeOverride")(computeTypeOverride.asInstanceOf[js.Any])
    if (environmentTypeOverride != null) __obj.updateDynamic("environmentTypeOverride")(environmentTypeOverride.asInstanceOf[js.Any])
    if (environmentVariablesOverride != null) __obj.updateDynamic("environmentVariablesOverride")(environmentVariablesOverride)
    if (!js.isUndefined(gitCloneDepthOverride)) __obj.updateDynamic("gitCloneDepthOverride")(gitCloneDepthOverride)
    if (gitSubmodulesConfigOverride != null) __obj.updateDynamic("gitSubmodulesConfigOverride")(gitSubmodulesConfigOverride)
    if (idempotencyToken != null) __obj.updateDynamic("idempotencyToken")(idempotencyToken)
    if (imageOverride != null) __obj.updateDynamic("imageOverride")(imageOverride)
    if (imagePullCredentialsTypeOverride != null) __obj.updateDynamic("imagePullCredentialsTypeOverride")(imagePullCredentialsTypeOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureSslOverride)) __obj.updateDynamic("insecureSslOverride")(insecureSslOverride)
    if (logsConfigOverride != null) __obj.updateDynamic("logsConfigOverride")(logsConfigOverride)
    if (!js.isUndefined(privilegedModeOverride)) __obj.updateDynamic("privilegedModeOverride")(privilegedModeOverride)
    if (!js.isUndefined(queuedTimeoutInMinutesOverride)) __obj.updateDynamic("queuedTimeoutInMinutesOverride")(queuedTimeoutInMinutesOverride)
    if (registryCredentialOverride != null) __obj.updateDynamic("registryCredentialOverride")(registryCredentialOverride)
    if (!js.isUndefined(reportBuildStatusOverride)) __obj.updateDynamic("reportBuildStatusOverride")(reportBuildStatusOverride)
    if (secondaryArtifactsOverride != null) __obj.updateDynamic("secondaryArtifactsOverride")(secondaryArtifactsOverride)
    if (secondarySourcesOverride != null) __obj.updateDynamic("secondarySourcesOverride")(secondarySourcesOverride)
    if (secondarySourcesVersionOverride != null) __obj.updateDynamic("secondarySourcesVersionOverride")(secondarySourcesVersionOverride)
    if (serviceRoleOverride != null) __obj.updateDynamic("serviceRoleOverride")(serviceRoleOverride)
    if (sourceAuthOverride != null) __obj.updateDynamic("sourceAuthOverride")(sourceAuthOverride)
    if (sourceLocationOverride != null) __obj.updateDynamic("sourceLocationOverride")(sourceLocationOverride)
    if (sourceTypeOverride != null) __obj.updateDynamic("sourceTypeOverride")(sourceTypeOverride.asInstanceOf[js.Any])
    if (sourceVersion != null) __obj.updateDynamic("sourceVersion")(sourceVersion)
    if (!js.isUndefined(timeoutInMinutesOverride)) __obj.updateDynamic("timeoutInMinutesOverride")(timeoutInMinutesOverride)
    __obj.asInstanceOf[StartBuildInput]
  }
}

