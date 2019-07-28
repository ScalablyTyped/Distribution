package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLicenseConfigurationRequest extends js.Object {
  /**
    * ARN of the license configuration being requested.
    */
  var LicenseConfigurationArn: String
}

object GetLicenseConfigurationRequest {
  @scala.inline
  def apply(LicenseConfigurationArn: String): GetLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn)
  
    __obj.asInstanceOf[GetLicenseConfigurationRequest]
  }
}

