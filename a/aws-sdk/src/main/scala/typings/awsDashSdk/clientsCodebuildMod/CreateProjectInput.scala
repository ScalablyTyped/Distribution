package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProjectInput extends js.Object {
  /**
    * Information about the build output artifacts for the build project.
    */
  var artifacts: ProjectArtifacts
  /**
    * Set this to true to generate a publicly accessible URL for your project's build badge.
    */
  var badgeEnabled: js.UndefOr[WrapperBoolean] = js.undefined
  /**
    * Stores recently used information so that it can be quickly accessed at a later time.
    */
  var cache: js.UndefOr[ProjectCache] = js.undefined
  /**
    * A description that makes the build project easy to identify.
    */
  var description: js.UndefOr[ProjectDescription] = js.undefined
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts.   You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/alias-name ).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Information about the build environment for the build project.
    */
  var environment: ProjectEnvironment
  /**
    *  Information about logs for the build project. These can be logs in Amazon CloudWatch Logs, logs uploaded to a specified S3 bucket, or both. 
    */
  var logsConfig: js.UndefOr[LogsConfig] = js.undefined
  /**
    * The name of the build project.
    */
  var name: ProjectName
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
  /**
    *  An array of ProjectArtifacts objects. 
    */
  var secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.undefined
  /**
    *  An array of ProjectSourceVersion objects. If secondarySourceVersions is specified at the build level, then they take precedence over these secondarySourceVersions (at the project level). 
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined
  /**
    *  An array of ProjectSource objects. 
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.undefined
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  var serviceRole: NonEmptyString
  /**
    * Information about the build input source code for the build project.
    */
  var source: ProjectSource
  /**
    *  A version of the build input to be built for this project. If not specified, the latest version is used. If specified, it must be one of:    For AWS CodeCommit: the commit ID to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.    If sourceVersion is specified at the build level, then that version takes precedence over this sourceVersion (at the project level).   For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.undefined
  /**
    * A set of tags for this build project. These tags are available for use by AWS services that support AWS CodeBuild build project tags.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before it times out any build that has not been marked as completed. The default is 60 minutes.
    */
  var timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
  /**
    * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
    */
  var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
}

object CreateProjectInput {
  @scala.inline
  def apply(
    artifacts: ProjectArtifacts,
    environment: ProjectEnvironment,
    name: ProjectName,
    serviceRole: NonEmptyString,
    source: ProjectSource,
    badgeEnabled: js.UndefOr[WrapperBoolean] = js.undefined,
    cache: ProjectCache = null,
    description: ProjectDescription = null,
    encryptionKey: NonEmptyString = null,
    logsConfig: LogsConfig = null,
    queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined,
    secondaryArtifacts: ProjectArtifactsList = null,
    secondarySourceVersions: ProjectSecondarySourceVersions = null,
    secondarySources: ProjectSources = null,
    sourceVersion: String = null,
    tags: TagList = null,
    timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined,
    vpcConfig: VpcConfig = null
  ): CreateProjectInput = {
    val __obj = js.Dynamic.literal(artifacts = artifacts, environment = environment, name = name, serviceRole = serviceRole, source = source)
    if (!js.isUndefined(badgeEnabled)) __obj.updateDynamic("badgeEnabled")(badgeEnabled)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (description != null) __obj.updateDynamic("description")(description)
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey)
    if (logsConfig != null) __obj.updateDynamic("logsConfig")(logsConfig)
    if (!js.isUndefined(queuedTimeoutInMinutes)) __obj.updateDynamic("queuedTimeoutInMinutes")(queuedTimeoutInMinutes)
    if (secondaryArtifacts != null) __obj.updateDynamic("secondaryArtifacts")(secondaryArtifacts)
    if (secondarySourceVersions != null) __obj.updateDynamic("secondarySourceVersions")(secondarySourceVersions)
    if (secondarySources != null) __obj.updateDynamic("secondarySources")(secondarySources)
    if (sourceVersion != null) __obj.updateDynamic("sourceVersion")(sourceVersion)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(timeoutInMinutes)) __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes)
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig)
    __obj.asInstanceOf[CreateProjectInput]
  }
}

