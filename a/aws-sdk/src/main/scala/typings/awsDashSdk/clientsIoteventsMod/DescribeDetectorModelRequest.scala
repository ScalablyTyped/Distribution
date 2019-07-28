package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDetectorModelRequest extends js.Object {
  /**
    * The name of the detector model.
    */
  var detectorModelName: DetectorModelName
  /**
    * The version of the detector model.
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined
}

object DescribeDetectorModelRequest {
  @scala.inline
  def apply(detectorModelName: DetectorModelName, detectorModelVersion: DetectorModelVersion = null): DescribeDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName)
    if (detectorModelVersion != null) __obj.updateDynamic("detectorModelVersion")(detectorModelVersion)
    __obj.asInstanceOf[DescribeDetectorModelRequest]
  }
}

