package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDetectorRequest extends js.Object {
  /**
    * The name of the detector model whose detectors (instances) you want information about.
    */
  var detectorModelName: DetectorModelName
  /**
    * A filter used to limit results to detectors (instances) created because of the given key ID.
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
}

object DescribeDetectorRequest {
  @scala.inline
  def apply(detectorModelName: DetectorModelName, keyValue: KeyValue = null): DescribeDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName)
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue)
    __obj.asInstanceOf[DescribeDetectorRequest]
  }
}

