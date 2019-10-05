package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProjectInput extends js.Object {
  /**
    * Information to be changed about the build output artifacts for the build project.
    */
  var artifacts: js.UndefOr[ProjectArtifacts] = js.undefined
  /**
    * Set this to true to generate a publicly accessible URL for your project's build badge.
    */
  var badgeEnabled: js.UndefOr[WrapperBoolean] = js.undefined
  /**
    * Stores recently used information so that it can be quickly accessed at a later time.
    */
  var cache: js.UndefOr[ProjectCache] = js.undefined
  /**
    * A new or replacement description of the build project.
    */
  var description: js.UndefOr[ProjectDescription] = js.undefined
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts.   You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/alias-name ).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Information to be changed about the build environment for the build project.
    */
  var environment: js.UndefOr[ProjectEnvironment] = js.undefined
  /**
    *  Information about logs for the build project. A project can create logs in Amazon CloudWatch Logs, logs in an S3 bucket, or both. 
    */
  var logsConfig: js.UndefOr[LogsConfig] = js.undefined
  /**
    * The name of the build project.  You cannot change a build project's name. 
    */
  var name: NonEmptyString
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
  /**
    *  An array of ProjectSource objects. 
    */
  var secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.undefined
  /**
    *  An array of ProjectSourceVersion objects. If secondarySourceVersions is specified at the build level, then they take over these secondarySourceVersions (at the project level). 
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined
  /**
    *  An array of ProjectSource objects. 
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.undefined
  /**
    * The replacement ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Information to be changed about the build input source code for the build project.
    */
  var source: js.UndefOr[ProjectSource] = js.undefined
  /**
    *  A version of the build input to be built for this project. If not specified, the latest version is used. If specified, it must be one of:    For AWS CodeCommit: the commit ID to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.    If sourceVersion is specified at the build level, then that version takes precedence over this sourceVersion (at the project level).   For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.undefined
  /**
    * The replacement set of tags for this build project. These tags are available for use by AWS services that support AWS CodeBuild build project tags.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * The replacement value in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any related build that did not get marked as completed.
    */
  var timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
  /**
    * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
    */
  var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
}

object UpdateProjectInput {
  @scala.inline
  def apply(
    name: NonEmptyString,
    artifacts: ProjectArtifacts = null,
    badgeEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    cache: ProjectCache = null,
    description: ProjectDescription = null,
    encryptionKey: NonEmptyString = null,
    environment: ProjectEnvironment = null,
    logsConfig: LogsConfig = null,
    queuedTimeoutInMinutes: Int | Double = null,
    secondaryArtifacts: ProjectArtifactsList = null,
    secondarySourceVersions: ProjectSecondarySourceVersions = null,
    secondarySources: ProjectSources = null,
    serviceRole: NonEmptyString = null,
    source: ProjectSource = null,
    sourceVersion: String = null,
    tags: TagList = null,
    timeoutInMinutes: Int | Double = null,
    vpcConfig: VpcConfig = null
  ): UpdateProjectInput = {
    val __obj = js.Dynamic.literal(name = name)
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts)
    if (!js.isUndefined(badgeEnabled)) __obj.updateDynamic("badgeEnabled")(badgeEnabled)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (description != null) __obj.updateDynamic("description")(description)
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (logsConfig != null) __obj.updateDynamic("logsConfig")(logsConfig)
    if (queuedTimeoutInMinutes != null) __obj.updateDynamic("queuedTimeoutInMinutes")(queuedTimeoutInMinutes.asInstanceOf[js.Any])
    if (secondaryArtifacts != null) __obj.updateDynamic("secondaryArtifacts")(secondaryArtifacts)
    if (secondarySourceVersions != null) __obj.updateDynamic("secondarySourceVersions")(secondarySourceVersions)
    if (secondarySources != null) __obj.updateDynamic("secondarySources")(secondarySources)
    if (serviceRole != null) __obj.updateDynamic("serviceRole")(serviceRole)
    if (source != null) __obj.updateDynamic("source")(source)
    if (sourceVersion != null) __obj.updateDynamic("sourceVersion")(sourceVersion)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timeoutInMinutes != null) __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes.asInstanceOf[js.Any])
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig)
    __obj.asInstanceOf[UpdateProjectInput]
  }
}

