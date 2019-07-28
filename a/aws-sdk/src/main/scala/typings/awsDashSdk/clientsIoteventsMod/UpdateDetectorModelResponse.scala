package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDetectorModelResponse extends js.Object {
  /**
    * Information about how the detector model is configured.
    */
  var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.undefined
}

object UpdateDetectorModelResponse {
  @scala.inline
  def apply(detectorModelConfiguration: DetectorModelConfiguration = null): UpdateDetectorModelResponse = {
    val __obj = js.Dynamic.literal()
    if (detectorModelConfiguration != null) __obj.updateDynamic("detectorModelConfiguration")(detectorModelConfiguration)
    __obj.asInstanceOf[UpdateDetectorModelResponse]
  }
}

