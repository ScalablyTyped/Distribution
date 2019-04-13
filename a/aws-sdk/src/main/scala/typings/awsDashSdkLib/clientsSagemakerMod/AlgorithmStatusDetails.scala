package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmStatusDetails extends js.Object {
  /**
    * The status of the scan of the algorithm's Docker image container.
    */
  var ImageScanStatuses: js.UndefOr[AlgorithmStatusItemList] = js.undefined
  /**
    * The status of algorithm validation.
    */
  var ValidationStatuses: js.UndefOr[AlgorithmStatusItemList] = js.undefined
}

object AlgorithmStatusDetails {
  @scala.inline
  def apply(
    ImageScanStatuses: AlgorithmStatusItemList = null,
    ValidationStatuses: AlgorithmStatusItemList = null
  ): AlgorithmStatusDetails = {
    val __obj = js.Dynamic.literal()
    if (ImageScanStatuses != null) __obj.updateDynamic("ImageScanStatuses")(ImageScanStatuses)
    if (ValidationStatuses != null) __obj.updateDynamic("ValidationStatuses")(ValidationStatuses)
    __obj.asInstanceOf[AlgorithmStatusDetails]
  }
}

