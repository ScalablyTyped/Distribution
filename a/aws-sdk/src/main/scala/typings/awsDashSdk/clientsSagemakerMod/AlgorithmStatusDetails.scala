package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmStatusDetails extends js.Object {
  /**
    * The status of the scan of the algorithm's Docker image container.
    */
  var ImageScanStatuses: js.UndefOr[AlgorithmStatusItemList] = js.native
  /**
    * The status of algorithm validation.
    */
  var ValidationStatuses: js.UndefOr[AlgorithmStatusItemList] = js.native
}

object AlgorithmStatusDetails {
  @scala.inline
  def apply(
    ImageScanStatuses: AlgorithmStatusItemList = null,
    ValidationStatuses: AlgorithmStatusItemList = null
  ): AlgorithmStatusDetails = {
    val __obj = js.Dynamic.literal()
    if (ImageScanStatuses != null) __obj.updateDynamic("ImageScanStatuses")(ImageScanStatuses.asInstanceOf[js.Any])
    if (ValidationStatuses != null) __obj.updateDynamic("ValidationStatuses")(ValidationStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmStatusDetails]
  }
}

