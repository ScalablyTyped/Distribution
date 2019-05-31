package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorModelVersionSummary extends js.Object {
  /**
    * The time the detector model version was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ARN of the detector model version.
    */
  var detectorModelArn: js.UndefOr[DetectorModelArn] = js.undefined
  /**
    * The name of the detector model.
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.undefined
  /**
    * The ID of the detector model version.
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined
  /**
    * The last time the detector model version was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ARN of the role that grants the detector model permission to perform its tasks.
    */
  var roleArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The status of the detector model version.
    */
  var status: js.UndefOr[DetectorModelVersionStatus] = js.undefined
}

object DetectorModelVersionSummary {
  @scala.inline
  def apply(
    creationTime: Timestamp = null,
    detectorModelArn: DetectorModelArn = null,
    detectorModelName: DetectorModelName = null,
    detectorModelVersion: DetectorModelVersion = null,
    lastUpdateTime: Timestamp = null,
    roleArn: AmazonResourceName = null,
    status: DetectorModelVersionStatus = null
  ): DetectorModelVersionSummary = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (detectorModelArn != null) __obj.updateDynamic("detectorModelArn")(detectorModelArn)
    if (detectorModelName != null) __obj.updateDynamic("detectorModelName")(detectorModelName)
    if (detectorModelVersion != null) __obj.updateDynamic("detectorModelVersion")(detectorModelVersion)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorModelVersionSummary]
  }
}

