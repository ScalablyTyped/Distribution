package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBuildBatchInput extends StObject {
  
  /**
    * An array of ProjectArtifacts objects that contains information about the build output artifact overrides for the build project.
    */
  var artifactsOverride: js.UndefOr[ProjectArtifacts] = js.undefined
  
  /**
    * A BuildBatchConfigOverride object that contains batch build configuration overrides.
    */
  var buildBatchConfigOverride: js.UndefOr[ProjectBuildBatchConfig] = js.undefined
  
  /**
    * Overrides the build timeout specified in the batch build project.
    */
  var buildTimeoutInMinutesOverride: js.UndefOr[TimeOut] = js.undefined
  
  /**
    * A buildspec file declaration that overrides, for this build only, the latest one already defined in the build project. If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file relative to the value of the built-in CODEBUILD_SRC_DIR environment variable, or the path to an S3 bucket. The bucket must be in the same Amazon Web Services Region as the build project. Specify the buildspec file using its ARN (for example, arn:aws:s3:::my-codebuild-sample2/buildspec.yml). If this value is not provided or is set to an empty string, the source code must contain a buildspec file in its root directory. For more information, see Buildspec File Name and Storage Location. 
    */
  var buildspecOverride: js.UndefOr[String] = js.undefined
  
  /**
    * A ProjectCache object that specifies cache overrides.
    */
  var cacheOverride: js.UndefOr[ProjectCache] = js.undefined
  
  /**
    * The name of a certificate for this batch build that overrides the one specified in the batch build project.
    */
  var certificateOverride: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a compute type for this batch build that overrides the one specified in the batch build project.
    */
  var computeTypeOverride: js.UndefOr[ComputeType] = js.undefined
  
  /**
    * Specifies if session debugging is enabled for this batch build. For more information, see Viewing a running build in Session Manager. Batch session debugging is not supported for matrix batch builds.
    */
  var debugSessionEnabled: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * The Key Management Service customer master key (CMK) that overrides the one specified in the batch build project. The CMK key encrypts the build output artifacts.  You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/&lt;alias-name&gt;).
    */
  var encryptionKeyOverride: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A container type for this batch build that overrides the one specified in the batch build project.
    */
  var environmentTypeOverride: js.UndefOr[EnvironmentType] = js.undefined
  
  /**
    * An array of EnvironmentVariable objects that override, or add to, the environment variables defined in the batch build project.
    */
  var environmentVariablesOverride: js.UndefOr[EnvironmentVariables] = js.undefined
  
  /**
    * The user-defined depth of history, with a minimum value of 0, that overrides, for this batch build only, any previous depth of history defined in the batch build project.
    */
  var gitCloneDepthOverride: js.UndefOr[GitCloneDepth] = js.undefined
  
  /**
    * A GitSubmodulesConfig object that overrides the Git submodules configuration for this batch build.
    */
  var gitSubmodulesConfigOverride: js.UndefOr[GitSubmodulesConfig] = js.undefined
  
  /**
    * A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuildBatch request. The token is included in the StartBuildBatch request and is valid for five minutes. If you repeat the StartBuildBatch request with the same token, but change a parameter, CodeBuild returns a parameter mismatch error.
    */
  var idempotencyToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of an image for this batch build that overrides the one specified in the batch build project.
    */
  var imageOverride: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of credentials CodeBuild uses to pull images in your batch build. There are two valid values:   CODEBUILD  Specifies that CodeBuild uses its own credentials. This requires that you modify your ECR repository policy to trust CodeBuild's service principal.  SERVICE_ROLE  Specifies that CodeBuild uses your build project's service role.    When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an CodeBuild curated image, you must use CODEBUILD credentials. 
    */
  var imagePullCredentialsTypeOverride: js.UndefOr[ImagePullCredentialsType] = js.undefined
  
  /**
    * Enable this flag to override the insecure SSL setting that is specified in the batch build project. The insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This override applies only if the build's source is GitHub Enterprise.
    */
  var insecureSslOverride: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * A LogsConfig object that override the log settings defined in the batch build project.
    */
  var logsConfigOverride: js.UndefOr[LogsConfig] = js.undefined
  
  /**
    * Enable this flag to override privileged mode in the batch build project.
    */
  var privilegedModeOverride: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * The name of the project.
    */
  var projectName: NonEmptyString
  
  /**
    * The number of minutes a batch build is allowed to be queued before it times out.
    */
  var queuedTimeoutInMinutesOverride: js.UndefOr[TimeOut] = js.undefined
  
  /**
    * A RegistryCredential object that overrides credentials for access to a private registry.
    */
  var registryCredentialOverride: js.UndefOr[RegistryCredential] = js.undefined
  
  /**
    * Set to true to report to your source provider the status of a batch build's start and completion. If you use this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is thrown.   The status of a build triggered by a webhook is always reported to your source provider.  
    */
  var reportBuildBatchStatusOverride: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * An array of ProjectArtifacts objects that override the secondary artifacts defined in the batch build project.
    */
  var secondaryArtifactsOverride: js.UndefOr[ProjectArtifactsList] = js.undefined
  
  /**
    * An array of ProjectSource objects that override the secondary sources defined in the batch build project.
    */
  var secondarySourcesOverride: js.UndefOr[ProjectSources] = js.undefined
  
  /**
    * An array of ProjectSourceVersion objects that override the secondary source versions in the batch build project.
    */
  var secondarySourcesVersionOverride: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined
  
  /**
    * The name of a service role for this batch build that overrides the one specified in the batch build project.
    */
  var serviceRoleOverride: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A SourceAuth object that overrides the one defined in the batch build project. This override applies only if the build project's source is BitBucket or GitHub.
    */
  var sourceAuthOverride: js.UndefOr[SourceAuth] = js.undefined
  
  /**
    * A location that overrides, for this batch build, the source location defined in the batch build project.
    */
  var sourceLocationOverride: js.UndefOr[String] = js.undefined
  
  /**
    * The source input type that overrides the source input defined in the batch build project.
    */
  var sourceTypeOverride: js.UndefOr[SourceType] = js.undefined
  
  /**
    * The version of the batch build input to be built, for this build only. If not specified, the latest version is used. If specified, the contents depends on the source provider:  CodeCommit  The commit ID, branch, or Git tag to use.  GitHub  The commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.  Bitbucket  The commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.  Amazon S3  The version ID of the object that represents the build input ZIP file to use.   If sourceVersion is specified at the project level, then this sourceVersion (at the build level) takes precedence.  For more information, see Source Version Sample with CodeBuild in the CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.undefined
}
object StartBuildBatchInput {
  
  inline def apply(projectName: NonEmptyString): StartBuildBatchInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBuildBatchInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartBuildBatchInput] (val x: Self) extends AnyVal {
    
    inline def setArtifactsOverride(value: ProjectArtifacts): Self = StObject.set(x, "artifactsOverride", value.asInstanceOf[js.Any])
    
    inline def setArtifactsOverrideUndefined: Self = StObject.set(x, "artifactsOverride", js.undefined)
    
    inline def setBuildBatchConfigOverride(value: ProjectBuildBatchConfig): Self = StObject.set(x, "buildBatchConfigOverride", value.asInstanceOf[js.Any])
    
    inline def setBuildBatchConfigOverrideUndefined: Self = StObject.set(x, "buildBatchConfigOverride", js.undefined)
    
    inline def setBuildTimeoutInMinutesOverride(value: TimeOut): Self = StObject.set(x, "buildTimeoutInMinutesOverride", value.asInstanceOf[js.Any])
    
    inline def setBuildTimeoutInMinutesOverrideUndefined: Self = StObject.set(x, "buildTimeoutInMinutesOverride", js.undefined)
    
    inline def setBuildspecOverride(value: String): Self = StObject.set(x, "buildspecOverride", value.asInstanceOf[js.Any])
    
    inline def setBuildspecOverrideUndefined: Self = StObject.set(x, "buildspecOverride", js.undefined)
    
    inline def setCacheOverride(value: ProjectCache): Self = StObject.set(x, "cacheOverride", value.asInstanceOf[js.Any])
    
    inline def setCacheOverrideUndefined: Self = StObject.set(x, "cacheOverride", js.undefined)
    
    inline def setCertificateOverride(value: String): Self = StObject.set(x, "certificateOverride", value.asInstanceOf[js.Any])
    
    inline def setCertificateOverrideUndefined: Self = StObject.set(x, "certificateOverride", js.undefined)
    
    inline def setComputeTypeOverride(value: ComputeType): Self = StObject.set(x, "computeTypeOverride", value.asInstanceOf[js.Any])
    
    inline def setComputeTypeOverrideUndefined: Self = StObject.set(x, "computeTypeOverride", js.undefined)
    
    inline def setDebugSessionEnabled(value: WrapperBoolean): Self = StObject.set(x, "debugSessionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDebugSessionEnabledUndefined: Self = StObject.set(x, "debugSessionEnabled", js.undefined)
    
    inline def setEncryptionKeyOverride(value: NonEmptyString): Self = StObject.set(x, "encryptionKeyOverride", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyOverrideUndefined: Self = StObject.set(x, "encryptionKeyOverride", js.undefined)
    
    inline def setEnvironmentTypeOverride(value: EnvironmentType): Self = StObject.set(x, "environmentTypeOverride", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentTypeOverrideUndefined: Self = StObject.set(x, "environmentTypeOverride", js.undefined)
    
    inline def setEnvironmentVariablesOverride(value: EnvironmentVariables): Self = StObject.set(x, "environmentVariablesOverride", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesOverrideUndefined: Self = StObject.set(x, "environmentVariablesOverride", js.undefined)
    
    inline def setEnvironmentVariablesOverrideVarargs(value: EnvironmentVariable*): Self = StObject.set(x, "environmentVariablesOverride", js.Array(value*))
    
    inline def setGitCloneDepthOverride(value: GitCloneDepth): Self = StObject.set(x, "gitCloneDepthOverride", value.asInstanceOf[js.Any])
    
    inline def setGitCloneDepthOverrideUndefined: Self = StObject.set(x, "gitCloneDepthOverride", js.undefined)
    
    inline def setGitSubmodulesConfigOverride(value: GitSubmodulesConfig): Self = StObject.set(x, "gitSubmodulesConfigOverride", value.asInstanceOf[js.Any])
    
    inline def setGitSubmodulesConfigOverrideUndefined: Self = StObject.set(x, "gitSubmodulesConfigOverride", js.undefined)
    
    inline def setIdempotencyToken(value: String): Self = StObject.set(x, "idempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "idempotencyToken", js.undefined)
    
    inline def setImageOverride(value: NonEmptyString): Self = StObject.set(x, "imageOverride", value.asInstanceOf[js.Any])
    
    inline def setImageOverrideUndefined: Self = StObject.set(x, "imageOverride", js.undefined)
    
    inline def setImagePullCredentialsTypeOverride(value: ImagePullCredentialsType): Self = StObject.set(x, "imagePullCredentialsTypeOverride", value.asInstanceOf[js.Any])
    
    inline def setImagePullCredentialsTypeOverrideUndefined: Self = StObject.set(x, "imagePullCredentialsTypeOverride", js.undefined)
    
    inline def setInsecureSslOverride(value: WrapperBoolean): Self = StObject.set(x, "insecureSslOverride", value.asInstanceOf[js.Any])
    
    inline def setInsecureSslOverrideUndefined: Self = StObject.set(x, "insecureSslOverride", js.undefined)
    
    inline def setLogsConfigOverride(value: LogsConfig): Self = StObject.set(x, "logsConfigOverride", value.asInstanceOf[js.Any])
    
    inline def setLogsConfigOverrideUndefined: Self = StObject.set(x, "logsConfigOverride", js.undefined)
    
    inline def setPrivilegedModeOverride(value: WrapperBoolean): Self = StObject.set(x, "privilegedModeOverride", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedModeOverrideUndefined: Self = StObject.set(x, "privilegedModeOverride", js.undefined)
    
    inline def setProjectName(value: NonEmptyString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimeoutInMinutesOverride(value: TimeOut): Self = StObject.set(x, "queuedTimeoutInMinutesOverride", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimeoutInMinutesOverrideUndefined: Self = StObject.set(x, "queuedTimeoutInMinutesOverride", js.undefined)
    
    inline def setRegistryCredentialOverride(value: RegistryCredential): Self = StObject.set(x, "registryCredentialOverride", value.asInstanceOf[js.Any])
    
    inline def setRegistryCredentialOverrideUndefined: Self = StObject.set(x, "registryCredentialOverride", js.undefined)
    
    inline def setReportBuildBatchStatusOverride(value: WrapperBoolean): Self = StObject.set(x, "reportBuildBatchStatusOverride", value.asInstanceOf[js.Any])
    
    inline def setReportBuildBatchStatusOverrideUndefined: Self = StObject.set(x, "reportBuildBatchStatusOverride", js.undefined)
    
    inline def setSecondaryArtifactsOverride(value: ProjectArtifactsList): Self = StObject.set(x, "secondaryArtifactsOverride", value.asInstanceOf[js.Any])
    
    inline def setSecondaryArtifactsOverrideUndefined: Self = StObject.set(x, "secondaryArtifactsOverride", js.undefined)
    
    inline def setSecondaryArtifactsOverrideVarargs(value: ProjectArtifacts*): Self = StObject.set(x, "secondaryArtifactsOverride", js.Array(value*))
    
    inline def setSecondarySourcesOverride(value: ProjectSources): Self = StObject.set(x, "secondarySourcesOverride", value.asInstanceOf[js.Any])
    
    inline def setSecondarySourcesOverrideUndefined: Self = StObject.set(x, "secondarySourcesOverride", js.undefined)
    
    inline def setSecondarySourcesOverrideVarargs(value: ProjectSource*): Self = StObject.set(x, "secondarySourcesOverride", js.Array(value*))
    
    inline def setSecondarySourcesVersionOverride(value: ProjectSecondarySourceVersions): Self = StObject.set(x, "secondarySourcesVersionOverride", value.asInstanceOf[js.Any])
    
    inline def setSecondarySourcesVersionOverrideUndefined: Self = StObject.set(x, "secondarySourcesVersionOverride", js.undefined)
    
    inline def setSecondarySourcesVersionOverrideVarargs(value: ProjectSourceVersion*): Self = StObject.set(x, "secondarySourcesVersionOverride", js.Array(value*))
    
    inline def setServiceRoleOverride(value: NonEmptyString): Self = StObject.set(x, "serviceRoleOverride", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleOverrideUndefined: Self = StObject.set(x, "serviceRoleOverride", js.undefined)
    
    inline def setSourceAuthOverride(value: SourceAuth): Self = StObject.set(x, "sourceAuthOverride", value.asInstanceOf[js.Any])
    
    inline def setSourceAuthOverrideUndefined: Self = StObject.set(x, "sourceAuthOverride", js.undefined)
    
    inline def setSourceLocationOverride(value: String): Self = StObject.set(x, "sourceLocationOverride", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationOverrideUndefined: Self = StObject.set(x, "sourceLocationOverride", js.undefined)
    
    inline def setSourceTypeOverride(value: SourceType): Self = StObject.set(x, "sourceTypeOverride", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeOverrideUndefined: Self = StObject.set(x, "sourceTypeOverride", js.undefined)
    
    inline def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
  }
}
