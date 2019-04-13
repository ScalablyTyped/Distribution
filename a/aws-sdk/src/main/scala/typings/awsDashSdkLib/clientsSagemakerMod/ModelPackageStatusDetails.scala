package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelPackageStatusDetails extends js.Object {
  /**
    * The status of the scan of the Docker image container for the model package.
    */
  var ImageScanStatuses: js.UndefOr[ModelPackageStatusItemList] = js.undefined
  /**
    * The validation status of the model package.
    */
  var ValidationStatuses: ModelPackageStatusItemList
}

object ModelPackageStatusDetails {
  @scala.inline
  def apply(
    ValidationStatuses: ModelPackageStatusItemList,
    ImageScanStatuses: ModelPackageStatusItemList = null
  ): ModelPackageStatusDetails = {
    val __obj = js.Dynamic.literal(ValidationStatuses = ValidationStatuses)
    if (ImageScanStatuses != null) __obj.updateDynamic("ImageScanStatuses")(ImageScanStatuses)
    __obj.asInstanceOf[ModelPackageStatusDetails]
  }
}

