package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLicenseConfigurationResponse extends js.Object {
  /**
    * ARN of the license configuration object after its creation.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.undefined
}

object CreateLicenseConfigurationResponse {
  @scala.inline
  def apply(LicenseConfigurationArn: String = null): CreateLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (LicenseConfigurationArn != null) __obj.updateDynamic("LicenseConfigurationArn")(LicenseConfigurationArn)
    __obj.asInstanceOf[CreateLicenseConfigurationResponse]
  }
}

