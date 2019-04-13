package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Build extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the build.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Information about the output artifacts for the build.
    */
  var artifacts: js.UndefOr[BuildArtifacts] = js.undefined
  /**
    * Whether the build is complete. True if complete; otherwise, false.
    */
  var buildComplete: js.UndefOr[Boolean] = js.undefined
  /**
    * The current status of the build. Valid values include:    FAILED: The build failed.    FAULT: The build faulted.    IN_PROGRESS: The build is still in progress.    STOPPED: The build stopped.    SUCCEEDED: The build succeeded.    TIMED_OUT: The build timed out.  
    */
  var buildStatus: js.UndefOr[StatusType] = js.undefined
  /**
    * Information about the cache for the build.
    */
  var cache: js.UndefOr[ProjectCache] = js.undefined
  /**
    * The current build phase.
    */
  var currentPhase: js.UndefOr[String] = js.undefined
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts.   You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/alias-name ).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * When the build process ended, expressed in Unix time format.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Information about the build environment for this build.
    */
  var environment: js.UndefOr[ProjectEnvironment] = js.undefined
  /**
    * The unique ID for the build.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The entity that started the build. Valid values include:   If AWS CodePipeline started the build, the pipeline's name (for example, codepipeline/my-demo-pipeline).   If an AWS Identity and Access Management (IAM) user started the build, the user's name (for example, MyUserName).   If the Jenkins plugin for AWS CodeBuild started the build, the string CodeBuild-Jenkins-Plugin.  
    */
  var initiator: js.UndefOr[String] = js.undefined
  /**
    * Information about the build's logs in Amazon CloudWatch Logs.
    */
  var logs: js.UndefOr[LogsLocation] = js.undefined
  /**
    * Describes a network interface.
    */
  var networkInterface: js.UndefOr[NetworkInterface] = js.undefined
  /**
    * Information about all previous build phases that are complete and information about any current build phase that is not yet complete.
    */
  var phases: js.UndefOr[BuildPhases] = js.undefined
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: js.UndefOr[NonEmptyString] = js.undefined
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined
  /**
    *  An identifier for the version of this build's source code.     For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.     For AWS CodePipeline, the source revision provided by AWS CodePipeline.     For Amazon Simple Storage Service (Amazon S3), this does not apply.   
    */
  var resolvedSourceVersion: js.UndefOr[NonEmptyString] = js.undefined
  /**
    *  An array of ProjectArtifacts objects. 
    */
  var secondaryArtifacts: js.UndefOr[BuildArtifactsList] = js.undefined
  /**
    *  An array of ProjectSourceVersion objects. Each ProjectSourceVersion must be one of:    For AWS CodeCommit: the commit ID to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example, pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.  
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined
  /**
    *  An array of ProjectSource objects. 
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.undefined
  /**
    * The name of a service role used for this build.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Information about the source code to be built.
    */
  var source: js.UndefOr[ProjectSource] = js.undefined
  /**
    * Any version identifier for the version of the source code to be built.
    */
  var sourceVersion: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * When the build process started, expressed in Unix time format.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * How long, in minutes, for AWS CodeBuild to wait before timing out this build if it does not get marked as completed.
    */
  var timeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined
  /**
    * If your AWS CodeBuild project accesses resources in an Amazon VPC, you provide this parameter that identifies the VPC ID and the list of security group IDs and subnet IDs. The security groups and subnets must belong to the same VPC. You must provide at least one security group and one subnet ID.
    */
  var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
}

object Build {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    artifacts: BuildArtifacts = null,
    buildComplete: js.UndefOr[Boolean] = js.undefined,
    buildStatus: StatusType = null,
    cache: ProjectCache = null,
    currentPhase: String = null,
    encryptionKey: NonEmptyString = null,
    endTime: Timestamp = null,
    environment: ProjectEnvironment = null,
    id: NonEmptyString = null,
    initiator: String = null,
    logs: LogsLocation = null,
    networkInterface: NetworkInterface = null,
    phases: BuildPhases = null,
    projectName: NonEmptyString = null,
    queuedTimeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined,
    resolvedSourceVersion: NonEmptyString = null,
    secondaryArtifacts: BuildArtifactsList = null,
    secondarySourceVersions: ProjectSecondarySourceVersions = null,
    secondarySources: ProjectSources = null,
    serviceRole: NonEmptyString = null,
    source: ProjectSource = null,
    sourceVersion: NonEmptyString = null,
    startTime: Timestamp = null,
    timeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined,
    vpcConfig: VpcConfig = null
  ): Build = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts)
    if (!js.isUndefined(buildComplete)) __obj.updateDynamic("buildComplete")(buildComplete)
    if (buildStatus != null) __obj.updateDynamic("buildStatus")(buildStatus.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (currentPhase != null) __obj.updateDynamic("currentPhase")(currentPhase)
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (id != null) __obj.updateDynamic("id")(id)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (logs != null) __obj.updateDynamic("logs")(logs)
    if (networkInterface != null) __obj.updateDynamic("networkInterface")(networkInterface)
    if (phases != null) __obj.updateDynamic("phases")(phases)
    if (projectName != null) __obj.updateDynamic("projectName")(projectName)
    if (!js.isUndefined(queuedTimeoutInMinutes)) __obj.updateDynamic("queuedTimeoutInMinutes")(queuedTimeoutInMinutes)
    if (resolvedSourceVersion != null) __obj.updateDynamic("resolvedSourceVersion")(resolvedSourceVersion)
    if (secondaryArtifacts != null) __obj.updateDynamic("secondaryArtifacts")(secondaryArtifacts)
    if (secondarySourceVersions != null) __obj.updateDynamic("secondarySourceVersions")(secondarySourceVersions)
    if (secondarySources != null) __obj.updateDynamic("secondarySources")(secondarySources)
    if (serviceRole != null) __obj.updateDynamic("serviceRole")(serviceRole)
    if (source != null) __obj.updateDynamic("source")(source)
    if (sourceVersion != null) __obj.updateDynamic("sourceVersion")(sourceVersion)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (!js.isUndefined(timeoutInMinutes)) __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes)
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig)
    __obj.asInstanceOf[Build]
  }
}

