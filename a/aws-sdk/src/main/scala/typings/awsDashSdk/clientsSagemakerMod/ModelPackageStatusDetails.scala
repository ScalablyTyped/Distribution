package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPackageStatusDetails extends js.Object {
  /**
    * The status of the scan of the Docker image container for the model package.
    */
  var ImageScanStatuses: js.UndefOr[ModelPackageStatusItemList] = js.native
  /**
    * The validation status of the model package.
    */
  var ValidationStatuses: ModelPackageStatusItemList = js.native
}

object ModelPackageStatusDetails {
  @scala.inline
  def apply(
    ValidationStatuses: ModelPackageStatusItemList,
    ImageScanStatuses: ModelPackageStatusItemList = null
  ): ModelPackageStatusDetails = {
    val __obj = js.Dynamic.literal(ValidationStatuses = ValidationStatuses.asInstanceOf[js.Any])
    if (ImageScanStatuses != null) __obj.updateDynamic("ImageScanStatuses")(ImageScanStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageStatusDetails]
  }
}

