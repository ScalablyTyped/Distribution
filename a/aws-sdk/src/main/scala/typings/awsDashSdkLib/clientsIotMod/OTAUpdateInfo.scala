package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OTAUpdateInfo extends js.Object {
  /**
    * A collection of name/value pairs
    */
  var additionalParameters: js.UndefOr[AdditionalParameterMap] = js.undefined
  /**
    * The AWS IoT job ARN associated with the OTA update.
    */
  var awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.undefined
  /**
    * The AWS IoT job ID associated with the OTA update.
    */
  var awsIotJobId: js.UndefOr[AwsIotJobId] = js.undefined
  /**
    * Configuration for the rollout of OTA updates.
    */
  var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.undefined
  /**
    * The date when the OTA update was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  /**
    * A description of the OTA update.
    */
  var description: js.UndefOr[OTAUpdateDescription] = js.undefined
  /**
    * Error information associated with the OTA update.
    */
  var errorInfo: js.UndefOr[ErrorInfo] = js.undefined
  /**
    * The date when the OTA update was last updated.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined
  /**
    * A list of files associated with the OTA update.
    */
  var otaUpdateFiles: js.UndefOr[OTAUpdateFiles] = js.undefined
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined
  /**
    * The status of the OTA update.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
  /**
    * Specifies whether the OTA update will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the OTA update (SNAPSHOT). If continuous, the OTA update may also be run on a thing when a change is detected in a target. For example, an OTA update will run on a thing when the thing is added to a target group, even after the OTA update was completed by all things originally in the group. 
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.undefined
  /**
    * The targets of the OTA update.
    */
  var targets: js.UndefOr[Targets] = js.undefined
}

object OTAUpdateInfo {
  @scala.inline
  def apply(
    additionalParameters: AdditionalParameterMap = null,
    awsIotJobArn: AwsIotJobArn = null,
    awsIotJobId: AwsIotJobId = null,
    awsJobExecutionsRolloutConfig: AwsJobExecutionsRolloutConfig = null,
    creationDate: DateType = null,
    description: OTAUpdateDescription = null,
    errorInfo: ErrorInfo = null,
    lastModifiedDate: DateType = null,
    otaUpdateArn: OTAUpdateArn = null,
    otaUpdateFiles: OTAUpdateFiles = null,
    otaUpdateId: OTAUpdateId = null,
    otaUpdateStatus: OTAUpdateStatus = null,
    targetSelection: TargetSelection = null,
    targets: Targets = null
  ): OTAUpdateInfo = {
    val __obj = js.Dynamic.literal()
    if (additionalParameters != null) __obj.updateDynamic("additionalParameters")(additionalParameters)
    if (awsIotJobArn != null) __obj.updateDynamic("awsIotJobArn")(awsIotJobArn)
    if (awsIotJobId != null) __obj.updateDynamic("awsIotJobId")(awsIotJobId)
    if (awsJobExecutionsRolloutConfig != null) __obj.updateDynamic("awsJobExecutionsRolloutConfig")(awsJobExecutionsRolloutConfig)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (errorInfo != null) __obj.updateDynamic("errorInfo")(errorInfo)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (otaUpdateArn != null) __obj.updateDynamic("otaUpdateArn")(otaUpdateArn)
    if (otaUpdateFiles != null) __obj.updateDynamic("otaUpdateFiles")(otaUpdateFiles)
    if (otaUpdateId != null) __obj.updateDynamic("otaUpdateId")(otaUpdateId)
    if (otaUpdateStatus != null) __obj.updateDynamic("otaUpdateStatus")(otaUpdateStatus.asInstanceOf[js.Any])
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[OTAUpdateInfo]
  }
}

