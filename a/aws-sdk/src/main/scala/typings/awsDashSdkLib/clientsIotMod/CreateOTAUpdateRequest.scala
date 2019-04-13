package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOTAUpdateRequest extends js.Object {
  /**
    * A list of additional OTA update parameters which are name-value pairs.
    */
  var additionalParameters: js.UndefOr[AdditionalParameterMap] = js.undefined
  /**
    * Configuration for the rollout of OTA updates.
    */
  var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.undefined
  /**
    * The description of the OTA update.
    */
  var description: js.UndefOr[OTAUpdateDescription] = js.undefined
  /**
    * The files to be streamed by the OTA update.
    */
  var files: OTAUpdateFiles
  /**
    * The ID of the OTA update to be created.
    */
  var otaUpdateId: OTAUpdateId
  /**
    * The IAM role that allows access to the AWS IoT Jobs service.
    */
  var roleArn: RoleArn
  /**
    * Metadata which can be used to manage updates.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a thing when a change is detected in a target. For example, an update will run on a thing when the thing is added to a target group, even after the update was completed by all things originally in the group. Valid values: CONTINUOUS | SNAPSHOT.
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.undefined
  /**
    * The targeted devices to receive OTA updates.
    */
  var targets: Targets
}

object CreateOTAUpdateRequest {
  @scala.inline
  def apply(
    files: OTAUpdateFiles,
    otaUpdateId: OTAUpdateId,
    roleArn: RoleArn,
    targets: Targets,
    additionalParameters: AdditionalParameterMap = null,
    awsJobExecutionsRolloutConfig: AwsJobExecutionsRolloutConfig = null,
    description: OTAUpdateDescription = null,
    tags: TagList = null,
    targetSelection: TargetSelection = null
  ): CreateOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(files = files, otaUpdateId = otaUpdateId, roleArn = roleArn, targets = targets)
    if (additionalParameters != null) __obj.updateDynamic("additionalParameters")(additionalParameters)
    if (awsJobExecutionsRolloutConfig != null) __obj.updateDynamic("awsJobExecutionsRolloutConfig")(awsJobExecutionsRolloutConfig)
    if (description != null) __obj.updateDynamic("description")(description)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOTAUpdateRequest]
  }
}

