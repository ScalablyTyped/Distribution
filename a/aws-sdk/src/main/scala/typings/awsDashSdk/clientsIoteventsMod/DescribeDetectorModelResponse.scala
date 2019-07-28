package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDetectorModelResponse extends js.Object {
  /**
    * Information about the detector model.
    */
  var detectorModel: js.UndefOr[DetectorModel] = js.undefined
}

object DescribeDetectorModelResponse {
  @scala.inline
  def apply(detectorModel: DetectorModel = null): DescribeDetectorModelResponse = {
    val __obj = js.Dynamic.literal()
    if (detectorModel != null) __obj.updateDynamic("detectorModel")(detectorModel)
    __obj.asInstanceOf[DescribeDetectorModelResponse]
  }
}

