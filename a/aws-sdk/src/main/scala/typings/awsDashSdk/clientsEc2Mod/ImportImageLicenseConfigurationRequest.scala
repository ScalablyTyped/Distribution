package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportImageLicenseConfigurationRequest extends js.Object {
  /**
    * The ARN of a license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.native
}

object ImportImageLicenseConfigurationRequest {
  @scala.inline
  def apply(LicenseConfigurationArn: String = null): ImportImageLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (LicenseConfigurationArn != null) __obj.updateDynamic("LicenseConfigurationArn")(LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportImageLicenseConfigurationRequest]
  }
}

