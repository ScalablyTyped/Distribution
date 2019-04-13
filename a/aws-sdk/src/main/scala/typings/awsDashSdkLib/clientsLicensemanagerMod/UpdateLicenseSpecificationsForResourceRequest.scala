package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLicenseSpecificationsForResourceRequest extends js.Object {
  /**
    * License configuration ARNs to be added to a resource.
    */
  var AddLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined
  /**
    * License configuration ARNs to be removed from a resource.
    */
  var RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined
  /**
    * ARN for an AWS server resource.
    */
  var ResourceArn: String
}

object UpdateLicenseSpecificationsForResourceRequest {
  @scala.inline
  def apply(
    ResourceArn: String,
    AddLicenseSpecifications: LicenseSpecifications = null,
    RemoveLicenseSpecifications: LicenseSpecifications = null
  ): UpdateLicenseSpecificationsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (AddLicenseSpecifications != null) __obj.updateDynamic("AddLicenseSpecifications")(AddLicenseSpecifications)
    if (RemoveLicenseSpecifications != null) __obj.updateDynamic("RemoveLicenseSpecifications")(RemoveLicenseSpecifications)
    __obj.asInstanceOf[UpdateLicenseSpecificationsForResourceRequest]
  }
}

