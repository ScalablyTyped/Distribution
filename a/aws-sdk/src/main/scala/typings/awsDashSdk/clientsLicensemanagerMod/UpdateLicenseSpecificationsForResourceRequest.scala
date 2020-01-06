package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLicenseSpecificationsForResourceRequest extends js.Object {
  /**
    * ARNs of the license configurations to add.
    */
  var AddLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.native
  /**
    * ARNs of the license configurations to remove.
    */
  var RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.native
  /**
    * Amazon Resource Name (ARN) of the AWS resource.
    */
  var ResourceArn: String = js.native
}

object UpdateLicenseSpecificationsForResourceRequest {
  @scala.inline
  def apply(
    ResourceArn: String,
    AddLicenseSpecifications: LicenseSpecifications = null,
    RemoveLicenseSpecifications: LicenseSpecifications = null
  ): UpdateLicenseSpecificationsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (AddLicenseSpecifications != null) __obj.updateDynamic("AddLicenseSpecifications")(AddLicenseSpecifications.asInstanceOf[js.Any])
    if (RemoveLicenseSpecifications != null) __obj.updateDynamic("RemoveLicenseSpecifications")(RemoveLicenseSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLicenseSpecificationsForResourceRequest]
  }
}

