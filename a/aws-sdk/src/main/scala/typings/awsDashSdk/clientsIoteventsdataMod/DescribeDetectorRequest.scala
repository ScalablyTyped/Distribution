package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDetectorRequest extends js.Object {
  /**
    * The name of the detector model whose detectors (instances) you want information about.
    */
  var detectorModelName: DetectorModelName = js.native
  /**
    * A filter used to limit results to detectors (instances) created because of the given key ID.
    */
  var keyValue: js.UndefOr[KeyValue] = js.native
}

object DescribeDetectorRequest {
  @scala.inline
  def apply(detectorModelName: DetectorModelName, keyValue: KeyValue = null): DescribeDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorRequest]
  }
}

