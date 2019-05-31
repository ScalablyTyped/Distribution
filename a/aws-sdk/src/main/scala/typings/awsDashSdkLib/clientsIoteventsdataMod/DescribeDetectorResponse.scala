package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDetectorResponse extends js.Object {
  /**
    * Information about the detector (instance).
    */
  var detector: js.UndefOr[Detector] = js.undefined
}

object DescribeDetectorResponse {
  @scala.inline
  def apply(detector: Detector = null): DescribeDetectorResponse = {
    val __obj = js.Dynamic.literal()
    if (detector != null) __obj.updateDynamic("detector")(detector)
    __obj.asInstanceOf[DescribeDetectorResponse]
  }
}

