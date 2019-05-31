package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDetectorModelResponse extends js.Object {
  /**
    * Information about how the detector model is configured.
    */
  var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.undefined
}

object CreateDetectorModelResponse {
  @scala.inline
  def apply(detectorModelConfiguration: DetectorModelConfiguration = null): CreateDetectorModelResponse = {
    val __obj = js.Dynamic.literal()
    if (detectorModelConfiguration != null) __obj.updateDynamic("detectorModelConfiguration")(detectorModelConfiguration)
    __obj.asInstanceOf[CreateDetectorModelResponse]
  }
}

