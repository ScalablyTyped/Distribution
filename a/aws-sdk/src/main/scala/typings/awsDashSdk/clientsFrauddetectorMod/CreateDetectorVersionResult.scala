package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDetectorVersionResult extends js.Object {
  /**
    * The ID for the created version's parent detector.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  /**
    * The ID for the created detector. 
    */
  var detectorVersionId: js.UndefOr[nonEmptyString] = js.native
  /**
    * The status of the detector version.
    */
  var status: js.UndefOr[DetectorVersionStatus] = js.native
}

object CreateDetectorVersionResult {
  @scala.inline
  def apply(
    detectorId: identifier = null,
    detectorVersionId: nonEmptyString = null,
    status: DetectorVersionStatus = null
  ): CreateDetectorVersionResult = {
    val __obj = js.Dynamic.literal()
    if (detectorId != null) __obj.updateDynamic("detectorId")(detectorId.asInstanceOf[js.Any])
    if (detectorVersionId != null) __obj.updateDynamic("detectorVersionId")(detectorVersionId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorVersionResult]
  }
}

