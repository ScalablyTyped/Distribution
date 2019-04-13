package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the build project.
    */
  var arn: js.UndefOr[String] = js.undefined
  /**
    * Information about the build output artifacts for the build project.
    */
  var artifacts: js.UndefOr[ProjectArtifacts] = js.undefined
  /**
    * Information about the build badge for the build project.
    */
  var badge: js.UndefOr[ProjectBadge] = js.undefined
  /**
    * Information about the cache for the build project.
    */
  var cache: js.UndefOr[ProjectCache] = js.undefined
  /**
    * When the build project was created, expressed in Unix time format.
    */
  var created: js.UndefOr[Timestamp] = js.undefined
  /**
    * A description that makes the build project easy to identify.
    */
  var description: js.UndefOr[ProjectDescription] = js.undefined
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts.   You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/alias-name ).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Information about the build environment for this build project.
    */
  var environment: js.UndefOr[ProjectEnvironment] = js.undefined
  /**
    * When the build project's settings were last modified, expressed in Unix time format.
    */
  var lastModified: js.UndefOr[Timestamp] = js.undefined
  /**
    *  Information about logs for the build project. A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both. 
    */
  var logsConfig: js.UndefOr[LogsConfig] = js.undefined
  /**
    * The name of the build project.
    */
  var name: js.UndefOr[ProjectName] = js.undefined
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
  /**
    *  An array of ProjectArtifacts objects. 
    */
  var secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.undefined
  /**
    *  An array of ProjectSource objects. 
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.undefined
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Information about the build input source code for this build project.
    */
  var source: js.UndefOr[ProjectSource] = js.undefined
  /**
    * The tags for this build project. These tags are available for use by AWS services that support AWS CodeBuild build project tags.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any related build that did not get marked as completed. The default is 60 minutes.
    */
  var timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
  /**
    * Information about the VPC configuration that AWS CodeBuild accesses.
    */
  var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
  /**
    * Information about a webhook that connects repository events to a build project in AWS CodeBuild.
    */
  var webhook: js.UndefOr[Webhook] = js.undefined
}

object Project {
  @scala.inline
  def apply(
    arn: String = null,
    artifacts: ProjectArtifacts = null,
    badge: ProjectBadge = null,
    cache: ProjectCache = null,
    created: Timestamp = null,
    description: ProjectDescription = null,
    encryptionKey: NonEmptyString = null,
    environment: ProjectEnvironment = null,
    lastModified: Timestamp = null,
    logsConfig: LogsConfig = null,
    name: ProjectName = null,
    queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined,
    secondaryArtifacts: ProjectArtifactsList = null,
    secondarySources: ProjectSources = null,
    serviceRole: NonEmptyString = null,
    source: ProjectSource = null,
    tags: TagList = null,
    timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined,
    vpcConfig: VpcConfig = null,
    webhook: Webhook = null
  ): Project = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified)
    if (logsConfig != null) __obj.updateDynamic("logsConfig")(logsConfig)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(queuedTimeoutInMinutes)) __obj.updateDynamic("queuedTimeoutInMinutes")(queuedTimeoutInMinutes)
    if (secondaryArtifacts != null) __obj.updateDynamic("secondaryArtifacts")(secondaryArtifacts)
    if (secondarySources != null) __obj.updateDynamic("secondarySources")(secondarySources)
    if (serviceRole != null) __obj.updateDynamic("serviceRole")(serviceRole)
    if (source != null) __obj.updateDynamic("source")(source)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(timeoutInMinutes)) __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes)
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig)
    if (webhook != null) __obj.updateDynamic("webhook")(webhook)
    __obj.asInstanceOf[Project]
  }
}

