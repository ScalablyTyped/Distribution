package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLicenseConfigurationRequest extends js.Object {
  /**
    * Unique ID of the configuration object to delete.
    */
  var LicenseConfigurationArn: String
}

object DeleteLicenseConfigurationRequest {
  @scala.inline
  def apply(LicenseConfigurationArn: String): DeleteLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn)
  
    __obj.asInstanceOf[DeleteLicenseConfigurationRequest]
  }
}

